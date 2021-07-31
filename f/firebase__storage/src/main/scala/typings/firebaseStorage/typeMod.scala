package typings.firebaseStorage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeMod {
  
  @JSImport("@firebase/storage/dist/src/implementation/type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isFunction(p: js.Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(p.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  @scala.inline
  def isJustDef[T](): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJustDef")().asInstanceOf[Boolean]
  @scala.inline
  def isJustDef[T](p: T): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJustDef")(p.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isNativeBlob(p: js.Any): /* is std.Blob */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNativeBlob")(p.asInstanceOf[js.Any]).asInstanceOf[/* is std.Blob */ Boolean]
  
  @scala.inline
  def isNativeBlobDefined(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNativeBlobDefined")().asInstanceOf[Boolean]
  
  @scala.inline
  def isNonArrayObject(p: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNonArrayObject")(p.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isString(p: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(p.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  @scala.inline
  def validateNumber(argument: String, minValue: Double, maxValue: Double, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateNumber")(argument.asInstanceOf[js.Any], minValue.asInstanceOf[js.Any], maxValue.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
