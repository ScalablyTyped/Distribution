package typings.firebaseFirestore.userDataReaderMod

import typings.firebaseFirestore.apiFieldPathMod.BaseFieldPath
import typings.firebaseFirestore.databaseInfoMod.DatabaseId
import typings.firebaseFirestore.remoteSerializerMod.JsonProtoSerializer
import typings.firebaseFirestoreTypes.mod.SetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/api/user_data_reader", "UserDataReader")
@js.native
class UserDataReader protected () extends js.Object {
  def this(databaseId: DatabaseId, ignoreUndefinedProperties: Boolean) = this()
  def this(databaseId: DatabaseId, ignoreUndefinedProperties: Boolean, serializer: JsonProtoSerializer) = this()
  /** Creates a new top-level parse context. */
  var createContext: js.Any = js.native
  val databaseId: js.Any = js.native
  val ignoreUndefinedProperties: js.Any = js.native
  val serializer: js.Any = js.native
  /**
    * Parse a "query value" (e.g. value in a where filter or a value in a cursor
    * bound).
    *
    * @param allowArrays Whether the query value is an array that may directly
    * contain additional arrays (e.g. the operand of an `in` query).
    */
  def parseQueryValue(methodName: String, input: js.Any): js.Any = js.native
  def parseQueryValue(methodName: String, input: js.Any, allowArrays: Boolean): js.Any = js.native
  /** Parse document data from a set() call. */
  def parseSetData(methodName: String, input: js.Any): ParsedSetData = js.native
  def parseSetData(methodName: String, input: js.Any, options: SetOptions): ParsedSetData = js.native
  /** Parse update data from an update() call. */
  def parseUpdateData(methodName: String, input: js.Any): ParsedUpdateData = js.native
  /** Parse update data from a list of field/value arguments. */
  def parseUpdateVarargs(methodName: String, field: String, value: js.Any, moreFieldsAndValues: js.Array[_]): ParsedUpdateData = js.native
  def parseUpdateVarargs(methodName: String, field: BaseFieldPath, value: js.Any, moreFieldsAndValues: js.Array[_]): ParsedUpdateData = js.native
}

