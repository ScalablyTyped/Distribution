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

