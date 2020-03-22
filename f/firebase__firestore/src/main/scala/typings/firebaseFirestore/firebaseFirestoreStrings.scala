package typings.firebaseFirestore

import typings.firebaseFirestore.credentialsMod.TokenType
import typings.firebaseFirestore.firestoreProtoApiMod.CompositeFilterOp
import typings.firebaseFirestore.firestoreProtoApiMod.FieldFilterOp
import typings.firebaseFirestore.firestoreProtoApiMod.FieldTransformSetToServerValue
import typings.firebaseFirestore.firestoreProtoApiMod.IndexFieldMode
import typings.firebaseFirestore.firestoreProtoApiMod.IndexState
import typings.firebaseFirestore.firestoreProtoApiMod.OrderDirection
import typings.firebaseFirestore.firestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientAlt
import typings.firebaseFirestore.firestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientXgafv
import typings.firebaseFirestore.firestoreProtoApiMod.ProjectsDatabasesIndexesApiClientAlt
import typings.firebaseFirestore.firestoreProtoApiMod.ProjectsDatabasesIndexesApiClientXgafv
import typings.firebaseFirestore.firestoreProtoApiMod.TargetChangeTargetChangeType
import typings.firebaseFirestore.firestoreProtoApiMod.UnaryFilterOp
import typings.firebaseFirestore.inputValidationMod.ValidationType
import typings.firebaseFirestore.localSharedClientStateSyncerMod.QueryTargetState
import typings.firebaseFirestore.persistenceMod.PersistenceTransactionMode
import typings.firebaseFirestore.simpleDbMod.SimpleDbTransactionMode
import typings.firebaseFirestore.specTestRunnerMod.SpecLimitType
import typings.firebaseFirestore.typesMod.MutationBatchState
import typings.firebaseFirestore.typesMod.OnlineState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object firebaseFirestoreStrings {
  @js.native
  sealed trait `1`
    extends ProjectsDatabasesDocumentsApiClientXgafv
       with ProjectsDatabasesIndexesApiClientXgafv
  
  @js.native
  sealed trait `2`
    extends ProjectsDatabasesDocumentsApiClientXgafv
       with ProjectsDatabasesIndexesApiClientXgafv
  
  @js.native
  sealed trait ADD extends TargetChangeTargetChangeType
  
  @js.native
  sealed trait AND extends CompositeFilterOp
  
  @js.native
  sealed trait ARRAY_CONTAINS extends FieldFilterOp
  
  @js.native
  sealed trait ARRAY_CONTAINS_ANY extends FieldFilterOp
  
  @js.native
  sealed trait ASCENDING
    extends IndexFieldMode
       with OrderDirection
  
  @js.native
  sealed trait CREATING extends IndexState
  
  @js.native
  sealed trait CURRENT extends TargetChangeTargetChangeType
  
  @js.native
  sealed trait DESCENDING
    extends IndexFieldMode
       with OrderDirection
  
  @js.native
  sealed trait DIRECTION_UNSPECIFIED extends OrderDirection
  
  @js.native
  sealed trait EQUAL extends FieldFilterOp
  
  @js.native
  sealed trait ERROR extends IndexState
  
  @js.native
  sealed trait FirstParty
    extends TokenType
       with typings.firebaseFirestore.apiCredentialsMod.TokenType
  
  @js.native
  sealed trait GREATER_THAN extends FieldFilterOp
  
  @js.native
  sealed trait GREATER_THAN_OR_EQUAL extends FieldFilterOp
  
  @js.native
  sealed trait IN extends FieldFilterOp
  
  @js.native
  sealed trait IS_NAN extends UnaryFilterOp
  
  @js.native
  sealed trait IS_NULL extends UnaryFilterOp
  
  @js.native
  sealed trait LESS_THAN extends FieldFilterOp
  
  @js.native
  sealed trait LESS_THAN_OR_EQUAL extends FieldFilterOp
  
  @js.native
  sealed trait LessthansignDELETEGreaterthansign extends js.Object
  
  @js.native
  sealed trait LimitToFirst
    extends SpecLimitType
       with typings.firebaseFirestore.specsSpecTestRunnerMod.SpecLimitType
  
  @js.native
  sealed trait LimitToLast
    extends SpecLimitType
       with typings.firebaseFirestore.specsSpecTestRunnerMod.SpecLimitType
  
  @js.native
  sealed trait MODE_UNSPECIFIED extends IndexFieldMode
  
  @js.native
  sealed trait NO_CHANGE extends TargetChangeTargetChangeType
  
  @js.native
  sealed trait NULL_VALUE extends js.Object
  
  @js.native
  sealed trait OAuth
    extends TokenType
       with typings.firebaseFirestore.apiCredentialsMod.TokenType
  
  @js.native
  sealed trait OPERATOR_UNSPECIFIED
    extends CompositeFilterOp
       with FieldFilterOp
       with UnaryFilterOp
  
  @js.native
  sealed trait Offline
    extends OnlineState
       with typings.firebaseFirestore.coreTypesMod.OnlineState
  
  @js.native
  sealed trait Online
    extends OnlineState
       with typings.firebaseFirestore.coreTypesMod.OnlineState
  
  @js.native
  sealed trait READY extends IndexState
  
  @js.native
  sealed trait REMOVE extends TargetChangeTargetChangeType
  
  @js.native
  sealed trait REQUEST_TIME extends FieldTransformSetToServerValue
  
  @js.native
  sealed trait RESET extends TargetChangeTargetChangeType
  
  @js.native
  sealed trait SERVER_VALUE_UNSPECIFIED extends FieldTransformSetToServerValue
  
  @js.native
  sealed trait STATE_UNSPECIFIED extends IndexState
  
  @js.native
  sealed trait Unknown
    extends OnlineState
       with typings.firebaseFirestore.coreTypesMod.OnlineState
  
  @js.native
  sealed trait __name__ extends js.Object
  
  @js.native
  sealed trait acknowledged
    extends MutationBatchState
       with typings.firebaseFirestore.coreTypesMod.MutationBatchState
  
  @js.native
  sealed trait boolean
    extends ValidationType
       with typings.firebaseFirestore.utilInputValidationMod.ValidationType
  
  @js.native
  sealed trait current_
    extends QueryTargetState
       with typings.firebaseFirestore.sharedClientStateSyncerMod.QueryTargetState
  
  @js.native
  sealed trait firestore_clients extends js.Object
  
  @js.native
  sealed trait firestore_mutations extends js.Object
  
  @js.native
  sealed trait firestore_online_state extends js.Object
  
  @js.native
  sealed trait firestore_sequence_number extends js.Object
  
  @js.native
  sealed trait firestore_targets extends js.Object
  
  @js.native
  sealed trait function
    extends ValidationType
       with typings.firebaseFirestore.utilInputValidationMod.ValidationType
  
  @js.native
  sealed trait gapi extends js.Object
  
  @js.native
  sealed trait json
    extends ProjectsDatabasesDocumentsApiClientAlt
       with ProjectsDatabasesIndexesApiClientAlt
  
  @js.native
  sealed trait media
    extends ProjectsDatabasesDocumentsApiClientAlt
       with ProjectsDatabasesIndexesApiClientAlt
  
  @js.native
  sealed trait `multi-client` extends js.Object
  
  @js.native
  sealed trait `non-empty string`
    extends ValidationType
       with typings.firebaseFirestore.utilInputValidationMod.ValidationType
  
  @js.native
  sealed trait `not-current`
    extends QueryTargetState
       with typings.firebaseFirestore.sharedClientStateSyncerMod.QueryTargetState
  
  @js.native
  sealed trait number
    extends ValidationType
       with typings.firebaseFirestore.utilInputValidationMod.ValidationType
  
  @js.native
  sealed trait `object`
    extends ValidationType
       with typings.firebaseFirestore.utilInputValidationMod.ValidationType
  
  @js.native
  sealed trait pending
    extends MutationBatchState
       with typings.firebaseFirestore.coreTypesMod.MutationBatchState
  
  @js.native
  sealed trait proto
    extends ProjectsDatabasesDocumentsApiClientAlt
       with ProjectsDatabasesIndexesApiClientAlt
  
  @js.native
  sealed trait provider extends js.Object
  
  @js.native
  sealed trait readonly
    extends PersistenceTransactionMode
       with typings.firebaseFirestore.localPersistenceMod.PersistenceTransactionMode
       with SimpleDbTransactionMode
       with typings.firebaseFirestore.localSimpleDbMod.SimpleDbTransactionMode
  
  @js.native
  sealed trait `readonly-idempotent`
    extends PersistenceTransactionMode
       with typings.firebaseFirestore.localPersistenceMod.PersistenceTransactionMode
       with SimpleDbTransactionMode
       with typings.firebaseFirestore.localSimpleDbMod.SimpleDbTransactionMode
  
  @js.native
  sealed trait readwrite
    extends PersistenceTransactionMode
       with typings.firebaseFirestore.localPersistenceMod.PersistenceTransactionMode
       with SimpleDbTransactionMode
       with typings.firebaseFirestore.localSimpleDbMod.SimpleDbTransactionMode
  
  @js.native
  sealed trait `readwrite-idempotent`
    extends PersistenceTransactionMode
       with typings.firebaseFirestore.localPersistenceMod.PersistenceTransactionMode
       with SimpleDbTransactionMode
       with typings.firebaseFirestore.localSimpleDbMod.SimpleDbTransactionMode
  
  @js.native
  sealed trait `readwrite-primary`
    extends PersistenceTransactionMode
       with typings.firebaseFirestore.localPersistenceMod.PersistenceTransactionMode
  
  @js.native
  sealed trait `readwrite-primary-idempotent`
    extends PersistenceTransactionMode
       with typings.firebaseFirestore.localPersistenceMod.PersistenceTransactionMode
  
  @js.native
  sealed trait rejected
    extends MutationBatchState
       with typings.firebaseFirestore.coreTypesMod.MutationBatchState
       with QueryTargetState
       with typings.firebaseFirestore.sharedClientStateSyncerMod.QueryTargetState
  
  @js.native
  sealed trait string
    extends ValidationType
       with typings.firebaseFirestore.utilInputValidationMod.ValidationType
  
  @js.native
  sealed trait `test-db2` extends js.Object
  
  @js.native
  sealed trait undefined
    extends ValidationType
       with typings.firebaseFirestore.utilInputValidationMod.ValidationType
  
  @scala.inline
  def `1`: `1` = "1".asInstanceOf[`1`]
  @scala.inline
  def `2`: `2` = "2".asInstanceOf[`2`]
  @scala.inline
  def ADD: ADD = "ADD".asInstanceOf[ADD]
  @scala.inline
  def AND: AND = "AND".asInstanceOf[AND]
  @scala.inline
  def ARRAY_CONTAINS: ARRAY_CONTAINS = "ARRAY_CONTAINS".asInstanceOf[ARRAY_CONTAINS]
  @scala.inline
  def ARRAY_CONTAINS_ANY: ARRAY_CONTAINS_ANY = "ARRAY_CONTAINS_ANY".asInstanceOf[ARRAY_CONTAINS_ANY]
  @scala.inline
  def ASCENDING: ASCENDING = "ASCENDING".asInstanceOf[ASCENDING]
  @scala.inline
  def CREATING: CREATING = "CREATING".asInstanceOf[CREATING]
  @scala.inline
  def CURRENT: CURRENT = "CURRENT".asInstanceOf[CURRENT]
  @scala.inline
  def DESCENDING: DESCENDING = "DESCENDING".asInstanceOf[DESCENDING]
  @scala.inline
  def DIRECTION_UNSPECIFIED: DIRECTION_UNSPECIFIED = "DIRECTION_UNSPECIFIED".asInstanceOf[DIRECTION_UNSPECIFIED]
  @scala.inline
  def EQUAL: EQUAL = "EQUAL".asInstanceOf[EQUAL]
  @scala.inline
  def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  @scala.inline
  def FirstParty: FirstParty = "FirstParty".asInstanceOf[FirstParty]
  @scala.inline
  def GREATER_THAN: GREATER_THAN = "GREATER_THAN".asInstanceOf[GREATER_THAN]
  @scala.inline
  def GREATER_THAN_OR_EQUAL: GREATER_THAN_OR_EQUAL = "GREATER_THAN_OR_EQUAL".asInstanceOf[GREATER_THAN_OR_EQUAL]
  @scala.inline
  def IN: IN = "IN".asInstanceOf[IN]
  @scala.inline
  def IS_NAN: IS_NAN = "IS_NAN".asInstanceOf[IS_NAN]
  @scala.inline
  def IS_NULL: IS_NULL = "IS_NULL".asInstanceOf[IS_NULL]
  @scala.inline
  def LESS_THAN: LESS_THAN = "LESS_THAN".asInstanceOf[LESS_THAN]
  @scala.inline
  def LESS_THAN_OR_EQUAL: LESS_THAN_OR_EQUAL = "LESS_THAN_OR_EQUAL".asInstanceOf[LESS_THAN_OR_EQUAL]
  @scala.inline
  def LessthansignDELETEGreaterthansign: LessthansignDELETEGreaterthansign = "<DELETE>".asInstanceOf[LessthansignDELETEGreaterthansign]
  @scala.inline
  def LimitToFirst: LimitToFirst = "LimitToFirst".asInstanceOf[LimitToFirst]
  @scala.inline
  def LimitToLast: LimitToLast = "LimitToLast".asInstanceOf[LimitToLast]
  @scala.inline
  def MODE_UNSPECIFIED: MODE_UNSPECIFIED = "MODE_UNSPECIFIED".asInstanceOf[MODE_UNSPECIFIED]
  @scala.inline
  def NO_CHANGE: NO_CHANGE = "NO_CHANGE".asInstanceOf[NO_CHANGE]
  @scala.inline
  def NULL_VALUE: NULL_VALUE = "NULL_VALUE".asInstanceOf[NULL_VALUE]
  @scala.inline
  def OAuth: OAuth = "OAuth".asInstanceOf[OAuth]
  @scala.inline
  def OPERATOR_UNSPECIFIED: OPERATOR_UNSPECIFIED = "OPERATOR_UNSPECIFIED".asInstanceOf[OPERATOR_UNSPECIFIED]
  @scala.inline
  def Offline: Offline = "Offline".asInstanceOf[Offline]
  @scala.inline
  def Online: Online = "Online".asInstanceOf[Online]
  @scala.inline
  def READY: READY = "READY".asInstanceOf[READY]
  @scala.inline
  def REMOVE: REMOVE = "REMOVE".asInstanceOf[REMOVE]
  @scala.inline
  def REQUEST_TIME: REQUEST_TIME = "REQUEST_TIME".asInstanceOf[REQUEST_TIME]
  @scala.inline
  def RESET: RESET = "RESET".asInstanceOf[RESET]
  @scala.inline
  def SERVER_VALUE_UNSPECIFIED: SERVER_VALUE_UNSPECIFIED = "SERVER_VALUE_UNSPECIFIED".asInstanceOf[SERVER_VALUE_UNSPECIFIED]
  @scala.inline
  def STATE_UNSPECIFIED: STATE_UNSPECIFIED = "STATE_UNSPECIFIED".asInstanceOf[STATE_UNSPECIFIED]
  @scala.inline
  def Unknown: Unknown = "Unknown".asInstanceOf[Unknown]
  @scala.inline
  def __name__ : __name__ = "__name__".asInstanceOf[__name__]
  @scala.inline
  def acknowledged: acknowledged = "acknowledged".asInstanceOf[acknowledged]
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  @scala.inline
  def current_ : current_ = "current".asInstanceOf[current_]
  @scala.inline
  def firestore_clients: firestore_clients = "firestore_clients".asInstanceOf[firestore_clients]
  @scala.inline
  def firestore_mutations: firestore_mutations = "firestore_mutations".asInstanceOf[firestore_mutations]
  @scala.inline
  def firestore_online_state: firestore_online_state = "firestore_online_state".asInstanceOf[firestore_online_state]
  @scala.inline
  def firestore_sequence_number: firestore_sequence_number = "firestore_sequence_number".asInstanceOf[firestore_sequence_number]
  @scala.inline
  def firestore_targets: firestore_targets = "firestore_targets".asInstanceOf[firestore_targets]
  @scala.inline
  def function: function = "function".asInstanceOf[function]
  @scala.inline
  def gapi: gapi = "gapi".asInstanceOf[gapi]
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  @scala.inline
  def media: media = "media".asInstanceOf[media]
  @scala.inline
  def `multi-client`: `multi-client` = "multi-client".asInstanceOf[`multi-client`]
  @scala.inline
  def `non-empty string`: `non-empty string` = "non-empty string".asInstanceOf[`non-empty string`]
  @scala.inline
  def `not-current`: `not-current` = "not-current".asInstanceOf[`not-current`]
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  @scala.inline
  def `object`: `object` = "object".asInstanceOf[`object`]
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  @scala.inline
  def proto: proto = "proto".asInstanceOf[proto]
  @scala.inline
  def provider: provider = "provider".asInstanceOf[provider]
  @scala.inline
  def readonly: readonly = "readonly".asInstanceOf[readonly]
  @scala.inline
  def `readonly-idempotent`: `readonly-idempotent` = "readonly-idempotent".asInstanceOf[`readonly-idempotent`]
  @scala.inline
  def readwrite: readwrite = "readwrite".asInstanceOf[readwrite]
  @scala.inline
  def `readwrite-idempotent`: `readwrite-idempotent` = "readwrite-idempotent".asInstanceOf[`readwrite-idempotent`]
  @scala.inline
  def `readwrite-primary`: `readwrite-primary` = "readwrite-primary".asInstanceOf[`readwrite-primary`]
  @scala.inline
  def `readwrite-primary-idempotent`: `readwrite-primary-idempotent` = "readwrite-primary-idempotent".asInstanceOf[`readwrite-primary-idempotent`]
  @scala.inline
  def rejected: rejected = "rejected".asInstanceOf[rejected]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def `test-db2`: `test-db2` = "test-db2".asInstanceOf[`test-db2`]
  @scala.inline
  def undefined: undefined = "undefined".asInstanceOf[undefined]
}

