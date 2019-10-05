package typings.ejDotWebDotAll.ej.SunburstChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Level extends js.Object {
  /** Specifies the group member path
    * @Default {null}
    */
  var groupMemberPath: js.UndefOr[String] = js.undefined
}

object Level {
  @scala.inline
  def apply(groupMemberPath: String = null): Level = {
    val __obj = js.Dynamic.literal()
    if (groupMemberPath != null) __obj.updateDynamic("groupMemberPath")(groupMemberPath)
    __obj.asInstanceOf[Level]
  }
}

