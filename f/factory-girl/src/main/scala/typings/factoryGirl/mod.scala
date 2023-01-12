package typings.factoryGirl

import org.scalablytyped.runtime.Shortcut
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("factory-girl", JSImport.Namespace)
  @js.native
  val ^ : Static = js.native
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: factory-girl.factory-girl.Definition<T[P]>}
    }}}
    */
  @js.native
  trait Attributes[T] extends StObject
  
  type BuildOptions = Record[String, Any]
  
  type Definition[T] = T | Generator[T] | js.Promise[T]
  
  type Generator[T] = js.Function0[T]
  
  type Hook[T] = js.Function3[/* model */ Any, /* attrs */ T | js.Array[T], /* options */ Any, Unit]
  
  type Initializer[T, BO] = Attributes[T] | (js.Function1[js.UndefOr[BO], Attributes[T] | js.Promise[Attributes[T]]])
  
  type MaybeReadonlyArray[T] = T | js.Array[T]
  
  trait Options[T] extends StObject {
    
    var afterBuild: js.UndefOr[Hook[T]] = js.undefined
    
    var afterCreate: js.UndefOr[Hook[T]] = js.undefined
  }
  object Options {
    
    inline def apply[T](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], T] (val x: Self & Options[T]) extends AnyVal {
      
      inline def setAfterBuild(value: (/* model */ Any, /* attrs */ T | js.Array[T], /* options */ Any) => Unit): Self = StObject.set(x, "afterBuild", js.Any.fromFunction3(value))
      
      inline def setAfterBuildUndefined: Self = StObject.set(x, "afterBuild", js.undefined)
      
      inline def setAfterCreate(value: (/* model */ Any, /* attrs */ T | js.Array[T], /* options */ Any) => Unit): Self = StObject.set(x, "afterCreate", js.Any.fromFunction3(value))
      
      inline def setAfterCreateUndefined: Self = StObject.set(x, "afterCreate", js.undefined)
    }
  }
  
  @js.native
  trait Static extends StObject {
    
    /**
      * Associate the factory to other model
      */
    def assoc(name: String): Any = js.native
    def assoc(name: String, key: String): Any = js.native
    def assoc(name: String, key: String, attrs: Unit, buildOptions: BuildOptions): Any = js.native
    def assoc(name: String, key: String, attrs: Attributes[Any]): Any = js.native
    def assoc(name: String, key: String, attrs: Attributes[Any], buildOptions: BuildOptions): Any = js.native
    def assoc(name: String, key: Unit, attrs: Unit, buildOptions: BuildOptions): Any = js.native
    def assoc(name: String, key: Unit, attrs: Attributes[Any]): Any = js.native
    def assoc(name: String, key: Unit, attrs: Attributes[Any], buildOptions: BuildOptions): Any = js.native
    
    /**
      * Associate the factory to a model that's not persisted
      */
    def assocAttrs(name: String): Any = js.native
    def assocAttrs(name: String, key: String): Any = js.native
    def assocAttrs(name: String, key: String, attrs: Unit, buildOptions: BuildOptions): Any = js.native
    def assocAttrs(name: String, key: String, attrs: Attributes[Any]): Any = js.native
    def assocAttrs(name: String, key: String, attrs: Attributes[Any], buildOptions: BuildOptions): Any = js.native
    def assocAttrs(name: String, key: Unit, attrs: Unit, buildOptions: BuildOptions): Any = js.native
    def assocAttrs(name: String, key: Unit, attrs: Attributes[Any]): Any = js.native
    def assocAttrs(name: String, key: Unit, attrs: Attributes[Any], buildOptions: BuildOptions): Any = js.native
    
    /**
      * Associate the factory to multiple other models that aren't persisted
      */
    def assocAttrsMany(name: String, num: Double): js.Array[Any] = js.native
    def assocAttrsMany(name: String, num: Double, key: String): js.Array[Any] = js.native
    def assocAttrsMany(name: String, num: Double, key: String, attrs: Unit, buildOptions: BuildOptions): js.Array[Any] = js.native
    def assocAttrsMany(name: String, num: Double, key: String, attrs: Attributes[Any]): js.Array[Any] = js.native
    def assocAttrsMany(name: String, num: Double, key: String, attrs: Attributes[Any], buildOptions: BuildOptions): js.Array[Any] = js.native
    def assocAttrsMany(name: String, num: Double, key: Unit, attrs: Unit, buildOptions: BuildOptions): js.Array[Any] = js.native
    def assocAttrsMany(name: String, num: Double, key: Unit, attrs: Attributes[Any]): js.Array[Any] = js.native
    def assocAttrsMany(name: String, num: Double, key: Unit, attrs: Attributes[Any], buildOptions: BuildOptions): js.Array[Any] = js.native
    
    /**
      * Associate the factory to multiple other models
      */
    def assocMany(name: String, num: Double): js.Array[Any] = js.native
    def assocMany(name: String, num: Double, key: String): js.Array[Any] = js.native
    def assocMany(name: String, num: Double, key: String, attrs: Unit, buildOptions: BuildOptions): js.Array[Any] = js.native
    def assocMany(name: String, num: Double, key: String, attrs: Attributes[Any]): js.Array[Any] = js.native
    def assocMany(name: String, num: Double, key: String, attrs: Attributes[Any], buildOptions: BuildOptions): js.Array[Any] = js.native
    def assocMany(name: String, num: Double, key: Unit, attrs: Unit, buildOptions: BuildOptions): js.Array[Any] = js.native
    def assocMany(name: String, num: Double, key: Unit, attrs: Attributes[Any]): js.Array[Any] = js.native
    def assocMany(name: String, num: Double, key: Unit, attrs: Attributes[Any], buildOptions: BuildOptions): js.Array[Any] = js.native
    
    /**
      * Generates and returns model attributes as an object hash instead of the model instance
      */
    def attrs[T](name: String): js.Promise[T] = js.native
    def attrs[T](name: String, attrs: Unit, buildOptions: BuildOptions): js.Promise[T] = js.native
    def attrs[T](name: String, attrs: Attributes[Partial[T]]): js.Promise[T] = js.native
    def attrs[T](name: String, attrs: Attributes[Partial[T]], buildOptions: BuildOptions): js.Promise[T] = js.native
    
    /**
      * Generates and returns a collection of model attributes as an object hash instead of the model instance
      */
    def attrsMany[T](name: String, num: Double): js.Promise[js.Array[T]] = js.native
    def attrsMany[T](name: String, num: Double, attrs: Unit, buildOptions: js.Array[BuildOptions]): js.Promise[js.Array[T]] = js.native
    def attrsMany[T](name: String, num: Double, attrs: Unit, buildOptions: BuildOptions): js.Promise[js.Array[T]] = js.native
    def attrsMany[T](name: String, num: Double, attrs: MaybeReadonlyArray[Attributes[Partial[T]]]): js.Promise[js.Array[T]] = js.native
    def attrsMany[T](
      name: String,
      num: Double,
      attrs: MaybeReadonlyArray[Attributes[Partial[T]]],
      buildOptions: js.Array[BuildOptions]
    ): js.Promise[js.Array[T]] = js.native
    def attrsMany[T](
      name: String,
      num: Double,
      attrs: MaybeReadonlyArray[Attributes[Partial[T]]],
      buildOptions: BuildOptions
    ): js.Promise[js.Array[T]] = js.native
    
    /**
      * Builds a new model instance that is not persisted
      */
    def build[T](name: String): js.Promise[T] = js.native
    def build[T](name: String, attrs: Unit, buildOptions: BuildOptions): js.Promise[T] = js.native
    def build[T](name: String, attrs: Attributes[Partial[T]]): js.Promise[T] = js.native
    def build[T](name: String, attrs: Attributes[Partial[T]], buildOptions: BuildOptions): js.Promise[T] = js.native
    
    /**
      * Builds an array of model instances that are not persisted
      */
    def buildMany[T](name: String, num: Double): js.Promise[js.Array[T]] = js.native
    def buildMany[T](name: String, num: Double, attrs: Unit, buildOptions: MaybeReadonlyArray[BuildOptions]): js.Promise[js.Array[T]] = js.native
    def buildMany[T](name: String, num: Double, attrs: MaybeReadonlyArray[Attributes[Partial[T]]]): js.Promise[js.Array[T]] = js.native
    def buildMany[T](
      name: String,
      num: Double,
      attrs: MaybeReadonlyArray[Attributes[Partial[T]]],
      buildOptions: MaybeReadonlyArray[BuildOptions]
    ): js.Promise[js.Array[T]] = js.native
    
    def chance(
      chanceMethod: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param options because its type any is not an array type */ options: Any
    ): Any = js.native
    
    /**
      * Destroys all of the created models
      */
    def cleanUp(): Unit = js.native
    
    /**
      * Builds a new model instance that is persisted
      */
    def create[T](name: String): js.Promise[T] = js.native
    def create[T](name: String, attrs: Unit, buildOptions: BuildOptions): js.Promise[T] = js.native
    def create[T](name: String, attrs: Attributes[Partial[T]]): js.Promise[T] = js.native
    def create[T](name: String, attrs: Attributes[Partial[T]], buildOptions: BuildOptions): js.Promise[T] = js.native
    
    def createMany[T](name: String): js.Promise[js.Array[T]] = js.native
    def createMany[T](name: String, attrs: js.Array[Attributes[Partial[T]]]): js.Promise[js.Array[T]] = js.native
    def createMany[T](
      name: String,
      attrs: js.Array[Attributes[Partial[T]]],
      buildOptions: MaybeReadonlyArray[BuildOptions]
    ): js.Promise[js.Array[T]] = js.native
    def createMany[T](name: String, attrs: Unit, buildOptions: MaybeReadonlyArray[BuildOptions]): js.Promise[js.Array[T]] = js.native
    /**
      * Builds an array of model instances that are persisted
      */
    def createMany[T](name: String, num: Double): js.Promise[js.Array[T]] = js.native
    def createMany[T](name: String, num: Double, attrs: Unit, buildOptions: MaybeReadonlyArray[BuildOptions]): js.Promise[js.Array[T]] = js.native
    def createMany[T](name: String, num: Double, attrs: MaybeReadonlyArray[Attributes[Partial[T]]]): js.Promise[js.Array[T]] = js.native
    def createMany[T](
      name: String,
      num: Double,
      attrs: MaybeReadonlyArray[Attributes[Partial[T]]],
      buildOptions: MaybeReadonlyArray[BuildOptions]
    ): js.Promise[js.Array[T]] = js.native
    
    /**
      * Define a new factory with a set of options
      */
    def define[T](name: String, model: Any, attrs: Initializer[Partial[T], BuildOptions]): Unit = js.native
    def define[T](name: String, model: Any, attrs: Initializer[Partial[T], BuildOptions], options: Options[T]): Unit = js.native
    
    /**
      * Extends a factory
      */
    def extend(parent: String, name: String, initializer: Any): Any = js.native
    def extend(parent: String, name: String, initializer: Any, options: Options[Any]): Any = js.native
    
    var factory: Static = js.native
    
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
    def seq(): Generator[Double] = js.native
    def seq(name: String): Generator[Double] = js.native
    def seq[T](fn: js.Function1[/* sequence */ Double, T]): Generator[T] = js.native
    def seq[T](name: String, fn: js.Function1[/* sequence */ Double, T]): Generator[T] = js.native
    
    def sequence(): Generator[Double] = js.native
    def sequence(name: String): Generator[Double] = js.native
    def sequence[T](fn: js.Function1[/* sequence */ Double, T]): Generator[T] = js.native
    def sequence[T](name: String, fn: js.Function1[/* sequence */ Double, T]): Generator[T] = js.native
    
    /**
      * Register an adapter, either as default or tied to a specific model
      */
    def setAdapter(adapter: Any): Unit = js.native
    def setAdapter(adapter: Any, name: String): Unit = js.native
  }
  
  type _To = Static
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Static = ^
}
