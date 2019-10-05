package typings.fineDashUploader.libAzureMod.azure

import typings.fineDashUploader.libCoreMod.ChunkingOptions
import typings.fineDashUploader.libCoreMod.ConcurrentOptions
import typings.fineDashUploader.libCoreMod.ParamNamesOptions
import typings.fineDashUploader.libCoreMod.SuccessOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AzureChunkingOptions extends ChunkingOptions {
  /**
    * Files smaller than this value will not be chunked.
    *
    * @default `4000001`
    */
  var minFileSize: js.UndefOr[Double] = js.undefined
  /**
    * The maximum size of each part, in bytes
    *
    * @default `5242880`
    */
  @JSName("partSize")
  var partSize_AzureChunkingOptions: js.UndefOr[Double] = js.undefined
}

object AzureChunkingOptions {
  @scala.inline
  def apply(
    concurrent: ConcurrentOptions = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    mandatory: js.UndefOr[Boolean] = js.undefined,
    minFileSize: Int | Double = null,
    paramNames: ParamNamesOptions = null,
    partSize: Int | Double = null,
    success: SuccessOptions = null
  ): AzureChunkingOptions = {
    val __obj = js.Dynamic.literal()
    if (concurrent != null) __obj.updateDynamic("concurrent")(concurrent)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(mandatory)) __obj.updateDynamic("mandatory")(mandatory)
    if (minFileSize != null) __obj.updateDynamic("minFileSize")(minFileSize.asInstanceOf[js.Any])
    if (paramNames != null) __obj.updateDynamic("paramNames")(paramNames)
    if (partSize != null) __obj.updateDynamic("partSize")(partSize.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[AzureChunkingOptions]
  }
}

