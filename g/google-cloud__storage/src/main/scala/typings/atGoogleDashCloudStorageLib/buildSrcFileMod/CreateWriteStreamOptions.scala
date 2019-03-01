package typings
package atGoogleDashCloudStorageLib.buildSrcFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateWriteStreamOptions extends CreateResumableUploadOptions {
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var gzip: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var resumable: js.UndefOr[scala.Boolean] = js.undefined
  var validation: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
}

object CreateWriteStreamOptions {
  @scala.inline
  def apply(
    contentType: java.lang.String = null,
    gzip: java.lang.String | scala.Boolean = null,
    metadata: atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata = null,
    offset: scala.Int | scala.Double = null,
    origin: java.lang.String = null,
    predefinedAcl: PredefinedAcl = null,
    `private`: js.UndefOr[scala.Boolean] = js.undefined,
    public: js.UndefOr[scala.Boolean] = js.undefined,
    resumable: js.UndefOr[scala.Boolean] = js.undefined,
    uri: java.lang.String = null,
    userProject: java.lang.String = null,
    validation: java.lang.String | scala.Boolean = null
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

