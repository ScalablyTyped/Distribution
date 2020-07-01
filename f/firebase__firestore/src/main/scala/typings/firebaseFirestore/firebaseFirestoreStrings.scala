package typings.firebaseFirestore

import typings.firebaseFirestore.asyncQueueMod.TimerId
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
import typings.firebaseFirestore.persistenceMod.PersistenceTransactionMode
import typings.firebaseFirestore.queryMod.Direction
import typings.firebaseFirestore.queryMod.LimitType
import typings.firebaseFirestore.queryMod.Operator
import typings.firebaseFirestore.sharedClientStateSyncerMod.QueryTargetState
import typings.firebaseFirestore.simpleDbMod.SimpleDbTransactionMode
import typings.firebaseFirestore.specTestRunnerMod.PersistenceAction
import typings.firebaseFirestore.specTestRunnerMod.SpecLimitType
import typings.firebaseFirestore.streamTestMod.StreamEventType
import typings.firebaseFirestore.typesMod.MutationBatchState
import typings.firebaseFirestore.typesMod.OnlineState
import typings.firebaseFirestore.userDataWriterMod.ServerTimestampBehavior
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
  sealed trait `Acknowledge batch` extends PersistenceAction
  
  @js.native
  sealed trait `Allocate target` extends PersistenceAction
  
  @js.native
  sealed trait `Apply remote event` extends PersistenceAction
  
  @js.native
  sealed trait CREATING extends IndexState
  
  @js.native
  sealed trait CURRENT extends TargetChangeTargetChangeType
  
  @js.native
  sealed trait `Collect garbage` extends PersistenceAction
  
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
  sealed trait EqualssignEqualssign extends Operator
  
  @js.native
  sealed trait `Execute query` extends PersistenceAction
  
  @js.native
  sealed trait F extends LimitType
  
  @js.native
  sealed trait FirstParty extends TokenType
  
  @js.native
  sealed trait GREATER_THAN extends FieldFilterOp
  
  @js.native
  sealed trait GREATER_THAN_OR_EQUAL extends FieldFilterOp
  
  @js.native
  sealed trait `Get highest unacknowledged batch id` extends PersistenceAction
  
  @js.native
  sealed trait `Get last remote snapshot version` extends PersistenceAction
  
  @js.native
  sealed trait `Get last stream token` extends PersistenceAction
  
  @js.native
  sealed trait `Get new document changes` extends PersistenceAction
  
  @js.native
  sealed trait `Get next mutation batch` extends PersistenceAction
  
  @js.native
  sealed trait `Get target data` extends PersistenceAction
  
  @js.native
  sealed trait Greaterthansign extends Operator
  
  @js.native
  sealed trait GreaterthansignEqualssign extends Operator
  
  @js.native
  sealed trait `Handle user change` extends PersistenceAction
  
  @js.native
  sealed trait IN extends FieldFilterOp
  
  @js.native
  sealed trait IS_NAN extends UnaryFilterOp
  
  @js.native
  sealed trait IS_NULL extends UnaryFilterOp
  
  @js.native
  sealed trait L extends LimitType
  
  @js.native
  sealed trait LESS_THAN extends FieldFilterOp
  
  @js.native
  sealed trait LESS_THAN_OR_EQUAL extends FieldFilterOp
  
  @js.native
  sealed trait Lessthansign extends Operator
  
  @js.native
  sealed trait LessthansignEqualssign extends Operator
  
  @js.native
  sealed trait LimitToFirst extends SpecLimitType
  
  @js.native
  sealed trait LimitToLast extends SpecLimitType
  
  @js.native
  sealed trait `Locally write mutations` extends PersistenceAction
  
  @js.native
  sealed trait `Lookup mutation documents` extends PersistenceAction
  
  @js.native
  sealed trait MODE_UNSPECIFIED extends IndexFieldMode
  
  @js.native
  sealed trait NO_CHANGE extends TargetChangeTargetChangeType
  
  @js.native
  sealed trait NULL_VALUE extends js.Object
  
  @js.native
  sealed trait NaN extends js.Object
  
  @js.native
  sealed trait OAuth extends TokenType
  
  @js.native
  sealed trait OPERATOR_UNSPECIFIED
    extends CompositeFilterOp
       with FieldFilterOp
       with UnaryFilterOp
  
  @js.native
  sealed trait Offline extends OnlineState
  
  @js.native
  sealed trait Online extends OnlineState
  
  @js.native
  sealed trait READY extends IndexState
  
  @js.native
  sealed trait REMOVE extends TargetChangeTargetChangeType
  
  @js.native
  sealed trait REQUEST_TIME extends FieldTransformSetToServerValue
  
  @js.native
  sealed trait RESET extends TargetChangeTargetChangeType
  
  @js.native
  sealed trait `Reject batch` extends PersistenceAction
  
  @js.native
  sealed trait `Release target` extends PersistenceAction
  
  @js.native
  sealed trait `Remote document keys` extends PersistenceAction
  
  @js.native
  sealed trait SERVER_VALUE_UNSPECIFIED extends FieldTransformSetToServerValue
  
  @js.native
  sealed trait STATE_UNSPECIFIED extends IndexState
  
  @js.native
  sealed trait `Set last remote snapshot version` extends PersistenceAction
  
  @js.native
  sealed trait `Set last stream token` extends PersistenceAction
  
  @js.native
  sealed trait `Synchronize last document change read time` extends PersistenceAction
  
  @js.native
  sealed trait Unknown extends OnlineState
  
  @js.native
  sealed trait acknowledged extends MutationBatchState
  
  @js.native
  sealed trait all extends TimerId
  
  @js.native
  sealed trait `array-contains` extends Operator
  
  @js.native
  sealed trait `array-contains-any` extends Operator
  
  @js.native
  sealed trait asc extends Direction
  
  @js.native
  sealed trait async_queue_retry extends TimerId
  
  @js.native
  sealed trait boolean extends ValidationType
  
  @js.native
  sealed trait client_metadata_refresh extends TimerId
  
  @js.native
  sealed trait close extends StreamEventType
  
  @js.native
  sealed trait current_ extends QueryTargetState
  
  @js.native
  sealed trait desc extends Direction
  
  @js.native
  sealed trait estimate extends ServerTimestampBehavior
  
  @js.native
  sealed trait function extends ValidationType
  
  @js.native
  sealed trait gapi extends js.Object
  
  @js.native
  sealed trait getHighestListenSequenceNumber extends PersistenceAction
  
  @js.native
  sealed trait handshakeComplete extends StreamEventType
  
  @js.native
  sealed trait in_ extends Operator
  
  @js.native
  sealed trait json
    extends ProjectsDatabasesDocumentsApiClientAlt
       with ProjectsDatabasesIndexesApiClientAlt
  
  @js.native
  sealed trait listen_stream_connection_backoff extends TimerId
  
  @js.native
  sealed trait listen_stream_idle extends TimerId
  
  @js.native
  sealed trait lru_garbage_collection extends TimerId
  
  @js.native
  sealed trait maybeGarbageCollectMultiClientState extends PersistenceAction
  
  @js.native
  sealed trait media
    extends ProjectsDatabasesDocumentsApiClientAlt
       with ProjectsDatabasesIndexesApiClientAlt
  
  @js.native
  sealed trait mutationResult extends StreamEventType
  
  @js.native
  sealed trait `non-empty string` extends ValidationType
  
  @js.native
  sealed trait none extends ServerTimestampBehavior
  
  @js.native
  sealed trait `not-current` extends QueryTargetState
  
  @js.native
  sealed trait notifyLocalViewChanges extends PersistenceAction
  
  @js.native
  sealed trait number extends ValidationType
  
  @js.native
  sealed trait `object` extends ValidationType
  
  @js.native
  sealed trait online_state_timeout extends TimerId
  
  @js.native
  sealed trait open extends StreamEventType
  
  @js.native
  sealed trait pending extends MutationBatchState
  
  @js.native
  sealed trait previous extends ServerTimestampBehavior
  
  @js.native
  sealed trait proto
    extends ProjectsDatabasesDocumentsApiClientAlt
       with ProjectsDatabasesIndexesApiClientAlt
  
  @js.native
  sealed trait provider extends js.Object
  
  @js.native
  sealed trait `read document` extends PersistenceAction
  
  @js.native
  sealed trait readonly
    extends PersistenceTransactionMode
       with SimpleDbTransactionMode
  
  @js.native
  sealed trait readwrite
    extends PersistenceTransactionMode
       with SimpleDbTransactionMode
  
  @js.native
  sealed trait `readwrite-primary` extends PersistenceTransactionMode
  
  @js.native
  sealed trait rejected
    extends MutationBatchState
       with QueryTargetState
  
  @js.native
  sealed trait string extends ValidationType
  
  @js.native
  sealed trait transaction_retry extends TimerId
  
  @js.native
  sealed trait undefined extends ValidationType
  
  @js.native
  sealed trait updateClientMetadataAndTryBecomePrimary extends PersistenceAction
  
  @js.native
  sealed trait watchChange extends StreamEventType
  
  @js.native
  sealed trait write_stream_connection_backoff extends TimerId
  
  @js.native
  sealed trait write_stream_idle extends TimerId
  
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
  def `Acknowledge batch`: `Acknowledge batch` = ("Acknowledge batch").asInstanceOf[`Acknowledge batch`]
  @scala.inline
  def `Allocate target`: `Allocate target` = ("Allocate target").asInstanceOf[`Allocate target`]
  @scala.inline
  def `Apply remote event`: `Apply remote event` = ("Apply remote event").asInstanceOf[`Apply remote event`]
  @scala.inline
  def CREATING: CREATING = "CREATING".asInstanceOf[CREATING]
  @scala.inline
  def CURRENT: CURRENT = "CURRENT".asInstanceOf[CURRENT]
  @scala.inline
  def `Collect garbage`: `Collect garbage` = ("Collect garbage").asInstanceOf[`Collect garbage`]
  @scala.inline
  def DESCENDING: DESCENDING = "DESCENDING".asInstanceOf[DESCENDING]
  @scala.inline
  def DIRECTION_UNSPECIFIED: DIRECTION_UNSPECIFIED = "DIRECTION_UNSPECIFIED".asInstanceOf[DIRECTION_UNSPECIFIED]
  @scala.inline
  def EQUAL: EQUAL = "EQUAL".asInstanceOf[EQUAL]
  @scala.inline
  def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  @scala.inline
  def EqualssignEqualssign: EqualssignEqualssign = "==".asInstanceOf[EqualssignEqualssign]
  @scala.inline
  def `Execute query`: `Execute query` = ("Execute query").asInstanceOf[`Execute query`]
  @scala.inline
  def F: F = "F".asInstanceOf[F]
  @scala.inline
  def FirstParty: FirstParty = "FirstParty".asInstanceOf[FirstParty]
  @scala.inline
  def GREATER_THAN: GREATER_THAN = "GREATER_THAN".asInstanceOf[GREATER_THAN]
  @scala.inline
  def GREATER_THAN_OR_EQUAL: GREATER_THAN_OR_EQUAL = "GREATER_THAN_OR_EQUAL".asInstanceOf[GREATER_THAN_OR_EQUAL]
  @scala.inline
  def `Get highest unacknowledged batch id`: `Get highest unacknowledged batch id` = ("Get highest unacknowledged batch id").asInstanceOf[`Get highest unacknowledged batch id`]
  @scala.inline
  def `Get last remote snapshot version`: `Get last remote snapshot version` = ("Get last remote snapshot version").asInstanceOf[`Get last remote snapshot version`]
  @scala.inline
  def `Get last stream token`: `Get last stream token` = ("Get last stream token").asInstanceOf[`Get last stream token`]
  @scala.inline
  def `Get new document changes`: `Get new document changes` = ("Get new document changes").asInstanceOf[`Get new document changes`]
  @scala.inline
  def `Get next mutation batch`: `Get next mutation batch` = ("Get next mutation batch").asInstanceOf[`Get next mutation batch`]
  @scala.inline
  def `Get target data`: `Get target data` = ("Get target data").asInstanceOf[`Get target data`]
  @scala.inline
  def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  @scala.inline
  def GreaterthansignEqualssign: GreaterthansignEqualssign = ">=".asInstanceOf[GreaterthansignEqualssign]
  @scala.inline
  def `Handle user change`: `Handle user change` = ("Handle user change").asInstanceOf[`Handle user change`]
  @scala.inline
  def IN: IN = "IN".asInstanceOf[IN]
  @scala.inline
  def IS_NAN: IS_NAN = "IS_NAN".asInstanceOf[IS_NAN]
  @scala.inline
  def IS_NULL: IS_NULL = "IS_NULL".asInstanceOf[IS_NULL]
  @scala.inline
  def L: L = "L".asInstanceOf[L]
  @scala.inline
  def LESS_THAN: LESS_THAN = "LESS_THAN".asInstanceOf[LESS_THAN]
  @scala.inline
  def LESS_THAN_OR_EQUAL: LESS_THAN_OR_EQUAL = "LESS_THAN_OR_EQUAL".asInstanceOf[LESS_THAN_OR_EQUAL]
  @scala.inline
  def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  @scala.inline
  def LessthansignEqualssign: LessthansignEqualssign = "<=".asInstanceOf[LessthansignEqualssign]
  @scala.inline
  def LimitToFirst: LimitToFirst = "LimitToFirst".asInstanceOf[LimitToFirst]
  @scala.inline
  def LimitToLast: LimitToLast = "LimitToLast".asInstanceOf[LimitToLast]
  @scala.inline
  def `Locally write mutations`: `Locally write mutations` = ("Locally write mutations").asInstanceOf[`Locally write mutations`]
  @scala.inline
  def `Lookup mutation documents`: `Lookup mutation documents` = ("Lookup mutation documents").asInstanceOf[`Lookup mutation documents`]
  @scala.inline
  def MODE_UNSPECIFIED: MODE_UNSPECIFIED = "MODE_UNSPECIFIED".asInstanceOf[MODE_UNSPECIFIED]
  @scala.inline
  def NO_CHANGE: NO_CHANGE = "NO_CHANGE".asInstanceOf[NO_CHANGE]
  @scala.inline
  def NULL_VALUE: NULL_VALUE = "NULL_VALUE".asInstanceOf[NULL_VALUE]
  @scala.inline
  def NaN: NaN = "NaN".asInstanceOf[NaN]
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
  def `Reject batch`: `Reject batch` = ("Reject batch").asInstanceOf[`Reject batch`]
  @scala.inline
  def `Release target`: `Release target` = ("Release target").asInstanceOf[`Release target`]
  @scala.inline
  def `Remote document keys`: `Remote document keys` = ("Remote document keys").asInstanceOf[`Remote document keys`]
  @scala.inline
  def SERVER_VALUE_UNSPECIFIED: SERVER_VALUE_UNSPECIFIED = "SERVER_VALUE_UNSPECIFIED".asInstanceOf[SERVER_VALUE_UNSPECIFIED]
  @scala.inline
  def STATE_UNSPECIFIED: STATE_UNSPECIFIED = "STATE_UNSPECIFIED".asInstanceOf[STATE_UNSPECIFIED]
  @scala.inline
  def `Set last remote snapshot version`: `Set last remote snapshot version` = ("Set last remote snapshot version").asInstanceOf[`Set last remote snapshot version`]
  @scala.inline
  def `Set last stream token`: `Set last stream token` = ("Set last stream token").asInstanceOf[`Set last stream token`]
  @scala.inline
  def `Synchronize last document change read time`: `Synchronize last document change read time` = ("Synchronize last document change read time").asInstanceOf[`Synchronize last document change read time`]
  @scala.inline
  def Unknown: Unknown = "Unknown".asInstanceOf[Unknown]
  @scala.inline
  def acknowledged: acknowledged = "acknowledged".asInstanceOf[acknowledged]
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def `array-contains`: `array-contains` = "array-contains".asInstanceOf[`array-contains`]
  @scala.inline
  def `array-contains-any`: `array-contains-any` = "array-contains-any".asInstanceOf[`array-contains-any`]
  @scala.inline
  def asc: asc = "asc".asInstanceOf[asc]
  @scala.inline
  def async_queue_retry: async_queue_retry = "async_queue_retry".asInstanceOf[async_queue_retry]
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  @scala.inline
  def client_metadata_refresh: client_metadata_refresh = "client_metadata_refresh".asInstanceOf[client_metadata_refresh]
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  @scala.inline
  def current_ : current_ = "current".asInstanceOf[current_]
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
  @scala.inline
  def estimate: estimate = "estimate".asInstanceOf[estimate]
  @scala.inline
  def function: function = "function".asInstanceOf[function]
  @scala.inline
  def gapi: gapi = "gapi".asInstanceOf[gapi]
  @scala.inline
  def getHighestListenSequenceNumber: getHighestListenSequenceNumber = "getHighestListenSequenceNumber".asInstanceOf[getHighestListenSequenceNumber]
  @scala.inline
  def handshakeComplete: handshakeComplete = "handshakeComplete".asInstanceOf[handshakeComplete]
  @scala.inline
  def in_ : in_ = "in".asInstanceOf[in_]
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  @scala.inline
  def listen_stream_connection_backoff: listen_stream_connection_backoff = "listen_stream_connection_backoff".asInstanceOf[listen_stream_connection_backoff]
  @scala.inline
  def listen_stream_idle: listen_stream_idle = "listen_stream_idle".asInstanceOf[listen_stream_idle]
  @scala.inline
  def lru_garbage_collection: lru_garbage_collection = "lru_garbage_collection".asInstanceOf[lru_garbage_collection]
  @scala.inline
  def maybeGarbageCollectMultiClientState: maybeGarbageCollectMultiClientState = "maybeGarbageCollectMultiClientState".asInstanceOf[maybeGarbageCollectMultiClientState]
  @scala.inline
  def media: media = "media".asInstanceOf[media]
  @scala.inline
  def mutationResult: mutationResult = "mutationResult".asInstanceOf[mutationResult]
  @scala.inline
  def `non-empty string`: `non-empty string` = ("non-empty string").asInstanceOf[`non-empty string`]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def `not-current`: `not-current` = "not-current".asInstanceOf[`not-current`]
  @scala.inline
  def notifyLocalViewChanges: notifyLocalViewChanges = "notifyLocalViewChanges".asInstanceOf[notifyLocalViewChanges]
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  @scala.inline
  def `object`: `object` = "object".asInstanceOf[`object`]
  @scala.inline
  def online_state_timeout: online_state_timeout = "online_state_timeout".asInstanceOf[online_state_timeout]
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  @scala.inline
  def previous: previous = "previous".asInstanceOf[previous]
  @scala.inline
  def proto: proto = "proto".asInstanceOf[proto]
  @scala.inline
  def provider: provider = "provider".asInstanceOf[provider]
  @scala.inline
  def `read document`: `read document` = ("read document").asInstanceOf[`read document`]
  @scala.inline
  def readonly: readonly = "readonly".asInstanceOf[readonly]
  @scala.inline
  def readwrite: readwrite = "readwrite".asInstanceOf[readwrite]
  @scala.inline
  def `readwrite-primary`: `readwrite-primary` = "readwrite-primary".asInstanceOf[`readwrite-primary`]
  @scala.inline
  def rejected: rejected = "rejected".asInstanceOf[rejected]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def transaction_retry: transaction_retry = "transaction_retry".asInstanceOf[transaction_retry]
  @scala.inline
  def undefined: undefined = "undefined".asInstanceOf[undefined]
  @scala.inline
  def updateClientMetadataAndTryBecomePrimary: updateClientMetadataAndTryBecomePrimary = "updateClientMetadataAndTryBecomePrimary".asInstanceOf[updateClientMetadataAndTryBecomePrimary]
  @scala.inline
  def watchChange: watchChange = "watchChange".asInstanceOf[watchChange]
  @scala.inline
  def write_stream_connection_backoff: write_stream_connection_backoff = "write_stream_connection_backoff".asInstanceOf[write_stream_connection_backoff]
  @scala.inline
  def write_stream_idle: write_stream_idle = "write_stream_idle".asInstanceOf[write_stream_idle]
}

