package typings.expoConfigureSplashScreen.xmlManipulationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpectedElementsType extends ExpectedElement {
  var elements: ExpectedElements = js.native
}

object ExpectedElementsType {
  @scala.inline
  def apply(elements: ExpectedElements): ExpectedElementsType = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpectedElementsType]
  }
  @scala.inline
  implicit class ExpectedElementsTypeOps[Self <: ExpectedElementsType] (val x: Self) extends AnyVal {
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
    def setElementsVarargs(value: WithExplicitIndex[WithDeletionFlag[ExpectedElement]]*): Self = this.set("elements", js.Array(value :_*))
    @scala.inline
    def setElements(value: ExpectedElements): Self = this.set("elements", value.asInstanceOf[js.Any])
  }
  
}

