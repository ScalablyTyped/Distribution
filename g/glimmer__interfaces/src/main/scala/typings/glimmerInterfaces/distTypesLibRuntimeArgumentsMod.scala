package typings.glimmerInterfaces

import org.scalablytyped.runtime.StringDictionary
import typings.glimmerInterfaces.distTypesLibCoreMod.Option
import typings.glimmerInterfaces.distTypesLibRuntimeScopeMod.ScopeBlock
import typings.std.Array
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibRuntimeArgumentsMod {
  
  @JSImport("@glimmer/interfaces/dist/types/lib/runtime/arguments", "CAPTURED_ARGS")
  @js.native
  val CAPTURED_ARGS: js.Symbol = js.native
  
  trait Arguments extends StObject {
    
    var named: Record[String, Any]
    
    var positional: js.Array[Any]
  }
  object Arguments {
    
    inline def apply(named: Record[String, Any], positional: js.Array[Any]): Arguments = {
      val __obj = js.Dynamic.literal(named = named.asInstanceOf[js.Any], positional = positional.asInstanceOf[js.Any])
      __obj.asInstanceOf[Arguments]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Arguments] (val x: Self) extends AnyVal {
      
      inline def setNamed(value: Record[String, Any]): Self = StObject.set(x, "named", value.asInstanceOf[js.Any])
      
      inline def setPositional(value: js.Array[Any]): Self = StObject.set(x, "positional", value.asInstanceOf[js.Any])
      
      inline def setPositionalVarargs(value: Any*): Self = StObject.set(x, "positional", js.Array(value*))
    }
  }
  
  trait BlockArguments extends StObject {
    
    def capture(): CapturedBlockArguments
    
    def get(name: String): Option[ScopeBlock]
    
    def has(name: String): Boolean
    
    var length: Double
    
    var names: js.Array[String]
  }
  object BlockArguments {
    
    inline def apply(
      capture: () => CapturedBlockArguments,
      get: String => Option[ScopeBlock],
      has: String => Boolean,
      length: Double,
      names: js.Array[String]
    ): BlockArguments = {
      val __obj = js.Dynamic.literal(capture = js.Any.fromFunction0(capture), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), length = length.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockArguments]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BlockArguments] (val x: Self) extends AnyVal {
      
      inline def setCapture(value: () => CapturedBlockArguments): Self = StObject.set(x, "capture", js.Any.fromFunction0(value))
      
      inline def setGet(value: String => Option[ScopeBlock]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
    }
  }
  
  @js.native
  trait CapturedArguments extends StObject {
    
    var named: CapturedNamedArguments = js.native
    
    var positional: CapturedPositionalArguments = js.native
  }
  
  trait CapturedBlockArguments extends StObject {
    
    def get(name: String): Option[ScopeBlock]
    
    def has(name: String): Boolean
    
    var length: Double
    
    var names: js.Array[String]
  }
  object CapturedBlockArguments {
    
    inline def apply(get: String => Option[ScopeBlock], has: String => Boolean, length: Double, names: js.Array[String]): CapturedBlockArguments = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), length = length.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
      __obj.asInstanceOf[CapturedBlockArguments]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CapturedBlockArguments] (val x: Self) extends AnyVal {
      
      inline def setGet(value: String => Option[ScopeBlock]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
    }
  }
  
  @js.native
  trait CapturedNamedArguments
    extends StObject
       with /* key */ StringDictionary[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference */ Any
        ]
  
  @js.native
  trait CapturedPositionalArguments
    extends StObject
       with Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference */ Any
        ]
  
  trait NamedArguments extends StObject {
    
    def capture(): CapturedNamedArguments
    
    def get(name: String): Any
    
    def has(name: String): Boolean
    
    var length: Double
    
    var names: js.Array[String]
  }
  object NamedArguments {
    
    inline def apply(
      capture: () => CapturedNamedArguments,
      get: String => Any,
      has: String => Boolean,
      length: Double,
      names: js.Array[String]
    ): NamedArguments = {
      val __obj = js.Dynamic.literal(capture = js.Any.fromFunction0(capture), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), length = length.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
      __obj.asInstanceOf[NamedArguments]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NamedArguments] (val x: Self) extends AnyVal {
      
      inline def setCapture(value: () => CapturedNamedArguments): Self = StObject.set(x, "capture", js.Any.fromFunction0(value))
      
      inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
    }
  }
  
  trait PositionalArguments extends StObject {
    
    def at(position: Double): Any
    
    def capture(): CapturedPositionalArguments
    
    var length: Double
  }
  object PositionalArguments {
    
    inline def apply(at: Double => Any, capture: () => CapturedPositionalArguments, length: Double): PositionalArguments = {
      val __obj = js.Dynamic.literal(at = js.Any.fromFunction1(at), capture = js.Any.fromFunction0(capture), length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[PositionalArguments]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PositionalArguments] (val x: Self) extends AnyVal {
      
      inline def setAt(value: Double => Any): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
      
      inline def setCapture(value: () => CapturedPositionalArguments): Self = StObject.set(x, "capture", js.Any.fromFunction0(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait VMArguments extends StObject {
    
    def at(pos: Double): Any
    
    def capture(): CapturedArguments
    
    var length: Double
    
    var named: NamedArguments
    
    var positional: PositionalArguments
  }
  object VMArguments {
    
    inline def apply(
      at: Double => Any,
      capture: () => CapturedArguments,
      length: Double,
      named: NamedArguments,
      positional: PositionalArguments
    ): VMArguments = {
      val __obj = js.Dynamic.literal(at = js.Any.fromFunction1(at), capture = js.Any.fromFunction0(capture), length = length.asInstanceOf[js.Any], named = named.asInstanceOf[js.Any], positional = positional.asInstanceOf[js.Any])
      __obj.asInstanceOf[VMArguments]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VMArguments] (val x: Self) extends AnyVal {
      
      inline def setAt(value: Double => Any): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
      
      inline def setCapture(value: () => CapturedArguments): Self = StObject.set(x, "capture", js.Any.fromFunction0(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setNamed(value: NamedArguments): Self = StObject.set(x, "named", value.asInstanceOf[js.Any])
      
      inline def setPositional(value: PositionalArguments): Self = StObject.set(x, "positional", value.asInstanceOf[js.Any])
    }
  }
}
