package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesClassMethod extends js.Object {
  /** Sets the visibility of the method.
    * @Default {ej.datavisualization.Diagram.ScopeValueDefaults.Public}
    */
  var scope: js.UndefOr[String] = js.undefined
}

object NodesClassMethod {
  @scala.inline
  def apply(scope: String = null): NodesClassMethod = {
    val __obj = js.Dynamic.literal()
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesClassMethod]
  }
}

