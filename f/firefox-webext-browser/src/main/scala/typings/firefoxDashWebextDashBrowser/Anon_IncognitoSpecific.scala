package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser.types.LevelOfControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncognitoSpecific extends js.Object {
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

object Anon_IncognitoSpecific {
  @scala.inline
  def apply(
    levelOfControl: LevelOfControl,
    value: js.Any,
    incognitoSpecific: js.UndefOr[Boolean] = js.undefined
  ): Anon_IncognitoSpecific = {
    val __obj = js.Dynamic.literal(levelOfControl = levelOfControl, value = value)
    if (!js.isUndefined(incognitoSpecific)) __obj.updateDynamic("incognitoSpecific")(incognitoSpecific)
    __obj.asInstanceOf[Anon_IncognitoSpecific]
  }
}

