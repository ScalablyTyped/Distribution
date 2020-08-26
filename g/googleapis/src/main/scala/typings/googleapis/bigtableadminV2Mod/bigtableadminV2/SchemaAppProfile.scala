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
  def apply(): SchemaAppProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppProfile]
  }
  @scala.inline
  implicit class SchemaAppProfileOps[Self <: SchemaAppProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setMultiClusterRoutingUseAny(value: SchemaMultiClusterRoutingUseAny): Self = this.set("multiClusterRoutingUseAny", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiClusterRoutingUseAny: Self = this.set("multiClusterRoutingUseAny", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSingleClusterRouting(value: SchemaSingleClusterRouting): Self = this.set("singleClusterRouting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleClusterRouting: Self = this.set("singleClusterRouting", js.undefined)
  }
  
}

