package typings.dojo.dojox.drawing.tools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/tools/Path.html
  *
  * Class for a drawable Path
  *
  */
@JSGlobal("dojox.drawing.tools.Path")
@js.native
class Path_ ()
  extends typings.dojo.dojox.drawing.stencil.Path {
  /**
    *
    */
  var draws: Boolean = js.native
  /**
    *
    */
  var setup: js.Object = js.native
  /**
    *
    * @param obj
    */
  def createGuide(obj: js.Any): Unit = js.native
  /**
    *
    * @param _closePath
    */
  def makeSubPath(_closePath: js.Any): Unit = js.native
  /**
    *
    * @param _closePath
    */
  def onCompletePath(_closePath: js.Any): Unit = js.native
  /**
    *
    * @param obj
    */
  def onDown(obj: js.Any): Unit = js.native
  /**
    *
    * @param obj
    */
  def onDrag(obj: js.Any): Unit = js.native
  /**
    *
    * @param obj
    */
  def onMove(obj: js.Any): Unit = js.native
  /**
    *
    * @param obj
    */
  def onStartPath(obj: js.Any): Unit = js.native
}

