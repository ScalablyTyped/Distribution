package typings.firebaseAdmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validatorMod {
  
  @JSImport("firebase-admin/lib/utils/validator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isArray[T](value: Any): /* is std.Array<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<T> */ Boolean]
  
  inline def isBase64String(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBase64String")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBoolean(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBuffer(value: Any): /* is node.buffer.<global>.Buffer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuffer")(value.asInstanceOf[js.Any]).asInstanceOf[/* is node.buffer.<global>.Buffer */ Boolean]
  
  inline def isEmail(email: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmail")(email.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isISODateString(dateString: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isISODateString")(dateString.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNonEmptyArray[T](value: Any): /* is std.Array<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNonEmptyArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<T> */ Boolean]
  
  inline def isNonEmptyString(value: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNonEmptyString")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isNonNullObject[T](): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNonNullObject")().asInstanceOf[/* is T */ Boolean]
  inline def isNonNullObject[T](value: T): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNonNullObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is T */ Boolean]
  
  inline def isNumber(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObject(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPassword(password: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPassword")(password.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPhoneNumber(phoneNumber: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPhoneNumber")(phoneNumber.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isString(value: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isTopic(topic: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTopic")(topic.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isURL(urlStr: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isURL")(urlStr.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUTCDateString(dateString: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUTCDateString")(dateString.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUid(uid: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUid")(uid.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
