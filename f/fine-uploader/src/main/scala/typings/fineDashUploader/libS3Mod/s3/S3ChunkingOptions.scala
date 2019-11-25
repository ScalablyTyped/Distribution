package typings.fineDashUploader.libS3Mod.s3

import typings.fineDashUploader.libCoreMod.ChunkingOptions
import typings.fineDashUploader.libCoreMod.ConcurrentOptions
import typings.fineDashUploader.libCoreMod.ParamNamesOptions
import typings.fineDashUploader.libCoreMod.SuccessOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3ChunkingOptions extends ChunkingOptions {
  /**
    * The maximum size of each part, in bytes
    *
    * @default `5242880`
    */
  @JSName("partSize")
  var partSize_S3ChunkingOptions: js.UndefOr[Double] = js.undefined
}

object S3ChunkingOptions {
  @scala.inline
  def apply(
    concurrent: ConcurrentOptions = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    mandatory: js.UndefOr[Boolean] = js.undefined,
    paramNames: ParamNamesOptions = null,
    partSize: Int | Double = null,
    success: SuccessOptions = null
  ): S3ChunkingOptions = {
    val __obj = js.Dynamic.literal()
    if (concurrent != null) __obj.updateDynamic("concurrent")(concurrent.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(mandatory)) __obj.updateDynamic("mandatory")(mandatory.asInstanceOf[js.Any])
    if (paramNames != null) __obj.updateDynamic("paramNames")(paramNames.asInstanceOf[js.Any])
    if (partSize != null) __obj.updateDynamic("partSize")(partSize.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ChunkingOptions]
  }
}

