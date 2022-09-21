package typings.firebaseStorage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeMod {
  
  @JSImport("@firebase/storage/dist/node-esm/src/implementation/type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isFunction(p: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(p.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isJustDef[T](): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJustDef")().asInstanceOf[Boolean]
  inline def isJustDef[T](p: T): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJustDef")(p.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNativeBlob(p: Any): /* is std.Blob */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNativeBlob")(p.asInstanceOf[js.Any]).asInstanceOf[/* is std.Blob */ Boolean]
  
  inline def isNativeBlobDefined(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNativeBlobDefined")().asInstanceOf[Boolean]
  
  inline def isNonArrayObject(p: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNonArrayObject")(p.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isString(p: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(p.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def validateNumber(argument: String, minValue: Double, maxValue: Double, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateNumber")(argument.asInstanceOf[js.Any], minValue.asInstanceOf[js.Any], maxValue.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
