package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesEnumeration extends js.Object {
  /** Defines the collection of enumeration members
    * @Default {[]}
    */
  var members: js.UndefOr[js.Array[NodesEnumerationMember]] = js.undefined
  /** Sets the name of the Enumeration
    */
  var name: js.UndefOr[String] = js.undefined
}

object NodesEnumeration {
  @scala.inline
  def apply(members: js.Array[NodesEnumerationMember] = null, name: String = null): NodesEnumeration = {
    val __obj = js.Dynamic.literal()
    if (members != null) __obj.updateDynamic("members")(members)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[NodesEnumeration]
  }
}

