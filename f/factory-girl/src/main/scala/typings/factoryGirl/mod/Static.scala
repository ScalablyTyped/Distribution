package typings.factoryGirl.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Static extends js.Object {
  
  /**
    * Associate the factory to other model
    */
  def assoc(model: String, attributes: String): js.Any = js.native
  
  /**
    * Associate the factory to a model that's not persisted
    */
  def assocAttrs(name: String): js.Any = js.native
  def assocAttrs(name: String, key: js.UndefOr[scala.Nothing], attributes: js.Any): js.Any = js.native
  def assocAttrs(name: String, key: String): js.Any = js.native
  def assocAttrs(name: String, key: String, attributes: js.Any): js.Any = js.native
  
  /**
    * Associate the factory to multiple other models
    */
  def assocMany(model: String, num: Double, attributes: String): js.Array[_] = js.native
  
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
  def createMany[T](name: String, attrs: js.UndefOr[scala.Nothing], buildOptions: Options[T]): js.Promise[js.Array[T]] = js.native
  def createMany[T](name: String, attrs: js.Array[Attributes[Partial[T]]]): js.Promise[js.Array[T]] = js.native
  def createMany[T](name: String, attrs: js.Array[Attributes[Partial[T]]], buildOptions: Options[T]): js.Promise[js.Array[T]] = js.native
  /**
    * Builds an array of model instances that are persisted
    */
  def createMany[T](name: String, num: Double): js.Promise[js.Array[T]] = js.native
  def createMany[T](name: String, num: Double, attrs: js.UndefOr[Attributes[Partial[T]]], buildOptions: Options[T]): js.Promise[js.Array[T]] = js.native
  def createMany[T](name: String, num: Double, attrs: Attributes[Partial[T]]): js.Promise[js.Array[T]] = js.native
  
  /**
    * Define a new factory with a set of options
    */
  def define[T](name: String, model: js.Any, attrs: Attributes[T]): Unit = js.native
  def define[T](name: String, model: js.Any, attrs: Attributes[T], options: Options[T]): Unit = js.native
  
  /**
    * Extends a factory
    */
  def extend(parent: String, name: String, initializer: js.Any): js.Any = js.native
  def extend(parent: String, name: String, initializer: js.Any, options: Options[_]): js.Any = js.native
  
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
