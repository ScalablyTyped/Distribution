package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodesInterfaceMethod extends js.Object {
  /** Sets the visibility of the method
    */
  var scope: js.UndefOr[String] = js.native
}

object NodesInterfaceMethod {
  @scala.inline
  def apply(): NodesInterfaceMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesInterfaceMethod]
  }
  @scala.inline
  implicit class NodesInterfaceMethodOps[Self <: NodesInterfaceMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
  
}

