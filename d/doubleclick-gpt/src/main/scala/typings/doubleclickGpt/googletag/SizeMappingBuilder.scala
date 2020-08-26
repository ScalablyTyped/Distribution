package typings.doubleclickGpt.googletag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeMappingBuilder extends js.Object {
  def addSize(viewportSize: SingleSizeArray, slotSize: GeneralSize): SizeMappingBuilder = js.native
  def build(): SizeMappingArray = js.native
}

object SizeMappingBuilder {
  @scala.inline
  def apply(addSize: (SingleSizeArray, GeneralSize) => SizeMappingBuilder, build: () => SizeMappingArray): SizeMappingBuilder = {
    val __obj = js.Dynamic.literal(addSize = js.Any.fromFunction2(addSize), build = js.Any.fromFunction0(build))
    __obj.asInstanceOf[SizeMappingBuilder]
  }
  @scala.inline
  implicit class SizeMappingBuilderOps[Self <: SizeMappingBuilder] (val x: Self) extends AnyVal {
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
    def setAddSize(value: (SingleSizeArray, GeneralSize) => SizeMappingBuilder): Self = this.set("addSize", js.Any.fromFunction2(value))
    @scala.inline
    def setBuild(value: () => SizeMappingArray): Self = this.set("build", js.Any.fromFunction0(value))
  }
  
}

