package typings
package atGoogleDashCloudStorageLib.buildSrcFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateResumableUploadOptions extends js.Object {
  var metadata: js.UndefOr[atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var origin: js.UndefOr[java.lang.String] = js.undefined
  var predefinedAcl: js.UndefOr[PredefinedAcl] = js.undefined
  var `private`: js.UndefOr[scala.Boolean] = js.undefined
  var public: js.UndefOr[scala.Boolean] = js.undefined
  var uri: js.UndefOr[java.lang.String] = js.undefined
  var userProject: js.UndefOr[java.lang.String] = js.undefined
}

object CreateResumableUploadOptions {
  @scala.inline
  def apply(
    metadata: atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata = null,
    offset: scala.Int | scala.Double = null,
    origin: java.lang.String = null,
    predefinedAcl: PredefinedAcl = null,
    `private`: js.UndefOr[scala.Boolean] = js.undefined,
    public: js.UndefOr[scala.Boolean] = js.undefined,
    uri: java.lang.String = null,
    userProject: java.lang.String = null
  ): CreateResumableUploadOptions = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (predefinedAcl != null) __obj.updateDynamic("predefinedAcl")(predefinedAcl)
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`)
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[CreateResumableUploadOptions]
  }
}

