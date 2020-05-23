package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryTaskbarInfoEventArgs extends js.Object {
  /** Returns the baseline background of current item.
    */
  var baselineBackground: js.UndefOr[String] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the data of the record.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the milestone background of current item.
    */
  var milestoneBackground: js.UndefOr[String] = js.undefined
  /** Returns the parent progressbar background of current item.
    */
  var parentProgressbarBackground: js.UndefOr[String] = js.undefined
  /** Returns the parent progressbar border color of current item.
    */
  var parentProgressbarBorder: js.UndefOr[String] = js.undefined
  /** Returns the parent taskbar background of current item.
    */
  var parentTaskbarBackground: js.UndefOr[String] = js.undefined
  /** Returns the parent taskbar border color of current item.
    */
  var parentTaskbarBorder: js.UndefOr[String] = js.undefined
  /** Returns the progressbar background of current item.
    */
  var progressbarBackground: js.UndefOr[String] = js.undefined
  /** Returns the progressbar border color of current item.
    */
  var progressbarBorder: js.UndefOr[String] = js.undefined
  /** Returns the taskbar background of current item.
    */
  var taskbarBackground: js.UndefOr[String] = js.undefined
  /** Returns the taskbar border color of current item.
    */
  var taskbarBorder: js.UndefOr[String] = js.undefined
  /** Returns the taskbar text color of current item.
    */
  var taskbarTextColor: js.UndefOr[String] = js.undefined
}

object QueryTaskbarInfoEventArgs {
  @scala.inline
  def apply(
    baselineBackground: String = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    milestoneBackground: String = null,
    parentProgressbarBackground: String = null,
    parentProgressbarBorder: String = null,
    parentTaskbarBackground: String = null,
    parentTaskbarBorder: String = null,
    progressbarBackground: String = null,
    progressbarBorder: String = null,
    taskbarBackground: String = null,
    taskbarBorder: String = null,
    taskbarTextColor: String = null
  ): QueryTaskbarInfoEventArgs = {
    val __obj = js.Dynamic.literal()
    if (baselineBackground != null) __obj.updateDynamic("baselineBackground")(baselineBackground.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (milestoneBackground != null) __obj.updateDynamic("milestoneBackground")(milestoneBackground.asInstanceOf[js.Any])
    if (parentProgressbarBackground != null) __obj.updateDynamic("parentProgressbarBackground")(parentProgressbarBackground.asInstanceOf[js.Any])
    if (parentProgressbarBorder != null) __obj.updateDynamic("parentProgressbarBorder")(parentProgressbarBorder.asInstanceOf[js.Any])
    if (parentTaskbarBackground != null) __obj.updateDynamic("parentTaskbarBackground")(parentTaskbarBackground.asInstanceOf[js.Any])
    if (parentTaskbarBorder != null) __obj.updateDynamic("parentTaskbarBorder")(parentTaskbarBorder.asInstanceOf[js.Any])
    if (progressbarBackground != null) __obj.updateDynamic("progressbarBackground")(progressbarBackground.asInstanceOf[js.Any])
    if (progressbarBorder != null) __obj.updateDynamic("progressbarBorder")(progressbarBorder.asInstanceOf[js.Any])
    if (taskbarBackground != null) __obj.updateDynamic("taskbarBackground")(taskbarBackground.asInstanceOf[js.Any])
    if (taskbarBorder != null) __obj.updateDynamic("taskbarBorder")(taskbarBorder.asInstanceOf[js.Any])
    if (taskbarTextColor != null) __obj.updateDynamic("taskbarTextColor")(taskbarTextColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryTaskbarInfoEventArgs]
  }
}

