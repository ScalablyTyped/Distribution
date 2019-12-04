package typings.dojo.dojox.treemap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/treemap/GroupLabel.html
  *
  * Specializes TreeMap to remove leaf labels and display group labels centered on group
  * content instead of display them in headers.
  *
  */
@JSGlobal("dojox.treemap.GroupLabel")
@js.native
class GroupLabel () extends js.Object {
  /**
    *
    * @param item
    * @param level
    * @param kind
    */
  def createRenderer(item: js.Any, level: js.Any, kind: js.Any): js.Any = js.native
  /**
    *
    * @param renderer
    * @param item
    * @param level
    * @param kind
    */
  def styleRenderer(renderer: js.Any, item: js.Any, level: js.Any, kind: js.Any): Unit = js.native
}

