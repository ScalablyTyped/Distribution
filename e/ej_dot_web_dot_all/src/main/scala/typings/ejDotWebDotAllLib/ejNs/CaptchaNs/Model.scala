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

