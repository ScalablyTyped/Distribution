package typings.atFirebaseFirestore.distSrcApiDatabaseMod

import typings.atFirebaseFirestore.distSrcApiFieldUnderscorePathMod.FieldPath
import typings.atFirebaseFirestore.distSrcApiObserverMod.PartialObserver
import typings.atFirebaseFirestore.distSrcApiObserverMod.Unsubscribe
import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.OrderByDirection
import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.SnapshotListenOptions
import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.WhereFilterOp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/api/database", "Query")
@js.native
class Query protected ()
  extends typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.Query {
  def this(_query: typings.atFirebaseFirestore.distSrcCoreQueryMod.Query, firestore: Firestore) = this()
  var _query: typings.atFirebaseFirestore.distSrcCoreQueryMod.Query = js.native
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
  def endAt(docOrField: js.Any, fields: js.Any*): typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.Query = js.native
  def endAt(
    docOrField: typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.DocumentSnapshot,
    fields: js.Any*
  ): typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.Query = js.native
  def endBefore(docOrField: js.Any, fields: js.Any*): typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.Query = js.native
  def endBefore(
    docOrField: typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.DocumentSnapshot,
    fields: js.Any*
  ): typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.Query = js.native
  def onSnapshot(
    observer: PartialObserver[
      typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.QuerySnapshot
    ]
  ): Unsubscribe = js.native
  def onSnapshot(
    options: SnapshotListenOptions,
    observer: PartialObserver[
      typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.QuerySnapshot
    ]
  ): Unsubscribe = js.native
  def orderBy(field: FieldPath): typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.Query = js.native
  def orderBy(field: FieldPath, directionStr: OrderByDirection): typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.Query = js.native
  def startAfter(docOrField: js.Any, fields: js.Any*): typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.Query = js.native
  def startAfter(
    docOrField: typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.DocumentSnapshot,
    fields: js.Any*
  ): typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.Query = js.native
  def startAt(docOrField: js.Any, fields: js.Any*): typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.Query = js.native
  def startAt(
    docOrField: typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.DocumentSnapshot,
    fields: js.Any*
  ): typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.Query = js.native
  def where(field: FieldPath, opStr: WhereFilterOp, value: js.Any): typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.Query = js.native
}

