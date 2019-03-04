package typings
package glDashTexture2dLib.glDashTexture2dMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawObject extends js.Object {
  var height: scala.Double
  var raw: stdLib.ArrayBufferView | glDashTexture2dLib.InputType | stdLib.ImageBitmap
  var width: scala.Double
}

object RawObject {
  @scala.inline
  def apply(
    height: scala.Double,
    raw: stdLib.ArrayBufferView | glDashTexture2dLib.InputType | stdLib.ImageBitmap,
    width: scala.Double
  ): RawObject = {
    val __obj = js.Dynamic.literal(height = height, raw = raw.asInstanceOf[js.Any], width = width)
  
    __obj.asInstanceOf[RawObject]
  }
}

