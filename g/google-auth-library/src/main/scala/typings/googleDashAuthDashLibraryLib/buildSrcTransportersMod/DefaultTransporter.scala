package typings
package googleDashAuthDashLibraryLib.buildSrcTransportersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-auth-library/build/src/transporters", "DefaultTransporter")
@js.native
class DefaultTransporter () extends js.Object {
  /**
       * Changes the error to include details from the body.
       */
  var processError: js.Any = js.native
  /**
       * Configures request options before making a request.
       * @param opts AxiosRequestConfig options.
       * @return Configured options.
       */
  def configure(): axiosLib.axiosMod.AxiosRequestConfig = js.native
  /**
       * Configures request options before making a request.
       * @param opts AxiosRequestConfig options.
       * @return Configured options.
       */
  def configure(opts: axiosLib.axiosMod.AxiosRequestConfig): axiosLib.axiosMod.AxiosRequestConfig = js.native
  def request[T](opts: axiosLib.axiosMod.AxiosRequestConfig): scala.Unit = js.native
  def request[T](opts: axiosLib.axiosMod.AxiosRequestConfig, callback: BodyResponseCallback[T]): scala.Unit = js.native
  /**
       * Makes a request using Axios with given options.
       * @param opts AxiosRequestConfig options.
       * @param callback optional callback that contains AxiosResponse object.
       * @return AxiosPromise, assuming no callback is passed.
       */
  @JSName("request")
  def request_TAxiosPromise[T](opts: axiosLib.axiosMod.AxiosRequestConfig): axiosLib.axiosMod.AxiosPromise[T] = js.native
}

@JSImport("google-auth-library/build/src/transporters", "DefaultTransporter")
@js.native
object DefaultTransporter extends js.Object {
  /**
       * Default user agent.
       */
  val USER_AGENT: java.lang.String = js.native
}

