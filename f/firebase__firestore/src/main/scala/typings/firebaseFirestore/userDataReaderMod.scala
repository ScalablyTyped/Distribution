package typings.firebaseFirestore

import typings.firebaseFirestore.databaseInfoMod.DatabaseId
import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.modelFieldValueMod.ObjectValue
import typings.firebaseFirestore.mutationMod.FieldMask
import typings.firebaseFirestore.mutationMod.FieldTransform
import typings.firebaseFirestore.mutationMod.Mutation
import typings.firebaseFirestore.mutationMod.Precondition
import typings.firebaseFirestore.serializerMod.JsonProtoSerializer
import typings.firebaseFirestoreTypes.mod.FieldPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/api/user_data_reader", JSImport.Namespace)
@js.native
object userDataReaderMod extends js.Object {
  @js.native
  class DocumentKeyReference protected () extends js.Object {
    def this(databaseId: DatabaseId, key: DocumentKey) = this()
    var databaseId: DatabaseId = js.native
    var key: DocumentKey = js.native
  }
  
  @js.native
  class ParsedSetData protected () extends js.Object {
    def this(data: ObjectValue, fieldMask: Null, fieldTransforms: js.Array[FieldTransform]) = this()
    def this(data: ObjectValue, fieldMask: FieldMask, fieldTransforms: js.Array[FieldTransform]) = this()
    val data: ObjectValue = js.native
    val fieldMask: FieldMask | Null = js.native
    val fieldTransforms: js.Array[FieldTransform] = js.native
    def toMutations(key: DocumentKey, precondition: Precondition): js.Array[Mutation] = js.native
  }
  
  @js.native
  class ParsedUpdateData protected () extends js.Object {
    def this(data: ObjectValue, fieldMask: FieldMask, fieldTransforms: js.Array[FieldTransform]) = this()
    val data: ObjectValue = js.native
    val fieldMask: FieldMask = js.native
    val fieldTransforms: js.Array[FieldTransform] = js.native
    def toMutations(key: DocumentKey, precondition: Precondition): js.Array[Mutation] = js.native
  }
  
  @js.native
  class UserDataReader protected () extends js.Object {
    def this(serializer: JsonProtoSerializer, preConverter: DataPreConverter) = this()
    var parseArray: js.Any = js.native
    var parseArrayTransformElements: js.Any = js.native
    /**
      * Internal helper for parsing user data.
      *
      * @param input Data to be parsed.
      * @param context A context object representing the current path being parsed,
      * the source of the data being parsed, etc.
      * @return The parsed value, or null if the value was a FieldValue sentinel
      * that should not be included in the resulting parsed data.
      */
    var parseData: js.Any = js.native
    var parseObject: js.Any = js.native
    /**
      * Helper to parse a scalar value (i.e. not an Object, Array, or FieldValue)
      *
      * @return The parsed value
      */
    var parseScalarValue: js.Any = js.native
    /**
      * "Parses" the provided FieldValueImpl, adding any necessary transforms to
      * context.fieldTransforms.
      */
    var parseSentinelFieldValue: js.Any = js.native
    val preConverter: js.Any = js.native
    /** Sends data through this.preConverter, handling any thrown errors. */
    var runPreConverter: js.Any = js.native
    val serializer: js.Any = js.native
    /** Parse document data from a set() call with '{merge:true}'. */
    def parseMergeData(methodName: String, input: js.Any): ParsedSetData = js.native
    def parseMergeData(methodName: String, input: js.Any, fieldPaths: js.Array[String | FieldPath]): ParsedSetData = js.native
    /**
      * Parse a "query value" (e.g. value in a where filter or a value in a cursor
      * bound).
      *
      * @param allowArrays Whether the query value is an array that may directly
      * contain additional arrays (e.g. the operand of an `in` query).
      */
    def parseQueryValue(methodName: String, input: js.Any): js.Any = js.native
    def parseQueryValue(methodName: String, input: js.Any, allowArrays: Boolean): js.Any = js.native
    /** Parse document data from a non-merge set() call. */
    def parseSetData(methodName: String, input: js.Any): ParsedSetData = js.native
    /** Parse update data from an update() call. */
    def parseUpdateData(methodName: String, input: js.Any): ParsedUpdateData = js.native
    /** Parse update data from a list of field/value arguments. */
    def parseUpdateVarargs(methodName: String, field: String, value: js.Any, moreFieldsAndValues: js.Array[_]): ParsedUpdateData = js.native
    def parseUpdateVarargs(
      methodName: String,
      field: typings.firebaseFirestore.fieldPathMod.FieldPath,
      value: js.Any,
      moreFieldsAndValues: js.Array[_]
    ): ParsedUpdateData = js.native
  }
  
  def fieldPathFromArgument(methodName: String, path: String): typings.firebaseFirestore.pathMod.FieldPath = js.native
  def fieldPathFromArgument(methodName: String, path: typings.firebaseFirestore.fieldPathMod.FieldPath): typings.firebaseFirestore.pathMod.FieldPath = js.native
  type DataPreConverter = js.Function1[/* input */ js.Any, js.Any]
}

