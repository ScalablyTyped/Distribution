package typings.ejWebAll.ej.Captcha

import typings.ejWebAll.ej.HatchStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Specifies the character set of the Captcha that will be used to generate captcha text randomly.
    */
  var characterSet: js.UndefOr[String] = js.native
  /** Specifies the error message to be displayed when the Captcha mismatch.
    */
  var customErrorMessage: js.UndefOr[String] = js.native
  /** Set the Captcha validation automatically.
    */
  var enableAutoValidation: js.UndefOr[Boolean] = js.native
  /** Specifies the case sensitivity for the characters typed in the Captcha.
    */
  var enableCaseSensitivity: js.UndefOr[Boolean] = js.native
  /** Specifies the background patterns for the Captcha.
    */
  var enablePattern: js.UndefOr[Boolean] = js.native
  /** Sets the Captcha direction as right to left alignment.
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Specifies the background appearance for the captcha.
    */
  var hatchStyle: js.UndefOr[HatchStyle | String] = js.native
  /** Specifies the height of the Captcha.
    */
  var height: js.UndefOr[Double] = js.native
  /** Specifies the method with values to be mapped in the Captcha.
    */
  var mapper: js.UndefOr[String] = js.native
  /** Specifies the maximum number of characters used in the Captcha.
    */
  var maximumLength: js.UndefOr[Double] = js.native
  /** Specifies the minimum number of characters used in the Captcha.
    */
  var minimumLength: js.UndefOr[Double] = js.native
  /** Fires when captcha refresh begins.
    */
  var refreshBegin: js.UndefOr[js.Function1[/* e */ RefreshBeginEventArgs, Unit]] = js.native
  /** Fires after captcha refresh completed.
    */
  var refreshComplete: js.UndefOr[js.Function1[/* e */ RefreshCompleteEventArgs, Unit]] = js.native
  /** Fires when captcha refresh fails to load.
    */
  var refreshFailure: js.UndefOr[js.Function1[/* e */ RefreshFailureEventArgs, Unit]] = js.native
  /** Fires after captcha refresh succeeded.
    */
  var refreshSuccess: js.UndefOr[js.Function1[/* e */ RefreshSuccessEventArgs, Unit]] = js.native
  /** Specifies the method to map values to Captcha.
    */
  var requestMapper: js.UndefOr[String] = js.native
  /** Sets the Captcha with audio support, that enables to dictate the captcha text.
    */
  var showAudioButton: js.UndefOr[Boolean] = js.native
  /** Sets the Captcha with a refresh button.
    */
  var showRefreshButton: js.UndefOr[Boolean] = js.native
  /** Specifies the target button of the Captcha to validate the entered text and captcha text.
    */
  var targetButton: js.UndefOr[String] = js.native
  /** Specifies the target input element that will verify the Captcha.
    */
  var targetInput: js.UndefOr[String] = js.native
  /** Specifies the width of the Captcha.
    */
  var width: js.UndefOr[Double] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
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
    def setCharacterSet(value: String): Self = this.set("characterSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharacterSet: Self = this.set("characterSet", js.undefined)
    @scala.inline
    def setCustomErrorMessage(value: String): Self = this.set("customErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomErrorMessage: Self = this.set("customErrorMessage", js.undefined)
    @scala.inline
    def setEnableAutoValidation(value: Boolean): Self = this.set("enableAutoValidation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableAutoValidation: Self = this.set("enableAutoValidation", js.undefined)
    @scala.inline
    def setEnableCaseSensitivity(value: Boolean): Self = this.set("enableCaseSensitivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableCaseSensitivity: Self = this.set("enableCaseSensitivity", js.undefined)
    @scala.inline
    def setEnablePattern(value: Boolean): Self = this.set("enablePattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePattern: Self = this.set("enablePattern", js.undefined)
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    @scala.inline
    def setHatchStyle(value: HatchStyle | String): Self = this.set("hatchStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHatchStyle: Self = this.set("hatchStyle", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setMapper(value: String): Self = this.set("mapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapper: Self = this.set("mapper", js.undefined)
    @scala.inline
    def setMaximumLength(value: Double): Self = this.set("maximumLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumLength: Self = this.set("maximumLength", js.undefined)
    @scala.inline
    def setMinimumLength(value: Double): Self = this.set("minimumLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumLength: Self = this.set("minimumLength", js.undefined)
    @scala.inline
    def setRefreshBegin(value: /* e */ RefreshBeginEventArgs => Unit): Self = this.set("refreshBegin", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRefreshBegin: Self = this.set("refreshBegin", js.undefined)
    @scala.inline
    def setRefreshComplete(value: /* e */ RefreshCompleteEventArgs => Unit): Self = this.set("refreshComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRefreshComplete: Self = this.set("refreshComplete", js.undefined)
    @scala.inline
    def setRefreshFailure(value: /* e */ RefreshFailureEventArgs => Unit): Self = this.set("refreshFailure", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRefreshFailure: Self = this.set("refreshFailure", js.undefined)
    @scala.inline
    def setRefreshSuccess(value: /* e */ RefreshSuccessEventArgs => Unit): Self = this.set("refreshSuccess", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRefreshSuccess: Self = this.set("refreshSuccess", js.undefined)
    @scala.inline
    def setRequestMapper(value: String): Self = this.set("requestMapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestMapper: Self = this.set("requestMapper", js.undefined)
    @scala.inline
    def setShowAudioButton(value: Boolean): Self = this.set("showAudioButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowAudioButton: Self = this.set("showAudioButton", js.undefined)
    @scala.inline
    def setShowRefreshButton(value: Boolean): Self = this.set("showRefreshButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowRefreshButton: Self = this.set("showRefreshButton", js.undefined)
    @scala.inline
    def setTargetButton(value: String): Self = this.set("targetButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetButton: Self = this.set("targetButton", js.undefined)
    @scala.inline
    def setTargetInput(value: String): Self = this.set("targetInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetInput: Self = this.set("targetInput", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

