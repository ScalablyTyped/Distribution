package typings.atGoogleDashCloudStorage.buildSrcFileMod

import typings.atGoogleDashCloudCommon.buildSrcServiceDashObjectMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateWriteStreamOptions extends CreateResumableUploadOptions {
  var contentType: js.UndefOr[String] = js.undefined
  var gzip: js.UndefOr[String | Boolean] = js.undefined
  var resumable: js.UndefOr[Boolean] = js.undefined
  var validation: js.UndefOr[String | Boolean] = js.undefined
}

object CreateWriteStreamOptions {
  @scala.inline
  def apply(
    contentType: String = null,
    gzip: String | Boolean = null,
    metadata: Metadata = null,
    offset: Int | Double = null,
    origin: String = null,
    predefinedAcl: PredefinedAcl = null,
    `private`: js.UndefOr[Boolean] = js.undefined,
    public: js.UndefOr[Boolean] = js.undefined,
    resumable: js.UndefOr[Boolean] = js.undefined,
    uri: String = null,
    userProject: String = null,
    validation: String | Boolean = null
  ): CreateWriteStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (gzip != null) __obj.updateDynamic("gzip")(gzip.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (predefinedAcl != null) __obj.updateDynamic("predefinedAcl")(predefinedAcl)
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`)
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public)
    if (!js.isUndefined(resumable)) __obj.updateDynamic("resumable")(resumable)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    if (validation != null) __obj.updateDynamic("validation")(validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWriteStreamOptions]
  }
}

