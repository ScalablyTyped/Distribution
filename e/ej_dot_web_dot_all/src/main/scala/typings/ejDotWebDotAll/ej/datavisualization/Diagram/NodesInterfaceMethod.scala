package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesInterfaceMethod extends js.Object {
  /** Sets the visibility of the method
    */
  var scope: js.UndefOr[String] = js.undefined
}

object NodesInterfaceMethod {
  @scala.inline
  def apply(scope: String = null): NodesInterfaceMethod = {
    val __obj = js.Dynamic.literal()
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[NodesInterfaceMethod]
  }
}

