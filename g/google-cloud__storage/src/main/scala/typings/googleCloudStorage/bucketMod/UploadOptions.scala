package typings.googleCloudStorage.bucketMod

import typings.googleCloudCommon.serviceObjectMod.Metadata
import typings.googleCloudStorage.fileMod.CreateWriteStreamOptions
import typings.googleCloudStorage.fileMod.File
import typings.googleCloudStorage.fileMod.PredefinedAcl
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadOptions extends CreateWriteStreamOptions {
  var destination: js.UndefOr[String | File] = js.undefined
  var encryptionKey: js.UndefOr[String | Buffer] = js.undefined
  var kmsKeyName: js.UndefOr[String] = js.undefined
}

object UploadOptions {
  @scala.inline
  def apply(
    configPath: String = null,
    contentType: String = null,
    destination: String | File = null,
    encryptionKey: String | Buffer = null,
    gzip: String | Boolean = null,
    kmsKeyName: String = null,
    metadata: Metadata = null,
    offset: js.UndefOr[Double] = js.undefined,
    origin: String = null,
    predefinedAcl: PredefinedAcl = null,
    `private`: js.UndefOr[Boolean] = js.undefined,
    public: js.UndefOr[Boolean] = js.undefined,
    resumable: js.UndefOr[Boolean] = js.undefined,
    uri: String = null,
    userProject: String = null,
    validation: String | Boolean = null
  ): UploadOptions = {
    val __obj = js.Dynamic.literal()
    if (configPath != null) __obj.updateDynamic("configPath")(configPath.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    if (gzip != null) __obj.updateDynamic("gzip")(gzip.asInstanceOf[js.Any])
    if (kmsKeyName != null) __obj.updateDynamic("kmsKeyName")(kmsKeyName.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (predefinedAcl != null) __obj.updateDynamic("predefinedAcl")(predefinedAcl.asInstanceOf[js.Any])
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resumable)) __obj.updateDynamic("resumable")(resumable.get.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    if (validation != null) __obj.updateDynamic("validation")(validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadOptions]
  }
}

