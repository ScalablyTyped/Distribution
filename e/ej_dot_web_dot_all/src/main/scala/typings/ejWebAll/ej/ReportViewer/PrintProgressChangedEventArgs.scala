package typings.ejWebAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintProgressChangedEventArgs extends js.Object {
  /** returns ReportViewer container Id.
    */
  var containerId: js.UndefOr[String] = js.undefined
  /** returns the currentPage value
    */
  var currentPage: js.UndefOr[String] = js.undefined
  /** true if the event should be handled; otherwise, false.
    */
  var handled: js.UndefOr[Boolean] = js.undefined
  /** returns the stage of export processing.
    */
  var stage: js.UndefOr[String] = js.undefined
  /** returns the totalPages value
    */
  var totalPages: js.UndefOr[String] = js.undefined
}

object PrintProgressChangedEventArgs {
  @scala.inline
  def apply(
    containerId: String = null,
    currentPage: String = null,
    handled: js.UndefOr[Boolean] = js.undefined,
    stage: String = null,
    totalPages: String = null
  ): PrintProgressChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (currentPage != null) __obj.updateDynamic("currentPage")(currentPage.asInstanceOf[js.Any])
    if (!js.isUndefined(handled)) __obj.updateDynamic("handled")(handled.asInstanceOf[js.Any])
    if (stage != null) __obj.updateDynamic("stage")(stage.asInstanceOf[js.Any])
    if (totalPages != null) __obj.updateDynamic("totalPages")(totalPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintProgressChangedEventArgs]
  }
}

