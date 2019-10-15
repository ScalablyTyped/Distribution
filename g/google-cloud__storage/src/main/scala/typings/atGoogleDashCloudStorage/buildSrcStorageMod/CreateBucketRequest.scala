package typings.atGoogleDashCloudStorage.buildSrcStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBucketRequest extends js.Object {
  var coldline: js.UndefOr[Boolean] = js.undefined
  var dra: js.UndefOr[Boolean] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var multiRegional: js.UndefOr[Boolean] = js.undefined
  var nearline: js.UndefOr[Boolean] = js.undefined
  var regional: js.UndefOr[Boolean] = js.undefined
  var requesterPays: js.UndefOr[Boolean] = js.undefined
  var retentionPolicy: js.UndefOr[js.Object] = js.undefined
  var standard: js.UndefOr[Boolean] = js.undefined
  var userProject: js.UndefOr[String] = js.undefined
}

object CreateBucketRequest {
  @scala.inline
  def apply(
    coldline: js.UndefOr[Boolean] = js.undefined,
    dra: js.UndefOr[Boolean] = js.undefined,
    location: String = null,
    multiRegional: js.UndefOr[Boolean] = js.undefined,
    nearline: js.UndefOr[Boolean] = js.undefined,
    regional: js.UndefOr[Boolean] = js.undefined,
    requesterPays: js.UndefOr[Boolean] = js.undefined,
    retentionPolicy: js.Object = null,
    standard: js.UndefOr[Boolean] = js.undefined,
    userProject: String = null
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
    if (!js.isUndefined(standard)) __obj.updateDynamic("standard")(standard)
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[CreateBucketRequest]
  }
}

