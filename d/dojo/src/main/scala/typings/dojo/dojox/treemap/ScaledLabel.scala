package typings.dojo.dojox.treemap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/treemap/ScaledLabel.html
  *
  * Specializes TreeMap to display scaled leaf labels instead of constant size labels.
  *
  */
@JSGlobal("dojox.treemap.ScaledLabel")
@js.native
class ScaledLabel () extends js.Object {
  /**
    *
    * @param item
    * @param level
    * @param kind
    */
  def createRenderer(item: js.Any, level: js.Any, kind: js.Any): js.Any = js.native
  /**
    *
    * @param evt
    */
  def onRendererUpdated(evt: js.Any): Unit = js.native
  /**
    *
    * @param renderer
    * @param item
    * @param level
    * @param kind
    */
  def styleRenderer(renderer: js.Any, item: js.Any, level: js.Any, kind: js.Any): Unit = js.native
}

