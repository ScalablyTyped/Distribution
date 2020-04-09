package typings.firebaseFirestore

import typings.firebaseFirestore.byteStringMod.ByteString
import typings.firebaseFirestore.databaseInfoMod.DatabaseId
import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.modelFieldValueMod.TypeOrder
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/model/values", JSImport.Namespace)
@js.native
object valuesMod extends js.Object {
  def arrayValueContains(
    haystack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.ArrayValue */ js.Any,
    needle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any
  ): Boolean = js.native
  def canonicalId(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any
  ): String = js.native
  def estimateByteSize(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any
  ): Double = js.native
  def isArray(): /* is @firebase/firestore.AnonArrayValue */ Boolean = js.native
  def isArray(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any
  ): /* is @firebase/firestore.AnonArrayValue */ Boolean = js.native
  def isDouble(): /* is @firebase/firestore.AnonDoubleValue */ Boolean = js.native
  def isDouble(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any
  ): /* is @firebase/firestore.AnonDoubleValue */ Boolean = js.native
  def isInteger(): /* is @firebase/firestore.AnonIntegerValue */ Boolean = js.native
  def isInteger(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any
  ): /* is @firebase/firestore.AnonIntegerValue */ Boolean = js.native
  def isMapValue(): /* is @firebase/firestore.AnonMapValue */ Boolean = js.native
  def isMapValue(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any
  ): /* is @firebase/firestore.AnonMapValue */ Boolean = js.native
  def isNanValue(): /* is @firebase/firestore.Anon2 */ Boolean = js.native
  def isNanValue(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any
  ): /* is @firebase/firestore.Anon2 */ Boolean = js.native
  def isNullValue(): /* is @firebase/firestore.AnonNullValue */ Boolean = js.native
  def isNullValue(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any
  ): /* is @firebase/firestore.AnonNullValue */ Boolean = js.native
  def isNumber(): Boolean = js.native
  def isNumber(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any
  ): Boolean = js.native
  def isReferenceValue(): /* is @firebase/firestore.AnonReferenceValue */ Boolean = js.native
  def isReferenceValue(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any
  ): /* is @firebase/firestore.AnonReferenceValue */ Boolean = js.native
  def normalizeByteString(blob: String): ByteString = js.native
  def normalizeByteString(blob: Uint8Array): ByteString = js.native
  def normalizeNumber(): Double = js.native
  def normalizeNumber(value: String): Double = js.native
  def normalizeNumber(value: Double): Double = js.native
  def normalizeTimestamp(
    date: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Timestamp */ js.Any
  ): AnonNanos = js.native
  def numberEquals(
    left: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any,
    right: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any
  ): Boolean = js.native
  def refValue(databaseId: DatabaseId, key: DocumentKey): js.Any = js.native
  def typeOrder(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any
  ): TypeOrder = js.native
  def valueCompare(
    left: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any,
    right: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any
  ): Double = js.native
  def valueEquals(
    left: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any,
    right: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any
  ): Boolean = js.native
}

