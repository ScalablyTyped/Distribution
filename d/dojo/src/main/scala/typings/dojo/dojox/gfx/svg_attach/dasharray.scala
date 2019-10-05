package typings.dojo.dojox.gfx.svg_attach

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/svg_attach.dasharray.html
  *
  *
  */
trait dasharray extends js.Object {
  /**
    *
    */
  var dash: js.Array[_]
  /**
    *
    */
  var dashdot: js.Array[_]
  /**
    *
    */
  var dot: js.Array[_]
  /**
    *
    */
  var longdash: js.Array[_]
  /**
    *
    */
  var longdashdot: js.Array[_]
  /**
    *
    */
  var longdashdotdot: js.Array[_]
  /**
    *
    */
  var shortdash: js.Array[_]
  /**
    *
    */
  var shortdashdot: js.Array[_]
  /**
    *
    */
  var shortdashdotdot: js.Array[_]
  /**
    *
    */
  var shortdot: js.Array[_]
  /**
    *
    */
  var solid: String
}

object dasharray {
  @scala.inline
  def apply(
    dash: js.Array[_],
    dashdot: js.Array[_],
    dot: js.Array[_],
    longdash: js.Array[_],
    longdashdot: js.Array[_],
    longdashdotdot: js.Array[_],
    shortdash: js.Array[_],
    shortdashdot: js.Array[_],
    shortdashdotdot: js.Array[_],
    shortdot: js.Array[_],
    solid: String
  ): dasharray = {
    val __obj = js.Dynamic.literal(dash = dash, dashdot = dashdot, dot = dot, longdash = longdash, longdashdot = longdashdot, longdashdotdot = longdashdotdot, shortdash = shortdash, shortdashdot = shortdashdot, shortdashdotdot = shortdashdotdot, shortdot = shortdot, solid = solid)
  
    __obj.asInstanceOf[dasharray]
  }
}

