package typings.firebaseFirestore

import typings.firebaseFirestore.coreDatabaseInfoMod.DatabaseId
import typings.firebaseFirestore.firestoreProtoApiMod.ArrayValue
import typings.firebaseFirestore.firestoreProtoApiMod.Timestamp
import typings.firebaseFirestore.firestoreProtoApiMod.Value
import typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.srcModelFieldValueMod.TypeOrder
import typings.firebaseFirestore.utilByteStringMod.ByteString
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/model/values", JSImport.Namespace)
@js.native
object modelValuesMod extends js.Object {
  def arrayValueContains(haystack: ArrayValue, needle: Value): Boolean = js.native
  def canonicalId(value: Value): String = js.native
  def estimateByteSize(value: Value): Double = js.native
  def isArray(): /* is @firebase/firestore.AnonArrayValueArrayValue */ Boolean = js.native
  def isArray(value: Value): /* is @firebase/firestore.AnonArrayValueArrayValue */ Boolean = js.native
  def isDouble(): /* is @firebase/firestore.AnonDoubleValue */ Boolean = js.native
  def isDouble(value: Value): /* is @firebase/firestore.AnonDoubleValue */ Boolean = js.native
  def isInteger(): /* is @firebase/firestore.AnonIntegerValue */ Boolean = js.native
  def isInteger(value: Value): /* is @firebase/firestore.AnonIntegerValue */ Boolean = js.native
  def isMapValue(): /* is @firebase/firestore.AnonMapValueMapValue */ Boolean = js.native
  def isMapValue(value: Value): /* is @firebase/firestore.AnonMapValueMapValue */ Boolean = js.native
  def isNanValue(): /* is @firebase/firestore.Anon2 */ Boolean = js.native
  def isNanValue(value: Value): /* is @firebase/firestore.Anon2 */ Boolean = js.native
  def isNullValue(): /* is @firebase/firestore.AnonNullValue */ Boolean = js.native
  def isNullValue(value: Value): /* is @firebase/firestore.AnonNullValue */ Boolean = js.native
  def isNumber(): Boolean = js.native
  def isNumber(value: Value): Boolean = js.native
  def isReferenceValue(): /* is @firebase/firestore.AnonReferenceValue */ Boolean = js.native
  def isReferenceValue(value: Value): /* is @firebase/firestore.AnonReferenceValue */ Boolean = js.native
  def normalizeByteString(blob: String): ByteString = js.native
  def normalizeByteString(blob: Uint8Array): ByteString = js.native
  def normalizeNumber(): Double = js.native
  def normalizeNumber(value: String): Double = js.native
  def normalizeNumber(value: Double): Double = js.native
  def normalizeTimestamp(date: Timestamp): AnonNanos = js.native
  def numberEquals(left: Value, right: Value): Boolean = js.native
  def refValue(databaseId: DatabaseId, key: DocumentKey): Value = js.native
  def typeOrder(value: Value): TypeOrder = js.native
  def valueCompare(left: Value, right: Value): Double = js.native
  def valueEquals(left: Value, right: Value): Boolean = js.native
}

