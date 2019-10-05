package typings.dojo.dojox.uuid._base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/uuid/_base.variant.html
  *
  *
  */
trait variant extends js.Object {
  /**
    *
    */
  var DCE: String
  /**
    *
    */
  var MICROSOFT: String
  /**
    *
    */
  var NCS: String
  /**
    *
    */
  var UNKNOWN: String
}

object variant {
  @scala.inline
  def apply(DCE: String, MICROSOFT: String, NCS: String, UNKNOWN: String): variant = {
    val __obj = js.Dynamic.literal(DCE = DCE, MICROSOFT = MICROSOFT, NCS = NCS, UNKNOWN = UNKNOWN)
  
    __obj.asInstanceOf[variant]
  }
}

