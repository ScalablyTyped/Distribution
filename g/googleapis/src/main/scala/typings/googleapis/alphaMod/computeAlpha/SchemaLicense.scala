package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A license resource.
  */
@js.native
trait SchemaLicense extends js.Object {
  /**
    * [Output Only] Deprecated. This field no longer reflects whether a license
    * charges a usage fee.
    */
  var chargesUseFee: js.UndefOr[Boolean] = js.native
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * An optional textual description of the resource; provided by the client
    * when the resource is created.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of resource. Always compute#license for licenses.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique code used to attach this license to images,
    * snapshots, and disks.
    */
  var licenseCode: js.UndefOr[String] = js.native
  /**
    * Name of the resource. The name must be 1-63 characters long and comply
    * with RFC1035.
    */
  var name: js.UndefOr[String] = js.native
  var resourceRequirements: js.UndefOr[SchemaLicenseResourceRequirements] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.native
  /**
    * If false, licenses will not be copied from the source resource when
    * creating an image from a disk, disk from snapshot, or snapshot from disk.
    */
  var transferable: js.UndefOr[Boolean] = js.native
}

object SchemaLicense {
  @scala.inline
  def apply(
    chargesUseFee: js.UndefOr[Boolean] = js.undefined,
    creationTimestamp: String = null,
    description: String = null,
    id: String = null,
    kind: String = null,
    licenseCode: String = null,
    name: String = null,
    resourceRequirements: SchemaLicenseResourceRequirements = null,
    selfLink: String = null,
    selfLinkWithId: String = null,
    transferable: js.UndefOr[Boolean] = js.undefined
  ): SchemaLicense = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chargesUseFee)) __obj.updateDynamic("chargesUseFee")(chargesUseFee.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (licenseCode != null) __obj.updateDynamic("licenseCode")(licenseCode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resourceRequirements != null) __obj.updateDynamic("resourceRequirements")(resourceRequirements.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (selfLinkWithId != null) __obj.updateDynamic("selfLinkWithId")(selfLinkWithId.asInstanceOf[js.Any])
    if (!js.isUndefined(transferable)) __obj.updateDynamic("transferable")(transferable.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLicense]
  }
}

