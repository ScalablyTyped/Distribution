package typings.firebaseStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/storage/dist/src/implementation/type", JSImport.Namespace)
@js.native
object typeMod extends js.Object {
  
  def isFunction(p: js.Any): /* is std.Function */ Boolean = js.native
  
  def isJustDef[T](): Boolean = js.native
  def isJustDef[T](p: T): Boolean = js.native
  
  def isNativeBlob(p: js.Any): /* is std.Blob */ Boolean = js.native
  
  def isNativeBlobDefined(): Boolean = js.native
  
  def isNonArrayObject(p: js.Any): Boolean = js.native
  
  def isString(p: js.Any): /* is string */ Boolean = js.native
  
  def validateNumber(argument: String, minValue: Double, maxValue: Double, value: Double): Unit = js.native
}
