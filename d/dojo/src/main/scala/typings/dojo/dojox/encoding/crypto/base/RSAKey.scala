package typings.dojo.dojox.encoding.crypto.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/encoding/crypto/_base.RSAKey.html
  *
  *
  * @param rngf
  */
@JSGlobal("dojox.encoding.crypto._base.RSAKey")
@js.native
class RSAKey protected () extends js.Object {
  def this(rngf: js.Any) = this()
  /**
    * Return the PKCS#1 RSA decryption of "ctext".
    *
    * @param ctext an even-length hex string
    */
  def decrypt(ctext: String): js.Any = js.native
  /**
    *
    * @param text
    */
  def encrypt(text: js.Any): js.Any = js.native
  /**
    * Generate a new random private key B bits long, using public expt E
    *
    * @param B
    * @param E
    */
  def generate(B: js.Any, E: js.Any): Unit = js.native
  /**
    * Set the private key fields N, e, d and CRT params from hex strings
    *
    * @param N
    * @param E
    * @param D
    */
  def setPrivate(N: js.Any, E: js.Any, D: js.Any): Unit = js.native
  /**
    * Set the private key fields N, e, d and CRT params from hex strings
    *
    * @param N
    * @param E
    * @param D
    * @param P
    * @param Q
    * @param DP
    * @param DQ
    * @param C
    */
  def setPrivateEx(N: js.Any, E: js.Any, D: js.Any, P: js.Any, Q: js.Any, DP: js.Any, DQ: js.Any, C: js.Any): Unit = js.native
  /**
    * Set the public key fields N and e from hex strings
    *
    * @param N
    * @param E
    */
  def setPublic(N: js.Any, E: js.Any): Unit = js.native
}

