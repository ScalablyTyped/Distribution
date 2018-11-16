package typings
package easyDashXapiDashSupertestLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Signer extends js.Object {
  def sign(private_key: java.lang.String, output_format: java.lang.String): java.lang.String
  def update(data: js.Any): scala.Unit
}

