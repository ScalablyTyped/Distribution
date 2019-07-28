package typings.googleDashAuthDashLibrary.buildSrcTransportersMod

import typings.gaxios.buildSrcCommonMod.GaxiosOptions
import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transporter extends js.Object {
  def request[T](opts: GaxiosOptions): GaxiosPromise[_] | Unit = js.native
  def request[T](opts: GaxiosOptions, callback: BodyResponseCallback[T]): GaxiosPromise[_] | Unit = js.native
  @JSName("request")
  def request_T_GaxiosPromise[T](opts: GaxiosOptions): GaxiosPromise[T] = js.native
  @JSName("request")
  def request_T_Unit[T](opts: GaxiosOptions): Unit = js.native
  @JSName("request")
  def request_T_Unit[T](opts: GaxiosOptions, callback: BodyResponseCallback[T]): Unit = js.native
}

