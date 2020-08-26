package typings.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResumeOptions extends js.Object {
  /**
    * Define custom keys used to identify this file among other resume records.
    * 
    * The file's ID will be passed to your provided function
    * 
    * @default `function(fileId) { return [] }`
    */
  var customKeys: js.UndefOr[js.Function] = js.native
  /**
    * Enable or disable the ability to resume failed or stopped chunked uploads
    *
    * @default `false`
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * paramNames.resuming - Sent with the first request of the resume with a value of `true`.
    *
    * @default `'qqresume'`
    */
  var paramNames: js.UndefOr[ParamNamesOptions] = js.native
  /**
    * The number of days before a persistent resume record will expire
    *
    * @default `7`
    */
  var recordsExpireIn: js.UndefOr[Double] = js.native
}

object ResumeOptions {
  @scala.inline
  def apply(): ResumeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResumeOptions]
  }
  @scala.inline
  implicit class ResumeOptionsOps[Self <: ResumeOptions] (val x: Self) extends AnyVal {
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
    def setCustomKeys(value: js.Function): Self = this.set("customKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomKeys: Self = this.set("customKeys", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setParamNames(value: ParamNamesOptions): Self = this.set("paramNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParamNames: Self = this.set("paramNames", js.undefined)
    @scala.inline
    def setRecordsExpireIn(value: Double): Self = this.set("recordsExpireIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordsExpireIn: Self = this.set("recordsExpireIn", js.undefined)
  }
  
}

