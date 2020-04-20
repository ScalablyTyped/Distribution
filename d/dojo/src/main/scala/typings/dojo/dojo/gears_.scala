package typings.dojo.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/gears.html
  *
  * TODOC
  *
  */
trait gears_ extends js.Object {
  /**
    * True if client is using Google Gears
    *
    */
  var available: js.Object
}

object gears_ {
  @scala.inline
  def apply(available: js.Object): gears_ = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any])
    __obj.asInstanceOf[gears_]
  }
}

