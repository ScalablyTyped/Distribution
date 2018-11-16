package typings
package fineDashUploaderLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ValidationOptions extends js.Object {
  /**
           * Used by the file selection dialog.
           *
           * Restrict the valid file types that appear in the selection dialog by listing valid content-type specifiers
           *
           * @default `null`
           */
  var acceptFiles: js.UndefOr[js.Any] = js.undefined
  /**
           * Specify file valid file extensions here to restrict uploads to specific types
           *
           * @default `[]`
           */
  var allowedExtensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * ImageOptions
           */
  var image: js.UndefOr[ImageOptions] = js.undefined
  /**
           * Maximum number of items that can be potentially uploaded in this session.
           *
           * Will reject all items that are added or retried after this limit is reached
           *
           * @default `0`
           */
  var itemLimit: js.UndefOr[scala.Double] = js.undefined
  /**
           * The minimum allowable size, in bytes, for an item
           *
           * @default `0`
           */
  var minSizeLimit: js.UndefOr[scala.Double] = js.undefined
  /**
           * The maximum allowable size, in bytes, for an item
           *
           * @default `0`
           */
  var sizeLimit: js.UndefOr[scala.Double] = js.undefined
  /**
           * When `true` the first invalid item will stop processing further files
           *
           * @default `true`
           */
  var stopOnFirstInvalidFile: js.UndefOr[scala.Boolean] = js.undefined
}

