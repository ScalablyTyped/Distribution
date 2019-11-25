package typings.ejDotWebDotAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitterResizedEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the value based on current splitter position.
    */
  var currentSplitterPosition: js.UndefOr[String] = js.undefined
  /** To set custom position for splitter after resize action.
    */
  var customSplitterPosition: js.UndefOr[String] = js.undefined
  /** Returns the value to differentiate whether splitter resizing is performed either by manual resizing or by method
    */
  var isOnResize: js.UndefOr[Boolean] = js.undefined
  /** To differentiate `customSplitterPosition` value was index or position.
    */
  var isSplitterIndex: js.UndefOr[Boolean] = js.undefined
  /** Returns the previous splitter position
    */
  var prevSplitterPosition: js.UndefOr[String] = js.undefined
}

object SplitterResizedEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    currentSplitterPosition: String = null,
    customSplitterPosition: String = null,
    isOnResize: js.UndefOr[Boolean] = js.undefined,
    isSplitterIndex: js.UndefOr[Boolean] = js.undefined,
    prevSplitterPosition: String = null
  ): SplitterResizedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (currentSplitterPosition != null) __obj.updateDynamic("currentSplitterPosition")(currentSplitterPosition.asInstanceOf[js.Any])
    if (customSplitterPosition != null) __obj.updateDynamic("customSplitterPosition")(customSplitterPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(isOnResize)) __obj.updateDynamic("isOnResize")(isOnResize.asInstanceOf[js.Any])
    if (!js.isUndefined(isSplitterIndex)) __obj.updateDynamic("isSplitterIndex")(isSplitterIndex.asInstanceOf[js.Any])
    if (prevSplitterPosition != null) __obj.updateDynamic("prevSplitterPosition")(prevSplitterPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitterResizedEventArgs]
  }
}

