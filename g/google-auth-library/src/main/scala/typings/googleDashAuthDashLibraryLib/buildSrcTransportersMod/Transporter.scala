package typings
package googleDashAuthDashLibraryLib.buildSrcTransportersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transporter extends js.Object {
  def request[T](opts: axiosLib.axiosMod.AxiosRequestConfig): axiosLib.axiosMod.AxiosPromise[_] | scala.Unit = js.native
  def request[T](opts: axiosLib.axiosMod.AxiosRequestConfig, callback: BodyResponseCallback[T]): axiosLib.axiosMod.AxiosPromise[_] | scala.Unit = js.native
  @JSName("request")
  def request_TAxiosPromise[T](opts: axiosLib.axiosMod.AxiosRequestConfig): axiosLib.axiosMod.AxiosPromise[T] = js.native
  @JSName("request")
  def request_TUnit[T](opts: axiosLib.axiosMod.AxiosRequestConfig): scala.Unit = js.native
  @JSName("request")
  def request_TUnit[T](opts: axiosLib.axiosMod.AxiosRequestConfig, callback: BodyResponseCallback[T]): scala.Unit = js.native
}

