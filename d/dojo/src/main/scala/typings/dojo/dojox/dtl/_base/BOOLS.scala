package typings.dojo.dojox.dtl._base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/_base.BOOLS.html
  *
  *
  */
trait BOOLS extends js.Object {
  /**
    *
    */
  var checked: Double
  /**
    *
    */
  var disabled: Double
  /**
    *
    */
  var readonly: Double
}

object BOOLS {
  @scala.inline
  def apply(checked: Double, disabled: Double, readonly: Double): BOOLS = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BOOLS]
  }
}

