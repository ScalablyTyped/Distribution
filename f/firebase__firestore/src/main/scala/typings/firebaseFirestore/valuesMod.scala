package typings.firebaseFirestore

import typings.firebaseFirestore.anon.Inclusive
import typings.firebaseFirestore.databaseInfoMod.DatabaseId
import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.firestoreProtoApiMod.ArrayValue
import typings.firebaseFirestore.firestoreProtoApiMod.Value
import typings.firebaseFirestore.typeOrderMod.TypeOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valuesMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/model/values", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/firestore/src/model/values", "MAX_VALUE")
  @js.native
  val MAX_VALUE: Value = js.native
  
  @JSImport("@firebase/firestore/dist/firestore/src/model/values", "MIN_VALUE")
  @js.native
  val MIN_VALUE: Value = js.native
  
  inline def arrayValueContains(haystack: ArrayValue, needle: Value): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayValueContains")(haystack.asInstanceOf[js.Any], needle.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def canonicalId(value: Value): String = ^.asInstanceOf[js.Dynamic].applyDynamic("canonicalId")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def deepClone(source: Value): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("deepClone")(source.asInstanceOf[js.Any]).asInstanceOf[Value]
  
  inline def estimateByteSize(value: Value): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("estimateByteSize")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isArray(): /* is @firebase/firestore.anon.ArrayValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")().asInstanceOf[/* is @firebase/firestore.anon.ArrayValue */ Boolean]
  inline def isArray(value: Value): /* is @firebase/firestore.anon.ArrayValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @firebase/firestore.anon.ArrayValue */ Boolean]
  
  inline def isDouble(): /* is @firebase/firestore.anon.DoubleValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDouble")().asInstanceOf[/* is @firebase/firestore.anon.DoubleValue */ Boolean]
  inline def isDouble(value: Value): /* is @firebase/firestore.anon.DoubleValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDouble")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @firebase/firestore.anon.DoubleValue */ Boolean]
  
  inline def isInteger(): /* is @firebase/firestore.anon.IntegerValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteger")().asInstanceOf[/* is @firebase/firestore.anon.IntegerValue */ Boolean]
  inline def isInteger(value: Value): /* is @firebase/firestore.anon.IntegerValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteger")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @firebase/firestore.anon.IntegerValue */ Boolean]
  
  inline def isMapValue(): /* is @firebase/firestore.anon.MapValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMapValue")().asInstanceOf[/* is @firebase/firestore.anon.MapValue */ Boolean]
  inline def isMapValue(value: Value): /* is @firebase/firestore.anon.MapValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMapValue")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @firebase/firestore.anon.MapValue */ Boolean]
  
  inline def isMaxValue(value: Value): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMaxValue")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNanValue(): /* is @firebase/firestore.anon.2 */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNanValue")().asInstanceOf[/* is @firebase/firestore.anon.2 */ Boolean]
  inline def isNanValue(value: Value): /* is @firebase/firestore.anon.2 */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNanValue")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @firebase/firestore.anon.2 */ Boolean]
  
  inline def isNullValue(): /* is @firebase/firestore.anon.NullValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullValue")().asInstanceOf[/* is @firebase/firestore.anon.NullValue */ Boolean]
  inline def isNullValue(value: Value): /* is @firebase/firestore.anon.NullValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullValue")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @firebase/firestore.anon.NullValue */ Boolean]
  
  inline def isNumber(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")().asInstanceOf[Boolean]
  inline def isNumber(value: Value): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isReferenceValue(): /* is @firebase/firestore.anon.ReferenceValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReferenceValue")().asInstanceOf[/* is @firebase/firestore.anon.ReferenceValue */ Boolean]
  inline def isReferenceValue(value: Value): /* is @firebase/firestore.anon.ReferenceValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReferenceValue")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @firebase/firestore.anon.ReferenceValue */ Boolean]
  
  inline def lowerBoundCompare(left: Inclusive, right: Inclusive): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lowerBoundCompare")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def numberEquals(left: Value, right: Value): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("numberEquals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def refValue(databaseId: DatabaseId, key: DocumentKey): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("refValue")(databaseId.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def typeOrder(value: Value): TypeOrder = ^.asInstanceOf[js.Dynamic].applyDynamic("typeOrder")(value.asInstanceOf[js.Any]).asInstanceOf[TypeOrder]
  
  inline def upperBoundCompare(left: Inclusive, right: Inclusive): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("upperBoundCompare")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def valueCompare(left: Value, right: Value): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("valueCompare")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def valueEquals(left: Value, right: Value): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("valueEquals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def valuesGetLowerBound(value: Value): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("valuesGetLowerBound")(value.asInstanceOf[js.Any]).asInstanceOf[Value]
  
  inline def valuesGetUpperBound(value: Value): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("valuesGetUpperBound")(value.asInstanceOf[js.Any]).asInstanceOf[Value]
}
