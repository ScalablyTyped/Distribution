package typings.dwt.dynamsoft.BarcodeReader

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumImagePixelFormat with Double] = js.native
  /* 7 */ @js.native
  object IPF_ARGB_8888 extends TopLevel[IPF_ARGB_8888 with Double]
  
  /* 0 */ @js.native
  object IPF_Binary extends TopLevel[IPF_Binary with Double]
  
  /* 1 */ @js.native
  object IPF_BinaryInverted extends TopLevel[IPF_BinaryInverted with Double]
  
  /* 2 */ @js.native
  object IPF_GrayScaled extends TopLevel[IPF_GrayScaled with Double]
  
  /* 3 */ @js.native
  object IPF_NV21 extends TopLevel[IPF_NV21 with Double]
  
  /* 5 */ @js.native
  object IPF_RGB_555 extends TopLevel[IPF_RGB_555 with Double]
  
  /* 4 */ @js.native
  object IPF_RGB_565 extends TopLevel[IPF_RGB_565 with Double]
  
  /* 6 */ @js.native
  object IPF_RGB_888 extends TopLevel[IPF_RGB_888 with Double]
  
}

