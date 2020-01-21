package typings.firebaseFirestore.databaseMod

import typings.firebaseFirestore.fieldPathMod.FieldPath
import typings.firebaseFirestore.observerMod.PartialObserver
import typings.firebaseFirestore.observerMod.Unsubscribe
import typings.firebaseFirestoreTypes.mod.FirestoreDataConverter
import typings.firebaseFirestoreTypes.mod.OrderByDirection
import typings.firebaseFirestoreTypes.mod.SnapshotListenOptions
import typings.firebaseFirestoreTypes.mod.WhereFilterOp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/api/database", "Query")
@js.native
class Query[T] protected ()
  extends typings.firebaseFirestoreTypes.mod.Query[T] {
  def this(_query: typings.firebaseFirestore.queryMod.Query, firestore: Firestore) = this()
  def this(
    _query: typings.firebaseFirestore.queryMod.Query,
    firestore: Firestore,
    _converter: FirestoreDataConverter[T]
  ) = this()
  val _converter: js.UndefOr[FirestoreDataConverter[T]] = js.native
  var _query: typings.firebaseFirestore.queryMod.Query = js.native
  /** Helper function to create a bound from a document or fields */
  var boundFromDocOrFields: js.Any = js.native
  /**
    * Create a Bound from a query and a document.
    *
    * Note that the Bound will always include the key of the document
    * and so only the provided document will compare equal to the returned
    * position.
    *
    * Will throw if the document does not contain all fields of the order by
    * of the query or if any of the fields in the order by are an uncommitted
    * server timestamp.
    */
  var boundFromDocument: js.Any = js.native
  /**
    * Converts a list of field values to a Bound for the given query.
    */
  var boundFromFields: js.Any = js.native
  var getViaSnapshotListener: js.Any = js.native
  var onSnapshotInternal: js.Any = js.native
  /**
    * Parses the given documentIdValue into a ReferenceValue, throwing
    * appropriate errors if the value is anything other than a DocumentReference
    * or String, or if the string is malformed.
    */
  var parseDocumentIdValue: js.Any = js.native
  /**
    * Validates that the value passed into a disjunctrive filter satisfies all
    * array requirements.
    */
  var validateDisjunctiveFilterElements: js.Any = js.native
  var validateHasExplicitOrderByForLimitToLast: js.Any = js.native
  var validateNewFilter: js.Any = js.native
  var validateNewOrderBy: js.Any = js.native
  var validateOrderByAndInequalityMatch: js.Any = js.native
  def endAt(docOrField: js.Any, fields: js.Any*): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def endAt(docOrField: typings.firebaseFirestoreTypes.mod.DocumentSnapshot[_], fields: js.Any*): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def endBefore(docOrField: js.Any, fields: js.Any*): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def endBefore(docOrField: typings.firebaseFirestoreTypes.mod.DocumentSnapshot[_], fields: js.Any*): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def onSnapshot(observer: PartialObserver[typings.firebaseFirestoreTypes.mod.QuerySnapshot[T]]): Unsubscribe = js.native
  def onSnapshot(
    options: SnapshotListenOptions,
    observer: PartialObserver[typings.firebaseFirestoreTypes.mod.QuerySnapshot[T]]
  ): Unsubscribe = js.native
  def orderBy(field: FieldPath): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def orderBy(field: FieldPath, directionStr: OrderByDirection): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def startAfter(docOrField: js.Any, fields: js.Any*): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def startAfter(docOrField: typings.firebaseFirestoreTypes.mod.DocumentSnapshot[_], fields: js.Any*): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def startAt(docOrField: js.Any, fields: js.Any*): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def startAt(docOrField: typings.firebaseFirestoreTypes.mod.DocumentSnapshot[_], fields: js.Any*): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def where(field: FieldPath, opStr: WhereFilterOp, value: js.Any): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
}

