package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesInterfaceMethod extends js.Object {
  /** Sets the visibility of the method
    */
  var scope: js.UndefOr[java.lang.String] = js.undefined
}

object NodesInterfaceMethod {
  @scala.inline
  def apply(scope: java.lang.String = null): NodesInterfaceMethod = {
    val __obj = js.Dynamic.literal()
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[NodesInterfaceMethod]
  }
}

