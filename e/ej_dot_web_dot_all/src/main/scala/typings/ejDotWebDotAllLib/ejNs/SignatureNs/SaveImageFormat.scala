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
  
  val BMP: BMP with java.lang.String = js.native
  val JPG: JPG with java.lang.String = js.native
  val PNG: PNG with java.lang.String = js.native
  val TIFF: TIFF with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.SignatureNs.SaveImageFormat with java.lang.String] = js.native
}

