package typings.gitlab

import org.scalablytyped.runtime.StringDictionary
import typings.gitlab.distSrcCoreInfrastructureMod.BaseServiceOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Requester
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/infrastructure/BaseService", JSImport.Namespace)
@js.native
object distSrcCoreInfrastructureBaseServiceMod extends js.Object {
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
  
}

