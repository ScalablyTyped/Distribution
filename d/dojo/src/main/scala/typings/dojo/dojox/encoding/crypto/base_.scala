package typings.dojo.dojox.encoding.crypto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/encoding/crypto/_base.html
  *
  *
  */
trait base_ extends js.Object {
  /**
    *
    */
  var Blowfish: js.Object
  /**
    *
    */
  var SimpleAES: js.Object
  /**
    * Enumeration for various cipher modes.
    *
    */
  var cipherModes: js.Object
  /**
    * Enumeration for input and output encodings.
    *
    */
  var outputTypes: js.Object
  /**
    *
    */
  def RSAKey(): Unit
}

object base_ {
  @scala.inline
  def apply(
    Blowfish: js.Object,
    RSAKey: () => Unit,
    SimpleAES: js.Object,
    cipherModes: js.Object,
    outputTypes: js.Object
  ): base_ = {
    val __obj = js.Dynamic.literal(Blowfish = Blowfish.asInstanceOf[js.Any], RSAKey = js.Any.fromFunction0(RSAKey), SimpleAES = SimpleAES.asInstanceOf[js.Any], cipherModes = cipherModes.asInstanceOf[js.Any], outputTypes = outputTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[base_]
  }
}

