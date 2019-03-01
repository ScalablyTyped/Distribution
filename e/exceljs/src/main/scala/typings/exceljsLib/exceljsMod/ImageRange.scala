package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageRange extends js.Object {
  var br: exceljsLib.Anon_Col
  var tl: exceljsLib.Anon_Col
}

object ImageRange {
  @scala.inline
  def apply(br: exceljsLib.Anon_Col, tl: exceljsLib.Anon_Col): ImageRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("br")(br)
    __obj.updateDynamic("tl")(tl)
    __obj.asInstanceOf[ImageRange]
  }
}

