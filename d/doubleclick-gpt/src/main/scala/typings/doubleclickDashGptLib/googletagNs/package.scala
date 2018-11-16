package typings
package doubleclickDashGptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object googletagNs {
  type GeneralSize = SingleSize | MultiSize
  type MultiSize = js.Array[SingleSize]
  type NamedSize = java.lang.String | js.Array[java.lang.String]
  type SingleSize = SingleSizeArray | NamedSize
  type SingleSizeArray = js.Array[scala.Double]
  type SizeMapping = js.Array[GeneralSize]
  type SizeMappingArray = js.Array[SizeMapping]
}
