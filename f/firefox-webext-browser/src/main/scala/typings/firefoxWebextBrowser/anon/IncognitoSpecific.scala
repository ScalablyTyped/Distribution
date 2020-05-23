package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.types.LevelOfControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncognitoSpecific extends js.Object {
  /**
    * Whether the value that has changed is specific to the incognito session.
    * This property will _only_ be present if the user has enabled the extension in incognito mode.
    */
  var incognitoSpecific: js.UndefOr[Boolean] = js.undefined
  /** The level of control of the setting. */
  var levelOfControl: LevelOfControl
  /** The value of the setting after the change. */
  var value: js.Any
}

object IncognitoSpecific {
  @scala.inline
  def apply(
    levelOfControl: LevelOfControl,
    value: js.Any,
    incognitoSpecific: js.UndefOr[Boolean] = js.undefined
  ): IncognitoSpecific = {
    val __obj = js.Dynamic.literal(levelOfControl = levelOfControl.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(incognitoSpecific)) __obj.updateDynamic("incognitoSpecific")(incognitoSpecific.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncognitoSpecific]
  }
}

