package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesEnumerationMember extends js.Object {
  /** Sets the name of the enumeration member
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object NodesEnumerationMember {
  @scala.inline
  def apply(name: java.lang.String = null): NodesEnumerationMember = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[NodesEnumerationMember]
  }
}

