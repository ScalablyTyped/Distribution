package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitterResizedEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the value based on current splitter position.
    */
  var currentSplitterPosition: js.UndefOr[java.lang.String] = js.undefined
  /** To set custom position for splitter after resize action.
    */
  var customSplitterPosition: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the value to differentiate whether splitter resizing is performed either by manual resizing or by method
    */
  var isOnResize: js.UndefOr[scala.Boolean] = js.undefined
  /** To differentiate `customSplitterPosition` value was index or position.
    */
  var isSplitterIndex: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the previous splitter position
    */
  var prevSplitterPosition: js.UndefOr[java.lang.String] = js.undefined
}

object SplitterResizedEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    currentSplitterPosition: java.lang.String = null,
    customSplitterPosition: java.lang.String = null,
    isOnResize: js.UndefOr[scala.Boolean] = js.undefined,
    isSplitterIndex: js.UndefOr[scala.Boolean] = js.undefined,
    prevSplitterPosition: java.lang.String = null
  ): SplitterResizedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (currentSplitterPosition != null) __obj.updateDynamic("currentSplitterPosition")(currentSplitterPosition)
    if (customSplitterPosition != null) __obj.updateDynamic("customSplitterPosition")(customSplitterPosition)
    if (!js.isUndefined(isOnResize)) __obj.updateDynamic("isOnResize")(isOnResize)
    if (!js.isUndefined(isSplitterIndex)) __obj.updateDynamic("isSplitterIndex")(isSplitterIndex)
    if (prevSplitterPosition != null) __obj.updateDynamic("prevSplitterPosition")(prevSplitterPosition)
    __obj.asInstanceOf[SplitterResizedEventArgs]
  }
}

