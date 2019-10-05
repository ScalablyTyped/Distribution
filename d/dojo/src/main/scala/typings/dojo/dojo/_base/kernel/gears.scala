package typings.dojo.dojo._base.kernel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/kernel.gears.html
  *
  * TODOC
  *
  */
trait gears extends js.Object {
  /**
    * True if client is using Google Gears
    *
    */
  var available: js.Object
}

object gears {
  @scala.inline
  def apply(available: js.Object): gears = {
    val __obj = js.Dynamic.literal(available = available)
  
    __obj.asInstanceOf[gears]
  }
}

