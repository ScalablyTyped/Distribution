package typings.doubleclickDashGpt.googletagNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeMappingBuilder extends js.Object {
  def addSize(viewportSize: SingleSizeArray, slotSize: GeneralSize): SizeMappingBuilder
  def build(): SizeMappingArray
}

object SizeMappingBuilder {
  @scala.inline
  def apply(addSize: (SingleSizeArray, GeneralSize) => SizeMappingBuilder, build: () => SizeMappingArray): SizeMappingBuilder = {
    val __obj = js.Dynamic.literal(addSize = js.Any.fromFunction2(addSize), build = js.Any.fromFunction0(build))
  
    __obj.asInstanceOf[SizeMappingBuilder]
  }
}

