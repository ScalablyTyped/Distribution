package typings.factoryGirl

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.TopLevel
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("factory-girl", JSImport.Namespace)
  @js.native
  val ^ : Static = js.native
  
  type Attributes[T] = Definition[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: factory-girl.factory-girl.Definition<T[P]>}
    */ typings.factoryGirl.factoryGirlStrings.Attributes & TopLevel[T]
  ]
  
  type Definition[T] = T | Generator[T]
  
  type Generator[T] = js.Function0[T]
  
  type Hook[T] = js.Function3[/* model */ js.Any, /* attrs */ js.Array[T], /* options */ js.Any, Unit]
  
  trait Options[T] extends StObject {
    
    var afterBuild: js.UndefOr[Hook[T]] = js.undefined
    
    var afterCreate: js.UndefOr[Hook[T]] = js.undefined
  }
  object Options {
    
    inline def apply[T](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    extension [Self <: Options[?], T](x: Self & Options[T]) {
      
      inline def setAfterBuild(value: (/* model */ js.Any, /* attrs */ js.Array[T], /* options */ js.Any) => Unit): Self = StObject.set(x, "afterBuild", js.Any.fromFunction3(value))
      
      inline def setAfterBuildUndefined: Self = StObject.set(x, "afterBuild", js.undefined)
      
      inline def setAfterCreate(value: (/* model */ js.Any, /* attrs */ js.Array[T], /* options */ js.Any) => Unit): Self = StObject.set(x, "afterCreate", js.Any.fromFunction3(value))
      
      inline def setAfterCreateUndefined: Self = StObject.set(x, "afterCreate", js.undefined)
    }
  }
  
  @js.native
  trait Static extends StObject {
    
    /**
      * Associate the factory to other model
      */
    def assoc(model: String, attributes: String): js.Any = js.native
    
    /**
      * Associate the factory to a model that's not persisted
      */
    def assocAttrs(name: String): js.Any = js.native
    def assocAttrs(name: String, key: String): js.Any = js.native
    def assocAttrs(name: String, key: String, attributes: js.Any): js.Any = js.native
    def assocAttrs(name: String, key: Unit, attributes: js.Any): js.Any = js.native
    
    /**
      * Associate the factory to multiple other models
      */
    def assocMany(model: String, num: Double, attributes: String): js.Array[js.Any] = js.native
    
    /**
      * Generates and returns model attributes as an object hash instead of the model instance
      */
    def attrs[T](name: String): js.Promise[T] = js.native
    def attrs[T](name: String, attrs: Attributes[Partial[T]]): js.Promise[T] = js.native
    
    /**
      * Generates and returns a collection of model attributes as an object hash instead of the model instance
      */
    def attrsMany[T](name: String, num: Double): js.Promise[js.Array[T]] = js.native
    def attrsMany[T](name: String, num: Double, attrs: js.Array[Attributes[Partial[T]]]): js.Promise[js.Array[T]] = js.native
    
    /**
      * Builds a new model instance that is not persisted
      */
    def build[T](name: String): js.Promise[T] = js.native
    def build[T](name: String, attrs: Attributes[Partial[T]]): js.Promise[T] = js.native
    
    def buildMany[T](name: String): js.Promise[js.Array[T]] = js.native
    def buildMany[T](name: String, attrs: js.Array[Attributes[Partial[T]]]): js.Promise[js.Array[T]] = js.native
    /**
      * Builds an array of model instances that are persisted
      */
    def buildMany[T](name: String, num: Double): js.Promise[js.Array[T]] = js.native
    def buildMany[T](name: String, num: Double, attrs: Attributes[Partial[T]]): js.Promise[js.Array[T]] = js.native
    
    /**
      * Destroys all of the created models
      */
    def cleanUp(): Unit = js.native
    
    /**
      * Builds a new model instance that is persisted
      */
    def create[T](name: String): js.Promise[T] = js.native
    def create[T](name: String, attrs: Attributes[Partial[T]]): js.Promise[T] = js.native
    
    def createMany[T](name: String): js.Promise[js.Array[T]] = js.native
    def createMany[T](name: String, attrs: js.Array[Attributes[Partial[T]]]): js.Promise[js.Array[T]] = js.native
    def createMany[T](name: String, attrs: js.Array[Attributes[Partial[T]]], buildOptions: Options[T]): js.Promise[js.Array[T]] = js.native
    def createMany[T](name: String, attrs: Unit, buildOptions: Options[T]): js.Promise[js.Array[T]] = js.native
    /**
      * Builds an array of model instances that are persisted
      */
    def createMany[T](name: String, num: Double): js.Promise[js.Array[T]] = js.native
    def createMany[T](name: String, num: Double, attrs: Unit, buildOptions: Options[T]): js.Promise[js.Array[T]] = js.native
    def createMany[T](name: String, num: Double, attrs: Attributes[Partial[T]]): js.Promise[js.Array[T]] = js.native
    def createMany[T](name: String, num: Double, attrs: Attributes[Partial[T]], buildOptions: Options[T]): js.Promise[js.Array[T]] = js.native
    
    /**
      * Define a new factory with a set of options
      */
    def define[T](name: String, model: js.Any, attrs: Attributes[T]): Unit = js.native
    def define[T](name: String, model: js.Any, attrs: Attributes[T], options: Options[T]): Unit = js.native
    
    /**
      * Extends a factory
      */
    def extend(parent: String, name: String, initializer: js.Any): js.Any = js.native
    def extend(parent: String, name: String, initializer: js.Any, options: Options[js.Any]): js.Any = js.native
    
    def resetSeq(): Unit = js.native
    def resetSeq(name: String): Unit = js.native
    
    /**
      *  Reset sequence generator with the given name
      *  or all generators if no name is given.
      */
    def resetSequence(): Unit = js.native
    def resetSequence(name: String): Unit = js.native
    
    /**
      * Generate values sequentially inside a factory
      */
    def seq[T](name: String, fn: js.Function1[/* sequence */ Double, T]): Generator[T] = js.native
    
    def sequence[T](name: String, fn: js.Function1[/* sequence */ Double, T]): Generator[T] = js.native
    
    /**
      * Register an adapter, either as default or tied to a specific model
      */
    def setAdapter(adapter: js.Any): Unit = js.native
    def setAdapter(adapter: js.Any, name: String): Unit = js.native
  }
  
  type _To = Static
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Static = ^
}
