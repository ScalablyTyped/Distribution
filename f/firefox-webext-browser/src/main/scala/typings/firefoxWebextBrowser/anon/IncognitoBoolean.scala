package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncognitoBoolean extends js.Object {
  /** Whether to return the value that applies to the incognito session (default false). */
  var incognito: js.UndefOr[Boolean] = js.undefined
}

object IncognitoBoolean {
  @scala.inline
  def apply(incognito: js.UndefOr[Boolean] = js.undefined): IncognitoBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(incognito)) __obj.updateDynamic("incognito")(incognito.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncognitoBoolean]
  }
}

