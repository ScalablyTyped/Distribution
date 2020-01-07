package typings.googleapis.buildSrcApisFirebasedynamiclinksV1Mod.firebasedynamiclinks_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for iSDK to get reopen attribution for app universal link open
  * deeplinking. This endpoint is meant for only iOS requests.
  */
@js.native
trait Schema$GetIosReopenAttributionRequest extends js.Object {
  /**
    * APP bundle ID.
    */
  var bundleId: js.UndefOr[String] = js.native
  /**
    * FDL link to be verified from an app universal link open. The FDL link can
    * be one of: 1) short FDL. e.g. &lt;app_code&gt;.page.link/&lt;ddl_id&gt;,
    * or 2) long FDL. e.g. &lt;app_code&gt;.page.link/?{query params}, or 3)
    * Invite FDL. e.g. &lt;app_code&gt;.page.link/i/&lt;invite_id_or_alias&gt;
    */
  var requestedLink: js.UndefOr[String] = js.native
  /**
    * Google SDK version. Version takes the form
    * &quot;$major.$minor.$patch&quot;
    */
  var sdkVersion: js.UndefOr[String] = js.native
}

object Schema$GetIosReopenAttributionRequest {
  @scala.inline
  def apply(bundleId: String = null, requestedLink: String = null, sdkVersion: String = null): Schema$GetIosReopenAttributionRequest = {
    val __obj = js.Dynamic.literal()
    if (bundleId != null) __obj.updateDynamic("bundleId")(bundleId.asInstanceOf[js.Any])
    if (requestedLink != null) __obj.updateDynamic("requestedLink")(requestedLink.asInstanceOf[js.Any])
    if (sdkVersion != null) __obj.updateDynamic("sdkVersion")(sdkVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GetIosReopenAttributionRequest]
  }
}

