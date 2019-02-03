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
    * @param opts GaxiosOptions options.
    * @return Configured options.
    */
  def configure(): gaxiosLib.buildSrcCommonMod.GaxiosOptions = js.native
  def configure(opts: gaxiosLib.buildSrcCommonMod.GaxiosOptions): gaxiosLib.buildSrcCommonMod.GaxiosOptions = js.native
  /**
    * Makes a request using Gaxios with given options.
    * @param opts GaxiosOptions options.
    * @param callback optional callback that contains GaxiosResponse object.
    * @return GaxiosPromise, assuming no callback is passed.
    */
  def request[T](opts: gaxiosLib.buildSrcCommonMod.GaxiosOptions): gaxiosLib.buildSrcCommonMod.GaxiosPromise[T] = js.native
  def request[T](opts: gaxiosLib.buildSrcCommonMod.GaxiosOptions, callback: BodyResponseCallback[T]): scala.Unit = js.native
  @JSName("request")
  def request_TUnit[T](opts: gaxiosLib.buildSrcCommonMod.GaxiosOptions): scala.Unit = js.native
}

/* static members */
@JSImport("google-auth-library/build/src/transporters", "DefaultTransporter")
@js.native
object DefaultTransporter extends js.Object {
  /**
    * Default user agent.
    */
  val USER_AGENT: java.lang.String = js.native
}

