package typings.firebaseFirestore.apiDatabaseMod

import typings.firebaseFirestore.databaseInfoMod.DatabaseId
import typings.firebaseFirestore.documentMod.Document
import typings.firebaseFirestore.pathMod.FieldPath
import typings.firebaseFirestore.queryMod.Bound
import typings.firebaseFirestore.queryMod.Direction
import typings.firebaseFirestore.queryMod.FieldFilter
import typings.firebaseFirestore.queryMod.Operator
import typings.firebaseFirestore.queryMod.OrderBy
import typings.firebaseFirestore.userDataReaderMod.UserDataReader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/api/database", "BaseQuery")
@js.native
class BaseQuery protected () extends js.Object {
  def this(
    _databaseId: DatabaseId,
    _dataReader: UserDataReader,
    _query: typings.firebaseFirestore.queryMod.Query
  ) = this()
  var _dataReader: UserDataReader = js.native
  var _databaseId: DatabaseId = js.native
  var _query: typings.firebaseFirestore.queryMod.Query = js.native
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
  var validateNewFilter: js.Any = js.native
  var validateNewOrderBy: js.Any = js.native
  var validateOrderByAndInequalityMatch: js.Any = js.native
  /* protected */ def boundFromDocument(methodName: String, doc: Null, before: Boolean): Bound = js.native
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
  /* protected */ def boundFromDocument(methodName: String, doc: Document, before: Boolean): Bound = js.native
  /**
    * Converts a list of field values to a Bound for the given query.
    */
  /* protected */ def boundFromFields(methodName: String, values: js.Array[_], before: Boolean): Bound = js.native
  /* protected */ def createFilter(fieldPath: FieldPath, op: Operator, value: js.Any): FieldFilter = js.native
  /* protected */ def createOrderBy(fieldPath: FieldPath, direction: Direction): OrderBy = js.native
  /* protected */ def validateHasExplicitOrderByForLimitToLast(query: typings.firebaseFirestore.queryMod.Query): Unit = js.native
}

