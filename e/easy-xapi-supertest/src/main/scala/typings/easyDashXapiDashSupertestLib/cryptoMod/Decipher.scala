package typings
package easyDashXapiDashSupertestLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decipher extends js.Object {
  def `final`(): easyDashXapiDashSupertestLib.Buffer = js.native
  def `final`(output_encoding: java.lang.String): java.lang.String = js.native
  def setAutoPadding(auto_padding: scala.Boolean): scala.Unit = js.native
  def update(data: easyDashXapiDashSupertestLib.Buffer): easyDashXapiDashSupertestLib.Buffer = js.native
  def update(data: java.lang.String): java.lang.String = js.native
  def update(data: java.lang.String, input_encoding: java.lang.String): java.lang.String = js.native
  def update(data: java.lang.String, input_encoding: java.lang.String, output_encoding: java.lang.String): java.lang.String = js.native
}

