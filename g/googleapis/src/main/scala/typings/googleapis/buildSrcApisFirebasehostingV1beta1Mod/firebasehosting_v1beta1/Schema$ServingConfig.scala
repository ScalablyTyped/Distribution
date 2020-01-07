package typings.googleapis.buildSrcApisFirebasehostingV1beta1Mod.firebasehosting_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration for how incoming requests to a site should be routed and
  * processed before serving content. The patterns are matched and applied
  * according to a specific [priority
  * order](/docs/hosting/full-config#hosting_priority_order).
  */
@js.native
trait Schema$ServingConfig extends js.Object {
  /**
    * How to handle well known App Association files.
    */
  var appAssociation: js.UndefOr[String] = js.native
  /**
    * Defines whether to drop the file extension from uploaded files.
    */
  var cleanUrls: js.UndefOr[Boolean] = js.native
  /**
    * A list of custom response headers that are added to the content if the
    * request URL path matches the glob.
    */
  var headers: js.UndefOr[js.Array[Schema$Header]] = js.native
  /**
    * A list of globs that will cause the response to redirect to another
    * location.
    */
  var redirects: js.UndefOr[js.Array[Schema$Redirect]] = js.native
  /**
    * A list of rewrites that will act as if the service were given the
    * destination URL.
    */
  var rewrites: js.UndefOr[js.Array[Schema$Rewrite]] = js.native
  /**
    * Defines how to handle a trailing slash in the URL path.
    */
  var trailingSlashBehavior: js.UndefOr[String] = js.native
}

object Schema$ServingConfig {
  @scala.inline
  def apply(
    appAssociation: String = null,
    cleanUrls: js.UndefOr[Boolean] = js.undefined,
    headers: js.Array[Schema$Header] = null,
    redirects: js.Array[Schema$Redirect] = null,
    rewrites: js.Array[Schema$Rewrite] = null,
    trailingSlashBehavior: String = null
  ): Schema$ServingConfig = {
    val __obj = js.Dynamic.literal()
    if (appAssociation != null) __obj.updateDynamic("appAssociation")(appAssociation.asInstanceOf[js.Any])
    if (!js.isUndefined(cleanUrls)) __obj.updateDynamic("cleanUrls")(cleanUrls.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (redirects != null) __obj.updateDynamic("redirects")(redirects.asInstanceOf[js.Any])
    if (rewrites != null) __obj.updateDynamic("rewrites")(rewrites.asInstanceOf[js.Any])
    if (trailingSlashBehavior != null) __obj.updateDynamic("trailingSlashBehavior")(trailingSlashBehavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ServingConfig]
  }
}

