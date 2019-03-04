package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  // The collection of elements in the group. The minimum size of a group is 2.
  var children: js.Array[PageElement]
}

object Group {
  @scala.inline
  def apply(children: js.Array[PageElement]): Group = {
    val __obj = js.Dynamic.literal(children = children)
  
    __obj.asInstanceOf[Group]
  }
}

