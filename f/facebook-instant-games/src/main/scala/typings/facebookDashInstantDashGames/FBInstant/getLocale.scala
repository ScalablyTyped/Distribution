package typings.facebookDashInstantDashGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FBInstant.getLocale")
@js.native
object getLocale extends js.Object {
  /**
    * The current locale. Use this to determine what language the current game should be localized with.
    * The value will not be accurate until FBInstant.startGameAsync() resolves.
    *
    * @returns The current locale.
    */
  def apply(): String | Null = js.native
}

