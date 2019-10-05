package typings.doubleclickDashGpt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object googletag {
  type GeneralSize = SingleSize | MultiSize
  type MultiSize = js.Array[SingleSize]
  type NamedSize = String | js.Array[String]
  type SingleSize = SingleSizeArray | NamedSize
  type SingleSizeArray = js.Array[Double]
  type SizeMapping = js.Array[GeneralSize]
  type SizeMappingArray = js.Array[SizeMapping]
}
