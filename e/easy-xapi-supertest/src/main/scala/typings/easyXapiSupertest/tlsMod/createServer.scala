package typings.easyXapiSupertest.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tls", "createServer")
@js.native
object createServer extends js.Object {
  def apply(options: TlsOptions): Server = js.native
  def apply(
    options: TlsOptions,
    secureConnectionListener: js.Function1[/* cleartextStream */ ClearTextStream, Unit]
  ): Server = js.native
}

