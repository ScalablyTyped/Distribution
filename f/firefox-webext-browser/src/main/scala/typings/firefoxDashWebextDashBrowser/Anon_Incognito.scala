package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Incognito extends js.Object {
  /** Whether to return the value that applies to the incognito session (default false). */
  var incognito: js.UndefOr[Boolean] = js.undefined
}

object Anon_Incognito {
  @scala.inline
  def apply(incognito: js.UndefOr[Boolean] = js.undefined): Anon_Incognito = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(incognito)) __obj.updateDynamic("incognito")(incognito)
    __obj.asInstanceOf[Anon_Incognito]
  }
}

