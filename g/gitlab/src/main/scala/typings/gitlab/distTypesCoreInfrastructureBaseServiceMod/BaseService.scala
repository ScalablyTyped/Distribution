package typings.gitlab.distTypesCoreInfrastructureBaseServiceMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/infrastructure/BaseService", "BaseService")
@js.native
class BaseService () extends js.Object {
  def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
  val camelize: Boolean = js.native
  val headers: StringDictionary[String] = js.native
  val rejectUnauthorized: Boolean = js.native
  val requestTimeout: Double = js.native
  val requester: Requester = js.native
  val url: String = js.native
}

