package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The web app details for an enterprise.
  */
@js.native
trait Schema$WebAppsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#webAppsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The manifest describing a web app.
    */
  var webApp: js.UndefOr[js.Array[Schema$WebApp]] = js.native
}

object Schema$WebAppsListResponse {
  @scala.inline
  def apply(kind: String = null, webApp: js.Array[Schema$WebApp] = null): Schema$WebAppsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (webApp != null) __obj.updateDynamic("webApp")(webApp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$WebAppsListResponse]
  }
}

