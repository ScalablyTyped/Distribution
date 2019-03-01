package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Level extends js.Object {
  /** Specifies the group member path
    * @Default {null}
    */
  var groupMemberPath: js.UndefOr[java.lang.String] = js.undefined
}

object Level {
  @scala.inline
  def apply(groupMemberPath: java.lang.String = null): Level = {
    val __obj = js.Dynamic.literal()
    if (groupMemberPath != null) __obj.updateDynamic("groupMemberPath")(groupMemberPath)
    __obj.asInstanceOf[Level]
  }
}

