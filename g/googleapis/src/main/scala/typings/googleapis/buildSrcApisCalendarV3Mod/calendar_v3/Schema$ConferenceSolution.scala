package typings.googleapis.buildSrcApisCalendarV3Mod.calendar_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ConferenceSolution extends js.Object {
  /**
    * The user-visible icon for this solution.
    */
  var iconUri: js.UndefOr[String] = js.native
  /**
    * The key which can uniquely identify the conference solution for this
    * event.
    */
  var key: js.UndefOr[Schema$ConferenceSolutionKey] = js.native
  /**
    * The user-visible name of this solution. Not localized.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$ConferenceSolution {
  @scala.inline
  def apply(iconUri: String = null, key: Schema$ConferenceSolutionKey = null, name: String = null): Schema$ConferenceSolution = {
    val __obj = js.Dynamic.literal()
    if (iconUri != null) __obj.updateDynamic("iconUri")(iconUri.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ConferenceSolution]
  }
}

