package typings.fineDashUploader.libCoreMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormOptions extends js.Object {
  /**
    * If Fine Uploader is able to attach to a form, this value takes the place of the base `autoUpload` option
    *
    * @default `false`
    */
  var autoUpload: js.UndefOr[Boolean] = js.undefined
  /**
    * This can be the ID of the <form> or a reference to the <form> element
    *
    * @default `'qq-form'`
    */
  var element: js.UndefOr[String | HTMLElement] = js.undefined
  /**
    * Set this to `false` if you do not want Fine Uploader to intercept attempts to submit your form.
    *
    * By default, Fine Uploader will intercept submit attempts and instead upload all submitted files, including data from your form in each upload request
    *
    * @default `true`
    */
  var interceptSubmit: js.UndefOr[Boolean] = js.undefined
}

object FormOptions {
  @scala.inline
  def apply(
    autoUpload: js.UndefOr[Boolean] = js.undefined,
    element: String | HTMLElement = null,
    interceptSubmit: js.UndefOr[Boolean] = js.undefined
  ): FormOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoUpload)) __obj.updateDynamic("autoUpload")(autoUpload.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(interceptSubmit)) __obj.updateDynamic("interceptSubmit")(interceptSubmit.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormOptions]
  }
}

