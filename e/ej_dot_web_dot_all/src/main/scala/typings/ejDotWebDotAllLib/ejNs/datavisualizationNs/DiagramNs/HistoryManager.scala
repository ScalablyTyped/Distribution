package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HistoryManager extends js.Object {
  /** A method that takes a history entry as argument and returns whether the specific entry can be popped or not
               */
  var canPop: js.UndefOr[js.Any] = js.undefined
  /** A method that ends grouping the changes
               */
  var closeGroupAction: js.UndefOr[js.Any] = js.undefined
  /** A method that removes the history of a recent change made in diagram
               */
  var pop: js.UndefOr[js.Any] = js.undefined
  /** A method that allows to track the custom changes made in diagram
               */
  var push: js.UndefOr[js.Any] = js.undefined
  /** Defines what should be happened while trying to restore a custom change
               * @Default {null}
               */
  var redo: js.UndefOr[js.Any] = js.undefined
  /** The redoStack property is used to get the number of redo actions to be stored on the history manager. Its an read-only property and the collection should not be modified.
               * @Default {[]}
               */
  var redoStack: js.UndefOr[js.Array[_]] = js.undefined
  /** The stackLimit property used to restrict the undo and redo actions to a certain limit.
               * @Default {null}
               */
  var stackLimit: js.UndefOr[scala.Double] = js.undefined
  /** A method that starts to group the changes to revert/restore them in a single undo or redo
               */
  var startGroupAction: js.UndefOr[js.Any] = js.undefined
  /** Defines what should be happened while trying to revert a custom change
               */
  var undo: js.UndefOr[js.Any] = js.undefined
  /** The undoStack property is used to get the number of undo actions to be stored on the history manager. Its an read-only property and the collection should not be modified.
               * @Default {[]}
               */
  var undoStack: js.UndefOr[js.Array[_]] = js.undefined
}

