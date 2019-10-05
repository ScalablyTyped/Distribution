package typings.dojo.dojox.charting.Theme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/Theme.defaultMarkers.html
  *
  *
  */
trait defaultMarkers extends js.Object {
  /**
    *
    */
  var CIRCLE: String
  /**
    *
    */
  var CROSS: String
  /**
    *
    */
  var DIAMOND: String
  /**
    *
    */
  var SQUARE: String
  /**
    *
    */
  var TRIANGLE: String
  /**
    *
    */
  var TRIANGLE_INVERTED: String
  /**
    *
    */
  var X: String
}

object defaultMarkers {
  @scala.inline
  def apply(
    CIRCLE: String,
    CROSS: String,
    DIAMOND: String,
    SQUARE: String,
    TRIANGLE: String,
    TRIANGLE_INVERTED: String,
    X: String
  ): defaultMarkers = {
    val __obj = js.Dynamic.literal(CIRCLE = CIRCLE, CROSS = CROSS, DIAMOND = DIAMOND, SQUARE = SQUARE, TRIANGLE = TRIANGLE, TRIANGLE_INVERTED = TRIANGLE_INVERTED, X = X)
  
    __obj.asInstanceOf[defaultMarkers]
  }
}

