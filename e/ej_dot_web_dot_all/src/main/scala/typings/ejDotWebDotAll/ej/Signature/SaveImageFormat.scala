package typings.ejDotWebDotAll.ej.Signature

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SaveImageFormat extends js.Object

@JSGlobal("ej.Signature.SaveImageFormat")
@js.native
object SaveImageFormat extends js.Object {
  ///To save the signature image with BMP format only.
  @js.native
  sealed trait BMP extends SaveImageFormat
  
  ///To save the signature image with JPG format only.
  @js.native
  sealed trait JPG extends SaveImageFormat
  
  ///To save the signature image with PNG format only.
  @js.native
  sealed trait PNG extends SaveImageFormat
  
  ///To save the signature image with TIFF format only.
  @js.native
  sealed trait TIFF extends SaveImageFormat
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SaveImageFormat with Double] = js.native
  /* 2 */ @js.native
  object BMP extends TopLevel[BMP with Double]
  
  /* 1 */ @js.native
  object JPG extends TopLevel[JPG with Double]
  
  /* 0 */ @js.native
  object PNG extends TopLevel[PNG with Double]
  
  /* 3 */ @js.native
  object TIFF extends TopLevel[TIFF with Double]
  
}

