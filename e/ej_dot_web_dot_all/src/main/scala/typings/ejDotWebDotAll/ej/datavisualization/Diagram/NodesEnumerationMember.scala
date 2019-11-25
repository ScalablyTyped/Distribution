package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesEnumerationMember extends js.Object {
  /** Sets the name of the enumeration member
    */
  var name: js.UndefOr[String] = js.undefined
}

object NodesEnumerationMember {
  @scala.inline
  def apply(name: String = null): NodesEnumerationMember = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesEnumerationMember]
  }
}

