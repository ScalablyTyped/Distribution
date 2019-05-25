package typings
package ejDotWebDotAllLib.ejNs.ReportViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintProgressChangedEventArgs extends js.Object {
  /** returns ReportViewer container Id.
    */
  var containerId: js.UndefOr[java.lang.String] = js.undefined
  /** returns the currentPage value
    */
  var currentPage: js.UndefOr[java.lang.String] = js.undefined
  /** true if the event should be handled; otherwise, false.
    */
  var handled: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the stage of export processing.
    */
  var stage: js.UndefOr[java.lang.String] = js.undefined
  /** returns the totalPages value
    */
  var totalPages: js.UndefOr[java.lang.String] = js.undefined
}

object PrintProgressChangedEventArgs {
  @scala.inline
  def apply(
    containerId: java.lang.String = null,
    currentPage: java.lang.String = null,
    handled: js.UndefOr[scala.Boolean] = js.undefined,
    stage: java.lang.String = null,
    totalPages: java.lang.String = null
  ): PrintProgressChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (containerId != null) __obj.updateDynamic("containerId")(containerId)
    if (currentPage != null) __obj.updateDynamic("currentPage")(currentPage)
    if (!js.isUndefined(handled)) __obj.updateDynamic("handled")(handled)
    if (stage != null) __obj.updateDynamic("stage")(stage)
    if (totalPages != null) __obj.updateDynamic("totalPages")(totalPages)
    __obj.asInstanceOf[PrintProgressChangedEventArgs]
  }
}

