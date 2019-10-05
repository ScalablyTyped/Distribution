package typings.dojo.dojox.treemap

import typings.dojo.dijit._FocusMixin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/treemap/Keyboard.html
  *
  * Specializes TreeMap to support keyboard navigation and accessibility.
  *
  */
@JSGlobal("dojox.treemap.Keyboard")
@js.native
class Keyboard () extends _FocusMixin {
  /**
    * Order fields are traversed when user hits the tab key
    *
    */
  var tabIndex: String = js.native
  /**
    *
    * @param item
    * @param level
    * @param kind
    */
  def createRenderer(item: js.Any, level: js.Any, kind: js.Any): js.Any = js.native
  /**
    *
    */
  def postCreate(): Unit = js.native
}

