package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryTaskbarInfoEventArgs extends js.Object {
  /** Returns the baseline background of current item.
    */
  var baselineBackground: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the data of the record.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the milestone background of current item.
    */
  var milestoneBackground: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the parent progressbar background of current item.
    */
  var parentProgressbarBackground: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the parent progressbar border color of current item.
    */
  var parentProgressbarBorder: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the parent taskbar background of current item.
    */
  var parentTaskbarBackground: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the parent taskbar border color of current item.
    */
  var parentTaskbarBorder: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the progressbar background of current item.
    */
  var progressbarBackground: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the progressbar border color of current item.
    */
  var progressbarBorder: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the taskbar background of current item.
    */
  var taskbarBackground: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the taskbar border color of current item.
    */
  var taskbarBorder: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the taskbar text color of current item.
    */
  var taskbarTextColor: js.UndefOr[java.lang.String] = js.undefined
}

object QueryTaskbarInfoEventArgs {
  @scala.inline
  def apply(
    baselineBackground: java.lang.String = null,
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    data: js.Any = null,
    milestoneBackground: java.lang.String = null,
    parentProgressbarBackground: java.lang.String = null,
    parentProgressbarBorder: java.lang.String = null,
    parentTaskbarBackground: java.lang.String = null,
    parentTaskbarBorder: java.lang.String = null,
    progressbarBackground: java.lang.String = null,
    progressbarBorder: java.lang.String = null,
    taskbarBackground: java.lang.String = null,
    taskbarBorder: java.lang.String = null,
    taskbarTextColor: java.lang.String = null
  ): QueryTaskbarInfoEventArgs = {
    val __obj = js.Dynamic.literal()
    if (baselineBackground != null) __obj.updateDynamic("baselineBackground")(baselineBackground)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (milestoneBackground != null) __obj.updateDynamic("milestoneBackground")(milestoneBackground)
    if (parentProgressbarBackground != null) __obj.updateDynamic("parentProgressbarBackground")(parentProgressbarBackground)
    if (parentProgressbarBorder != null) __obj.updateDynamic("parentProgressbarBorder")(parentProgressbarBorder)
    if (parentTaskbarBackground != null) __obj.updateDynamic("parentTaskbarBackground")(parentTaskbarBackground)
    if (parentTaskbarBorder != null) __obj.updateDynamic("parentTaskbarBorder")(parentTaskbarBorder)
    if (progressbarBackground != null) __obj.updateDynamic("progressbarBackground")(progressbarBackground)
    if (progressbarBorder != null) __obj.updateDynamic("progressbarBorder")(progressbarBorder)
    if (taskbarBackground != null) __obj.updateDynamic("taskbarBackground")(taskbarBackground)
    if (taskbarBorder != null) __obj.updateDynamic("taskbarBorder")(taskbarBorder)
    if (taskbarTextColor != null) __obj.updateDynamic("taskbarTextColor")(taskbarTextColor)
    __obj.asInstanceOf[QueryTaskbarInfoEventArgs]
  }
}

