package typings
package doubleclickDashGptLib.googletagNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeMappingBuilder extends js.Object {
  def addSize(viewportSize: SingleSizeArray, slotSize: GeneralSize): SizeMappingBuilder
  def build(): SizeMappingArray
}

object SizeMappingBuilder {
  @scala.inline
  def apply(
    addSize: js.Function2[SingleSizeArray, GeneralSize, SizeMappingBuilder],
    build: js.Function0[SizeMappingArray]
  ): SizeMappingBuilder = {
    val __obj = js.Dynamic.literal(addSize = addSize, build = build)
  
    __obj.asInstanceOf[SizeMappingBuilder]
  }
}

