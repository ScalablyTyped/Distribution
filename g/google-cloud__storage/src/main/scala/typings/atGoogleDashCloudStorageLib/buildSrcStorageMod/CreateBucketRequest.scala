package typings
package atGoogleDashCloudStorageLib.buildSrcStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBucketRequest extends js.Object {
  var coldline: js.UndefOr[scala.Boolean] = js.undefined
  var dra: js.UndefOr[scala.Boolean] = js.undefined
  var location: js.UndefOr[java.lang.String] = js.undefined
  var multiRegional: js.UndefOr[scala.Boolean] = js.undefined
  var nearline: js.UndefOr[scala.Boolean] = js.undefined
  var regional: js.UndefOr[scala.Boolean] = js.undefined
  var requesterPays: js.UndefOr[scala.Boolean] = js.undefined
  var retentionPolicy: js.UndefOr[js.Object] = js.undefined
  var userProject: js.UndefOr[java.lang.String] = js.undefined
}

object CreateBucketRequest {
  @scala.inline
  def apply(
    coldline: js.UndefOr[scala.Boolean] = js.undefined,
    dra: js.UndefOr[scala.Boolean] = js.undefined,
    location: java.lang.String = null,
    multiRegional: js.UndefOr[scala.Boolean] = js.undefined,
    nearline: js.UndefOr[scala.Boolean] = js.undefined,
    regional: js.UndefOr[scala.Boolean] = js.undefined,
    requesterPays: js.UndefOr[scala.Boolean] = js.undefined,
    retentionPolicy: js.Object = null,
    userProject: java.lang.String = null
  ): CreateBucketRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(coldline)) __obj.updateDynamic("coldline")(coldline)
    if (!js.isUndefined(dra)) __obj.updateDynamic("dra")(dra)
    if (location != null) __obj.updateDynamic("location")(location)
    if (!js.isUndefined(multiRegional)) __obj.updateDynamic("multiRegional")(multiRegional)
    if (!js.isUndefined(nearline)) __obj.updateDynamic("nearline")(nearline)
    if (!js.isUndefined(regional)) __obj.updateDynamic("regional")(regional)
    if (!js.isUndefined(requesterPays)) __obj.updateDynamic("requesterPays")(requesterPays)
    if (retentionPolicy != null) __obj.updateDynamic("retentionPolicy")(retentionPolicy)
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[CreateBucketRequest]
  }
}

