package typings
package dwtLib.dynamsoftNs.BarcodeReaderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumImagePixelFormat extends js.Object

@JSGlobal("dynamsoft.BarcodeReader.EnumImagePixelFormat")
@js.native
object EnumImagePixelFormat extends js.Object {
  @js.native
  sealed trait IPF_ARGB_8888
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumImagePixelFormat
  
  @js.native
  sealed trait IPF_Binary
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumImagePixelFormat
  
  @js.native
  sealed trait IPF_BinaryInverted
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumImagePixelFormat
  
  @js.native
  sealed trait IPF_GrayScaled
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumImagePixelFormat
  
  @js.native
  sealed trait IPF_NV21
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumImagePixelFormat
  
  @js.native
  sealed trait IPF_RGB_555
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumImagePixelFormat
  
  @js.native
  sealed trait IPF_RGB_565
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumImagePixelFormat
  
  @js.native
  sealed trait IPF_RGB_888
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumImagePixelFormat
  
  /* 7 */ val IPF_ARGB_8888: IPF_ARGB_8888 with scala.Double = js.native
  /* 0 */ val IPF_Binary: IPF_Binary with scala.Double = js.native
  /* 1 */ val IPF_BinaryInverted: IPF_BinaryInverted with scala.Double = js.native
  /* 2 */ val IPF_GrayScaled: IPF_GrayScaled with scala.Double = js.native
  /* 3 */ val IPF_NV21: IPF_NV21 with scala.Double = js.native
  /* 5 */ val IPF_RGB_555: IPF_RGB_555 with scala.Double = js.native
  /* 4 */ val IPF_RGB_565: IPF_RGB_565 with scala.Double = js.native
  /* 6 */ val IPF_RGB_888: IPF_RGB_888 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.dynamsoftNs.BarcodeReaderNs.EnumImagePixelFormat with scala.Double] = js.native
}

