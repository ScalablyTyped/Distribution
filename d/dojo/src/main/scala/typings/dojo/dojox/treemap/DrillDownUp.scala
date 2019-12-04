package typings.dojo.dojox.treemap

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/treemap/DrillDownUp.html
  *
  * Specializes TreeMap to support drill down and up operations.
  *
  */
@JSGlobal("dojox.treemap.DrillDownUp")
@js.native
class DrillDownUp () extends js.Object {
  /**
    * Drill up from the given renderer.
    *
    * @param renderer The item renderer.
    */
  def drillDown(renderer: HTMLElement): Unit = js.native
  /**
    * Drill up from the given renderer.
    *
    * @param renderer The item renderer.
    */
  def drillUp(renderer: HTMLElement): Unit = js.native
  /**
    *
    */
  def postCreate(): Unit = js.native
}

