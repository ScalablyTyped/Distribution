package typings.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx.defaultLine.html
  *
  * An object defining the default Line prototype.
  *
  */
trait defaultLine extends js.Object {
  /**
    * Specifies this is a Line, value 'line'
    *
    */
  var `type`: String
  /**
    * The X coordinate of the start of the line, default value 0.
    *
    */
  var x1: Double
  /**
    * The X coordinate of the end of the line, default value 100.
    *
    */
  var x2: Double
  /**
    * The Y coordinate of the start of the line, default value 0.
    *
    */
  var y1: Double
  /**
    * The Y coordinate of the end of the line, default value 100.
    *
    */
  var y2: Double
}

object defaultLine {
  @scala.inline
  def apply(`type`: String, x1: Double, x2: Double, y1: Double, y2: Double): defaultLine = {
    val __obj = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultLine]
  }
}

