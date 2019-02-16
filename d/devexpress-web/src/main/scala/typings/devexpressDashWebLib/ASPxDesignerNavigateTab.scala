package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides functionality for a tab displayed a report in the Web Report Designer.
  */
@js.native
trait ASPxDesignerNavigateTab extends js.Object {
  /**
    * Provides access to a value that specifies the display name of the current tab.
    * Value: A knockout computed string that specifies the tab's display name.
    */
  var displayName: js.Any = js.native
  var isModified: js.Any = js.native
  /**
    * Provides access to a report opened in the current tab.
    * Value: A knockout observable object that specifies a report opened in the current tab.
    */
  @JSName("report")
  var report_Original: knockoutLib.KnockoutObservable[js.Object] = js.native
  /**
    * Provides access to an engine that manages undo and redo operations in the Web Report Designer.
    * Value: An object that specifies an undo/redo engine.
    */
  var undoEngine: ASPxDesignerUndoEngine = js.native
  /**
    * Provides access to the URL of a report opened in the current tab.
    * Value: A knockout observable string that specifies the report URL.
    */
  var url: js.Any = js.native
  def refresh(): scala.Unit = js.native
  /**
    * Provides access to a report opened in the current tab.
    * Value: A knockout observable object that specifies a report opened in the current tab.
    */
  def report(): js.Object = js.native
  /**
    * Provides access to a report opened in the current tab.
    * Value: A knockout observable object that specifies a report opened in the current tab.
    */
  def report(value: js.Object): scala.Unit = js.native
  def resetIsModified(): scala.Unit = js.native
}

