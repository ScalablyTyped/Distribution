package typings
package easyDashXDashHeadersLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cipher extends js.Object {
  def `final`(): easyDashXDashHeadersLib.Buffer = js.native
  def `final`(output_encoding: java.lang.String): java.lang.String = js.native
  def setAutoPadding(auto_padding: scala.Boolean): scala.Unit = js.native
  def update(data: easyDashXDashHeadersLib.Buffer): easyDashXDashHeadersLib.Buffer = js.native
  def update(data: java.lang.String): java.lang.String = js.native
  def update(data: java.lang.String, input_encoding: java.lang.String): java.lang.String = js.native
  def update(data: java.lang.String, input_encoding: java.lang.String, output_encoding: java.lang.String): java.lang.String = js.native
}

