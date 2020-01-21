package typings.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResumeOptions extends js.Object {
  /**
    * Define custom keys used to identify this file among other resume records.
    * 
    * The file's ID will be passed to your provided function
    * 
    * @default `function(fileId) { return [] }`
    */
  var customKeys: js.UndefOr[js.Function] = js.undefined
  /**
    * Enable or disable the ability to resume failed or stopped chunked uploads
    *
    * @default `false`
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * paramNames.resuming - Sent with the first request of the resume with a value of `true`.
    *
    * @default `'qqresume'`
    */
  var paramNames: js.UndefOr[ParamNamesOptions] = js.undefined
  /**
    * The number of days before a persistent resume record will expire
    *
    * @default `7`
    */
  var recordsExpireIn: js.UndefOr[Double] = js.undefined
}

object ResumeOptions {
  @scala.inline
  def apply(
    customKeys: js.Function = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    paramNames: ParamNamesOptions = null,
    recordsExpireIn: Int | Double = null
  ): ResumeOptions = {
    val __obj = js.Dynamic.literal()
    if (customKeys != null) __obj.updateDynamic("customKeys")(customKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (paramNames != null) __obj.updateDynamic("paramNames")(paramNames.asInstanceOf[js.Any])
    if (recordsExpireIn != null) __obj.updateDynamic("recordsExpireIn")(recordsExpireIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResumeOptions]
  }
}

