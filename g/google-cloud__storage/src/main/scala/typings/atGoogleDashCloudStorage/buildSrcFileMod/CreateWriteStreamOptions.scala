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
    configPath: String = null,
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
    if (configPath != null) __obj.updateDynamic("configPath")(configPath.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (gzip != null) __obj.updateDynamic("gzip")(gzip.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (predefinedAcl != null) __obj.updateDynamic("predefinedAcl")(predefinedAcl.asInstanceOf[js.Any])
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public.asInstanceOf[js.Any])
    if (!js.isUndefined(resumable)) __obj.updateDynamic("resumable")(resumable.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    if (validation != null) __obj.updateDynamic("validation")(validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWriteStreamOptions]
  }
}

