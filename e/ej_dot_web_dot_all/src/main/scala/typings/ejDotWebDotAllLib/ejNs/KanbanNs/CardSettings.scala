package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardSettings extends js.Object {
  /** To customize the card border color based on assigned task. Colors and corresponding values defined here will be mapped with colorField mapped data source column.
    * @Default {Object}
    */
  var colorMapping: js.UndefOr[js.Any] = js.undefined
  /** This specifies the Kanban card to drop into particular target element.
    */
  var externalDropTarget: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates to add the template for card .
    * @Default {null}
    */
  var template: js.UndefOr[java.lang.String] = js.undefined
}

