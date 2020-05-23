package typings.googleCloudStorage.storageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBucketRequest extends js.Object {
  var archive: js.UndefOr[Boolean] = js.undefined
  var coldline: js.UndefOr[Boolean] = js.undefined
  var cors: js.UndefOr[js.Array[Cors]] = js.undefined
  var dra: js.UndefOr[Boolean] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var multiRegional: js.UndefOr[Boolean] = js.undefined
  var nearline: js.UndefOr[Boolean] = js.undefined
  var regional: js.UndefOr[Boolean] = js.undefined
  var requesterPays: js.UndefOr[Boolean] = js.undefined
  var retentionPolicy: js.UndefOr[js.Object] = js.undefined
  var standard: js.UndefOr[Boolean] = js.undefined
  var userProject: js.UndefOr[String] = js.undefined
  var versioning: js.UndefOr[Versioning] = js.undefined
}

object CreateBucketRequest {
  @scala.inline
  def apply(
    archive: js.UndefOr[Boolean] = js.undefined,
    coldline: js.UndefOr[Boolean] = js.undefined,
    cors: js.Array[Cors] = null,
    dra: js.UndefOr[Boolean] = js.undefined,
    location: String = null,
    multiRegional: js.UndefOr[Boolean] = js.undefined,
    nearline: js.UndefOr[Boolean] = js.undefined,
    regional: js.UndefOr[Boolean] = js.undefined,
    requesterPays: js.UndefOr[Boolean] = js.undefined,
    retentionPolicy: js.Object = null,
    standard: js.UndefOr[Boolean] = js.undefined,
    userProject: String = null,
    versioning: Versioning = null
  ): CreateBucketRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(archive)) __obj.updateDynamic("archive")(archive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(coldline)) __obj.updateDynamic("coldline")(coldline.get.asInstanceOf[js.Any])
    if (cors != null) __obj.updateDynamic("cors")(cors.asInstanceOf[js.Any])
    if (!js.isUndefined(dra)) __obj.updateDynamic("dra")(dra.get.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(multiRegional)) __obj.updateDynamic("multiRegional")(multiRegional.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nearline)) __obj.updateDynamic("nearline")(nearline.get.asInstanceOf[js.Any])
    if (!js.isUndefined(regional)) __obj.updateDynamic("regional")(regional.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requesterPays)) __obj.updateDynamic("requesterPays")(requesterPays.get.asInstanceOf[js.Any])
    if (retentionPolicy != null) __obj.updateDynamic("retentionPolicy")(retentionPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(standard)) __obj.updateDynamic("standard")(standard.get.asInstanceOf[js.Any])
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    if (versioning != null) __obj.updateDynamic("versioning")(versioning.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBucketRequest]
  }
}

