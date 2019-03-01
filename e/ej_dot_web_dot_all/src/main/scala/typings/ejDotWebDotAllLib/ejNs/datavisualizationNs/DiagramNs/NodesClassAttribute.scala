package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesClassAttribute extends js.Object {
  /** Sets the name of the attribute
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the visibility of the attribute
    * @Default {ej.datavisualization.Diagram.ScopeValueDefaults.Public}
    */
  var scope: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the data type of attribute
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object NodesClassAttribute {
  @scala.inline
  def apply(name: java.lang.String = null, scope: java.lang.String = null, `type`: java.lang.String = null): NodesClassAttribute = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NodesClassAttribute]
  }
}

