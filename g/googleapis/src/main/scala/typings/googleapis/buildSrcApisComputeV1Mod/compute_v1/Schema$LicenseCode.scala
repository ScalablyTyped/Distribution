package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LicenseCode extends js.Object {
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * [Output Only] Description of this License Code.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of resource. Always compute#licenseCode for licenses.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * [Output Only] URL and description aliases of Licenses with the same
    * License Code.
    */
  var licenseAlias: js.UndefOr[js.Array[Schema$LicenseCodeLicenseAlias]] = js.native
  /**
    * [Output Only] Name of the resource. The name is 1-20 characters long and
    * must be a valid 64 bit integer.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] Current state of this License Code.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * [Output Only] If true, the license will remain attached when creating
    * images or snapshots from disks. Otherwise, the license is not
    * transferred.
    */
  var transferable: js.UndefOr[Boolean] = js.native
}

object Schema$LicenseCode {
  @scala.inline
  def apply(
    creationTimestamp: String = null,
    description: String = null,
    id: String = null,
    kind: String = null,
    licenseAlias: js.Array[Schema$LicenseCodeLicenseAlias] = null,
    name: String = null,
    selfLink: String = null,
    state: String = null,
    transferable: js.UndefOr[Boolean] = js.undefined
  ): Schema$LicenseCode = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (licenseAlias != null) __obj.updateDynamic("licenseAlias")(licenseAlias.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (!js.isUndefined(transferable)) __obj.updateDynamic("transferable")(transferable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LicenseCode]
  }
}

