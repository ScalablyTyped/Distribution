package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncognitoSpecific extends js.Object {
  /**
    * Whether the value that has changed is specific to the incognito session.
    * This property will _only_ be present if the user has enabled the extension in incognito mode.
    */
  var incognitoSpecific: js.UndefOr[scala.Boolean] = js.undefined
  /** The level of control of the setting. */
  var levelOfControl: firefoxDashWebextDashBrowserLib.browserNs.typesNs.LevelOfControl
  /** The value of the setting after the change. */
  var value: js.Any
}

object Anon_IncognitoSpecific {
  @scala.inline
  def apply(
    levelOfControl: firefoxDashWebextDashBrowserLib.browserNs.typesNs.LevelOfControl,
    value: js.Any,
    incognitoSpecific: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_IncognitoSpecific = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("levelOfControl")(levelOfControl)
    __obj.updateDynamic("value")(value)
    if (!js.isUndefined(incognitoSpecific)) __obj.updateDynamic("incognitoSpecific")(incognitoSpecific)
    __obj.asInstanceOf[Anon_IncognitoSpecific]
  }
}

