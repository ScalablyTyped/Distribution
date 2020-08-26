package typings.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChunkingOptions extends js.Object {
  /**
    * concurrent Chunking options
    */
  var concurrent: js.UndefOr[ConcurrentOptions] = js.native
  /**
    * Enable or disable splitting the file separate chunks. Each chunks is sent in a separate requested
    *
    * @default `false`
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Ensure every file is uploaded in chunks, even if the file can only be split up into 1 chunk.
    *
    * Does not apply if chunking is not possible in the current browser
    *
    * @default `false`
    */
  var mandatory: js.UndefOr[Boolean] = js.native
  /**
    * ParamNamesOptions
    */
  var paramNames: js.UndefOr[ParamNamesOptions] = js.native
  /**
    * The maximum size of each chunk, in bytes
    * If a function value is provided, the file's ID will be passed when invoking the function (which should only be called once per file)
    *
    * @default `2000000`
    */
  var partSize: js.UndefOr[Double | js.Function] = js.native
  /**
    * SuccessOptions
    */
  var success: js.UndefOr[SuccessOptions] = js.native
}

object ChunkingOptions {
  @scala.inline
  def apply(): ChunkingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChunkingOptions]
  }
  @scala.inline
  implicit class ChunkingOptionsOps[Self <: ChunkingOptions] (val x: Self) extends AnyVal {
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
    def setConcurrent(value: ConcurrentOptions): Self = this.set("concurrent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcurrent: Self = this.set("concurrent", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setMandatory(value: Boolean): Self = this.set("mandatory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMandatory: Self = this.set("mandatory", js.undefined)
    @scala.inline
    def setParamNames(value: ParamNamesOptions): Self = this.set("paramNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParamNames: Self = this.set("paramNames", js.undefined)
    @scala.inline
    def setPartSize(value: Double | js.Function): Self = this.set("partSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartSize: Self = this.set("partSize", js.undefined)
    @scala.inline
    def setSuccess(value: SuccessOptions): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

