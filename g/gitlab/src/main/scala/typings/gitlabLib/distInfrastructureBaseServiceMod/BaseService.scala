package typings
package gitlabLib.distInfrastructureBaseServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/infrastructure/BaseService", "BaseService")
@js.native
class BaseService protected () extends js.Object {
  def this(hasTokenJobTokenOauthTokenSudoHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: gitlabLib.distInfrastructureMod.BaseServiceOptions) = this()
  val camelize: scala.Boolean = js.native
  val headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  val rejectUnauthorized: scala.Boolean = js.native
  val requestTimeout: scala.Double = js.native
  val requester: gitlabLib.distInfrastructureMod.Requester = js.native
  val url: java.lang.String = js.native
}

