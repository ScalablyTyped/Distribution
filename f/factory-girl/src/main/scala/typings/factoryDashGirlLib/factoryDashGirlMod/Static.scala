package typings
package factoryDashGirlLib.factoryDashGirlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends js.Object {
  /**
    * Associate the factory to other model
    */
  def assoc(model: java.lang.String, attributes: java.lang.String): js.Any = js.native
  /**
    * Associate the factory to a model that's not persisted
    */
  def assocAttrs(name: java.lang.String): js.Any = js.native
  def assocAttrs(name: java.lang.String, key: java.lang.String): js.Any = js.native
  def assocAttrs(name: java.lang.String, key: java.lang.String, attributes: js.Any): js.Any = js.native
  /**
    * Associate the factory to multiple other models
    */
  def assocMany(model: java.lang.String, num: scala.Double, attributes: java.lang.String): js.Array[_] = js.native
  /**
    * Generates and returns model attributes as an object hash instead of the model instance
    */
  def attrs[T](name: java.lang.String): js.Promise[T] = js.native
  def attrs[T](name: java.lang.String, attrs: stdLib.Partial[T]): js.Promise[T] = js.native
  /**
    * Generates and returns a collection of model attributes as an object hash instead of the model instance
    */
  def attrsMany[T](name: java.lang.String, num: scala.Double): js.Promise[js.Array[T]] = js.native
  def attrsMany[T](name: java.lang.String, num: scala.Double, attrs: js.Array[stdLib.Partial[T]]): js.Promise[js.Array[T]] = js.native
  /**
    * Builds a new model instance that is not persisted
    */
  def build[T](name: java.lang.String): js.Promise[T] = js.native
  def build[T](name: java.lang.String, attrs: stdLib.Partial[T]): js.Promise[T] = js.native
  def buildMany[T](name: java.lang.String): js.Promise[js.Array[T]] = js.native
  def buildMany[T](name: java.lang.String, attrs: js.Array[stdLib.Partial[T]]): js.Promise[js.Array[T]] = js.native
  /**
    * Builds an array of model instances that are persisted
    */
  def buildMany[T](name: java.lang.String, num: scala.Double): js.Promise[js.Array[T]] = js.native
  def buildMany[T](name: java.lang.String, num: scala.Double, attrs: stdLib.Partial[T]): js.Promise[js.Array[T]] = js.native
  /**
    * Destroys all of the created models
    */
  def cleanUp(): scala.Unit = js.native
  /**
    * Builds a new model instance that is persisted
    */
  def create[T](name: java.lang.String): js.Promise[T] = js.native
  def create[T](name: java.lang.String, attrs: stdLib.Partial[T]): js.Promise[T] = js.native
  def createMany[T](name: java.lang.String): js.Promise[js.Array[T]] = js.native
  def createMany[T](name: java.lang.String, attrs: js.Array[stdLib.Partial[T]]): js.Promise[js.Array[T]] = js.native
  def createMany[T](name: java.lang.String, attrs: js.Array[stdLib.Partial[T]], buildOptions: Options[T]): js.Promise[js.Array[T]] = js.native
  /**
    * Builds an array of model instances that are persisted
    */
  def createMany[T](name: java.lang.String, num: scala.Double): js.Promise[js.Array[T]] = js.native
  def createMany[T](name: java.lang.String, num: scala.Double, attrs: stdLib.Partial[T]): js.Promise[js.Array[T]] = js.native
  def createMany[T](name: java.lang.String, num: scala.Double, attrs: stdLib.Partial[T], buildOptions: Options[T]): js.Promise[js.Array[T]] = js.native
  /**
    * Define a new factory with a set of options
    */
  def define[T](name: java.lang.String, model: js.Any, attrs: T): scala.Unit = js.native
  def define[T](name: java.lang.String, model: js.Any, attrs: T, options: Options[T]): scala.Unit = js.native
  /**
    * Extends a factory
    */
  def extend(parent: java.lang.String, name: java.lang.String, initializer: js.Any): js.Any = js.native
  def extend(parent: java.lang.String, name: java.lang.String, initializer: js.Any, options: Options[_]): js.Any = js.native
  /**
    * Generate values sequentially inside a factory
    */
  def seq[T](name: java.lang.String, fn: js.Function1[/* sequence */ scala.Double, T]): T = js.native
  /**
    * Register an adapter, either as default or tied to a specific model
    */
  def setAdapter(adapter: js.Any): scala.Unit = js.native
  def setAdapter(adapter: js.Any, name: java.lang.String): scala.Unit = js.native
}

