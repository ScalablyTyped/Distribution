package typings.atGoogleDashCloudStorage.buildSrcFileMod

import typings.atGoogleDashCloudCommon.buildSrcServiceDashObjectMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateResumableUploadOptions extends js.Object {
  var configPath: js.UndefOr[String] = js.undefined
  var metadata: js.UndefOr[Metadata] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var origin: js.UndefOr[String] = js.undefined
  var predefinedAcl: js.UndefOr[PredefinedAcl] = js.undefined
  var `private`: js.UndefOr[Boolean] = js.undefined
  var public: js.UndefOr[Boolean] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
  var userProject: js.UndefOr[String] = js.undefined
}

object CreateResumableUploadOptions {
  @scala.inline
  def apply(
    configPath: String = null,
    metadata: Metadata = null,
    offset: Int | Double = null,
    origin: String = null,
    predefinedAcl: PredefinedAcl = null,
    `private`: js.UndefOr[Boolean] = js.undefined,
    public: js.UndefOr[Boolean] = js.undefined,
    uri: String = null,
    userProject: String = null
  ): CreateResumableUploadOptions = {
    val __obj = js.Dynamic.literal()
    if (configPath != null) __obj.updateDynamic("configPath")(configPath.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (predefinedAcl != null) __obj.updateDynamic("predefinedAcl")(predefinedAcl.asInstanceOf[js.Any])
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResumableUploadOptions]
  }
}

