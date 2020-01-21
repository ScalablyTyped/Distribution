package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A configuration object describing how Cloud Bigtable should treat traffic
  * from a particular end user application.
  */
@js.native
trait SchemaAppProfile extends js.Object {
  /**
    * Optional long form description of the use case for this AppProfile.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Strongly validated etag for optimistic concurrency control. Preserve the
    * value returned from `GetAppProfile` when calling `UpdateAppProfile` to
    * fail the request if there has been a modification in the mean time. The
    * `update_mask` of the request need not include `etag` for this protection
    * to apply. See [Wikipedia](https://en.wikipedia.org/wiki/HTTP_ETag) and
    * [RFC 7232](https://tools.ietf.org/html/rfc7232#section-2.3) for more
    * details.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Use a multi-cluster routing policy that may pick any cluster.
    */
  var multiClusterRoutingUseAny: js.UndefOr[SchemaMultiClusterRoutingUseAny] = js.native
  /**
    * (`OutputOnly`) The unique name of the app profile. Values are of the form
    * `projects/&lt;project&gt;/instances/&lt;instance&gt;/appProfiles/_a-zA-Z0-9*`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Use a single-cluster routing policy.
    */
  var singleClusterRouting: js.UndefOr[SchemaSingleClusterRouting] = js.native
}

object SchemaAppProfile {
  @scala.inline
  def apply(
    description: String = null,
    etag: String = null,
    multiClusterRoutingUseAny: SchemaMultiClusterRoutingUseAny = null,
    name: String = null,
    singleClusterRouting: SchemaSingleClusterRouting = null
  ): SchemaAppProfile = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (multiClusterRoutingUseAny != null) __obj.updateDynamic("multiClusterRoutingUseAny")(multiClusterRoutingUseAny.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (singleClusterRouting != null) __obj.updateDynamic("singleClusterRouting")(singleClusterRouting.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAppProfile]
  }
}

