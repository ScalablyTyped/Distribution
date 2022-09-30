package typings.googleCloudFirestore

import typings.googleCloudFirestore.FirebaseFirestore.DocumentChangeType
import typings.googleCloudFirestore.FirebaseFirestore.OrderByDirection
import typings.googleCloudFirestore.FirebaseFirestore.WhereFilterOp
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.api.FieldBehavior
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.api.ResourceDescriptor.History
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.api.ResourceDescriptor.Style
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.Database.ConcurrencyMode
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.Database.DatabaseType
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.FieldOperationMetadata.IndexConfigDelta.ChangeType
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.Index.IndexField.ArrayConfig
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.Index.IndexField.Order
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.Index.QueryScope
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.Index.State
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.OperationState
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.protobuf.FieldDescriptorProto.Label
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.protobuf.FieldOptions.CType
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.protobuf.FieldOptions.JSType
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.protobuf.FileOptions.OptimizeMode
import typings.googleCloudFirestore.firestoreV1ProtoApiMod.firestore.BundledQuery.LimitType
import typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.DocumentTransform.FieldTransform.ServerValue
import typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.StructuredQuery.CompositeFilter.Operator
import typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.StructuredQuery.Direction
import typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.TargetChange.TargetChangeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googleCloudFirestoreStrings {
  
  @js.native
  sealed trait ADD
    extends StObject
       with ChangeType
       with TargetChangeType
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.TargetChange.TargetChangeType
  inline def ADD: ADD = "ADD".asInstanceOf[ADD]
  
  @js.native
  sealed trait AND
    extends StObject
       with Operator
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.CompositeFilter.Operator
  inline def AND: AND = "AND".asInstanceOf[AND]
  
  @js.native
  sealed trait ARRAY_CONFIG_UNSPECIFIED
    extends StObject
       with ArrayConfig
  inline def ARRAY_CONFIG_UNSPECIFIED: ARRAY_CONFIG_UNSPECIFIED = "ARRAY_CONFIG_UNSPECIFIED".asInstanceOf[ARRAY_CONFIG_UNSPECIFIED]
  
  @js.native
  sealed trait ARRAY_CONTAINS
    extends StObject
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.StructuredQuery.FieldFilter.Operator
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.FieldFilter.Operator
  inline def ARRAY_CONTAINS: ARRAY_CONTAINS = "ARRAY_CONTAINS".asInstanceOf[ARRAY_CONTAINS]
  
  @js.native
  sealed trait ARRAY_CONTAINS_ANY
    extends StObject
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.StructuredQuery.FieldFilter.Operator
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.FieldFilter.Operator
  inline def ARRAY_CONTAINS_ANY: ARRAY_CONTAINS_ANY = "ARRAY_CONTAINS_ANY".asInstanceOf[ARRAY_CONTAINS_ANY]
  
  @js.native
  sealed trait ASCENDING
    extends StObject
       with Direction
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.Direction
       with Order
  inline def ASCENDING: ASCENDING = "ASCENDING".asInstanceOf[ASCENDING]
  
  @js.native
  sealed trait AddPrefixToKeys extends StObject
  inline def AddPrefixToKeys: AddPrefixToKeys = "AddPrefixToKeys".asInstanceOf[AddPrefixToKeys]
  
  @js.native
  sealed trait CANCELLED
    extends StObject
       with OperationState
  inline def CANCELLED: CANCELLED = "CANCELLED".asInstanceOf[CANCELLED]
  
  @js.native
  sealed trait CANCELLING
    extends StObject
       with OperationState
  inline def CANCELLING: CANCELLING = "CANCELLING".asInstanceOf[CANCELLING]
  
  @js.native
  sealed trait CHANGE_TYPE_UNSPECIFIED
    extends StObject
       with ChangeType
  inline def CHANGE_TYPE_UNSPECIFIED: CHANGE_TYPE_UNSPECIFIED = "CHANGE_TYPE_UNSPECIFIED".asInstanceOf[CHANGE_TYPE_UNSPECIFIED]
  
  @js.native
  sealed trait CODE_SIZE
    extends StObject
       with OptimizeMode
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.FileOptions.OptimizeMode
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.FileOptions.OptimizeMode
  inline def CODE_SIZE: CODE_SIZE = "CODE_SIZE".asInstanceOf[CODE_SIZE]
  
  @js.native
  sealed trait COLLECTION
    extends StObject
       with QueryScope
  inline def COLLECTION: COLLECTION = "COLLECTION".asInstanceOf[COLLECTION]
  
  @js.native
  sealed trait COLLECTION_GROUP
    extends StObject
       with QueryScope
  inline def COLLECTION_GROUP: COLLECTION_GROUP = "COLLECTION_GROUP".asInstanceOf[COLLECTION_GROUP]
  
  @js.native
  sealed trait CONCURRENCY_MODE_UNSPECIFIED
    extends StObject
       with ConcurrencyMode
  inline def CONCURRENCY_MODE_UNSPECIFIED: CONCURRENCY_MODE_UNSPECIFIED = "CONCURRENCY_MODE_UNSPECIFIED".asInstanceOf[CONCURRENCY_MODE_UNSPECIFIED]
  
  @js.native
  sealed trait CONTAINS
    extends StObject
       with ArrayConfig
  inline def CONTAINS: CONTAINS = "CONTAINS".asInstanceOf[CONTAINS]
  
  @js.native
  sealed trait CORD
    extends StObject
       with CType
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.FieldOptions.CType
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.FieldOptions.CType
  inline def CORD: CORD = "CORD".asInstanceOf[CORD]
  
  @js.native
  sealed trait CREATING
    extends StObject
       with State
  inline def CREATING: CREATING = "CREATING".asInstanceOf[CREATING]
  
  @js.native
  sealed trait CURRENT
    extends StObject
       with TargetChangeType
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.TargetChange.TargetChangeType
  inline def CURRENT: CURRENT = "CURRENT".asInstanceOf[CURRENT]
  
  @js.native
  sealed trait DATABASE_TYPE_UNSPECIFIED
    extends StObject
       with DatabaseType
  inline def DATABASE_TYPE_UNSPECIFIED: DATABASE_TYPE_UNSPECIFIED = "DATABASE_TYPE_UNSPECIFIED".asInstanceOf[DATABASE_TYPE_UNSPECIFIED]
  
  @js.native
  sealed trait DATASTORE_MODE
    extends StObject
       with DatabaseType
  inline def DATASTORE_MODE: DATASTORE_MODE = "DATASTORE_MODE".asInstanceOf[DATASTORE_MODE]
  
  @js.native
  sealed trait DECLARATIVE_FRIENDLY
    extends StObject
       with Style
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.api.ResourceDescriptor.Style
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.api.ResourceDescriptor.Style
  inline def DECLARATIVE_FRIENDLY: DECLARATIVE_FRIENDLY = "DECLARATIVE_FRIENDLY".asInstanceOf[DECLARATIVE_FRIENDLY]
  
  @js.native
  sealed trait DESCENDING
    extends StObject
       with Direction
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.Direction
       with Order
  inline def DESCENDING: DESCENDING = "DESCENDING".asInstanceOf[DESCENDING]
  
  @js.native
  sealed trait DIRECTION_UNSPECIFIED
    extends StObject
       with Direction
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.Direction
  inline def DIRECTION_UNSPECIFIED: DIRECTION_UNSPECIFIED = "DIRECTION_UNSPECIFIED".asInstanceOf[DIRECTION_UNSPECIFIED]
  
  @js.native
  sealed trait EQUAL
    extends StObject
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.StructuredQuery.FieldFilter.Operator
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.FieldFilter.Operator
  inline def EQUAL: EQUAL = "EQUAL".asInstanceOf[EQUAL]
  
  @js.native
  sealed trait EqualssignEqualssign
    extends StObject
       with WhereFilterOp
  inline def EqualssignEqualssign: EqualssignEqualssign = "==".asInstanceOf[EqualssignEqualssign]
  
  @js.native
  sealed trait ExclamationmarkEqualssign
    extends StObject
       with WhereFilterOp
  inline def ExclamationmarkEqualssign: ExclamationmarkEqualssign = "!=".asInstanceOf[ExclamationmarkEqualssign]
  
  @js.native
  sealed trait FAILED
    extends StObject
       with OperationState
  inline def FAILED: FAILED = "FAILED".asInstanceOf[FAILED]
  
  @js.native
  sealed trait FIELD_BEHAVIOR_UNSPECIFIED
    extends StObject
       with FieldBehavior
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.api.FieldBehavior
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.api.FieldBehavior
  inline def FIELD_BEHAVIOR_UNSPECIFIED: FIELD_BEHAVIOR_UNSPECIFIED = "FIELD_BEHAVIOR_UNSPECIFIED".asInstanceOf[FIELD_BEHAVIOR_UNSPECIFIED]
  
  @js.native
  sealed trait FINALIZING
    extends StObject
       with OperationState
  inline def FINALIZING: FINALIZING = "FINALIZING".asInstanceOf[FINALIZING]
  
  @js.native
  sealed trait FIRESTORE_NATIVE
    extends StObject
       with DatabaseType
  inline def FIRESTORE_NATIVE: FIRESTORE_NATIVE = "FIRESTORE_NATIVE".asInstanceOf[FIRESTORE_NATIVE]
  
  @js.native
  sealed trait FIRST
    extends StObject
       with LimitType
  inline def FIRST: FIRST = "FIRST".asInstanceOf[FIRST]
  
  @js.native
  sealed trait FUTURE_MULTI_PATTERN
    extends StObject
       with History
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.api.ResourceDescriptor.History
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.api.ResourceDescriptor.History
  inline def FUTURE_MULTI_PATTERN: FUTURE_MULTI_PATTERN = "FUTURE_MULTI_PATTERN".asInstanceOf[FUTURE_MULTI_PATTERN]
  
  @js.native
  sealed trait GREATER_THAN
    extends StObject
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.StructuredQuery.FieldFilter.Operator
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.FieldFilter.Operator
  inline def GREATER_THAN: GREATER_THAN = "GREATER_THAN".asInstanceOf[GREATER_THAN]
  
  @js.native
  sealed trait GREATER_THAN_OR_EQUAL
    extends StObject
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.StructuredQuery.FieldFilter.Operator
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.FieldFilter.Operator
  inline def GREATER_THAN_OR_EQUAL: GREATER_THAN_OR_EQUAL = "GREATER_THAN_OR_EQUAL".asInstanceOf[GREATER_THAN_OR_EQUAL]
  
  @js.native
  sealed trait Greaterthansign
    extends StObject
       with WhereFilterOp
  inline def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  
  @js.native
  sealed trait GreaterthansignEqualssign
    extends StObject
       with WhereFilterOp
  inline def GreaterthansignEqualssign: GreaterthansignEqualssign = ">=".asInstanceOf[GreaterthansignEqualssign]
  
  @js.native
  sealed trait HISTORY_UNSPECIFIED
    extends StObject
       with History
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.api.ResourceDescriptor.History
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.api.ResourceDescriptor.History
  inline def HISTORY_UNSPECIFIED: HISTORY_UNSPECIFIED = "HISTORY_UNSPECIFIED".asInstanceOf[HISTORY_UNSPECIFIED]
  
  @js.native
  sealed trait IMMUTABLE
    extends StObject
       with FieldBehavior
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.api.FieldBehavior
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.api.FieldBehavior
  inline def IMMUTABLE: IMMUTABLE = "IMMUTABLE".asInstanceOf[IMMUTABLE]
  
  @js.native
  sealed trait IN
    extends StObject
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.StructuredQuery.FieldFilter.Operator
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.FieldFilter.Operator
  inline def IN: IN = "IN".asInstanceOf[IN]
  
  @js.native
  sealed trait INITIALIZING
    extends StObject
       with OperationState
  inline def INITIALIZING: INITIALIZING = "INITIALIZING".asInstanceOf[INITIALIZING]
  
  @js.native
  sealed trait INPUT_ONLY
    extends StObject
       with FieldBehavior
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.api.FieldBehavior
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.api.FieldBehavior
  inline def INPUT_ONLY: INPUT_ONLY = "INPUT_ONLY".asInstanceOf[INPUT_ONLY]
  
  @js.native
  sealed trait IS_NAN
    extends StObject
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.StructuredQuery.UnaryFilter.Operator
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.UnaryFilter.Operator
  inline def IS_NAN: IS_NAN = "IS_NAN".asInstanceOf[IS_NAN]
  
  @js.native
  sealed trait IS_NOT_NAN
    extends StObject
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.StructuredQuery.UnaryFilter.Operator
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.UnaryFilter.Operator
  inline def IS_NOT_NAN: IS_NOT_NAN = "IS_NOT_NAN".asInstanceOf[IS_NOT_NAN]
  
  @js.native
  sealed trait IS_NOT_NULL
    extends StObject
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.StructuredQuery.UnaryFilter.Operator
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.UnaryFilter.Operator
  inline def IS_NOT_NULL: IS_NOT_NULL = "IS_NOT_NULL".asInstanceOf[IS_NOT_NULL]
  
  @js.native
  sealed trait IS_NULL
    extends StObject
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.StructuredQuery.UnaryFilter.Operator
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.UnaryFilter.Operator
  inline def IS_NULL: IS_NULL = "IS_NULL".asInstanceOf[IS_NULL]
  
  @js.native
  sealed trait JS_NORMAL
    extends StObject
       with JSType
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.FieldOptions.JSType
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.FieldOptions.JSType
  inline def JS_NORMAL: JS_NORMAL = "JS_NORMAL".asInstanceOf[JS_NORMAL]
  
  @js.native
  sealed trait JS_NUMBER
    extends StObject
       with JSType
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.FieldOptions.JSType
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.FieldOptions.JSType
  inline def JS_NUMBER: JS_NUMBER = "JS_NUMBER".asInstanceOf[JS_NUMBER]
  
  @js.native
  sealed trait JS_STRING
    extends StObject
       with JSType
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.FieldOptions.JSType
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.FieldOptions.JSType
  inline def JS_STRING: JS_STRING = "JS_STRING".asInstanceOf[JS_STRING]
  
  @js.native
  sealed trait LABEL_OPTIONAL
    extends StObject
       with Label
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.FieldDescriptorProto.Label
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.FieldDescriptorProto.Label
  inline def LABEL_OPTIONAL: LABEL_OPTIONAL = "LABEL_OPTIONAL".asInstanceOf[LABEL_OPTIONAL]
  
  @js.native
  sealed trait LABEL_REPEATED
    extends StObject
       with Label
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.FieldDescriptorProto.Label
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.FieldDescriptorProto.Label
  inline def LABEL_REPEATED: LABEL_REPEATED = "LABEL_REPEATED".asInstanceOf[LABEL_REPEATED]
  
  @js.native
  sealed trait LABEL_REQUIRED
    extends StObject
       with Label
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.FieldDescriptorProto.Label
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.FieldDescriptorProto.Label
  inline def LABEL_REQUIRED: LABEL_REQUIRED = "LABEL_REQUIRED".asInstanceOf[LABEL_REQUIRED]
  
  @js.native
  sealed trait LAST
    extends StObject
       with LimitType
  inline def LAST: LAST = "LAST".asInstanceOf[LAST]
  
  @js.native
  sealed trait LESS_THAN
    extends StObject
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.StructuredQuery.FieldFilter.Operator
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.FieldFilter.Operator
  inline def LESS_THAN: LESS_THAN = "LESS_THAN".asInstanceOf[LESS_THAN]
  
  @js.native
  sealed trait LESS_THAN_OR_EQUAL
    extends StObject
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.StructuredQuery.FieldFilter.Operator
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.FieldFilter.Operator
  inline def LESS_THAN_OR_EQUAL: LESS_THAN_OR_EQUAL = "LESS_THAN_OR_EQUAL".asInstanceOf[LESS_THAN_OR_EQUAL]
  
  @js.native
  sealed trait LITE_RUNTIME
    extends StObject
       with OptimizeMode
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.FileOptions.OptimizeMode
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.FileOptions.OptimizeMode
  inline def LITE_RUNTIME: LITE_RUNTIME = "LITE_RUNTIME".asInstanceOf[LITE_RUNTIME]
  
  @js.native
  sealed trait Lessthansign
    extends StObject
       with WhereFilterOp
  inline def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  
  @js.native
  sealed trait LessthansignEqualssign
    extends StObject
       with WhereFilterOp
  inline def LessthansignEqualssign: LessthansignEqualssign = "<=".asInstanceOf[LessthansignEqualssign]
  
  @js.native
  sealed trait NEEDS_REPAIR
    extends StObject
       with State
  inline def NEEDS_REPAIR: NEEDS_REPAIR = "NEEDS_REPAIR".asInstanceOf[NEEDS_REPAIR]
  
  @js.native
  sealed trait NON_EMPTY_DEFAULT
    extends StObject
       with FieldBehavior
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.api.FieldBehavior
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.api.FieldBehavior
  inline def NON_EMPTY_DEFAULT: NON_EMPTY_DEFAULT = "NON_EMPTY_DEFAULT".asInstanceOf[NON_EMPTY_DEFAULT]
  
  @js.native
  sealed trait NOT_EQUAL
    extends StObject
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.StructuredQuery.FieldFilter.Operator
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.FieldFilter.Operator
  inline def NOT_EQUAL: NOT_EQUAL = "NOT_EQUAL".asInstanceOf[NOT_EQUAL]
  
  @js.native
  sealed trait NOT_IN
    extends StObject
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.StructuredQuery.FieldFilter.Operator
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.FieldFilter.Operator
  inline def NOT_IN: NOT_IN = "NOT_IN".asInstanceOf[NOT_IN]
  
  @js.native
  sealed trait NO_CHANGE
    extends StObject
       with TargetChangeType
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.TargetChange.TargetChangeType
  inline def NO_CHANGE: NO_CHANGE = "NO_CHANGE".asInstanceOf[NO_CHANGE]
  
  @js.native
  sealed trait NULL_VALUE extends StObject
  inline def NULL_VALUE: NULL_VALUE = "NULL_VALUE".asInstanceOf[NULL_VALUE]
  
  @js.native
  sealed trait OPERATION_STATE_UNSPECIFIED
    extends StObject
       with OperationState
  inline def OPERATION_STATE_UNSPECIFIED: OPERATION_STATE_UNSPECIFIED = "OPERATION_STATE_UNSPECIFIED".asInstanceOf[OPERATION_STATE_UNSPECIFIED]
  
  @js.native
  sealed trait OPERATOR_UNSPECIFIED
    extends StObject
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.StructuredQuery.UnaryFilter.Operator
       with Operator
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.StructuredQuery.FieldFilter.Operator
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.UnaryFilter.Operator
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.CompositeFilter.Operator
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.StructuredQuery.FieldFilter.Operator
  inline def OPERATOR_UNSPECIFIED: OPERATOR_UNSPECIFIED = "OPERATOR_UNSPECIFIED".asInstanceOf[OPERATOR_UNSPECIFIED]
  
  @js.native
  sealed trait OPTIMISTIC
    extends StObject
       with ConcurrencyMode
  inline def OPTIMISTIC: OPTIMISTIC = "OPTIMISTIC".asInstanceOf[OPTIMISTIC]
  
  @js.native
  sealed trait OPTIMISTIC_WITH_ENTITY_GROUPS
    extends StObject
       with ConcurrencyMode
  inline def OPTIMISTIC_WITH_ENTITY_GROUPS: OPTIMISTIC_WITH_ENTITY_GROUPS = "OPTIMISTIC_WITH_ENTITY_GROUPS".asInstanceOf[OPTIMISTIC_WITH_ENTITY_GROUPS]
  
  @js.native
  sealed trait OPTIONAL
    extends StObject
       with FieldBehavior
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.api.FieldBehavior
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.api.FieldBehavior
  inline def OPTIONAL: OPTIONAL = "OPTIONAL".asInstanceOf[OPTIONAL]
  
  @js.native
  sealed trait ORDER_UNSPECIFIED
    extends StObject
       with Order
  inline def ORDER_UNSPECIFIED: ORDER_UNSPECIFIED = "ORDER_UNSPECIFIED".asInstanceOf[ORDER_UNSPECIFIED]
  
  @js.native
  sealed trait ORIGINALLY_SINGLE_PATTERN
    extends StObject
       with History
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.api.ResourceDescriptor.History
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.api.ResourceDescriptor.History
  inline def ORIGINALLY_SINGLE_PATTERN: ORIGINALLY_SINGLE_PATTERN = "ORIGINALLY_SINGLE_PATTERN".asInstanceOf[ORIGINALLY_SINGLE_PATTERN]
  
  @js.native
  sealed trait OUTPUT_ONLY
    extends StObject
       with FieldBehavior
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.api.FieldBehavior
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.api.FieldBehavior
  inline def OUTPUT_ONLY: OUTPUT_ONLY = "OUTPUT_ONLY".asInstanceOf[OUTPUT_ONLY]
  
  @js.native
  sealed trait PESSIMISTIC
    extends StObject
       with ConcurrencyMode
  inline def PESSIMISTIC: PESSIMISTIC = "PESSIMISTIC".asInstanceOf[PESSIMISTIC]
  
  @js.native
  sealed trait PROCESSING
    extends StObject
       with OperationState
  inline def PROCESSING: PROCESSING = "PROCESSING".asInstanceOf[PROCESSING]
  
  @js.native
  sealed trait PartialWithFieldValue extends StObject
  inline def PartialWithFieldValue: PartialWithFieldValue = "PartialWithFieldValue".asInstanceOf[PartialWithFieldValue]
  
  @js.native
  sealed trait QUERY_SCOPE_UNSPECIFIED
    extends StObject
       with QueryScope
  inline def QUERY_SCOPE_UNSPECIFIED: QUERY_SCOPE_UNSPECIFIED = "QUERY_SCOPE_UNSPECIFIED".asInstanceOf[QUERY_SCOPE_UNSPECIFIED]
  
  @js.native
  sealed trait READY
    extends StObject
       with State
  inline def READY: READY = "READY".asInstanceOf[READY]
  
  @js.native
  sealed trait REMOVE
    extends StObject
       with ChangeType
       with TargetChangeType
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.TargetChange.TargetChangeType
  inline def REMOVE: REMOVE = "REMOVE".asInstanceOf[REMOVE]
  
  @js.native
  sealed trait REQUEST_TIME
    extends StObject
       with ServerValue
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.DocumentTransform.FieldTransform.ServerValue
  inline def REQUEST_TIME: REQUEST_TIME = "REQUEST_TIME".asInstanceOf[REQUEST_TIME]
  
  @js.native
  sealed trait REQUIRED
    extends StObject
       with FieldBehavior
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.api.FieldBehavior
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.api.FieldBehavior
  inline def REQUIRED: REQUIRED = "REQUIRED".asInstanceOf[REQUIRED]
  
  @js.native
  sealed trait RESET
    extends StObject
       with TargetChangeType
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.TargetChange.TargetChangeType
  inline def RESET: RESET = "RESET".asInstanceOf[RESET]
  
  @js.native
  sealed trait SERVER_VALUE_UNSPECIFIED
    extends StObject
       with ServerValue
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.DocumentTransform.FieldTransform.ServerValue
  inline def SERVER_VALUE_UNSPECIFIED: SERVER_VALUE_UNSPECIFIED = "SERVER_VALUE_UNSPECIFIED".asInstanceOf[SERVER_VALUE_UNSPECIFIED]
  
  @js.native
  sealed trait SPEED
    extends StObject
       with OptimizeMode
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.FileOptions.OptimizeMode
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.FileOptions.OptimizeMode
  inline def SPEED: SPEED = "SPEED".asInstanceOf[SPEED]
  
  @js.native
  sealed trait STATE_UNSPECIFIED
    extends StObject
       with State
  inline def STATE_UNSPECIFIED: STATE_UNSPECIFIED = "STATE_UNSPECIFIED".asInstanceOf[STATE_UNSPECIFIED]
  
  @js.native
  sealed trait STRING
    extends StObject
       with CType
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.FieldOptions.CType
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.FieldOptions.CType
  inline def STRING: STRING = "STRING".asInstanceOf[STRING]
  
  @js.native
  sealed trait STRING_PIECE
    extends StObject
       with CType
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.FieldOptions.CType
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.FieldOptions.CType
  inline def STRING_PIECE: STRING_PIECE = "STRING_PIECE".asInstanceOf[STRING_PIECE]
  
  @js.native
  sealed trait STYLE_UNSPECIFIED
    extends StObject
       with Style
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.api.ResourceDescriptor.Style
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.api.ResourceDescriptor.Style
  inline def STYLE_UNSPECIFIED: STYLE_UNSPECIFIED = "STYLE_UNSPECIFIED".asInstanceOf[STYLE_UNSPECIFIED]
  
  @js.native
  sealed trait SUCCESSFUL
    extends StObject
       with OperationState
  inline def SUCCESSFUL: SUCCESSFUL = "SUCCESSFUL".asInstanceOf[SUCCESSFUL]
  
  @js.native
  sealed trait TYPE_BOOL
    extends StObject
       with Type
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
  inline def TYPE_BOOL: TYPE_BOOL = "TYPE_BOOL".asInstanceOf[TYPE_BOOL]
  
  @js.native
  sealed trait TYPE_BYTES
    extends StObject
       with Type
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
  inline def TYPE_BYTES: TYPE_BYTES = "TYPE_BYTES".asInstanceOf[TYPE_BYTES]
  
  @js.native
  sealed trait TYPE_DOUBLE
    extends StObject
       with Type
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
  inline def TYPE_DOUBLE: TYPE_DOUBLE = "TYPE_DOUBLE".asInstanceOf[TYPE_DOUBLE]
  
  @js.native
  sealed trait TYPE_ENUM
    extends StObject
       with Type
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
  inline def TYPE_ENUM: TYPE_ENUM = "TYPE_ENUM".asInstanceOf[TYPE_ENUM]
  
  @js.native
  sealed trait TYPE_FIXED32
    extends StObject
       with Type
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
  inline def TYPE_FIXED32: TYPE_FIXED32 = "TYPE_FIXED32".asInstanceOf[TYPE_FIXED32]
  
  @js.native
  sealed trait TYPE_FIXED64
    extends StObject
       with Type
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
  inline def TYPE_FIXED64: TYPE_FIXED64 = "TYPE_FIXED64".asInstanceOf[TYPE_FIXED64]
  
  @js.native
  sealed trait TYPE_FLOAT
    extends StObject
       with Type
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
  inline def TYPE_FLOAT: TYPE_FLOAT = "TYPE_FLOAT".asInstanceOf[TYPE_FLOAT]
  
  @js.native
  sealed trait TYPE_GROUP
    extends StObject
       with Type
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
  inline def TYPE_GROUP: TYPE_GROUP = "TYPE_GROUP".asInstanceOf[TYPE_GROUP]
  
  @js.native
  sealed trait TYPE_INT32
    extends StObject
       with Type
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
  inline def TYPE_INT32: TYPE_INT32 = "TYPE_INT32".asInstanceOf[TYPE_INT32]
  
  @js.native
  sealed trait TYPE_INT64
    extends StObject
       with Type
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
  inline def TYPE_INT64: TYPE_INT64 = "TYPE_INT64".asInstanceOf[TYPE_INT64]
  
  @js.native
  sealed trait TYPE_MESSAGE
    extends StObject
       with Type
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
  inline def TYPE_MESSAGE: TYPE_MESSAGE = "TYPE_MESSAGE".asInstanceOf[TYPE_MESSAGE]
  
  @js.native
  sealed trait TYPE_SFIXED32
    extends StObject
       with Type
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
  inline def TYPE_SFIXED32: TYPE_SFIXED32 = "TYPE_SFIXED32".asInstanceOf[TYPE_SFIXED32]
  
  @js.native
  sealed trait TYPE_SFIXED64
    extends StObject
       with Type
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
  inline def TYPE_SFIXED64: TYPE_SFIXED64 = "TYPE_SFIXED64".asInstanceOf[TYPE_SFIXED64]
  
  @js.native
  sealed trait TYPE_SINT32
    extends StObject
       with Type
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
  inline def TYPE_SINT32: TYPE_SINT32 = "TYPE_SINT32".asInstanceOf[TYPE_SINT32]
  
  @js.native
  sealed trait TYPE_SINT64
    extends StObject
       with Type
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
  inline def TYPE_SINT64: TYPE_SINT64 = "TYPE_SINT64".asInstanceOf[TYPE_SINT64]
  
  @js.native
  sealed trait TYPE_STRING
    extends StObject
       with Type
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
  inline def TYPE_STRING: TYPE_STRING = "TYPE_STRING".asInstanceOf[TYPE_STRING]
  
  @js.native
  sealed trait TYPE_UINT32
    extends StObject
       with Type
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
  inline def TYPE_UINT32: TYPE_UINT32 = "TYPE_UINT32".asInstanceOf[TYPE_UINT32]
  
  @js.native
  sealed trait TYPE_UINT64
    extends StObject
       with Type
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
  inline def TYPE_UINT64: TYPE_UINT64 = "TYPE_UINT64".asInstanceOf[TYPE_UINT64]
  
  @js.native
  sealed trait UNORDERED_LIST
    extends StObject
       with FieldBehavior
       with typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.api.FieldBehavior
       with typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.api.FieldBehavior
  inline def UNORDERED_LIST: UNORDERED_LIST = "UNORDERED_LIST".asInstanceOf[UNORDERED_LIST]
  
  @js.native
  sealed trait UpdateData extends StObject
  inline def UpdateData: UpdateData = "UpdateData".asInstanceOf[UpdateData]
  
  @js.native
  sealed trait WithFieldValue extends StObject
  inline def WithFieldValue: WithFieldValue = "WithFieldValue".asInstanceOf[WithFieldValue]
  
  @js.native
  sealed trait addTarget extends StObject
  inline def addTarget: addTarget = "addTarget".asInstanceOf[addTarget]
  
  @js.native
  sealed trait added
    extends StObject
       with DocumentChangeType
  inline def added: added = "added".asInstanceOf[added]
  
  @js.native
  sealed trait appendMissingElements extends StObject
  inline def appendMissingElements: appendMissingElements = "appendMissingElements".asInstanceOf[appendMissingElements]
  
  @js.native
  sealed trait `array-contains`
    extends StObject
       with WhereFilterOp
  inline def `array-contains`: `array-contains` = "array-contains".asInstanceOf[`array-contains`]
  
  @js.native
  sealed trait `array-contains-any`
    extends StObject
       with WhereFilterOp
  inline def `array-contains-any`: `array-contains-any` = "array-contains-any".asInstanceOf[`array-contains-any`]
  
  @js.native
  sealed trait arrayConfig extends StObject
  inline def arrayConfig: arrayConfig = "arrayConfig".asInstanceOf[arrayConfig]
  
  @js.native
  sealed trait arrayValue extends StObject
  inline def arrayValue: arrayValue = "arrayValue".asInstanceOf[arrayValue]
  
  @js.native
  sealed trait asc
    extends StObject
       with OrderByDirection
  inline def asc: asc = "asc".asInstanceOf[asc]
  
  @js.native
  sealed trait boolValue extends StObject
  inline def boolValue: boolValue = "boolValue".asInstanceOf[boolValue]
  
  @js.native
  sealed trait booleanValue extends StObject
  inline def booleanValue: booleanValue = "booleanValue".asInstanceOf[booleanValue]
  
  @js.native
  sealed trait bytesValue extends StObject
  inline def bytesValue: bytesValue = "bytesValue".asInstanceOf[bytesValue]
  
  @js.native
  sealed trait compositeFilter extends StObject
  inline def compositeFilter: compositeFilter = "compositeFilter".asInstanceOf[compositeFilter]
  
  @js.native
  sealed trait create extends StObject
  inline def create: create = "create".asInstanceOf[create]
  
  @js.native
  sealed trait custom extends StObject
  inline def custom: custom = "custom".asInstanceOf[custom]
  
  @js.native
  sealed trait delete extends StObject
  inline def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait desc
    extends StObject
       with OrderByDirection
  inline def desc: desc = "desc".asInstanceOf[desc]
  
  @js.native
  sealed trait document extends StObject
  inline def document: document = "document".asInstanceOf[document]
  
  @js.native
  sealed trait documentChange extends StObject
  inline def documentChange: documentChange = "documentChange".asInstanceOf[documentChange]
  
  @js.native
  sealed trait documentDelete extends StObject
  inline def documentDelete: documentDelete = "documentDelete".asInstanceOf[documentDelete]
  
  @js.native
  sealed trait documentMetadata extends StObject
  inline def documentMetadata: documentMetadata = "documentMetadata".asInstanceOf[documentMetadata]
  
  @js.native
  sealed trait documentRemove extends StObject
  inline def documentRemove: documentRemove = "documentRemove".asInstanceOf[documentRemove]
  
  @js.native
  sealed trait documents extends StObject
  inline def documents: documents = "documents".asInstanceOf[documents]
  
  @js.native
  sealed trait doubleValue extends StObject
  inline def doubleValue: doubleValue = "doubleValue".asInstanceOf[doubleValue]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait exists extends StObject
  inline def exists: exists = "exists".asInstanceOf[exists]
  
  @js.native
  sealed trait field extends StObject
  inline def field: field = "field".asInstanceOf[field]
  
  @js.native
  sealed trait fieldFilter extends StObject
  inline def fieldFilter: fieldFilter = "fieldFilter".asInstanceOf[fieldFilter]
  
  @js.native
  sealed trait filter extends StObject
  inline def filter: filter = "filter".asInstanceOf[filter]
  
  @js.native
  sealed trait found extends StObject
  inline def found: found = "found".asInstanceOf[found]
  
  @js.native
  sealed trait geoPointValue extends StObject
  inline def geoPointValue: geoPointValue = "geoPointValue".asInstanceOf[geoPointValue]
  
  @js.native
  sealed trait get extends StObject
  inline def get: get = "get".asInstanceOf[get]
  
  @js.native
  sealed trait in_
    extends StObject
       with WhereFilterOp
  inline def in_ : in_ = "in".asInstanceOf[in_]
  
  @js.native
  sealed trait increment extends StObject
  inline def increment: increment = "increment".asInstanceOf[increment]
  
  @js.native
  sealed trait integerValue extends StObject
  inline def integerValue: integerValue = "integerValue".asInstanceOf[integerValue]
  
  @js.native
  sealed trait listValue extends StObject
  inline def listValue: listValue = "listValue".asInstanceOf[listValue]
  
  @js.native
  sealed trait mapValue extends StObject
  inline def mapValue: mapValue = "mapValue".asInstanceOf[mapValue]
  
  @js.native
  sealed trait maximum extends StObject
  inline def maximum: maximum = "maximum".asInstanceOf[maximum]
  
  @js.native
  sealed trait metadata extends StObject
  inline def metadata: metadata = "metadata".asInstanceOf[metadata]
  
  @js.native
  sealed trait minimum extends StObject
  inline def minimum: minimum = "minimum".asInstanceOf[minimum]
  
  @js.native
  sealed trait missing extends StObject
  inline def missing: missing = "missing".asInstanceOf[missing]
  
  @js.native
  sealed trait modified
    extends StObject
       with DocumentChangeType
  inline def modified: modified = "modified".asInstanceOf[modified]
  
  @js.native
  sealed trait namedQuery extends StObject
  inline def namedQuery: namedQuery = "namedQuery".asInstanceOf[namedQuery]
  
  @js.native
  sealed trait newTransaction extends StObject
  inline def newTransaction: newTransaction = "newTransaction".asInstanceOf[newTransaction]
  
  @js.native
  sealed trait `not-in`
    extends StObject
       with WhereFilterOp
  inline def `not-in`: `not-in` = "not-in".asInstanceOf[`not-in`]
  
  @js.native
  sealed trait nullValue extends StObject
  inline def nullValue: nullValue = "nullValue".asInstanceOf[nullValue]
  
  @js.native
  sealed trait numberValue extends StObject
  inline def numberValue: numberValue = "numberValue".asInstanceOf[numberValue]
  
  @js.native
  sealed trait order extends StObject
  inline def order: order = "order".asInstanceOf[order]
  
  @js.native
  sealed trait patch extends StObject
  inline def patch: patch = "patch".asInstanceOf[patch]
  
  @js.native
  sealed trait post extends StObject
  inline def post: post = "post".asInstanceOf[post]
  
  @js.native
  sealed trait put extends StObject
  inline def put: put = "put".asInstanceOf[put]
  
  @js.native
  sealed trait query extends StObject
  inline def query: query = "query".asInstanceOf[query]
  
  @js.native
  sealed trait readOnly extends StObject
  inline def readOnly: readOnly = "readOnly".asInstanceOf[readOnly]
  
  @js.native
  sealed trait readTime extends StObject
  inline def readTime: readTime = "readTime".asInstanceOf[readTime]
  
  @js.native
  sealed trait readWrite extends StObject
  inline def readWrite: readWrite = "readWrite".asInstanceOf[readWrite]
  
  @js.native
  sealed trait referenceValue extends StObject
  inline def referenceValue: referenceValue = "referenceValue".asInstanceOf[referenceValue]
  
  @js.native
  sealed trait removeAllFromArray extends StObject
  inline def removeAllFromArray: removeAllFromArray = "removeAllFromArray".asInstanceOf[removeAllFromArray]
  
  @js.native
  sealed trait removeTarget extends StObject
  inline def removeTarget: removeTarget = "removeTarget".asInstanceOf[removeTarget]
  
  @js.native
  sealed trait removed
    extends StObject
       with DocumentChangeType
  inline def removed: removed = "removed".asInstanceOf[removed]
  
  @js.native
  sealed trait response extends StObject
  inline def response: response = "response".asInstanceOf[response]
  
  @js.native
  sealed trait resumeToken extends StObject
  inline def resumeToken: resumeToken = "resumeToken".asInstanceOf[resumeToken]
  
  @js.native
  sealed trait set extends StObject
  inline def set: set = "set".asInstanceOf[set]
  
  @js.native
  sealed trait setToServerValue extends StObject
  inline def setToServerValue: setToServerValue = "setToServerValue".asInstanceOf[setToServerValue]
  
  @js.native
  sealed trait stringValue extends StObject
  inline def stringValue: stringValue = "stringValue".asInstanceOf[stringValue]
  
  @js.native
  sealed trait structValue extends StObject
  inline def structValue: structValue = "structValue".asInstanceOf[structValue]
  
  @js.native
  sealed trait structuredQuery extends StObject
  inline def structuredQuery: structuredQuery = "structuredQuery".asInstanceOf[structuredQuery]
  
  @js.native
  sealed trait targetChange extends StObject
  inline def targetChange: targetChange = "targetChange".asInstanceOf[targetChange]
  
  @js.native
  sealed trait timestampValue extends StObject
  inline def timestampValue: timestampValue = "timestampValue".asInstanceOf[timestampValue]
  
  @js.native
  sealed trait transaction extends StObject
  inline def transaction: transaction = "transaction".asInstanceOf[transaction]
  
  @js.native
  sealed trait transform extends StObject
  inline def transform: transform = "transform".asInstanceOf[transform]
  
  @js.native
  sealed trait unaryFilter extends StObject
  inline def unaryFilter: unaryFilter = "unaryFilter".asInstanceOf[unaryFilter]
  
  @js.native
  sealed trait update extends StObject
  inline def update: update = "update".asInstanceOf[update]
  
  @js.native
  sealed trait updateTime extends StObject
  inline def updateTime: updateTime = "updateTime".asInstanceOf[updateTime]
}
