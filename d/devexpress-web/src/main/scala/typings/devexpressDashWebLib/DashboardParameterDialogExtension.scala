package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A Web Dashboard extension that is the Dashboard Parameters dialog.
 */

trait DashboardParameterDialogExtension extends IExtension {
  /**
       * Gets or sets whether to show the Dashboard Parameters button in the dashboard title.
       * Value: true, to show the Dashboard Parameters button; otherwise, false.
       */
  var showDialogButton: KnockoutObservableBoolean
  /**
       * Closes the Dashboard Parameters dialog.
       */
  def hide(): scala.Unit
  /**
       * Renders the content of the Dashboard Parameters dialog inside the specified JQuery element.
       * @param element A JQuery element where the Dashboard Parameters dialog content is rendered.
       */
  def renderContent(element: Element): ParameterDialogContent
  /**
       * Invokes the Dashboard Parameters dialog.
       */
  def show(): scala.Unit
  /**
       * Allows you to be notified about the dashboard parameter settings changes.
       * @param callback A custom function.
       */
  def subscribeToContentChanges(callback: js.Function): js.Object
}

