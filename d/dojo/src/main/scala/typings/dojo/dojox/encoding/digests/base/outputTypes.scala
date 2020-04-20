package typings.dojo.dojox.encoding.digests.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/encoding/digests/_base.outputTypes.html
  *
  * Enumeration for input and output encodings.
  *
  */
trait outputTypes extends js.Object {
  /**
    *
    */
  var Base64: Double
  /**
    *
    */
  var Hex: Double
  /**
    *
    */
  var Raw: Double
  /**
    *
    */
  var String: Double
}

object outputTypes {
  @scala.inline
  def apply(Base64: Double, Hex: Double, Raw: Double, String: Double): outputTypes = {
    val __obj = js.Dynamic.literal(Base64 = Base64.asInstanceOf[js.Any], Hex = Hex.asInstanceOf[js.Any], Raw = Raw.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any])
    __obj.asInstanceOf[outputTypes]
  }
}

