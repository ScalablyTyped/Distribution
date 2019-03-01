package typings
package atGoogleDashCloudStorageLib.buildSrcBucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadOptions
  extends atGoogleDashCloudStorageLib.buildSrcFileMod.CreateWriteStreamOptions {
  var destination: js.UndefOr[java.lang.String | atGoogleDashCloudStorageLib.buildSrcFileMod.File] = js.undefined
  var encryptionKey: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  var kmsKeyName: js.UndefOr[java.lang.String] = js.undefined
}

object UploadOptions {
  @scala.inline
  def apply(
    contentType: java.lang.String = null,
    destination: java.lang.String | atGoogleDashCloudStorageLib.buildSrcFileMod.File = null,
    encryptionKey: java.lang.String | nodeLib.Buffer = null,
    gzip: java.lang.String | scala.Boolean = null,
    kmsKeyName: java.lang.String = null,
    metadata: atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata = null,
    offset: scala.Int | scala.Double = null,
    origin: java.lang.String = null,
    predefinedAcl: atGoogleDashCloudStorageLib.buildSrcFileMod.PredefinedAcl = null,
    `private`: js.UndefOr[scala.Boolean] = js.undefined,
    public: js.UndefOr[scala.Boolean] = js.undefined,
    resumable: js.UndefOr[scala.Boolean] = js.undefined,
    uri: java.lang.String = null,
    userProject: java.lang.String = null,
    validation: java.lang.String | scala.Boolean = null
  ): UploadOptions = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    if (gzip != null) __obj.updateDynamic("gzip")(gzip.asInstanceOf[js.Any])
    if (kmsKeyName != null) __obj.updateDynamic("kmsKeyName")(kmsKeyName)
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
    __obj.asInstanceOf[UploadOptions]
  }
}

