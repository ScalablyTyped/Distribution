package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait KanbanSwimlane extends js.Object {
  /** Collapse all the swimlane rows in Kanban.
               * @returns {void}
               */
  def collapseAll(): scala.Unit
  /** Expand all the swimlane rows in Kanban.
               * @returns {void}
               */
  def expandAll(): scala.Unit
  /** Expand or collapse the swimlane row based on the state of target &quot;div&quot;
               * @param {any} Pass the div object to toggleSwimlane row based on its row state
               * @returns {void}
               */
  def toggle($div: js.Any): scala.Unit
}

