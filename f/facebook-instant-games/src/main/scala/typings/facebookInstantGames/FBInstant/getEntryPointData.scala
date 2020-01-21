package typings.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FBInstant.getEntryPointData")
@js.native
object getEntryPointData extends js.Object {
  /**
    * Returns any data object associated with the entry point that the game was launched from.
    *
    * The contents of the object are developer-defined, and can occur from entry points on different platforms.
    * This will return null for older mobile clients, as well as when there is no data associated with the particular entry point.
    *
    * @returns Data associated with the current entry point.
    */
  def apply(): js.Any = js.native
}

