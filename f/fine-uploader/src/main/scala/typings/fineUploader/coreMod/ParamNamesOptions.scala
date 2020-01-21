package typings.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamNamesOptions extends js.Object {
  /**
    * Name of the parameter passed with a chunked request that specifies the size in bytes of the associated chunk
    *
    * @default `'qqchunksize'`
    */
  var chunkSize: js.UndefOr[String] = js.undefined
  /**
    * Name of the parameter passed with a chunked request that specifies the starting byte of the associated chunk
    *
    * @default `'qqpartbyteoffset'`
    */
  var partByteOffset: js.UndefOr[String] = js.undefined
  /**
    * Name of the parameter passed with a chunked request that specifies the index of the associated partition
    *
    * @default `'qqpartindex'`
    */
  var partIndex: js.UndefOr[String] = js.undefined
  /**
    * Sent with the first request of the resume with a value of `true`
    *
    * @default `'qqresume'`
    */
  var resuming: js.UndefOr[String] = js.undefined
  /**
    * totalFileSize
    *
    * @default `'qqtotalfilesize'`
    */
  var totalFileSize: js.UndefOr[String] = js.undefined
  /**
    * Name of the parameter passed with a chunked request that specifies the total number of chunks associated with the `File` or `Blob`
    *
    * @default `'qqtotalparts'`
    */
  var totalParts: js.UndefOr[String] = js.undefined
}

object ParamNamesOptions {
  @scala.inline
  def apply(
    chunkSize: String = null,
    partByteOffset: String = null,
    partIndex: String = null,
    resuming: String = null,
    totalFileSize: String = null,
    totalParts: String = null
  ): ParamNamesOptions = {
    val __obj = js.Dynamic.literal()
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (partByteOffset != null) __obj.updateDynamic("partByteOffset")(partByteOffset.asInstanceOf[js.Any])
    if (partIndex != null) __obj.updateDynamic("partIndex")(partIndex.asInstanceOf[js.Any])
    if (resuming != null) __obj.updateDynamic("resuming")(resuming.asInstanceOf[js.Any])
    if (totalFileSize != null) __obj.updateDynamic("totalFileSize")(totalFileSize.asInstanceOf[js.Any])
    if (totalParts != null) __obj.updateDynamic("totalParts")(totalParts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamNamesOptions]
  }
}

