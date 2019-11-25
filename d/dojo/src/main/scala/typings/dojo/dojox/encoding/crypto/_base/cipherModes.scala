package typings.dojo.dojox.encoding.crypto._base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/encoding/crypto/_base.cipherModes.html
  *
  * Enumeration for various cipher modes.
  *
  */
trait cipherModes extends js.Object {
  /**
    *
    */
  var CBC: Double
  /**
    *
    */
  var CFB: Double
  /**
    *
    */
  var CTR: Double
  /**
    *
    */
  var ECB: Double
  /**
    *
    */
  var OFB: Double
  /**
    *
    */
  var PCBC: Double
}

object cipherModes {
  @scala.inline
  def apply(CBC: Double, CFB: Double, CTR: Double, ECB: Double, OFB: Double, PCBC: Double): cipherModes = {
    val __obj = js.Dynamic.literal(CBC = CBC.asInstanceOf[js.Any], CFB = CFB.asInstanceOf[js.Any], CTR = CTR.asInstanceOf[js.Any], ECB = ECB.asInstanceOf[js.Any], OFB = OFB.asInstanceOf[js.Any], PCBC = PCBC.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[cipherModes]
  }
}

