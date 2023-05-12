package typings.fastCase

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fast-case", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def camelize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def camelizeKeys(obj: ObjectOrArray): js.Array[Any] | (Record[String, Any]) = ^.asInstanceOf[js.Dynamic].applyDynamic("camelizeKeys")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any] | (Record[String, Any])]
  
  inline def camelizeKeysInPlace(obj: ObjectOrArray): (Record[String, Any]) | js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("camelizeKeysInPlace")(obj.asInstanceOf[js.Any]).asInstanceOf[(Record[String, Any]) | js.Array[Any]]
  
  inline def decamelize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decamelize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def decamelize(str: String, sep: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decamelize")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def decamelizeKeys(obj: ObjectOrArray): js.Array[Any] | (Record[String, Any]) = ^.asInstanceOf[js.Dynamic].applyDynamic("decamelizeKeys")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any] | (Record[String, Any])]
  inline def decamelizeKeys(obj: ObjectOrArray, sep: String): js.Array[Any] | (Record[String, Any]) = (^.asInstanceOf[js.Dynamic].applyDynamic("decamelizeKeys")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any] | (Record[String, Any])]
  
  inline def decamelizeKeysInPlace(obj: ObjectOrArray): (Record[String, Any]) | js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("decamelizeKeysInPlace")(obj.asInstanceOf[js.Any]).asInstanceOf[(Record[String, Any]) | js.Array[Any]]
  inline def decamelizeKeysInPlace(obj: ObjectOrArray, sep: String): (Record[String, Any]) | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("decamelizeKeysInPlace")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[(Record[String, Any]) | js.Array[Any]]
  
  inline def depascalize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("depascalize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def depascalize(str: String, sep: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("depascalize")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def depascalizeKeys(obj: ObjectOrArray): js.Array[Any] | (Record[String, Any]) = ^.asInstanceOf[js.Dynamic].applyDynamic("depascalizeKeys")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any] | (Record[String, Any])]
  inline def depascalizeKeys(obj: ObjectOrArray, sep: String): js.Array[Any] | (Record[String, Any]) = (^.asInstanceOf[js.Dynamic].applyDynamic("depascalizeKeys")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any] | (Record[String, Any])]
  
  inline def depascalizeKeysInPlace(obj: ObjectOrArray): (Record[String, Any]) | js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("depascalizeKeysInPlace")(obj.asInstanceOf[js.Any]).asInstanceOf[(Record[String, Any]) | js.Array[Any]]
  inline def depascalizeKeysInPlace(obj: ObjectOrArray, sep: String): (Record[String, Any]) | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("depascalizeKeysInPlace")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[(Record[String, Any]) | js.Array[Any]]
  
  inline def pascalize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pascalize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def pascalizeKeys(obj: ObjectOrArray): js.Array[Any] | (Record[String, Any]) = ^.asInstanceOf[js.Dynamic].applyDynamic("pascalizeKeys")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any] | (Record[String, Any])]
  
  inline def pascalizeKeysInPlace(obj: ObjectOrArray): (Record[String, Any]) | js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pascalizeKeysInPlace")(obj.asInstanceOf[js.Any]).asInstanceOf[(Record[String, Any]) | js.Array[Any]]
  
  type ObjectOrArray = (Record[String, Any]) | js.Array[Any]
}
