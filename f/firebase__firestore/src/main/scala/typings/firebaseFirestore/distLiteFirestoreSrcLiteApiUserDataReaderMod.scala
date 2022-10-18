package typings.firebaseFirestore

import typings.firebaseFirestore.anon.PartialContextSettingsArrayElement
import typings.firebaseFirestore.distLiteFirestoreSrcApiParseContextMod.ParseContext
import typings.firebaseFirestore.distLiteFirestoreSrcCoreDatabaseInfoMod.DatabaseId
import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore
import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiFieldValueMod.FieldValue
import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.PartialWithFieldValue
import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.WithFieldValue
import typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.distLiteFirestoreSrcModelFieldMaskMod.FieldMask
import typings.firebaseFirestore.distLiteFirestoreSrcModelMutationMod.FieldTransform
import typings.firebaseFirestore.distLiteFirestoreSrcModelMutationMod.Mutation
import typings.firebaseFirestore.distLiteFirestoreSrcModelMutationMod.Precondition
import typings.firebaseFirestore.distLiteFirestoreSrcModelObjectValueMod.ObjectValue
import typings.firebaseFirestore.distLiteFirestoreSrcModelPathMod.FieldPath
import typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.Value
import typings.firebaseFirestore.distLiteFirestoreSrcRemoteSerializerMod.JsonProtoSerializer
import typings.firebaseFirestore.distLiteFirestoreSrcUtilErrorMod.FirestoreError
import typings.firebaseFirestore.firebaseFirestoreInts.`0`
import typings.firebaseFirestore.firebaseFirestoreInts.`1`
import typings.firebaseFirestore.firebaseFirestoreInts.`2`
import typings.firebaseFirestore.firebaseFirestoreInts.`3`
import typings.firebaseFirestore.firebaseFirestoreInts.`4`
import typings.firebaseFirestoreTypes.mod.DocumentData
import typings.firebaseFirestoreTypes.mod.SetOptions
import typings.firebaseUtil.mod.Compat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcLiteApiUserDataReaderMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/lite-api/user_data_reader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/lite-api/user_data_reader", "ArrayRemoveFieldValueImpl")
  @js.native
  open class ArrayRemoveFieldValueImpl protected () extends FieldValue {
    def this(methodName: String, _elements: js.Array[Any]) = this()
    
    val _elements: js.Array[Any] = js.native
    
    def _toFieldTransform(context: ParseContextImpl): FieldTransform = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/lite-api/user_data_reader", "ArrayUnionFieldValueImpl")
  @js.native
  open class ArrayUnionFieldValueImpl protected () extends FieldValue {
    def this(methodName: String, _elements: js.Array[Any]) = this()
    
    /* private */ val _elements: Any = js.native
    
    def _toFieldTransform(context: ParseContextImpl): FieldTransform = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/lite-api/user_data_reader", "DeleteFieldValueImpl")
  @js.native
  open class DeleteFieldValueImpl protected () extends FieldValue {
    /**
      * @param _methodName - The public API endpoint that returns this class.
      * @hideconstructor
      */
    def this(_methodName: String) = this()
    
    def _toFieldTransform(context: ParseContextImpl): Null = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/lite-api/user_data_reader", "NumericIncrementFieldValueImpl")
  @js.native
  open class NumericIncrementFieldValueImpl protected () extends FieldValue {
    def this(methodName: String, _operand: Double) = this()
    
    /* private */ val _operand: Any = js.native
    
    def _toFieldTransform(context: ParseContextImpl): FieldTransform = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/lite-api/user_data_reader", "ParsedSetData")
  @js.native
  open class ParsedSetData protected () extends StObject {
    def this(data: ObjectValue, fieldMask: Null, fieldTransforms: js.Array[FieldTransform]) = this()
    def this(data: ObjectValue, fieldMask: FieldMask, fieldTransforms: js.Array[FieldTransform]) = this()
    
    val data: ObjectValue = js.native
    
    val fieldMask: FieldMask | Null = js.native
    
    val fieldTransforms: js.Array[FieldTransform] = js.native
    
    def toMutation(key: DocumentKey, precondition: Precondition): Mutation = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/lite-api/user_data_reader", "ParsedUpdateData")
  @js.native
  open class ParsedUpdateData protected () extends StObject {
    def this(data: ObjectValue, fieldMask: FieldMask, fieldTransforms: js.Array[FieldTransform]) = this()
    
    val data: ObjectValue = js.native
    
    val fieldMask: FieldMask = js.native
    
    val fieldTransforms: js.Array[FieldTransform] = js.native
    
    def toMutation(key: DocumentKey, precondition: Precondition): Mutation = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/lite-api/user_data_reader", "ServerTimestampFieldValueImpl")
  @js.native
  open class ServerTimestampFieldValueImpl protected () extends FieldValue {
    /**
      * @param _methodName - The public API endpoint that returns this class.
      * @hideconstructor
      */
    def this(_methodName: String) = this()
    
    def _toFieldTransform(context: ParseContextImpl): FieldTransform = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/lite-api/user_data_reader", "UserDataReader")
  @js.native
  open class UserDataReader protected () extends StObject {
    def this(databaseId: DatabaseId, ignoreUndefinedProperties: Boolean) = this()
    def this(databaseId: DatabaseId, ignoreUndefinedProperties: Boolean, serializer: JsonProtoSerializer) = this()
    
    /** Creates a new top-level parse context. */
    def createContext(dataSource: UserDataSource, methodName: String): ParseContextImpl = js.native
    def createContext(dataSource: UserDataSource, methodName: String, targetDoc: Unit, hasConverter: Boolean): ParseContextImpl = js.native
    def createContext(dataSource: UserDataSource, methodName: String, targetDoc: DocumentKey): ParseContextImpl = js.native
    def createContext(dataSource: UserDataSource, methodName: String, targetDoc: DocumentKey, hasConverter: Boolean): ParseContextImpl = js.native
    
    /* private */ val databaseId: Any = js.native
    
    /* private */ val ignoreUndefinedProperties: Any = js.native
    
    /* private */ val serializer: Any = js.native
  }
  
  inline def fieldPathFromArgument(methodName: String, path: String): FieldPath = (^.asInstanceOf[js.Dynamic].applyDynamic("fieldPathFromArgument")(methodName.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[FieldPath]
  inline def fieldPathFromArgument(methodName: String, path: String, targetDoc: DocumentKey): FieldPath = (^.asInstanceOf[js.Dynamic].applyDynamic("fieldPathFromArgument")(methodName.asInstanceOf[js.Any], path.asInstanceOf[js.Any], targetDoc.asInstanceOf[js.Any])).asInstanceOf[FieldPath]
  inline def fieldPathFromArgument(methodName: String, path: typings.firebaseFirestoreTypes.mod.FieldPath): FieldPath = (^.asInstanceOf[js.Dynamic].applyDynamic("fieldPathFromArgument")(methodName.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[FieldPath]
  inline def fieldPathFromArgument(methodName: String, path: typings.firebaseFirestoreTypes.mod.FieldPath, targetDoc: DocumentKey): FieldPath = (^.asInstanceOf[js.Dynamic].applyDynamic("fieldPathFromArgument")(methodName.asInstanceOf[js.Any], path.asInstanceOf[js.Any], targetDoc.asInstanceOf[js.Any])).asInstanceOf[FieldPath]
  inline def fieldPathFromArgument(methodName: String, path: Compat[typings.firebaseFirestoreTypes.mod.FieldPath]): FieldPath = (^.asInstanceOf[js.Dynamic].applyDynamic("fieldPathFromArgument")(methodName.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[FieldPath]
  inline def fieldPathFromArgument(
    methodName: String,
    path: Compat[typings.firebaseFirestoreTypes.mod.FieldPath],
    targetDoc: DocumentKey
  ): FieldPath = (^.asInstanceOf[js.Dynamic].applyDynamic("fieldPathFromArgument")(methodName.asInstanceOf[js.Any], path.asInstanceOf[js.Any], targetDoc.asInstanceOf[js.Any])).asInstanceOf[FieldPath]
  
  inline def fieldPathFromDotSeparatedString(methodName: String, path: String): FieldPath = (^.asInstanceOf[js.Dynamic].applyDynamic("fieldPathFromDotSeparatedString")(methodName.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[FieldPath]
  inline def fieldPathFromDotSeparatedString(methodName: String, path: String, targetDoc: DocumentKey): FieldPath = (^.asInstanceOf[js.Dynamic].applyDynamic("fieldPathFromDotSeparatedString")(methodName.asInstanceOf[js.Any], path.asInstanceOf[js.Any], targetDoc.asInstanceOf[js.Any])).asInstanceOf[FieldPath]
  
  inline def newUserDataReader(firestore: Firestore): UserDataReader = ^.asInstanceOf[js.Dynamic].applyDynamic("newUserDataReader")(firestore.asInstanceOf[js.Any]).asInstanceOf[UserDataReader]
  
  inline def parseData(input: Any, context: ParseContextImpl): Value | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseData")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Value | Null]
  
  inline def parseQueryValue(userDataReader: UserDataReader, methodName: String, input: Any): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("parseQueryValue")(userDataReader.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def parseQueryValue(userDataReader: UserDataReader, methodName: String, input: Any, allowArrays: Boolean): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("parseQueryValue")(userDataReader.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], input.asInstanceOf[js.Any], allowArrays.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def parseSetData(
    userDataReader: UserDataReader,
    methodName: String,
    targetDoc: DocumentKey,
    input: Any,
    hasConverter: Boolean
  ): ParsedSetData = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSetData")(userDataReader.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], targetDoc.asInstanceOf[js.Any], input.asInstanceOf[js.Any], hasConverter.asInstanceOf[js.Any])).asInstanceOf[ParsedSetData]
  inline def parseSetData(
    userDataReader: UserDataReader,
    methodName: String,
    targetDoc: DocumentKey,
    input: Any,
    hasConverter: Boolean,
    options: SetOptions
  ): ParsedSetData = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSetData")(userDataReader.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], targetDoc.asInstanceOf[js.Any], input.asInstanceOf[js.Any], hasConverter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedSetData]
  
  inline def parseUpdateData(userDataReader: UserDataReader, methodName: String, targetDoc: DocumentKey, input: Any): ParsedUpdateData = (^.asInstanceOf[js.Dynamic].applyDynamic("parseUpdateData")(userDataReader.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], targetDoc.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[ParsedUpdateData]
  
  inline def parseUpdateVarargs(
    userDataReader: UserDataReader,
    methodName: String,
    targetDoc: DocumentKey,
    field: String,
    value: Any,
    moreFieldsAndValues: js.Array[Any]
  ): ParsedUpdateData = (^.asInstanceOf[js.Dynamic].applyDynamic("parseUpdateVarargs")(userDataReader.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], targetDoc.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any], moreFieldsAndValues.asInstanceOf[js.Any])).asInstanceOf[ParsedUpdateData]
  inline def parseUpdateVarargs(
    userDataReader: UserDataReader,
    methodName: String,
    targetDoc: DocumentKey,
    field: typings.firebaseFirestoreTypes.mod.FieldPath,
    value: Any,
    moreFieldsAndValues: js.Array[Any]
  ): ParsedUpdateData = (^.asInstanceOf[js.Dynamic].applyDynamic("parseUpdateVarargs")(userDataReader.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], targetDoc.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any], moreFieldsAndValues.asInstanceOf[js.Any])).asInstanceOf[ParsedUpdateData]
  inline def parseUpdateVarargs(
    userDataReader: UserDataReader,
    methodName: String,
    targetDoc: DocumentKey,
    field: Compat[typings.firebaseFirestoreTypes.mod.FieldPath],
    value: Any,
    moreFieldsAndValues: js.Array[Any]
  ): ParsedUpdateData = (^.asInstanceOf[js.Dynamic].applyDynamic("parseUpdateVarargs")(userDataReader.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], targetDoc.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any], moreFieldsAndValues.asInstanceOf[js.Any])).asInstanceOf[ParsedUpdateData]
  
  /** Contains the settings that are mutated as we parse user data. */
  trait ContextSettings extends StObject {
    
    /**
      * Whether or not this context corresponds to an element of an array.
      * If not set, elements are treated as if they were outside of arrays.
      */
    val arrayElement: js.UndefOr[Boolean] = js.undefined
    
    /** Indicates what kind of API method this data came from. */
    val dataSource: UserDataSource
    
    /**
      * Whether or not a converter was specified in this context. If true, error
      * messages will reference the converter when invalid data is provided.
      */
    val hasConverter: js.UndefOr[Boolean] = js.undefined
    
    /** The name of the method the user called to create the ParseContext. */
    val methodName: String
    
    /**
      * A path within the object being parsed. This could be an empty path (in
      * which case the context represents the root of the data being parsed), or a
      * nonempty path (indicating the context represents a nested location within
      * the data).
      */
    val path: js.UndefOr[FieldPath] = js.undefined
    
    /** The document the user is attempting to modify, if that applies. */
    val targetDoc: js.UndefOr[DocumentKey] = js.undefined
  }
  object ContextSettings {
    
    inline def apply(dataSource: UserDataSource, methodName: String): ContextSettings = {
      val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextSettings]
    }
    
    extension [Self <: ContextSettings](x: Self) {
      
      inline def setArrayElement(value: Boolean): Self = StObject.set(x, "arrayElement", value.asInstanceOf[js.Any])
      
      inline def setArrayElementUndefined: Self = StObject.set(x, "arrayElement", js.undefined)
      
      inline def setDataSource(value: UserDataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setHasConverter(value: Boolean): Self = StObject.set(x, "hasConverter", value.asInstanceOf[js.Any])
      
      inline def setHasConverterUndefined: Self = StObject.set(x, "hasConverter", js.undefined)
      
      inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
      
      inline def setPath(value: FieldPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setTargetDoc(value: DocumentKey): Self = StObject.set(x, "targetDoc", value.asInstanceOf[js.Any])
      
      inline def setTargetDocUndefined: Self = StObject.set(x, "targetDoc", js.undefined)
    }
  }
  
  /** A "context" object passed around while parsing user data. */
  @js.native
  trait ParseContextImpl
    extends StObject
       with ParseContext {
    
    def childContextForArray(index: Double): ParseContextImpl = js.native
    
    def childContextForField(field: String): ParseContextImpl = js.native
    
    def childContextForFieldPath(field: FieldPath): ParseContextImpl = js.native
    
    /** Returns 'true' if 'fieldPath' was traversed when creating this context. */
    def contains(fieldPath: FieldPath): Boolean = js.native
    
    /** Returns a new context with the specified settings overwritten. */
    def contextWith(configuration: PartialContextSettingsArrayElement): ParseContextImpl = js.native
    
    def createError(reason: String): FirestoreError = js.native
    
    def dataSource: UserDataSource = js.native
    
    val fieldMask: js.Array[FieldPath] = js.native
    
    val fieldTransforms: js.Array[FieldTransform] = js.native
    
    def path: js.UndefOr[FieldPath] = js.native
    
    val serializer: JsonProtoSerializer = js.native
    
    val settings: ContextSettings = js.native
    
    /* private */ var validatePath: Any = js.native
    
    /* private */ var validatePathSegment: Any = js.native
  }
  
  @js.native
  trait UntypedFirestoreDataConverter[T] extends StObject {
    
    def fromFirestore(snapshot: Any): T = js.native
    def fromFirestore(snapshot: Any, options: Any): T = js.native
    
    def toFirestore(modelObject: PartialWithFieldValue[T], options: SetOptions): DocumentData = js.native
    def toFirestore(modelObject: WithFieldValue[T]): DocumentData = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreInts.`0`
    - typings.firebaseFirestore.firebaseFirestoreInts.`1`
    - typings.firebaseFirestore.firebaseFirestoreInts.`2`
    - typings.firebaseFirestore.firebaseFirestoreInts.`3`
    - typings.firebaseFirestore.firebaseFirestoreInts.`4`
  */
  trait UserDataSource extends StObject
  object UserDataSource {
    
    /**
      * Indicates the source is a where clause, cursor bound, arrayUnion()
      * element, etc. Of note, isWrite(source) will return false.
      */
    inline def Argument: `3` = 3.asInstanceOf[`3`]
    
    /**
      * Indicates that the source is an Argument that may directly contain nested
      * arrays (e.g. the operand of an `in` query).
      */
    inline def ArrayArgument: `4` = 4.asInstanceOf[`4`]
    
    inline def MergeSet: `2` = 2.asInstanceOf[`2`]
    
    inline def Set: `0` = 0.asInstanceOf[`0`]
    
    inline def Update: `1` = 1.asInstanceOf[`1`]
  }
}
