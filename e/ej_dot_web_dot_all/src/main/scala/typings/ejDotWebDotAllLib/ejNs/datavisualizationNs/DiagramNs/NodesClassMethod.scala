package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesClassMethod extends js.Object {
  /** Sets the visibility of the method.
    * @Default {ej.datavisualization.Diagram.ScopeValueDefaults.Public}
    */
  var scope: js.UndefOr[java.lang.String] = js.undefined
}

object NodesClassMethod {
  @scala.inline
  def apply(scope: java.lang.String = null): NodesClassMethod = {
    val __obj = js.Dynamic.literal()
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[NodesClassMethod]
  }
}

