package typings.ejWebAll.ej.Signature

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
  
}

