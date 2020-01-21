package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesClassAttribute extends js.Object {
  /** Sets the name of the attribute
    */
  var name: js.UndefOr[String] = js.undefined
  /** Defines the visibility of the attribute
    * @Default {ej.datavisualization.Diagram.ScopeValueDefaults.Public}
    */
  var scope: js.UndefOr[String] = js.undefined
  /** Sets the data type of attribute
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object NodesClassAttribute {
  @scala.inline
  def apply(name: String = null, scope: String = null, `type`: String = null): NodesClassAttribute = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesClassAttribute]
  }
}

