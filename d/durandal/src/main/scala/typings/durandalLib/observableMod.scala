package typings
package durandalLib

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
object observableMod extends js.Object {
  def apply(obj: js.Any, property: java.lang.String): knockoutLib.KnockoutObservable[_] = js.native
  def convertObject(obj: js.Any): scala.Unit = js.native
  def convertProperty(obj: js.Any, propertyName: java.lang.String): knockoutLib.KnockoutObservable[_] = js.native
  def convertProperty(obj: js.Any, propertyName: java.lang.String, original: js.Any): knockoutLib.KnockoutObservable[_] = js.native
  def defineProperty[T](obj: js.Any, propertyName: java.lang.String): knockoutLib.KnockoutComputed[T] = js.native
  def defineProperty[T](
    obj: js.Any,
    propertyName: java.lang.String,
    evaluatorOrOptions: knockoutLib.KnockoutComputedDefine[T]
  ): knockoutLib.KnockoutComputed[T] = js.native
  def install(config: js.Object): scala.Unit = js.native
}

