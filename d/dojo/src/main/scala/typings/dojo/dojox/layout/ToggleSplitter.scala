package typings.dojo.dojox.layout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/layout/ToggleSplitter.html
  *
  * A draggable and clickable spacer between two items in a dijit.layout.BorderContainer.
  * This is instantiated by dijit.layout.BorderContainer. Users should not
  * create it directly.
  *
  */
@JSGlobal("dojox.layout.ToggleSplitter")
@js.native
class ToggleSplitter () extends js.Object {
  /**
    *
    */
  var baseClass: String = js.native
  /**
    * Pointer to the pane associated with this splitter
    *
    */
  var child: js.Object = js.native
  /**
    * Pointer to the parent BorderContainer
    *
    */
  var container: js.Object = js.native
  /**
    * Region of pane associated with this splitter.
    * "top", "bottom", "left", "right".
    *
    */
  var region: String = js.native
  /**
    * the initial and current state of the splitter (and its attached pane)
    * It has three values: full, collapsed (optional), closed
    *
    */
  var state: String = js.native
  /**
    *
    */
  var templateString: String = js.native
  /**
    *
    * @param pane
    */
  def onClosed(pane: js.Any): Unit = js.native
  /**
    *
    * @param pane
    */
  def onCollapsed(pane: js.Any): Unit = js.native
  /**
    *
    * @param pane
    */
  def onOpen(pane: js.Any): Unit = js.native
  /**
    *
    */
  def postCreate(): Unit = js.native
  /**
    *
    */
  def startup(): js.Function = js.native
}

