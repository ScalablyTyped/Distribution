package typings.devcertSan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devcert-san/dist", JSImport.Namespace)
@js.native
object distMod extends js.Object {
  def default(appName: String): js.Promise[AnonCert] = js.native
  def default(appName: String, options: AnonInstallCertutil): js.Promise[AnonCert] = js.native
}

