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

object ValidationOptions {
  @scala.inline
  def apply(
    acceptFiles: js.Any = null,
    allowedExtensions: js.Array[java.lang.String] = null,
    image: ImageOptions = null,
    itemLimit: scala.Int | scala.Double = null,
    minSizeLimit: scala.Int | scala.Double = null,
    sizeLimit: scala.Int | scala.Double = null,
    stopOnFirstInvalidFile: js.UndefOr[scala.Boolean] = js.undefined
  ): ValidationOptions = {
    val __obj = js.Dynamic.literal()
    if (acceptFiles != null) __obj.updateDynamic("acceptFiles")(acceptFiles)
    if (allowedExtensions != null) __obj.updateDynamic("allowedExtensions")(allowedExtensions)
    if (image != null) __obj.updateDynamic("image")(image)
    if (itemLimit != null) __obj.updateDynamic("itemLimit")(itemLimit.asInstanceOf[js.Any])
    if (minSizeLimit != null) __obj.updateDynamic("minSizeLimit")(minSizeLimit.asInstanceOf[js.Any])
    if (sizeLimit != null) __obj.updateDynamic("sizeLimit")(sizeLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(stopOnFirstInvalidFile)) __obj.updateDynamic("stopOnFirstInvalidFile")(stopOnFirstInvalidFile)
    __obj.asInstanceOf[ValidationOptions]
  }
}

