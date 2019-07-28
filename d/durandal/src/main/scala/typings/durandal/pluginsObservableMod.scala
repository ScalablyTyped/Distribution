package typings.durandal

import typings.knockout.KnockoutComputed
import typings.knockout.KnockoutComputedDefine
import typings.knockout.KnockoutObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enables automatic observability of plain javascript object for ES5 compatible browsers. Also, converts promise properties into observables that are updated when the promise resolves.
  * @requires system
  * @requires binder
  * @requires knockout
  */
@JSImport("plugins/observable", JSImport.Namespace)
@js.native
object pluginsObservableMod extends js.Object {
  def apply(obj: js.Any, property: String): KnockoutObservable[_] = js.native
  def convertObject(obj: js.Any): Unit = js.native
  def convertProperty(obj: js.Any, propertyName: String): KnockoutObservable[_] = js.native
  def convertProperty(obj: js.Any, propertyName: String, original: js.Any): KnockoutObservable[_] = js.native
  def defineProperty[T](obj: js.Any, propertyName: String): KnockoutComputed[T] = js.native
  def defineProperty[T](obj: js.Any, propertyName: String, evaluatorOrOptions: KnockoutComputedDefine[T]): KnockoutComputed[T] = js.native
  def install(config: js.Object): Unit = js.native
}

