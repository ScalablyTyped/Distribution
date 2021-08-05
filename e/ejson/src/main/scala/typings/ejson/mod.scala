package typings.ejson

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ejson", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clone_[T](obj: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(obj.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def equals_(a: js.Any, b: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(a: js.Any, b: js.Any, options: CloneOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def fromJSONValue(obj: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSONValue")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def isBinary(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def newBinary(len: Double): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("newBinary")(len.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  inline def parse(str: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def stringify(obj: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(obj: js.Any, options: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toJSONValue(obj: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSONValue")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait CloneOptions extends StObject {
    
    var keyOrderSensitive: Boolean
  }
  object CloneOptions {
    
    inline def apply(keyOrderSensitive: Boolean): CloneOptions = {
      val __obj = js.Dynamic.literal(keyOrderSensitive = keyOrderSensitive.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloneOptions]
    }
    
    extension [Self <: CloneOptions](x: Self) {
      
      inline def setKeyOrderSensitive(value: Boolean): Self = StObject.set(x, "keyOrderSensitive", value.asInstanceOf[js.Any])
    }
  }
  
  trait StringifyOptions extends StObject {
    
    var canonical: Boolean
    
    var indent: Boolean | Double | String
  }
  object StringifyOptions {
    
    inline def apply(canonical: Boolean, indent: Boolean | Double | String): StringifyOptions = {
      val __obj = js.Dynamic.literal(canonical = canonical.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any])
      __obj.asInstanceOf[StringifyOptions]
    }
    
    extension [Self <: StringifyOptions](x: Self) {
      
      inline def setCanonical(value: Boolean): Self = StObject.set(x, "canonical", value.asInstanceOf[js.Any])
      
      inline def setIndent(value: Boolean | Double | String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    }
  }
}
