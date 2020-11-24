package typings.devexpressUtils.fontsMod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/utils/fonts", "loadFont")
@js.native
object loadFont extends js.Object {
  
  def apply(
    fontFamily: String,
    source: String,
    fontFaceDescriptors: IFontFaceDescriptors,
    callback: js.Function1[/* error */ String | Null, Unit]
  ): Unit = js.native
  def apply(
    fontFamily: String,
    source: ArrayBuffer,
    fontFaceDescriptors: IFontFaceDescriptors,
    callback: js.Function1[/* error */ String | Null, Unit]
  ): Unit = js.native
}
