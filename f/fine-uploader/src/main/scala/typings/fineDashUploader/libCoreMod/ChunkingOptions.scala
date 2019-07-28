package typings.fineDashUploader.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChunkingOptions extends js.Object {
  /**
    * concurrent Chunking options
    */
  var concurrent: js.UndefOr[ConcurrentOptions] = js.undefined
  /**
    * Enable or disable splitting the file separate chunks. Each chunks is sent in a separate requested
    *
    * @default `false`
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Ensure every file is uploaded in chunks, even if the file can only be split up into 1 chunk.
    *
    * Does not apply if chunking is not possible in the current browser
    *
    * @default `false`
    */
  var mandatory: js.UndefOr[Boolean] = js.undefined
  /**
    * ParamNamesOptions
    */
  var paramNames: js.UndefOr[ParamNamesOptions] = js.undefined
  /**
    * The maximum size of each chunk, in bytes
    * If a function value is provided, the file's ID will be passed when invoking the function (which should only be called once per file)
    *
    * @default `2000000`
    */
  var partSize: js.UndefOr[Double | js.Function] = js.undefined
  /**
    * SuccessOptions
    */
  var success: js.UndefOr[SuccessOptions] = js.undefined
}

object ChunkingOptions {
  @scala.inline
  def apply(
    concurrent: ConcurrentOptions = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    mandatory: js.UndefOr[Boolean] = js.undefined,
    paramNames: ParamNamesOptions = null,
    partSize: Double | js.Function = null,
    success: SuccessOptions = null
  ): ChunkingOptions = {
    val __obj = js.Dynamic.literal()
    if (concurrent != null) __obj.updateDynamic("concurrent")(concurrent)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(mandatory)) __obj.updateDynamic("mandatory")(mandatory)
    if (paramNames != null) __obj.updateDynamic("paramNames")(paramNames)
    if (partSize != null) __obj.updateDynamic("partSize")(partSize.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[ChunkingOptions]
  }
}

