package typings.gitlab

import org.scalablytyped.runtime.StringDictionary
import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distInfrastructureMod.Requester
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/infrastructure/BaseService", JSImport.Namespace)
@js.native
object distInfrastructureBaseServiceMod extends js.Object {
  @js.native
  class BaseService protected () extends js.Object {
    def this(hasTokenJobTokenOauthTokenSudoHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    val camelize: Boolean = js.native
    val headers: StringDictionary[String] = js.native
    val rejectUnauthorized: Boolean = js.native
    val requestTimeout: Double = js.native
    val requester: Requester = js.native
    val url: String = js.native
  }
  
}

