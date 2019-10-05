package typings.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx.vectorFontFitting.html
  *
  *
  */
trait vectorFontFitting extends js.Object {
  /**
    *
    */
  var FIT: Double
  /**
    *
    */
  var FLOW: Double
  /**
    *
    */
  var NONE: Double
}

object vectorFontFitting {
  @scala.inline
  def apply(FIT: Double, FLOW: Double, NONE: Double): vectorFontFitting = {
    val __obj = js.Dynamic.literal(FIT = FIT, FLOW = FLOW, NONE = NONE)
  
    __obj.asInstanceOf[vectorFontFitting]
  }
}

