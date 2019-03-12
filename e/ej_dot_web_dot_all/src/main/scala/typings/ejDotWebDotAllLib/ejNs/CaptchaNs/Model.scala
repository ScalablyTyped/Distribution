package typings
package ejDotWebDotAllLib.ejNs.CaptchaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Specifies the character set of the Captcha that will be used to generate captcha text randomly.
    */
  var characterSet: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the error message to be displayed when the Captcha mismatch.
    */
  var customErrorMessage: js.UndefOr[java.lang.String] = js.undefined
  /** Set the Captcha validation automatically.
    */
  var enableAutoValidation: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the case sensitivity for the characters typed in the Captcha.
    */
  var enableCaseSensitivity: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the background patterns for the Captcha.
    */
  var enablePattern: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the Captcha direction as right to left alignment.
    */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the background appearance for the captcha.
    */
  var hatchStyle: js.UndefOr[ejDotWebDotAllLib.ejNs.HatchStyle | java.lang.String] = js.undefined
  /** Specifies the height of the Captcha.
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the method with values to be mapped in the Captcha.
    */
  var mapper: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the maximum number of characters used in the Captcha.
    */
  var maximumLength: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the minimum number of characters used in the Captcha.
    */
  var minimumLength: js.UndefOr[scala.Double] = js.undefined
  /** Fires when captcha refresh begins.
    */
  var refreshBegin: js.UndefOr[js.Function1[/* e */ RefreshBeginEventArgs, scala.Unit]] = js.undefined
  /** Fires after captcha refresh completed.
    */
  var refreshComplete: js.UndefOr[js.Function1[/* e */ RefreshCompleteEventArgs, scala.Unit]] = js.undefined
  /** Fires when captcha refresh fails to load.
    */
  var refreshFailure: js.UndefOr[js.Function1[/* e */ RefreshFailureEventArgs, scala.Unit]] = js.undefined
  /** Fires after captcha refresh succeeded.
    */
  var refreshSuccess: js.UndefOr[js.Function1[/* e */ RefreshSuccessEventArgs, scala.Unit]] = js.undefined
  /** Specifies the method to map values to Captcha.
    */
  var requestMapper: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the Captcha with audio support, that enables to dictate the captcha text.
    */
  var showAudioButton: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the Captcha with a refresh button.
    */
  var showRefreshButton: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the target button of the Captcha to validate the entered text and captcha text.
    */
  var targetButton: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the target input element that will verify the Captcha.
    */
  var targetInput: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the width of the Captcha.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    characterSet: java.lang.String = null,
    customErrorMessage: java.lang.String = null,
    enableAutoValidation: js.UndefOr[scala.Boolean] = js.undefined,
    enableCaseSensitivity: js.UndefOr[scala.Boolean] = js.undefined,
    enablePattern: js.UndefOr[scala.Boolean] = js.undefined,
    enableRTL: js.UndefOr[scala.Boolean] = js.undefined,
    hatchStyle: ejDotWebDotAllLib.ejNs.HatchStyle | java.lang.String = null,
    height: scala.Int | scala.Double = null,
    mapper: java.lang.String = null,
    maximumLength: scala.Int | scala.Double = null,
    minimumLength: scala.Int | scala.Double = null,
    refreshBegin: /* e */ RefreshBeginEventArgs => scala.Unit = null,
    refreshComplete: /* e */ RefreshCompleteEventArgs => scala.Unit = null,
    refreshFailure: /* e */ RefreshFailureEventArgs => scala.Unit = null,
    refreshSuccess: /* e */ RefreshSuccessEventArgs => scala.Unit = null,
    requestMapper: java.lang.String = null,
    showAudioButton: js.UndefOr[scala.Boolean] = js.undefined,
    showRefreshButton: js.UndefOr[scala.Boolean] = js.undefined,
    targetButton: java.lang.String = null,
    targetInput: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (characterSet != null) __obj.updateDynamic("characterSet")(characterSet)
    if (customErrorMessage != null) __obj.updateDynamic("customErrorMessage")(customErrorMessage)
    if (!js.isUndefined(enableAutoValidation)) __obj.updateDynamic("enableAutoValidation")(enableAutoValidation)
    if (!js.isUndefined(enableCaseSensitivity)) __obj.updateDynamic("enableCaseSensitivity")(enableCaseSensitivity)
    if (!js.isUndefined(enablePattern)) __obj.updateDynamic("enablePattern")(enablePattern)
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (hatchStyle != null) __obj.updateDynamic("hatchStyle")(hatchStyle.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (mapper != null) __obj.updateDynamic("mapper")(mapper)
    if (maximumLength != null) __obj.updateDynamic("maximumLength")(maximumLength.asInstanceOf[js.Any])
    if (minimumLength != null) __obj.updateDynamic("minimumLength")(minimumLength.asInstanceOf[js.Any])
    if (refreshBegin != null) __obj.updateDynamic("refreshBegin")(js.Any.fromFunction1(refreshBegin))
    if (refreshComplete != null) __obj.updateDynamic("refreshComplete")(js.Any.fromFunction1(refreshComplete))
    if (refreshFailure != null) __obj.updateDynamic("refreshFailure")(js.Any.fromFunction1(refreshFailure))
    if (refreshSuccess != null) __obj.updateDynamic("refreshSuccess")(js.Any.fromFunction1(refreshSuccess))
    if (requestMapper != null) __obj.updateDynamic("requestMapper")(requestMapper)
    if (!js.isUndefined(showAudioButton)) __obj.updateDynamic("showAudioButton")(showAudioButton)
    if (!js.isUndefined(showRefreshButton)) __obj.updateDynamic("showRefreshButton")(showRefreshButton)
    if (targetButton != null) __obj.updateDynamic("targetButton")(targetButton)
    if (targetInput != null) __obj.updateDynamic("targetInput")(targetInput)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

