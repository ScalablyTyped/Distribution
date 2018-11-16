package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ScrollSettings extends js.Object {
  /** To allow the Kanban to freeze particular swimlane at the time of scrolling , until scroll reaches next swimlane and it continues.
               * @Default {false}
               */
  var allowFreezeSwimlane: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets an object that indicates to render the Kanban with specified scroll height.
               * @Default {0}
               */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Gets or sets an object that indicates to render the Kanban with specified scroll width.
               * @Default {auto}
               */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

