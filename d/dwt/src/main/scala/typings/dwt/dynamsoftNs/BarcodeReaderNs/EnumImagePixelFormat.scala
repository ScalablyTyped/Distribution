package typings.dwt.dynamsoftNs.BarcodeReaderNs

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
  
  /* 7 */ val IPF_ARGB_8888: typings.dwt.dynamsoftNs.BarcodeReaderNs.EnumImagePixelFormat.IPF_ARGB_8888 with Double = js.native
  /* 0 */ val IPF_Binary: typings.dwt.dynamsoftNs.BarcodeReaderNs.EnumImagePixelFormat.IPF_Binary with Double = js.native
  /* 1 */ val IPF_BinaryInverted: typings.dwt.dynamsoftNs.BarcodeReaderNs.EnumImagePixelFormat.IPF_BinaryInverted with Double = js.native
  /* 2 */ val IPF_GrayScaled: typings.dwt.dynamsoftNs.BarcodeReaderNs.EnumImagePixelFormat.IPF_GrayScaled with Double = js.native
  /* 3 */ val IPF_NV21: typings.dwt.dynamsoftNs.BarcodeReaderNs.EnumImagePixelFormat.IPF_NV21 with Double = js.native
  /* 5 */ val IPF_RGB_555: typings.dwt.dynamsoftNs.BarcodeReaderNs.EnumImagePixelFormat.IPF_RGB_555 with Double = js.native
  /* 4 */ val IPF_RGB_565: typings.dwt.dynamsoftNs.BarcodeReaderNs.EnumImagePixelFormat.IPF_RGB_565 with Double = js.native
  /* 6 */ val IPF_RGB_888: typings.dwt.dynamsoftNs.BarcodeReaderNs.EnumImagePixelFormat.IPF_RGB_888 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumImagePixelFormat with Double] = js.native
}

