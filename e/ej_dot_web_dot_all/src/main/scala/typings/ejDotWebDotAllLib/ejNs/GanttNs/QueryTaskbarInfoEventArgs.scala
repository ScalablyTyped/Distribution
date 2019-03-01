package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryTaskbarInfoEventArgs extends js.Object {
  /** Returns the progressbar background of current item.
    */
  var ProgressbarBackground: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the taskbar background of current item.
    */
  var TaskbarBackground: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the data of the record.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the parent progressbar background of current item.
    */
  var parentProgressbarBackground: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the parent taskbar background of current item.
    */
  var parentTaskbarBackground: js.UndefOr[java.lang.String] = js.undefined
}

object QueryTaskbarInfoEventArgs {
  @scala.inline
  def apply(
    ProgressbarBackground: java.lang.String = null,
    TaskbarBackground: java.lang.String = null,
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    data: js.Any = null,
    parentProgressbarBackground: java.lang.String = null,
    parentTaskbarBackground: java.lang.String = null
  ): QueryTaskbarInfoEventArgs = {
    val __obj = js.Dynamic.literal()
    if (ProgressbarBackground != null) __obj.updateDynamic("ProgressbarBackground")(ProgressbarBackground)
    if (TaskbarBackground != null) __obj.updateDynamic("TaskbarBackground")(TaskbarBackground)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (parentProgressbarBackground != null) __obj.updateDynamic("parentProgressbarBackground")(parentProgressbarBackground)
    if (parentTaskbarBackground != null) __obj.updateDynamic("parentTaskbarBackground")(parentTaskbarBackground)
    __obj.asInstanceOf[QueryTaskbarInfoEventArgs]
  }
}

