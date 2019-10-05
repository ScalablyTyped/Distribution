package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesInterfaceAttribute extends js.Object {
  /** Sets the name of the attribute
    */
  var name: js.UndefOr[String] = js.undefined
  /** Sets the visibility of the attribute
    */
  var scope: js.UndefOr[String] = js.undefined
  /** Sets the type of the attribute
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object NodesInterfaceAttribute {
  @scala.inline
  def apply(name: String = null, scope: String = null, `type`: String = null): NodesInterfaceAttribute = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NodesInterfaceAttribute]
  }
}

