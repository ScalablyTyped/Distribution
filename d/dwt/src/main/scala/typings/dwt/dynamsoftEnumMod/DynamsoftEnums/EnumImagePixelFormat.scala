package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumImagePixelFormat extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumImagePixelFormat")
@js.native
object EnumImagePixelFormat extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumImagePixelFormat with Double] = js.native
  
  @js.native
  sealed trait IPF_ABGR_16161616 extends EnumImagePixelFormat
  /* 11 */ @js.native
  object IPF_ABGR_16161616 extends TopLevel[IPF_ABGR_16161616 with Double]
  
  @js.native
  sealed trait IPF_ABGR_8888 extends EnumImagePixelFormat
  /* 10 */ @js.native
  object IPF_ABGR_8888 extends TopLevel[IPF_ABGR_8888 with Double]
  
  @js.native
  sealed trait IPF_ARGB_16161616 extends EnumImagePixelFormat
  /* 9 */ @js.native
  object IPF_ARGB_16161616 extends TopLevel[IPF_ARGB_16161616 with Double]
  
  @js.native
  sealed trait IPF_ARGB_8888 extends EnumImagePixelFormat
  /* 7 */ @js.native
  object IPF_ARGB_8888 extends TopLevel[IPF_ARGB_8888 with Double]
  
  @js.native
  sealed trait IPF_BGR_888 extends EnumImagePixelFormat
  /* 12 */ @js.native
  object IPF_BGR_888 extends TopLevel[IPF_BGR_888 with Double]
  
  @js.native
  sealed trait IPF_Binary extends EnumImagePixelFormat
  /* 0 */ @js.native
  object IPF_Binary extends TopLevel[IPF_Binary with Double]
  
  @js.native
  sealed trait IPF_BinaryInverted extends EnumImagePixelFormat
  /* 1 */ @js.native
  object IPF_BinaryInverted extends TopLevel[IPF_BinaryInverted with Double]
  
  @js.native
  sealed trait IPF_GrayScaled extends EnumImagePixelFormat
  /* 2 */ @js.native
  object IPF_GrayScaled extends TopLevel[IPF_GrayScaled with Double]
  
  @js.native
  sealed trait IPF_NV21 extends EnumImagePixelFormat
  /* 3 */ @js.native
  object IPF_NV21 extends TopLevel[IPF_NV21 with Double]
  
  @js.native
  sealed trait IPF_RGB_161616 extends EnumImagePixelFormat
  /* 8 */ @js.native
  object IPF_RGB_161616 extends TopLevel[IPF_RGB_161616 with Double]
  
  @js.native
  sealed trait IPF_RGB_555 extends EnumImagePixelFormat
  /* 5 */ @js.native
  object IPF_RGB_555 extends TopLevel[IPF_RGB_555 with Double]
  
  @js.native
  sealed trait IPF_RGB_565 extends EnumImagePixelFormat
  /* 4 */ @js.native
  object IPF_RGB_565 extends TopLevel[IPF_RGB_565 with Double]
  
  @js.native
  sealed trait IPF_RGB_888 extends EnumImagePixelFormat
  /* 6 */ @js.native
  object IPF_RGB_888 extends TopLevel[IPF_RGB_888 with Double]
}
