package typings
package googleDashAuthDashLibraryLib.buildSrcTransportersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transporter extends js.Object {
  def request[T](opts: gaxiosLib.buildSrcCommonMod.GaxiosOptions): gaxiosLib.buildSrcCommonMod.GaxiosPromise[T] = js.native
  def request[T](opts: gaxiosLib.buildSrcCommonMod.GaxiosOptions, callback: BodyResponseCallback[T]): gaxiosLib.buildSrcCommonMod.GaxiosPromise[_] | scala.Unit = js.native
  @JSName("request")
  def `request_T<union>`[T](opts: gaxiosLib.buildSrcCommonMod.GaxiosOptions): gaxiosLib.buildSrcCommonMod.GaxiosPromise[_] | scala.Unit = js.native
  @JSName("request")
  def request_TUnit[T](opts: gaxiosLib.buildSrcCommonMod.GaxiosOptions): scala.Unit = js.native
  @JSName("request")
  def request_TUnit[T](opts: gaxiosLib.buildSrcCommonMod.GaxiosOptions, callback: BodyResponseCallback[T]): scala.Unit = js.native
}

