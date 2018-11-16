package typings
package fineDashUploaderLib.libCoreMod

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
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Ensure every file is uploaded in chunks, even if the file can only be split up into 1 chunk.
           *
           * Does not apply if chunking is not possible in the current browser
           *
           * @default `false`
           */
  var mandatory: js.UndefOr[scala.Boolean] = js.undefined
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
  var partSize: js.UndefOr[scala.Double | js.Function] = js.undefined
  /**
           * SuccessOptions
           */
  var success: js.UndefOr[SuccessOptions] = js.undefined
}

