package typings.dojo.dojox.gfx.svgAttach

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
    val __obj = js.Dynamic.literal(dash = dash.asInstanceOf[js.Any], dashdot = dashdot.asInstanceOf[js.Any], dot = dot.asInstanceOf[js.Any], longdash = longdash.asInstanceOf[js.Any], longdashdot = longdashdot.asInstanceOf[js.Any], longdashdotdot = longdashdotdot.asInstanceOf[js.Any], shortdash = shortdash.asInstanceOf[js.Any], shortdashdot = shortdashdot.asInstanceOf[js.Any], shortdashdotdot = shortdashdotdot.asInstanceOf[js.Any], shortdot = shortdot.asInstanceOf[js.Any], solid = solid.asInstanceOf[js.Any])
    __obj.asInstanceOf[dasharray]
  }
}

