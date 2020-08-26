package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodesInterface extends js.Object {
  /** Defines a collection of attributes of the interface
    * @Default {[]}
    */
  var attributes: js.UndefOr[js.Array[NodesInterfaceAttribute]] = js.native
  /** Defines the collection of public methods of an interface
    * @Default {[]}
    */
  var methods: js.UndefOr[js.Array[NodesInterfaceMethod]] = js.native
  /** Sets the name of the interface
    */
  var name: js.UndefOr[String] = js.native
}

object NodesInterface {
  @scala.inline
  def apply(): NodesInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesInterface]
  }
  @scala.inline
  implicit class NodesInterfaceOps[Self <: NodesInterface] (val x: Self) extends AnyVal {
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
    def setAttributesVarargs(value: NodesInterfaceAttribute*): Self = this.set("attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: js.Array[NodesInterfaceAttribute]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setMethodsVarargs(value: NodesInterfaceMethod*): Self = this.set("methods", js.Array(value :_*))
    @scala.inline
    def setMethods(value: js.Array[NodesInterfaceMethod]): Self = this.set("methods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

