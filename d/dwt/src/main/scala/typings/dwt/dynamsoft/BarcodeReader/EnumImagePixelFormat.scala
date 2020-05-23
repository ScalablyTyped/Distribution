package typings.dwt.dynamsoft.BarcodeReader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumImagePixelFormat extends js.Object

@JSGlobal("dynamsoft.BarcodeReader.EnumImagePixelFormat")
@js.native
object EnumImagePixelFormat extends js.Object {
  @js.native
  sealed trait IPF_ARGB_8888 extends EnumImagePixelFormat
  
  @js.native
  sealed trait IPF_Binary extends EnumImagePixelFormat
  
  @js.native
  sealed trait IPF_BinaryInverted extends EnumImagePixelFormat
  
  @js.native
  sealed trait IPF_GrayScaled extends EnumImagePixelFormat
  
  @js.native
  sealed trait IPF_NV21 extends EnumImagePixelFormat
  
  @js.native
  sealed trait IPF_RGB_555 extends EnumImagePixelFormat
  
  @js.native
  sealed trait IPF_RGB_565 extends EnumImagePixelFormat
  
  @js.native
  sealed trait IPF_RGB_888 extends EnumImagePixelFormat
  
}

