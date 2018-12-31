package typings
package ejDotWebDotAllLib.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategorizeSettings extends js.Object {
  /** When set to true, enables the multiple selection of categories to be applied for the appointments.
    * @Default {false}
    */
  var allowMultiple: js.UndefOr[scala.Boolean] = js.undefined
  /** Binds color field name in the dataSource to category color.
    * @Default {color}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** The dataSource option accepts either the JSON object collection or DataManager [ej.DataManager] instance that contains the categorize data.
    */
  var dataSource: js.UndefOr[js.Array[_] | js.Any] = js.undefined
  /** When set to true, enables the categories option to be applied for the appointments.
    * @Default {false}
    */
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  /** Binds fontColor field name in the dataSource to category font.
    * @Default {fontColor}
    */
  var fontColor: js.UndefOr[java.lang.String] = js.undefined
  /** Binds id field name in the dataSource to id of category data.
    * @Default {id}
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Binds text field name in the dataSource to category text.
    * @Default {text}
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

