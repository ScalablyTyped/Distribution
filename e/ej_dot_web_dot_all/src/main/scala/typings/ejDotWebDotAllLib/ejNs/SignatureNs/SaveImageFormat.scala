package typings
package ejDotWebDotAllLib.ejNs.SignatureNs

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
  sealed trait BMP
    extends ejDotWebDotAllLib.ejNs.SignatureNs.SaveImageFormat
  
  ///To save the signature image with JPG format only.
  @js.native
  sealed trait JPG
    extends ejDotWebDotAllLib.ejNs.SignatureNs.SaveImageFormat
  
  ///To save the signature image with PNG format only.
  @js.native
  sealed trait PNG
    extends ejDotWebDotAllLib.ejNs.SignatureNs.SaveImageFormat
  
  ///To save the signature image with TIFF format only.
  @js.native
  sealed trait TIFF
    extends ejDotWebDotAllLib.ejNs.SignatureNs.SaveImageFormat
  
  /* 2 */ val BMP: BMP with scala.Double = js.native
  /* 1 */ val JPG: JPG with scala.Double = js.native
  /* 0 */ val PNG: PNG with scala.Double = js.native
  /* 3 */ val TIFF: TIFF with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.SignatureNs.SaveImageFormat with scala.Double] = js.native
}

