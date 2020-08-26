package typings.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamNamesOptions extends js.Object {
  /**
    * Name of the parameter passed with a chunked request that specifies the size in bytes of the associated chunk
    *
    * @default `'qqchunksize'`
    */
  var chunkSize: js.UndefOr[String] = js.native
  /**
    * Name of the parameter passed with a chunked request that specifies the starting byte of the associated chunk
    *
    * @default `'qqpartbyteoffset'`
    */
  var partByteOffset: js.UndefOr[String] = js.native
  /**
    * Name of the parameter passed with a chunked request that specifies the index of the associated partition
    *
    * @default `'qqpartindex'`
    */
  var partIndex: js.UndefOr[String] = js.native
  /**
    * Sent with the first request of the resume with a value of `true`
    *
    * @default `'qqresume'`
    */
  var resuming: js.UndefOr[String] = js.native
  /**
    * totalFileSize
    *
    * @default `'qqtotalfilesize'`
    */
  var totalFileSize: js.UndefOr[String] = js.native
  /**
    * Name of the parameter passed with a chunked request that specifies the total number of chunks associated with the `File` or `Blob`
    *
    * @default `'qqtotalparts'`
    */
  var totalParts: js.UndefOr[String] = js.native
}

object ParamNamesOptions {
  @scala.inline
  def apply(): ParamNamesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamNamesOptions]
  }
  @scala.inline
  implicit class ParamNamesOptionsOps[Self <: ParamNamesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChunkSize(value: String): Self = this.set("chunkSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChunkSize: Self = this.set("chunkSize", js.undefined)
    @scala.inline
    def setPartByteOffset(value: String): Self = this.set("partByteOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartByteOffset: Self = this.set("partByteOffset", js.undefined)
    @scala.inline
    def setPartIndex(value: String): Self = this.set("partIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartIndex: Self = this.set("partIndex", js.undefined)
    @scala.inline
    def setResuming(value: String): Self = this.set("resuming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResuming: Self = this.set("resuming", js.undefined)
    @scala.inline
    def setTotalFileSize(value: String): Self = this.set("totalFileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalFileSize: Self = this.set("totalFileSize", js.undefined)
    @scala.inline
    def setTotalParts(value: String): Self = this.set("totalParts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalParts: Self = this.set("totalParts", js.undefined)
  }
  
}

