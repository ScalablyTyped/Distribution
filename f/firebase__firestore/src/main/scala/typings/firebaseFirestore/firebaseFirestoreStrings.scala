package typings.firebaseFirestore

import typings.firebaseFirestore.distFirestoreSrcCoreQueryMod.LimitType
import typings.firebaseFirestore.distFirestoreSrcCoreTypesMod.MutationBatchState
import typings.firebaseFirestore.distFirestoreSrcCoreTypesMod.OnlineState
import typings.firebaseFirestore.distFirestoreSrcUtilInputValidationMod.ValidationType
import typings.firebaseFirestore.distInternalMod.LimitType2
import typings.firebaseFirestore.distInternalMod.QueryTargetState
import typings.firebaseFirestore.distLiteFirestoreSrcCoreTargetMod.Operator
import typings.firebaseFirestore.distLiteFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransactionMode
import typings.firebaseFirestore.distLiteFirestoreSrcLocalSimpleDbMod.SimpleDbTransactionMode
import typings.firebaseFirestore.distLiteFirestoreSrcUtilErrorMod.FirestoreErrorCode
import typings.firebaseFirestore.distLiteFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
import typings.firebaseFirestore.distLiteFirestoreTestUnitSpecsSpecTestRunnerMod.SpecLimitType
import typings.firebaseFirestore.distLiteInternalMod.Direction
import typings.firebaseFirestore.distLiteInternalMod.ServerTimestampBehavior
import typings.firebaseFirestore.distLiteInternalMod.TokenType
import typings.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.CompositeFilterOp
import typings.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
import typings.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.FieldTransformSetToServerValue
import typings.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.IndexFieldMode
import typings.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.IndexState
import typings.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.OrderDirection
import typings.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientAlt
import typings.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientXgafv
import typings.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientAlt
import typings.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientXgafv
import typings.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.TargetChangeTargetChangeType
import typings.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.UnaryFilterOp
import typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilAsyncQueueMod.TimerId
import typings.firebaseFirestore.distPackagesFirestoreTestIntegrationRemoteStreamDottestMod.StreamEventType
import typings.firebaseFirestore.mod.DocumentChangeType
import typings.firebaseFirestore.mod.OrderByDirection
import typings.firebaseFirestore.mod.QueryConstraintType
import typings.firebaseFirestore.mod.TaskState
import typings.firebaseFirestore.mod.WhereFilterOp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseFirestoreStrings {
  
  @js.native
  sealed trait `1`
    extends StObject
       with ProjectsDatabasesDocumentsApiClientXgafv
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientXgafv
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientXgafv
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientXgafv
       with ProjectsDatabasesIndexesApiClientXgafv
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientXgafv
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientXgafv
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientXgafv
  inline def `1`: `1` = "1".asInstanceOf[`1`]
  
  @js.native
  sealed trait `2`
    extends StObject
       with ProjectsDatabasesDocumentsApiClientXgafv
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientXgafv
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientXgafv
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientXgafv
       with ProjectsDatabasesIndexesApiClientXgafv
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientXgafv
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientXgafv
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientXgafv
  inline def `2`: `2` = "2".asInstanceOf[`2`]
  
  @js.native
  sealed trait ADD
    extends StObject
       with TargetChangeTargetChangeType
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.TargetChangeTargetChangeType
       with typings.firebaseFirestore.distLiteInternalMod.TargetChangeTargetChangeType
       with typings.firebaseFirestore.distInternalMod.TargetChangeTargetChangeType
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.TargetChangeTargetChangeType
       with typings.firebaseFirestore.distLitePrivateMod.TargetChangeTargetChangeType
       with typings.firebaseFirestore.distPrivateMod.TargetChangeTargetChangeType
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.TargetChangeTargetChangeType
  inline def ADD: ADD = "ADD".asInstanceOf[ADD]
  
  @js.native
  sealed trait AND
    extends StObject
       with CompositeFilterOp
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.CompositeFilterOp
       with typings.firebaseFirestore.distLiteInternalMod.CompositeFilterOp
       with typings.firebaseFirestore.distInternalMod.CompositeFilterOp
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.CompositeFilterOp
       with typings.firebaseFirestore.distLitePrivateMod.CompositeFilterOp
       with typings.firebaseFirestore.distPrivateMod.CompositeFilterOp
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.CompositeFilterOp
  inline def AND: AND = "AND".asInstanceOf[AND]
  
  @js.native
  sealed trait ARRAY_CONTAINS
    extends StObject
       with FieldFilterOp
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typings.firebaseFirestore.distLiteInternalMod.FieldFilterOp
       with typings.firebaseFirestore.distInternalMod.FieldFilterOp
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typings.firebaseFirestore.distLitePrivateMod.FieldFilterOp
       with typings.firebaseFirestore.distPrivateMod.FieldFilterOp
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
  inline def ARRAY_CONTAINS: ARRAY_CONTAINS = "ARRAY_CONTAINS".asInstanceOf[ARRAY_CONTAINS]
  
  @js.native
  sealed trait ARRAY_CONTAINS_ANY
    extends StObject
       with FieldFilterOp
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typings.firebaseFirestore.distLiteInternalMod.FieldFilterOp
       with typings.firebaseFirestore.distInternalMod.FieldFilterOp
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typings.firebaseFirestore.distLitePrivateMod.FieldFilterOp
       with typings.firebaseFirestore.distPrivateMod.FieldFilterOp
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
  inline def ARRAY_CONTAINS_ANY: ARRAY_CONTAINS_ANY = "ARRAY_CONTAINS_ANY".asInstanceOf[ARRAY_CONTAINS_ANY]
  
  @js.native
  sealed trait ASCENDING
    extends StObject
       with IndexFieldMode
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.IndexFieldMode
       with typings.firebaseFirestore.distLiteInternalMod.IndexFieldMode
       with typings.firebaseFirestore.distInternalMod.IndexFieldMode
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.IndexFieldMode
       with typings.firebaseFirestore.distLitePrivateMod.IndexFieldMode
       with typings.firebaseFirestore.distPrivateMod.IndexFieldMode
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.IndexFieldMode
       with OrderDirection
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.OrderDirection
       with typings.firebaseFirestore.distLiteInternalMod.OrderDirection
       with typings.firebaseFirestore.distInternalMod.OrderDirection
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.OrderDirection
       with typings.firebaseFirestore.distLitePrivateMod.OrderDirection
       with typings.firebaseFirestore.distPrivateMod.OrderDirection
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.OrderDirection
  inline def ASCENDING: ASCENDING = "ASCENDING".asInstanceOf[ASCENDING]
  
  @js.native
  sealed trait `Acknowledge batch`
    extends StObject
       with PersistenceAction
       with typings.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Acknowledge batch`: `Acknowledge batch` = ("Acknowledge batch").asInstanceOf[`Acknowledge batch`]
  
  @js.native
  sealed trait `Allocate target`
    extends StObject
       with PersistenceAction
       with typings.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Allocate target`: `Allocate target` = ("Allocate target").asInstanceOf[`Allocate target`]
  
  @js.native
  sealed trait AppCheck
    extends StObject
       with TokenType
       with typings.firebaseFirestore.distFirestoreSrcApiCredentialsMod.TokenType
       with typings.firebaseFirestore.distInternalMod.TokenType
       with typings.firebaseFirestore.distLitePrivateMod.TokenType
       with typings.firebaseFirestore.distPrivateMod.TokenType
       with typings.firebaseFirestore.distPackagesFirestoreSrcApiCredentialsMod.TokenType
       with typings.firebaseFirestore.distLiteFirestoreSrcApiCredentialsMod.TokenType
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcApiCredentialsMod.TokenType
  inline def AppCheck: AppCheck = "AppCheck".asInstanceOf[AppCheck]
  
  @js.native
  sealed trait `Apply remote event`
    extends StObject
       with PersistenceAction
       with typings.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Apply remote event`: `Apply remote event` = ("Apply remote event").asInstanceOf[`Apply remote event`]
  
  @js.native
  sealed trait CONTAINS extends StObject
  inline def CONTAINS: CONTAINS = "CONTAINS".asInstanceOf[CONTAINS]
  
  @js.native
  sealed trait CREATING
    extends StObject
       with IndexState
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.IndexState
       with typings.firebaseFirestore.distLiteInternalMod.IndexState
       with typings.firebaseFirestore.distInternalMod.IndexState
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.IndexState
       with typings.firebaseFirestore.distLitePrivateMod.IndexState
       with typings.firebaseFirestore.distPrivateMod.IndexState
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.IndexState
  inline def CREATING: CREATING = "CREATING".asInstanceOf[CREATING]
  
  @js.native
  sealed trait CURRENT
    extends StObject
       with TargetChangeTargetChangeType
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.TargetChangeTargetChangeType
       with typings.firebaseFirestore.distLiteInternalMod.TargetChangeTargetChangeType
       with typings.firebaseFirestore.distInternalMod.TargetChangeTargetChangeType
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.TargetChangeTargetChangeType
       with typings.firebaseFirestore.distLitePrivateMod.TargetChangeTargetChangeType
       with typings.firebaseFirestore.distPrivateMod.TargetChangeTargetChangeType
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.TargetChangeTargetChangeType
  inline def CURRENT: CURRENT = "CURRENT".asInstanceOf[CURRENT]
  
  @js.native
  sealed trait `Collect garbage`
    extends StObject
       with PersistenceAction
       with typings.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Collect garbage`: `Collect garbage` = ("Collect garbage").asInstanceOf[`Collect garbage`]
  
  @js.native
  sealed trait DESCENDING
    extends StObject
       with IndexFieldMode
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.IndexFieldMode
       with typings.firebaseFirestore.distLiteInternalMod.IndexFieldMode
       with typings.firebaseFirestore.distInternalMod.IndexFieldMode
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.IndexFieldMode
       with typings.firebaseFirestore.distLitePrivateMod.IndexFieldMode
       with typings.firebaseFirestore.distPrivateMod.IndexFieldMode
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.IndexFieldMode
       with OrderDirection
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.OrderDirection
       with typings.firebaseFirestore.distLiteInternalMod.OrderDirection
       with typings.firebaseFirestore.distInternalMod.OrderDirection
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.OrderDirection
       with typings.firebaseFirestore.distLitePrivateMod.OrderDirection
       with typings.firebaseFirestore.distPrivateMod.OrderDirection
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.OrderDirection
  inline def DESCENDING: DESCENDING = "DESCENDING".asInstanceOf[DESCENDING]
  
  @js.native
  sealed trait DIRECTION_UNSPECIFIED
    extends StObject
       with OrderDirection
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.OrderDirection
       with typings.firebaseFirestore.distLiteInternalMod.OrderDirection
       with typings.firebaseFirestore.distInternalMod.OrderDirection
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.OrderDirection
       with typings.firebaseFirestore.distLitePrivateMod.OrderDirection
       with typings.firebaseFirestore.distPrivateMod.OrderDirection
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.OrderDirection
  inline def DIRECTION_UNSPECIFIED: DIRECTION_UNSPECIFIED = "DIRECTION_UNSPECIFIED".asInstanceOf[DIRECTION_UNSPECIFIED]
  
  @js.native
  sealed trait EQUAL
    extends StObject
       with FieldFilterOp
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typings.firebaseFirestore.distLiteInternalMod.FieldFilterOp
       with typings.firebaseFirestore.distInternalMod.FieldFilterOp
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typings.firebaseFirestore.distLitePrivateMod.FieldFilterOp
       with typings.firebaseFirestore.distPrivateMod.FieldFilterOp
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
  inline def EQUAL: EQUAL = "EQUAL".asInstanceOf[EQUAL]
  
  @js.native
  sealed trait ERROR
    extends StObject
       with IndexState
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.IndexState
       with typings.firebaseFirestore.distLiteInternalMod.IndexState
       with typings.firebaseFirestore.distInternalMod.IndexState
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.IndexState
       with typings.firebaseFirestore.distLitePrivateMod.IndexState
       with typings.firebaseFirestore.distPrivateMod.IndexState
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.IndexState
  inline def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait EqualssignEqualssign
    extends StObject
       with Operator
       with typings.firebaseFirestore.distPackagesFirestoreSrcCoreTargetMod.Operator
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreTargetMod.Operator
       with typings.firebaseFirestore.distFirestoreSrcCoreTargetMod.Operator
       with WhereFilterOp
       with typings.firebaseFirestore.distLiteInternalMod.WhereFilterOp
       with typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typings.firebaseFirestore.distInternalMod.WhereFilterOp
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typings.firebaseFirestore.distLiteMod.WhereFilterOp
       with typings.firebaseFirestore.distLitePrivateMod.WhereFilterOp
       with typings.firebaseFirestore.distPrivateMod.WhereFilterOp
       with typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
  inline def EqualssignEqualssign: EqualssignEqualssign = "==".asInstanceOf[EqualssignEqualssign]
  
  @js.native
  sealed trait Error_
    extends StObject
       with TaskState
       with typings.firebaseFirestore.distInternalMod.TaskState
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcApiBundleMod.TaskState
       with typings.firebaseFirestore.distFirestoreSrcApiBundleMod.TaskState
       with typings.firebaseFirestore.distPrivateMod.TaskState
       with typings.firebaseFirestore.distLiteFirestoreSrcApiBundleMod.TaskState
       with typings.firebaseFirestore.distPackagesFirestoreSrcApiBundleMod.TaskState
  inline def Error_ : Error_ = "Error".asInstanceOf[Error_]
  
  @js.native
  sealed trait ExclamationmarkEqualssign
    extends StObject
       with Operator
       with typings.firebaseFirestore.distPackagesFirestoreSrcCoreTargetMod.Operator
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreTargetMod.Operator
       with typings.firebaseFirestore.distFirestoreSrcCoreTargetMod.Operator
       with WhereFilterOp
       with typings.firebaseFirestore.distLiteInternalMod.WhereFilterOp
       with typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typings.firebaseFirestore.distInternalMod.WhereFilterOp
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typings.firebaseFirestore.distLiteMod.WhereFilterOp
       with typings.firebaseFirestore.distLitePrivateMod.WhereFilterOp
       with typings.firebaseFirestore.distPrivateMod.WhereFilterOp
       with typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
  inline def ExclamationmarkEqualssign: ExclamationmarkEqualssign = "!=".asInstanceOf[ExclamationmarkEqualssign]
  
  @js.native
  sealed trait `Execute query`
    extends StObject
       with PersistenceAction
       with typings.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Execute query`: `Execute query` = ("Execute query").asInstanceOf[`Execute query`]
  
  @js.native
  sealed trait F
    extends StObject
       with LimitType
       with typings.firebaseFirestore.distLiteInternalMod.LimitType
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreQueryMod.LimitType
       with typings.firebaseFirestore.distInternalMod.LimitType
       with typings.firebaseFirestore.distLitePrivateMod.LimitType
       with typings.firebaseFirestore.distLiteFirestoreSrcCoreQueryMod.LimitType
       with typings.firebaseFirestore.distPrivateMod.LimitType
       with typings.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.LimitType
  inline def F: F = "F".asInstanceOf[F]
  
  @js.native
  sealed trait FIRST
    extends StObject
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreBundleProtoMod.LimitType
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreBundleProtoMod.LimitType
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreBundleProtoMod.LimitType
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreBundleProtoMod.LimitType
       with LimitType2
       with typings.firebaseFirestore.distPrivateMod.LimitType2
  inline def FIRST: FIRST = "FIRST".asInstanceOf[FIRST]
  
  @js.native
  sealed trait FirstParty
    extends StObject
       with TokenType
       with typings.firebaseFirestore.distFirestoreSrcApiCredentialsMod.TokenType
       with typings.firebaseFirestore.distInternalMod.TokenType
       with typings.firebaseFirestore.distLitePrivateMod.TokenType
       with typings.firebaseFirestore.distPrivateMod.TokenType
       with typings.firebaseFirestore.distPackagesFirestoreSrcApiCredentialsMod.TokenType
       with typings.firebaseFirestore.distLiteFirestoreSrcApiCredentialsMod.TokenType
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcApiCredentialsMod.TokenType
  inline def FirstParty: FirstParty = "FirstParty".asInstanceOf[FirstParty]
  
  @js.native
  sealed trait GREATER_THAN
    extends StObject
       with FieldFilterOp
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typings.firebaseFirestore.distLiteInternalMod.FieldFilterOp
       with typings.firebaseFirestore.distInternalMod.FieldFilterOp
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typings.firebaseFirestore.distLitePrivateMod.FieldFilterOp
       with typings.firebaseFirestore.distPrivateMod.FieldFilterOp
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
  inline def GREATER_THAN: GREATER_THAN = "GREATER_THAN".asInstanceOf[GREATER_THAN]
  
  @js.native
  sealed trait GREATER_THAN_OR_EQUAL
    extends StObject
       with FieldFilterOp
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typings.firebaseFirestore.distLiteInternalMod.FieldFilterOp
       with typings.firebaseFirestore.distInternalMod.FieldFilterOp
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typings.firebaseFirestore.distLitePrivateMod.FieldFilterOp
       with typings.firebaseFirestore.distPrivateMod.FieldFilterOp
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
  inline def GREATER_THAN_OR_EQUAL: GREATER_THAN_OR_EQUAL = "GREATER_THAN_OR_EQUAL".asInstanceOf[GREATER_THAN_OR_EQUAL]
  
  @js.native
  sealed trait `Get highest unacknowledged batch id`
    extends StObject
       with PersistenceAction
       with typings.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Get highest unacknowledged batch id`: `Get highest unacknowledged batch id` = ("Get highest unacknowledged batch id").asInstanceOf[`Get highest unacknowledged batch id`]
  
  @js.native
  sealed trait `Get last remote snapshot version`
    extends StObject
       with PersistenceAction
       with typings.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Get last remote snapshot version`: `Get last remote snapshot version` = ("Get last remote snapshot version").asInstanceOf[`Get last remote snapshot version`]
  
  @js.native
  sealed trait `Get last stream token`
    extends StObject
       with PersistenceAction
       with typings.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Get last stream token`: `Get last stream token` = ("Get last stream token").asInstanceOf[`Get last stream token`]
  
  @js.native
  sealed trait `Get new document changes`
    extends StObject
       with PersistenceAction
       with typings.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Get new document changes`: `Get new document changes` = ("Get new document changes").asInstanceOf[`Get new document changes`]
  
  @js.native
  sealed trait `Get next mutation batch`
    extends StObject
       with PersistenceAction
       with typings.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Get next mutation batch`: `Get next mutation batch` = ("Get next mutation batch").asInstanceOf[`Get next mutation batch`]
  
  @js.native
  sealed trait `Get target data`
    extends StObject
       with PersistenceAction
       with typings.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Get target data`: `Get target data` = ("Get target data").asInstanceOf[`Get target data`]
  
  @js.native
  sealed trait Greaterthansign
    extends StObject
       with Operator
       with typings.firebaseFirestore.distPackagesFirestoreSrcCoreTargetMod.Operator
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreTargetMod.Operator
       with typings.firebaseFirestore.distFirestoreSrcCoreTargetMod.Operator
       with WhereFilterOp
       with typings.firebaseFirestore.distLiteInternalMod.WhereFilterOp
       with typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typings.firebaseFirestore.distInternalMod.WhereFilterOp
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typings.firebaseFirestore.distLiteMod.WhereFilterOp
       with typings.firebaseFirestore.distLitePrivateMod.WhereFilterOp
       with typings.firebaseFirestore.distPrivateMod.WhereFilterOp
       with typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
  inline def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  
  @js.native
  sealed trait GreaterthansignEqualssign
    extends StObject
       with Operator
       with typings.firebaseFirestore.distPackagesFirestoreSrcCoreTargetMod.Operator
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreTargetMod.Operator
       with typings.firebaseFirestore.distFirestoreSrcCoreTargetMod.Operator
       with WhereFilterOp
       with typings.firebaseFirestore.distLiteInternalMod.WhereFilterOp
       with typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typings.firebaseFirestore.distInternalMod.WhereFilterOp
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typings.firebaseFirestore.distLiteMod.WhereFilterOp
       with typings.firebaseFirestore.distLitePrivateMod.WhereFilterOp
       with typings.firebaseFirestore.distPrivateMod.WhereFilterOp
       with typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
  inline def GreaterthansignEqualssign: GreaterthansignEqualssign = ">=".asInstanceOf[GreaterthansignEqualssign]
  
  @js.native
  sealed trait `Handle user change`
    extends StObject
       with PersistenceAction
       with typings.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Handle user change`: `Handle user change` = ("Handle user change").asInstanceOf[`Handle user change`]
  
  @js.native
  sealed trait IN
    extends StObject
       with FieldFilterOp
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typings.firebaseFirestore.distLiteInternalMod.FieldFilterOp
       with typings.firebaseFirestore.distInternalMod.FieldFilterOp
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typings.firebaseFirestore.distLitePrivateMod.FieldFilterOp
       with typings.firebaseFirestore.distPrivateMod.FieldFilterOp
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
  inline def IN: IN = "IN".asInstanceOf[IN]
  
  @js.native
  sealed trait IS_NAN
    extends StObject
       with UnaryFilterOp
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.UnaryFilterOp
       with typings.firebaseFirestore.distLiteInternalMod.UnaryFilterOp
       with typings.firebaseFirestore.distInternalMod.UnaryFilterOp
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.UnaryFilterOp
       with typings.firebaseFirestore.distLitePrivateMod.UnaryFilterOp
       with typings.firebaseFirestore.distPrivateMod.UnaryFilterOp
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.UnaryFilterOp
  inline def IS_NAN: IS_NAN = "IS_NAN".asInstanceOf[IS_NAN]
  
  @js.native
  sealed trait IS_NOT_NAN
    extends StObject
       with UnaryFilterOp
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.UnaryFilterOp
       with typings.firebaseFirestore.distLiteInternalMod.UnaryFilterOp
       with typings.firebaseFirestore.distInternalMod.UnaryFilterOp
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.UnaryFilterOp
       with typings.firebaseFirestore.distLitePrivateMod.UnaryFilterOp
       with typings.firebaseFirestore.distPrivateMod.UnaryFilterOp
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.UnaryFilterOp
  inline def IS_NOT_NAN: IS_NOT_NAN = "IS_NOT_NAN".asInstanceOf[IS_NOT_NAN]
  
  @js.native
  sealed trait IS_NOT_NULL
    extends StObject
       with UnaryFilterOp
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.UnaryFilterOp
       with typings.firebaseFirestore.distLiteInternalMod.UnaryFilterOp
       with typings.firebaseFirestore.distInternalMod.UnaryFilterOp
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.UnaryFilterOp
       with typings.firebaseFirestore.distLitePrivateMod.UnaryFilterOp
       with typings.firebaseFirestore.distPrivateMod.UnaryFilterOp
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.UnaryFilterOp
  inline def IS_NOT_NULL: IS_NOT_NULL = "IS_NOT_NULL".asInstanceOf[IS_NOT_NULL]
  
  @js.native
  sealed trait IS_NULL
    extends StObject
       with UnaryFilterOp
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.UnaryFilterOp
       with typings.firebaseFirestore.distLiteInternalMod.UnaryFilterOp
       with typings.firebaseFirestore.distInternalMod.UnaryFilterOp
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.UnaryFilterOp
       with typings.firebaseFirestore.distLitePrivateMod.UnaryFilterOp
       with typings.firebaseFirestore.distPrivateMod.UnaryFilterOp
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.UnaryFilterOp
  inline def IS_NULL: IS_NULL = "IS_NULL".asInstanceOf[IS_NULL]
  
  @js.native
  sealed trait L
    extends StObject
       with LimitType
       with typings.firebaseFirestore.distLiteInternalMod.LimitType
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreQueryMod.LimitType
       with typings.firebaseFirestore.distInternalMod.LimitType
       with typings.firebaseFirestore.distLitePrivateMod.LimitType
       with typings.firebaseFirestore.distLiteFirestoreSrcCoreQueryMod.LimitType
       with typings.firebaseFirestore.distPrivateMod.LimitType
       with typings.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.LimitType
  inline def L: L = "L".asInstanceOf[L]
  
  @js.native
  sealed trait LAST
    extends StObject
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreBundleProtoMod.LimitType
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreBundleProtoMod.LimitType
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreBundleProtoMod.LimitType
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreBundleProtoMod.LimitType
       with LimitType2
       with typings.firebaseFirestore.distPrivateMod.LimitType2
  inline def LAST: LAST = "LAST".asInstanceOf[LAST]
  
  @js.native
  sealed trait LESS_THAN
    extends StObject
       with FieldFilterOp
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typings.firebaseFirestore.distLiteInternalMod.FieldFilterOp
       with typings.firebaseFirestore.distInternalMod.FieldFilterOp
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typings.firebaseFirestore.distLitePrivateMod.FieldFilterOp
       with typings.firebaseFirestore.distPrivateMod.FieldFilterOp
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
  inline def LESS_THAN: LESS_THAN = "LESS_THAN".asInstanceOf[LESS_THAN]
  
  @js.native
  sealed trait LESS_THAN_OR_EQUAL
    extends StObject
       with FieldFilterOp
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typings.firebaseFirestore.distLiteInternalMod.FieldFilterOp
       with typings.firebaseFirestore.distInternalMod.FieldFilterOp
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typings.firebaseFirestore.distLitePrivateMod.FieldFilterOp
       with typings.firebaseFirestore.distPrivateMod.FieldFilterOp
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
  inline def LESS_THAN_OR_EQUAL: LESS_THAN_OR_EQUAL = "LESS_THAN_OR_EQUAL".asInstanceOf[LESS_THAN_OR_EQUAL]
  
  @js.native
  sealed trait Lessthansign
    extends StObject
       with Operator
       with typings.firebaseFirestore.distPackagesFirestoreSrcCoreTargetMod.Operator
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreTargetMod.Operator
       with typings.firebaseFirestore.distFirestoreSrcCoreTargetMod.Operator
       with WhereFilterOp
       with typings.firebaseFirestore.distLiteInternalMod.WhereFilterOp
       with typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typings.firebaseFirestore.distInternalMod.WhereFilterOp
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typings.firebaseFirestore.distLiteMod.WhereFilterOp
       with typings.firebaseFirestore.distLitePrivateMod.WhereFilterOp
       with typings.firebaseFirestore.distPrivateMod.WhereFilterOp
       with typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
  inline def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  
  @js.native
  sealed trait LessthansignEqualssign
    extends StObject
       with Operator
       with typings.firebaseFirestore.distPackagesFirestoreSrcCoreTargetMod.Operator
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreTargetMod.Operator
       with typings.firebaseFirestore.distFirestoreSrcCoreTargetMod.Operator
       with WhereFilterOp
       with typings.firebaseFirestore.distLiteInternalMod.WhereFilterOp
       with typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typings.firebaseFirestore.distInternalMod.WhereFilterOp
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typings.firebaseFirestore.distLiteMod.WhereFilterOp
       with typings.firebaseFirestore.distLitePrivateMod.WhereFilterOp
       with typings.firebaseFirestore.distPrivateMod.WhereFilterOp
       with typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
  inline def LessthansignEqualssign: LessthansignEqualssign = "<=".asInstanceOf[LessthansignEqualssign]
  
  @js.native
  sealed trait LimitToFirst
    extends StObject
       with SpecLimitType
       with typings.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.SpecLimitType
       with typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.SpecLimitType
       with typings.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.SpecLimitType
  inline def LimitToFirst: LimitToFirst = "LimitToFirst".asInstanceOf[LimitToFirst]
  
  @js.native
  sealed trait LimitToLast
    extends StObject
       with SpecLimitType
       with typings.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.SpecLimitType
       with typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.SpecLimitType
       with typings.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.SpecLimitType
  inline def LimitToLast: LimitToLast = "LimitToLast".asInstanceOf[LimitToLast]
  
  @js.native
  sealed trait `Locally write mutations`
    extends StObject
       with PersistenceAction
       with typings.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Locally write mutations`: `Locally write mutations` = ("Locally write mutations").asInstanceOf[`Locally write mutations`]
  
  @js.native
  sealed trait `Lookup mutation documents`
    extends StObject
       with PersistenceAction
       with typings.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Lookup mutation documents`: `Lookup mutation documents` = ("Lookup mutation documents").asInstanceOf[`Lookup mutation documents`]
  
  @js.native
  sealed trait MODE_UNSPECIFIED
    extends StObject
       with IndexFieldMode
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.IndexFieldMode
       with typings.firebaseFirestore.distLiteInternalMod.IndexFieldMode
       with typings.firebaseFirestore.distInternalMod.IndexFieldMode
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.IndexFieldMode
       with typings.firebaseFirestore.distLitePrivateMod.IndexFieldMode
       with typings.firebaseFirestore.distPrivateMod.IndexFieldMode
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.IndexFieldMode
  inline def MODE_UNSPECIFIED: MODE_UNSPECIFIED = "MODE_UNSPECIFIED".asInstanceOf[MODE_UNSPECIFIED]
  
  @js.native
  sealed trait NOT_EQUAL
    extends StObject
       with FieldFilterOp
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typings.firebaseFirestore.distLiteInternalMod.FieldFilterOp
       with typings.firebaseFirestore.distInternalMod.FieldFilterOp
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typings.firebaseFirestore.distLitePrivateMod.FieldFilterOp
       with typings.firebaseFirestore.distPrivateMod.FieldFilterOp
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
  inline def NOT_EQUAL: NOT_EQUAL = "NOT_EQUAL".asInstanceOf[NOT_EQUAL]
  
  @js.native
  sealed trait NOT_IN
    extends StObject
       with FieldFilterOp
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typings.firebaseFirestore.distLiteInternalMod.FieldFilterOp
       with typings.firebaseFirestore.distInternalMod.FieldFilterOp
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typings.firebaseFirestore.distLitePrivateMod.FieldFilterOp
       with typings.firebaseFirestore.distPrivateMod.FieldFilterOp
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
  inline def NOT_IN: NOT_IN = "NOT_IN".asInstanceOf[NOT_IN]
  
  @js.native
  sealed trait NO_CHANGE
    extends StObject
       with TargetChangeTargetChangeType
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.TargetChangeTargetChangeType
       with typings.firebaseFirestore.distLiteInternalMod.TargetChangeTargetChangeType
       with typings.firebaseFirestore.distInternalMod.TargetChangeTargetChangeType
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.TargetChangeTargetChangeType
       with typings.firebaseFirestore.distLitePrivateMod.TargetChangeTargetChangeType
       with typings.firebaseFirestore.distPrivateMod.TargetChangeTargetChangeType
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.TargetChangeTargetChangeType
  inline def NO_CHANGE: NO_CHANGE = "NO_CHANGE".asInstanceOf[NO_CHANGE]
  
  @js.native
  sealed trait NULL_VALUE extends StObject
  inline def NULL_VALUE: NULL_VALUE = "NULL_VALUE".asInstanceOf[NULL_VALUE]
  
  @js.native
  sealed trait NaN extends StObject
  inline def NaN: NaN = "NaN".asInstanceOf[NaN]
  
  @js.native
  sealed trait OAuth
    extends StObject
       with TokenType
       with typings.firebaseFirestore.distFirestoreSrcApiCredentialsMod.TokenType
       with typings.firebaseFirestore.distInternalMod.TokenType
       with typings.firebaseFirestore.distLitePrivateMod.TokenType
       with typings.firebaseFirestore.distPrivateMod.TokenType
       with typings.firebaseFirestore.distPackagesFirestoreSrcApiCredentialsMod.TokenType
       with typings.firebaseFirestore.distLiteFirestoreSrcApiCredentialsMod.TokenType
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcApiCredentialsMod.TokenType
  inline def OAuth: OAuth = "OAuth".asInstanceOf[OAuth]
  
  @js.native
  sealed trait OPERATOR_UNSPECIFIED
    extends StObject
       with CompositeFilterOp
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.CompositeFilterOp
       with typings.firebaseFirestore.distLiteInternalMod.CompositeFilterOp
       with typings.firebaseFirestore.distInternalMod.CompositeFilterOp
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.CompositeFilterOp
       with typings.firebaseFirestore.distLitePrivateMod.CompositeFilterOp
       with typings.firebaseFirestore.distPrivateMod.CompositeFilterOp
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.CompositeFilterOp
       with FieldFilterOp
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typings.firebaseFirestore.distLiteInternalMod.FieldFilterOp
       with typings.firebaseFirestore.distInternalMod.FieldFilterOp
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typings.firebaseFirestore.distLitePrivateMod.FieldFilterOp
       with typings.firebaseFirestore.distPrivateMod.FieldFilterOp
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with UnaryFilterOp
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.UnaryFilterOp
       with typings.firebaseFirestore.distLiteInternalMod.UnaryFilterOp
       with typings.firebaseFirestore.distInternalMod.UnaryFilterOp
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.UnaryFilterOp
       with typings.firebaseFirestore.distLitePrivateMod.UnaryFilterOp
       with typings.firebaseFirestore.distPrivateMod.UnaryFilterOp
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.UnaryFilterOp
  inline def OPERATOR_UNSPECIFIED: OPERATOR_UNSPECIFIED = "OPERATOR_UNSPECIFIED".asInstanceOf[OPERATOR_UNSPECIFIED]
  
  @js.native
  sealed trait Offline
    extends StObject
       with OnlineState
       with typings.firebaseFirestore.distInternalMod.OnlineState
       with typings.firebaseFirestore.distLiteFirestoreSrcCoreTypesMod.OnlineState
       with typings.firebaseFirestore.distPrivateMod.OnlineState
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreTypesMod.OnlineState
       with typings.firebaseFirestore.distPackagesFirestoreSrcCoreTypesMod.OnlineState
  inline def Offline: Offline = "Offline".asInstanceOf[Offline]
  
  @js.native
  sealed trait Online
    extends StObject
       with OnlineState
       with typings.firebaseFirestore.distInternalMod.OnlineState
       with typings.firebaseFirestore.distLiteFirestoreSrcCoreTypesMod.OnlineState
       with typings.firebaseFirestore.distPrivateMod.OnlineState
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreTypesMod.OnlineState
       with typings.firebaseFirestore.distPackagesFirestoreSrcCoreTypesMod.OnlineState
  inline def Online: Online = "Online".asInstanceOf[Online]
  
  @js.native
  sealed trait READY
    extends StObject
       with IndexState
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.IndexState
       with typings.firebaseFirestore.distLiteInternalMod.IndexState
       with typings.firebaseFirestore.distInternalMod.IndexState
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.IndexState
       with typings.firebaseFirestore.distLitePrivateMod.IndexState
       with typings.firebaseFirestore.distPrivateMod.IndexState
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.IndexState
  inline def READY: READY = "READY".asInstanceOf[READY]
  
  @js.native
  sealed trait REMOVE
    extends StObject
       with TargetChangeTargetChangeType
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.TargetChangeTargetChangeType
       with typings.firebaseFirestore.distLiteInternalMod.TargetChangeTargetChangeType
       with typings.firebaseFirestore.distInternalMod.TargetChangeTargetChangeType
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.TargetChangeTargetChangeType
       with typings.firebaseFirestore.distLitePrivateMod.TargetChangeTargetChangeType
       with typings.firebaseFirestore.distPrivateMod.TargetChangeTargetChangeType
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.TargetChangeTargetChangeType
  inline def REMOVE: REMOVE = "REMOVE".asInstanceOf[REMOVE]
  
  @js.native
  sealed trait REQUEST_TIME
    extends StObject
       with FieldTransformSetToServerValue
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.FieldTransformSetToServerValue
       with typings.firebaseFirestore.distLiteInternalMod.FieldTransformSetToServerValue
       with typings.firebaseFirestore.distInternalMod.FieldTransformSetToServerValue
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.FieldTransformSetToServerValue
       with typings.firebaseFirestore.distLitePrivateMod.FieldTransformSetToServerValue
       with typings.firebaseFirestore.distPrivateMod.FieldTransformSetToServerValue
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.FieldTransformSetToServerValue
  inline def REQUEST_TIME: REQUEST_TIME = "REQUEST_TIME".asInstanceOf[REQUEST_TIME]
  
  @js.native
  sealed trait RESET
    extends StObject
       with TargetChangeTargetChangeType
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.TargetChangeTargetChangeType
       with typings.firebaseFirestore.distLiteInternalMod.TargetChangeTargetChangeType
       with typings.firebaseFirestore.distInternalMod.TargetChangeTargetChangeType
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.TargetChangeTargetChangeType
       with typings.firebaseFirestore.distLitePrivateMod.TargetChangeTargetChangeType
       with typings.firebaseFirestore.distPrivateMod.TargetChangeTargetChangeType
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.TargetChangeTargetChangeType
  inline def RESET: RESET = "RESET".asInstanceOf[RESET]
  
  @js.native
  sealed trait `Reject batch`
    extends StObject
       with PersistenceAction
       with typings.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Reject batch`: `Reject batch` = ("Reject batch").asInstanceOf[`Reject batch`]
  
  @js.native
  sealed trait `Release target`
    extends StObject
       with PersistenceAction
       with typings.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Release target`: `Release target` = ("Release target").asInstanceOf[`Release target`]
  
  @js.native
  sealed trait `Remote document keys`
    extends StObject
       with PersistenceAction
       with typings.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Remote document keys`: `Remote document keys` = ("Remote document keys").asInstanceOf[`Remote document keys`]
  
  @js.native
  sealed trait Running
    extends StObject
       with TaskState
       with typings.firebaseFirestore.distInternalMod.TaskState
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcApiBundleMod.TaskState
       with typings.firebaseFirestore.distFirestoreSrcApiBundleMod.TaskState
       with typings.firebaseFirestore.distPrivateMod.TaskState
       with typings.firebaseFirestore.distLiteFirestoreSrcApiBundleMod.TaskState
       with typings.firebaseFirestore.distPackagesFirestoreSrcApiBundleMod.TaskState
  inline def Running: Running = "Running".asInstanceOf[Running]
  
  @js.native
  sealed trait SERVER_VALUE_UNSPECIFIED
    extends StObject
       with FieldTransformSetToServerValue
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.FieldTransformSetToServerValue
       with typings.firebaseFirestore.distLiteInternalMod.FieldTransformSetToServerValue
       with typings.firebaseFirestore.distInternalMod.FieldTransformSetToServerValue
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.FieldTransformSetToServerValue
       with typings.firebaseFirestore.distLitePrivateMod.FieldTransformSetToServerValue
       with typings.firebaseFirestore.distPrivateMod.FieldTransformSetToServerValue
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.FieldTransformSetToServerValue
  inline def SERVER_VALUE_UNSPECIFIED: SERVER_VALUE_UNSPECIFIED = "SERVER_VALUE_UNSPECIFIED".asInstanceOf[SERVER_VALUE_UNSPECIFIED]
  
  @js.native
  sealed trait STATE_UNSPECIFIED
    extends StObject
       with IndexState
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.IndexState
       with typings.firebaseFirestore.distLiteInternalMod.IndexState
       with typings.firebaseFirestore.distInternalMod.IndexState
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.IndexState
       with typings.firebaseFirestore.distLitePrivateMod.IndexState
       with typings.firebaseFirestore.distPrivateMod.IndexState
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.IndexState
  inline def STATE_UNSPECIFIED: STATE_UNSPECIFIED = "STATE_UNSPECIFIED".asInstanceOf[STATE_UNSPECIFIED]
  
  @js.native
  sealed trait `Set last remote snapshot version`
    extends StObject
       with PersistenceAction
       with typings.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Set last remote snapshot version`: `Set last remote snapshot version` = ("Set last remote snapshot version").asInstanceOf[`Set last remote snapshot version`]
  
  @js.native
  sealed trait `Set last stream token`
    extends StObject
       with PersistenceAction
       with typings.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Set last stream token`: `Set last stream token` = ("Set last stream token").asInstanceOf[`Set last stream token`]
  
  @js.native
  sealed trait Success
    extends StObject
       with TaskState
       with typings.firebaseFirestore.distInternalMod.TaskState
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcApiBundleMod.TaskState
       with typings.firebaseFirestore.distFirestoreSrcApiBundleMod.TaskState
       with typings.firebaseFirestore.distPrivateMod.TaskState
       with typings.firebaseFirestore.distLiteFirestoreSrcApiBundleMod.TaskState
       with typings.firebaseFirestore.distPackagesFirestoreSrcApiBundleMod.TaskState
  inline def Success: Success = "Success".asInstanceOf[Success]
  
  @js.native
  sealed trait `Synchronize last document change read time`
    extends StObject
       with PersistenceAction
       with typings.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Synchronize last document change read time`: `Synchronize last document change read time` = ("Synchronize last document change read time").asInstanceOf[`Synchronize last document change read time`]
  
  @js.native
  sealed trait Unknown
    extends StObject
       with OnlineState
       with typings.firebaseFirestore.distInternalMod.OnlineState
       with typings.firebaseFirestore.distLiteFirestoreSrcCoreTypesMod.OnlineState
       with typings.firebaseFirestore.distPrivateMod.OnlineState
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreTypesMod.OnlineState
       with typings.firebaseFirestore.distPackagesFirestoreSrcCoreTypesMod.OnlineState
  inline def Unknown: Unknown = "Unknown".asInstanceOf[Unknown]
  
  @js.native
  sealed trait aborted
    extends StObject
       with FirestoreErrorCode
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typings.firebaseFirestore.mod.FirestoreErrorCode
       with typings.firebaseFirestore.distLiteInternalMod.FirestoreErrorCode
       with typings.firebaseFirestore.distInternalMod.FirestoreErrorCode
       with typings.firebaseFirestore.distLiteMod.FirestoreErrorCode
       with typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typings.firebaseFirestore.distLitePrivateMod.FirestoreErrorCode
       with typings.firebaseFirestore.distPrivateMod.FirestoreErrorCode
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
  inline def aborted: aborted = "aborted".asInstanceOf[aborted]
  
  @js.native
  sealed trait acknowledged
    extends StObject
       with MutationBatchState
       with typings.firebaseFirestore.distLiteFirestoreSrcCoreTypesMod.MutationBatchState
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreTypesMod.MutationBatchState
       with typings.firebaseFirestore.distPackagesFirestoreSrcCoreTypesMod.MutationBatchState
  inline def acknowledged: acknowledged = "acknowledged".asInstanceOf[acknowledged]
  
  @js.native
  sealed trait added
    extends StObject
       with DocumentChangeType
       with typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentChangeType
       with typings.firebaseFirestore.distInternalMod.DocumentChangeType
       with typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.DocumentChangeType
       with typings.firebaseFirestore.distLiteFirestoreSrcApiSnapshotMod.DocumentChangeType
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.DocumentChangeType
       with typings.firebaseFirestore.distPrivateMod.DocumentChangeType
  inline def added: added = "added".asInstanceOf[added]
  
  @js.native
  sealed trait all
    extends StObject
       with TimerId
       with typings.firebaseFirestore.distFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distLiteInternalMod.TimerId
       with typings.firebaseFirestore.distInternalMod.TimerId
       with typings.firebaseFirestore.distLiteFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distLitePrivateMod.TimerId
       with typings.firebaseFirestore.distPrivateMod.TimerId
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait `already-exists`
    extends StObject
       with FirestoreErrorCode
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typings.firebaseFirestore.mod.FirestoreErrorCode
       with typings.firebaseFirestore.distLiteInternalMod.FirestoreErrorCode
       with typings.firebaseFirestore.distInternalMod.FirestoreErrorCode
       with typings.firebaseFirestore.distLiteMod.FirestoreErrorCode
       with typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typings.firebaseFirestore.distLitePrivateMod.FirestoreErrorCode
       with typings.firebaseFirestore.distPrivateMod.FirestoreErrorCode
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
  inline def `already-exists`: `already-exists` = "already-exists".asInstanceOf[`already-exists`]
  
  @js.native
  sealed trait `array-contains`
    extends StObject
       with Operator
       with typings.firebaseFirestore.distPackagesFirestoreSrcCoreTargetMod.Operator
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreTargetMod.Operator
       with typings.firebaseFirestore.distFirestoreSrcCoreTargetMod.Operator
       with WhereFilterOp
       with typings.firebaseFirestore.distLiteInternalMod.WhereFilterOp
       with typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typings.firebaseFirestore.distInternalMod.WhereFilterOp
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typings.firebaseFirestore.distLiteMod.WhereFilterOp
       with typings.firebaseFirestore.distLitePrivateMod.WhereFilterOp
       with typings.firebaseFirestore.distPrivateMod.WhereFilterOp
       with typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
  inline def `array-contains`: `array-contains` = "array-contains".asInstanceOf[`array-contains`]
  
  @js.native
  sealed trait `array-contains-any`
    extends StObject
       with Operator
       with typings.firebaseFirestore.distPackagesFirestoreSrcCoreTargetMod.Operator
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreTargetMod.Operator
       with typings.firebaseFirestore.distFirestoreSrcCoreTargetMod.Operator
       with WhereFilterOp
       with typings.firebaseFirestore.distLiteInternalMod.WhereFilterOp
       with typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typings.firebaseFirestore.distInternalMod.WhereFilterOp
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typings.firebaseFirestore.distLiteMod.WhereFilterOp
       with typings.firebaseFirestore.distLitePrivateMod.WhereFilterOp
       with typings.firebaseFirestore.distPrivateMod.WhereFilterOp
       with typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
  inline def `array-contains-any`: `array-contains-any` = "array-contains-any".asInstanceOf[`array-contains-any`]
  
  @js.native
  sealed trait asc
    extends StObject
       with Direction
       with typings.firebaseFirestore.distLiteFirestoreSrcCoreTargetMod.Direction
       with typings.firebaseFirestore.distInternalMod.Direction
       with typings.firebaseFirestore.distPackagesFirestoreSrcCoreTargetMod.Direction
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreTargetMod.Direction
       with typings.firebaseFirestore.distLitePrivateMod.Direction
       with typings.firebaseFirestore.distPrivateMod.Direction
       with typings.firebaseFirestore.distFirestoreSrcCoreTargetMod.Direction
       with OrderByDirection
       with typings.firebaseFirestore.distLiteInternalMod.OrderByDirection
       with typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.OrderByDirection
       with typings.firebaseFirestore.distInternalMod.OrderByDirection
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.OrderByDirection
       with typings.firebaseFirestore.distLiteMod.OrderByDirection
       with typings.firebaseFirestore.distLitePrivateMod.OrderByDirection
       with typings.firebaseFirestore.distPrivateMod.OrderByDirection
       with typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.OrderByDirection
       with typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.OrderByDirection
  inline def asc: asc = "asc".asInstanceOf[asc]
  
  @js.native
  sealed trait async_queue_retry
    extends StObject
       with TimerId
       with typings.firebaseFirestore.distFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distLiteInternalMod.TimerId
       with typings.firebaseFirestore.distInternalMod.TimerId
       with typings.firebaseFirestore.distLiteFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distLitePrivateMod.TimerId
       with typings.firebaseFirestore.distPrivateMod.TimerId
  inline def async_queue_retry: async_queue_retry = "async_queue_retry".asInstanceOf[async_queue_retry]
  
  @js.native
  sealed trait boolean
    extends StObject
       with ValidationType
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilInputValidationMod.ValidationType
       with typings.firebaseFirestore.distLiteFirestoreSrcUtilInputValidationMod.ValidationType
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilInputValidationMod.ValidationType
  inline def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @js.native
  sealed trait cancelled
    extends StObject
       with FirestoreErrorCode
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typings.firebaseFirestore.mod.FirestoreErrorCode
       with typings.firebaseFirestore.distLiteInternalMod.FirestoreErrorCode
       with typings.firebaseFirestore.distInternalMod.FirestoreErrorCode
       with typings.firebaseFirestore.distLiteMod.FirestoreErrorCode
       with typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typings.firebaseFirestore.distLitePrivateMod.FirestoreErrorCode
       with typings.firebaseFirestore.distPrivateMod.FirestoreErrorCode
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
  inline def cancelled: cancelled = "cancelled".asInstanceOf[cancelled]
  
  @js.native
  sealed trait client_metadata_refresh
    extends StObject
       with TimerId
       with typings.firebaseFirestore.distFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distLiteInternalMod.TimerId
       with typings.firebaseFirestore.distInternalMod.TimerId
       with typings.firebaseFirestore.distLiteFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distLitePrivateMod.TimerId
       with typings.firebaseFirestore.distPrivateMod.TimerId
  inline def client_metadata_refresh: client_metadata_refresh = "client_metadata_refresh".asInstanceOf[client_metadata_refresh]
  
  @js.native
  sealed trait close
    extends StObject
       with StreamEventType
       with typings.firebaseFirestore.distLiteFirestoreTestIntegrationRemoteStreamDottestMod.StreamEventType
       with typings.firebaseFirestore.distLitePackagesFirestoreTestIntegrationRemoteStreamDottestMod.StreamEventType
       with typings.firebaseFirestore.distFirestoreTestIntegrationRemoteStreamDottestMod.StreamEventType
  inline def close: close = "close".asInstanceOf[close]
  
  @js.native
  sealed trait collection extends StObject
  inline def collection: collection = "collection".asInstanceOf[collection]
  
  @js.native
  sealed trait current_
    extends StObject
       with QueryTargetState
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcLocalSharedClientStateSyncerMod.QueryTargetState
       with typings.firebaseFirestore.distPackagesFirestoreSrcLocalSharedClientStateSyncerMod.QueryTargetState
       with typings.firebaseFirestore.distPrivateMod.QueryTargetState
       with typings.firebaseFirestore.distFirestoreSrcLocalSharedClientStateSyncerMod.QueryTargetState
       with typings.firebaseFirestore.distLiteFirestoreSrcLocalSharedClientStateSyncerMod.QueryTargetState
  inline def current_ : current_ = "current".asInstanceOf[current_]
  
  @js.native
  sealed trait `data-loss`
    extends StObject
       with FirestoreErrorCode
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typings.firebaseFirestore.mod.FirestoreErrorCode
       with typings.firebaseFirestore.distLiteInternalMod.FirestoreErrorCode
       with typings.firebaseFirestore.distInternalMod.FirestoreErrorCode
       with typings.firebaseFirestore.distLiteMod.FirestoreErrorCode
       with typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typings.firebaseFirestore.distLitePrivateMod.FirestoreErrorCode
       with typings.firebaseFirestore.distPrivateMod.FirestoreErrorCode
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
  inline def `data-loss`: `data-loss` = "data-loss".asInstanceOf[`data-loss`]
  
  @js.native
  sealed trait `deadline-exceeded`
    extends StObject
       with FirestoreErrorCode
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typings.firebaseFirestore.mod.FirestoreErrorCode
       with typings.firebaseFirestore.distLiteInternalMod.FirestoreErrorCode
       with typings.firebaseFirestore.distInternalMod.FirestoreErrorCode
       with typings.firebaseFirestore.distLiteMod.FirestoreErrorCode
       with typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typings.firebaseFirestore.distLitePrivateMod.FirestoreErrorCode
       with typings.firebaseFirestore.distPrivateMod.FirestoreErrorCode
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
  inline def `deadline-exceeded`: `deadline-exceeded` = "deadline-exceeded".asInstanceOf[`deadline-exceeded`]
  
  @js.native
  sealed trait desc
    extends StObject
       with Direction
       with typings.firebaseFirestore.distLiteFirestoreSrcCoreTargetMod.Direction
       with typings.firebaseFirestore.distInternalMod.Direction
       with typings.firebaseFirestore.distPackagesFirestoreSrcCoreTargetMod.Direction
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreTargetMod.Direction
       with typings.firebaseFirestore.distLitePrivateMod.Direction
       with typings.firebaseFirestore.distPrivateMod.Direction
       with typings.firebaseFirestore.distFirestoreSrcCoreTargetMod.Direction
       with OrderByDirection
       with typings.firebaseFirestore.distLiteInternalMod.OrderByDirection
       with typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.OrderByDirection
       with typings.firebaseFirestore.distInternalMod.OrderByDirection
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.OrderByDirection
       with typings.firebaseFirestore.distLiteMod.OrderByDirection
       with typings.firebaseFirestore.distLitePrivateMod.OrderByDirection
       with typings.firebaseFirestore.distPrivateMod.OrderByDirection
       with typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.OrderByDirection
       with typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.OrderByDirection
  inline def desc: desc = "desc".asInstanceOf[desc]
  
  @js.native
  sealed trait endAt
    extends StObject
       with QueryConstraintType
       with typings.firebaseFirestore.distLiteInternalMod.QueryConstraintType
       with typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typings.firebaseFirestore.distInternalMod.QueryConstraintType
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typings.firebaseFirestore.distLiteMod.QueryConstraintType
       with typings.firebaseFirestore.distLitePrivateMod.QueryConstraintType
       with typings.firebaseFirestore.distPrivateMod.QueryConstraintType
       with typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraintType
  inline def endAt: endAt = "endAt".asInstanceOf[endAt]
  
  @js.native
  sealed trait endBefore
    extends StObject
       with QueryConstraintType
       with typings.firebaseFirestore.distLiteInternalMod.QueryConstraintType
       with typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typings.firebaseFirestore.distInternalMod.QueryConstraintType
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typings.firebaseFirestore.distLiteMod.QueryConstraintType
       with typings.firebaseFirestore.distLitePrivateMod.QueryConstraintType
       with typings.firebaseFirestore.distPrivateMod.QueryConstraintType
       with typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraintType
  inline def endBefore: endBefore = "endBefore".asInstanceOf[endBefore]
  
  @js.native
  sealed trait estimate
    extends StObject
       with ServerTimestampBehavior
       with typings.firebaseFirestore.distInternalMod.ServerTimestampBehavior
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiUserDataWriterMod.ServerTimestampBehavior
       with typings.firebaseFirestore.distLiteFirestoreSrcLiteApiUserDataWriterMod.ServerTimestampBehavior
       with typings.firebaseFirestore.distLitePrivateMod.ServerTimestampBehavior
       with typings.firebaseFirestore.distPrivateMod.ServerTimestampBehavior
       with typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiUserDataWriterMod.ServerTimestampBehavior
       with typings.firebaseFirestore.distFirestoreSrcLiteApiUserDataWriterMod.ServerTimestampBehavior
  inline def estimate: estimate = "estimate".asInstanceOf[estimate]
  
  @js.native
  sealed trait `failed-precondition`
    extends StObject
       with FirestoreErrorCode
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typings.firebaseFirestore.mod.FirestoreErrorCode
       with typings.firebaseFirestore.distLiteInternalMod.FirestoreErrorCode
       with typings.firebaseFirestore.distInternalMod.FirestoreErrorCode
       with typings.firebaseFirestore.distLiteMod.FirestoreErrorCode
       with typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typings.firebaseFirestore.distLitePrivateMod.FirestoreErrorCode
       with typings.firebaseFirestore.distPrivateMod.FirestoreErrorCode
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
  inline def `failed-precondition`: `failed-precondition` = "failed-precondition".asInstanceOf[`failed-precondition`]
  
  @js.native
  sealed trait firestore extends StObject
  inline def firestore: firestore = "firestore".asInstanceOf[firestore]
  
  @js.native
  sealed trait `firestore-lite` extends StObject
  inline def `firestore-lite`: `firestore-lite` = "firestore-lite".asInstanceOf[`firestore-lite`]
  
  @js.native
  sealed trait function
    extends StObject
       with ValidationType
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilInputValidationMod.ValidationType
       with typings.firebaseFirestore.distLiteFirestoreSrcUtilInputValidationMod.ValidationType
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilInputValidationMod.ValidationType
  inline def function: function = "function".asInstanceOf[function]
  
  @js.native
  sealed trait gapi extends StObject
  inline def gapi: gapi = "gapi".asInstanceOf[gapi]
  
  @js.native
  sealed trait getHighestListenSequenceNumber
    extends StObject
       with PersistenceAction
       with typings.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def getHighestListenSequenceNumber: getHighestListenSequenceNumber = "getHighestListenSequenceNumber".asInstanceOf[getHighestListenSequenceNumber]
  
  @js.native
  sealed trait handshakeComplete
    extends StObject
       with StreamEventType
       with typings.firebaseFirestore.distLiteFirestoreTestIntegrationRemoteStreamDottestMod.StreamEventType
       with typings.firebaseFirestore.distLitePackagesFirestoreTestIntegrationRemoteStreamDottestMod.StreamEventType
       with typings.firebaseFirestore.distFirestoreTestIntegrationRemoteStreamDottestMod.StreamEventType
  inline def handshakeComplete: handshakeComplete = "handshakeComplete".asInstanceOf[handshakeComplete]
  
  @js.native
  sealed trait health_check_timeout
    extends StObject
       with TimerId
       with typings.firebaseFirestore.distFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distLiteInternalMod.TimerId
       with typings.firebaseFirestore.distInternalMod.TimerId
       with typings.firebaseFirestore.distLiteFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distLitePrivateMod.TimerId
       with typings.firebaseFirestore.distPrivateMod.TimerId
  inline def health_check_timeout: health_check_timeout = "health_check_timeout".asInstanceOf[health_check_timeout]
  
  @js.native
  sealed trait in_
    extends StObject
       with Operator
       with typings.firebaseFirestore.distPackagesFirestoreSrcCoreTargetMod.Operator
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreTargetMod.Operator
       with typings.firebaseFirestore.distFirestoreSrcCoreTargetMod.Operator
       with WhereFilterOp
       with typings.firebaseFirestore.distLiteInternalMod.WhereFilterOp
       with typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typings.firebaseFirestore.distInternalMod.WhereFilterOp
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typings.firebaseFirestore.distLiteMod.WhereFilterOp
       with typings.firebaseFirestore.distLitePrivateMod.WhereFilterOp
       with typings.firebaseFirestore.distPrivateMod.WhereFilterOp
       with typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
  inline def in_ : in_ = "in".asInstanceOf[in_]
  
  @js.native
  sealed trait index_backfill
    extends StObject
       with TimerId
       with typings.firebaseFirestore.distFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distLiteInternalMod.TimerId
       with typings.firebaseFirestore.distInternalMod.TimerId
       with typings.firebaseFirestore.distLiteFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distLitePrivateMod.TimerId
       with typings.firebaseFirestore.distPrivateMod.TimerId
  inline def index_backfill: index_backfill = "index_backfill".asInstanceOf[index_backfill]
  
  @js.native
  sealed trait internal
    extends StObject
       with FirestoreErrorCode
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typings.firebaseFirestore.mod.FirestoreErrorCode
       with typings.firebaseFirestore.distLiteInternalMod.FirestoreErrorCode
       with typings.firebaseFirestore.distInternalMod.FirestoreErrorCode
       with typings.firebaseFirestore.distLiteMod.FirestoreErrorCode
       with typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typings.firebaseFirestore.distLitePrivateMod.FirestoreErrorCode
       with typings.firebaseFirestore.distPrivateMod.FirestoreErrorCode
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
  inline def internal: internal = "internal".asInstanceOf[internal]
  
  @js.native
  sealed trait `invalid-argument`
    extends StObject
       with FirestoreErrorCode
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typings.firebaseFirestore.mod.FirestoreErrorCode
       with typings.firebaseFirestore.distLiteInternalMod.FirestoreErrorCode
       with typings.firebaseFirestore.distInternalMod.FirestoreErrorCode
       with typings.firebaseFirestore.distLiteMod.FirestoreErrorCode
       with typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typings.firebaseFirestore.distLitePrivateMod.FirestoreErrorCode
       with typings.firebaseFirestore.distPrivateMod.FirestoreErrorCode
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
  inline def `invalid-argument`: `invalid-argument` = "invalid-argument".asInstanceOf[`invalid-argument`]
  
  @js.native
  sealed trait json
    extends StObject
       with ProjectsDatabasesDocumentsApiClientAlt
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientAlt
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientAlt
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientAlt
       with ProjectsDatabasesIndexesApiClientAlt
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientAlt
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientAlt
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientAlt
  inline def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait limit
    extends StObject
       with QueryConstraintType
       with typings.firebaseFirestore.distLiteInternalMod.QueryConstraintType
       with typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typings.firebaseFirestore.distInternalMod.QueryConstraintType
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typings.firebaseFirestore.distLiteMod.QueryConstraintType
       with typings.firebaseFirestore.distLitePrivateMod.QueryConstraintType
       with typings.firebaseFirestore.distPrivateMod.QueryConstraintType
       with typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraintType
  inline def limit: limit = "limit".asInstanceOf[limit]
  
  @js.native
  sealed trait limitToLast_
    extends StObject
       with QueryConstraintType
       with typings.firebaseFirestore.distLiteInternalMod.QueryConstraintType
       with typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typings.firebaseFirestore.distInternalMod.QueryConstraintType
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typings.firebaseFirestore.distLiteMod.QueryConstraintType
       with typings.firebaseFirestore.distLitePrivateMod.QueryConstraintType
       with typings.firebaseFirestore.distPrivateMod.QueryConstraintType
       with typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraintType
  inline def limitToLast_ : limitToLast_ = "limitToLast".asInstanceOf[limitToLast_]
  
  @js.native
  sealed trait listen_stream_connection_backoff
    extends StObject
       with TimerId
       with typings.firebaseFirestore.distFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distLiteInternalMod.TimerId
       with typings.firebaseFirestore.distInternalMod.TimerId
       with typings.firebaseFirestore.distLiteFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distLitePrivateMod.TimerId
       with typings.firebaseFirestore.distPrivateMod.TimerId
  inline def listen_stream_connection_backoff: listen_stream_connection_backoff = "listen_stream_connection_backoff".asInstanceOf[listen_stream_connection_backoff]
  
  @js.native
  sealed trait listen_stream_idle
    extends StObject
       with TimerId
       with typings.firebaseFirestore.distFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distLiteInternalMod.TimerId
       with typings.firebaseFirestore.distInternalMod.TimerId
       with typings.firebaseFirestore.distLiteFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distLitePrivateMod.TimerId
       with typings.firebaseFirestore.distPrivateMod.TimerId
  inline def listen_stream_idle: listen_stream_idle = "listen_stream_idle".asInstanceOf[listen_stream_idle]
  
  @js.native
  sealed trait lru_garbage_collection
    extends StObject
       with TimerId
       with typings.firebaseFirestore.distFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distLiteInternalMod.TimerId
       with typings.firebaseFirestore.distInternalMod.TimerId
       with typings.firebaseFirestore.distLiteFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distLitePrivateMod.TimerId
       with typings.firebaseFirestore.distPrivateMod.TimerId
  inline def lru_garbage_collection: lru_garbage_collection = "lru_garbage_collection".asInstanceOf[lru_garbage_collection]
  
  @js.native
  sealed trait maybeGarbageCollectMultiClientState
    extends StObject
       with PersistenceAction
       with typings.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def maybeGarbageCollectMultiClientState: maybeGarbageCollectMultiClientState = "maybeGarbageCollectMultiClientState".asInstanceOf[maybeGarbageCollectMultiClientState]
  
  @js.native
  sealed trait media
    extends StObject
       with ProjectsDatabasesDocumentsApiClientAlt
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientAlt
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientAlt
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientAlt
       with ProjectsDatabasesIndexesApiClientAlt
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientAlt
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientAlt
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientAlt
  inline def media: media = "media".asInstanceOf[media]
  
  @js.native
  sealed trait modified
    extends StObject
       with DocumentChangeType
       with typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentChangeType
       with typings.firebaseFirestore.distInternalMod.DocumentChangeType
       with typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.DocumentChangeType
       with typings.firebaseFirestore.distLiteFirestoreSrcApiSnapshotMod.DocumentChangeType
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.DocumentChangeType
       with typings.firebaseFirestore.distPrivateMod.DocumentChangeType
  inline def modified: modified = "modified".asInstanceOf[modified]
  
  @js.native
  sealed trait mutationResult
    extends StObject
       with StreamEventType
       with typings.firebaseFirestore.distLiteFirestoreTestIntegrationRemoteStreamDottestMod.StreamEventType
       with typings.firebaseFirestore.distLitePackagesFirestoreTestIntegrationRemoteStreamDottestMod.StreamEventType
       with typings.firebaseFirestore.distFirestoreTestIntegrationRemoteStreamDottestMod.StreamEventType
  inline def mutationResult: mutationResult = "mutationResult".asInstanceOf[mutationResult]
  
  @js.native
  sealed trait `non-empty string`
    extends StObject
       with ValidationType
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilInputValidationMod.ValidationType
       with typings.firebaseFirestore.distLiteFirestoreSrcUtilInputValidationMod.ValidationType
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilInputValidationMod.ValidationType
  inline def `non-empty string`: `non-empty string` = ("non-empty string").asInstanceOf[`non-empty string`]
  
  @js.native
  sealed trait none
    extends StObject
       with ServerTimestampBehavior
       with typings.firebaseFirestore.distInternalMod.ServerTimestampBehavior
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiUserDataWriterMod.ServerTimestampBehavior
       with typings.firebaseFirestore.distLiteFirestoreSrcLiteApiUserDataWriterMod.ServerTimestampBehavior
       with typings.firebaseFirestore.distLitePrivateMod.ServerTimestampBehavior
       with typings.firebaseFirestore.distPrivateMod.ServerTimestampBehavior
       with typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiUserDataWriterMod.ServerTimestampBehavior
       with typings.firebaseFirestore.distFirestoreSrcLiteApiUserDataWriterMod.ServerTimestampBehavior
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait `not-current`
    extends StObject
       with QueryTargetState
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcLocalSharedClientStateSyncerMod.QueryTargetState
       with typings.firebaseFirestore.distPackagesFirestoreSrcLocalSharedClientStateSyncerMod.QueryTargetState
       with typings.firebaseFirestore.distPrivateMod.QueryTargetState
       with typings.firebaseFirestore.distFirestoreSrcLocalSharedClientStateSyncerMod.QueryTargetState
       with typings.firebaseFirestore.distLiteFirestoreSrcLocalSharedClientStateSyncerMod.QueryTargetState
  inline def `not-current`: `not-current` = "not-current".asInstanceOf[`not-current`]
  
  @js.native
  sealed trait `not-found`
    extends StObject
       with FirestoreErrorCode
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typings.firebaseFirestore.mod.FirestoreErrorCode
       with typings.firebaseFirestore.distLiteInternalMod.FirestoreErrorCode
       with typings.firebaseFirestore.distInternalMod.FirestoreErrorCode
       with typings.firebaseFirestore.distLiteMod.FirestoreErrorCode
       with typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typings.firebaseFirestore.distLitePrivateMod.FirestoreErrorCode
       with typings.firebaseFirestore.distPrivateMod.FirestoreErrorCode
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
  inline def `not-found`: `not-found` = "not-found".asInstanceOf[`not-found`]
  
  @js.native
  sealed trait `not-in`
    extends StObject
       with Operator
       with typings.firebaseFirestore.distPackagesFirestoreSrcCoreTargetMod.Operator
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreTargetMod.Operator
       with typings.firebaseFirestore.distFirestoreSrcCoreTargetMod.Operator
       with WhereFilterOp
       with typings.firebaseFirestore.distLiteInternalMod.WhereFilterOp
       with typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typings.firebaseFirestore.distInternalMod.WhereFilterOp
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typings.firebaseFirestore.distLiteMod.WhereFilterOp
       with typings.firebaseFirestore.distLitePrivateMod.WhereFilterOp
       with typings.firebaseFirestore.distPrivateMod.WhereFilterOp
       with typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
  inline def `not-in`: `not-in` = "not-in".asInstanceOf[`not-in`]
  
  @js.native
  sealed trait notifyLocalViewChanges
    extends StObject
       with PersistenceAction
       with typings.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def notifyLocalViewChanges: notifyLocalViewChanges = "notifyLocalViewChanges".asInstanceOf[notifyLocalViewChanges]
  
  @js.native
  sealed trait number
    extends StObject
       with ValidationType
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilInputValidationMod.ValidationType
       with typings.firebaseFirestore.distLiteFirestoreSrcUtilInputValidationMod.ValidationType
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilInputValidationMod.ValidationType
  inline def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait `object`
    extends StObject
       with ValidationType
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilInputValidationMod.ValidationType
       with typings.firebaseFirestore.distLiteFirestoreSrcUtilInputValidationMod.ValidationType
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilInputValidationMod.ValidationType
  inline def `object`: `object` = "object".asInstanceOf[`object`]
  
  @js.native
  sealed trait online_state_timeout
    extends StObject
       with TimerId
       with typings.firebaseFirestore.distFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distLiteInternalMod.TimerId
       with typings.firebaseFirestore.distInternalMod.TimerId
       with typings.firebaseFirestore.distLiteFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distLitePrivateMod.TimerId
       with typings.firebaseFirestore.distPrivateMod.TimerId
  inline def online_state_timeout: online_state_timeout = "online_state_timeout".asInstanceOf[online_state_timeout]
  
  @js.native
  sealed trait open
    extends StObject
       with StreamEventType
       with typings.firebaseFirestore.distLiteFirestoreTestIntegrationRemoteStreamDottestMod.StreamEventType
       with typings.firebaseFirestore.distLitePackagesFirestoreTestIntegrationRemoteStreamDottestMod.StreamEventType
       with typings.firebaseFirestore.distFirestoreTestIntegrationRemoteStreamDottestMod.StreamEventType
  inline def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait orderBy
    extends StObject
       with QueryConstraintType
       with typings.firebaseFirestore.distLiteInternalMod.QueryConstraintType
       with typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typings.firebaseFirestore.distInternalMod.QueryConstraintType
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typings.firebaseFirestore.distLiteMod.QueryConstraintType
       with typings.firebaseFirestore.distLitePrivateMod.QueryConstraintType
       with typings.firebaseFirestore.distPrivateMod.QueryConstraintType
       with typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraintType
  inline def orderBy: orderBy = "orderBy".asInstanceOf[orderBy]
  
  @js.native
  sealed trait `out-of-range`
    extends StObject
       with FirestoreErrorCode
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typings.firebaseFirestore.mod.FirestoreErrorCode
       with typings.firebaseFirestore.distLiteInternalMod.FirestoreErrorCode
       with typings.firebaseFirestore.distInternalMod.FirestoreErrorCode
       with typings.firebaseFirestore.distLiteMod.FirestoreErrorCode
       with typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typings.firebaseFirestore.distLitePrivateMod.FirestoreErrorCode
       with typings.firebaseFirestore.distPrivateMod.FirestoreErrorCode
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
  inline def `out-of-range`: `out-of-range` = "out-of-range".asInstanceOf[`out-of-range`]
  
  @js.native
  sealed trait pending
    extends StObject
       with MutationBatchState
       with typings.firebaseFirestore.distLiteFirestoreSrcCoreTypesMod.MutationBatchState
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreTypesMod.MutationBatchState
       with typings.firebaseFirestore.distPackagesFirestoreSrcCoreTypesMod.MutationBatchState
  inline def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait `permission-denied`
    extends StObject
       with FirestoreErrorCode
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typings.firebaseFirestore.mod.FirestoreErrorCode
       with typings.firebaseFirestore.distLiteInternalMod.FirestoreErrorCode
       with typings.firebaseFirestore.distInternalMod.FirestoreErrorCode
       with typings.firebaseFirestore.distLiteMod.FirestoreErrorCode
       with typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typings.firebaseFirestore.distLitePrivateMod.FirestoreErrorCode
       with typings.firebaseFirestore.distPrivateMod.FirestoreErrorCode
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
  inline def `permission-denied`: `permission-denied` = "permission-denied".asInstanceOf[`permission-denied`]
  
  @js.native
  sealed trait previous
    extends StObject
       with ServerTimestampBehavior
       with typings.firebaseFirestore.distInternalMod.ServerTimestampBehavior
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiUserDataWriterMod.ServerTimestampBehavior
       with typings.firebaseFirestore.distLiteFirestoreSrcLiteApiUserDataWriterMod.ServerTimestampBehavior
       with typings.firebaseFirestore.distLitePrivateMod.ServerTimestampBehavior
       with typings.firebaseFirestore.distPrivateMod.ServerTimestampBehavior
       with typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiUserDataWriterMod.ServerTimestampBehavior
       with typings.firebaseFirestore.distFirestoreSrcLiteApiUserDataWriterMod.ServerTimestampBehavior
  inline def previous: previous = "previous".asInstanceOf[previous]
  
  @js.native
  sealed trait proto
    extends StObject
       with ProjectsDatabasesDocumentsApiClientAlt
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientAlt
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientAlt
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientAlt
       with ProjectsDatabasesIndexesApiClientAlt
       with typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientAlt
       with typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientAlt
       with typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientAlt
  inline def proto: proto = "proto".asInstanceOf[proto]
  
  @js.native
  sealed trait provider extends StObject
  inline def provider: provider = "provider".asInstanceOf[provider]
  
  @js.native
  sealed trait query extends StObject
  inline def query: query = "query".asInstanceOf[query]
  
  @js.native
  sealed trait `read document`
    extends StObject
       with PersistenceAction
       with typings.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `read document`: `read document` = ("read document").asInstanceOf[`read document`]
  
  @js.native
  sealed trait readonly
    extends StObject
       with PersistenceTransactionMode
       with typings.firebaseFirestore.distInternalMod.PersistenceTransactionMode
       with typings.firebaseFirestore.distPackagesFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransactionMode
       with typings.firebaseFirestore.distPrivateMod.PersistenceTransactionMode
       with typings.firebaseFirestore.distFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransactionMode
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransactionMode
       with SimpleDbTransactionMode
       with typings.firebaseFirestore.distFirestoreSrcLocalSimpleDbMod.SimpleDbTransactionMode
       with typings.firebaseFirestore.distPackagesFirestoreSrcLocalSimpleDbMod.SimpleDbTransactionMode
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcLocalSimpleDbMod.SimpleDbTransactionMode
  inline def readonly: readonly = "readonly".asInstanceOf[readonly]
  
  @js.native
  sealed trait readwrite
    extends StObject
       with PersistenceTransactionMode
       with typings.firebaseFirestore.distInternalMod.PersistenceTransactionMode
       with typings.firebaseFirestore.distPackagesFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransactionMode
       with typings.firebaseFirestore.distPrivateMod.PersistenceTransactionMode
       with typings.firebaseFirestore.distFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransactionMode
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransactionMode
       with SimpleDbTransactionMode
       with typings.firebaseFirestore.distFirestoreSrcLocalSimpleDbMod.SimpleDbTransactionMode
       with typings.firebaseFirestore.distPackagesFirestoreSrcLocalSimpleDbMod.SimpleDbTransactionMode
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcLocalSimpleDbMod.SimpleDbTransactionMode
  inline def readwrite: readwrite = "readwrite".asInstanceOf[readwrite]
  
  @js.native
  sealed trait `readwrite-primary`
    extends StObject
       with PersistenceTransactionMode
       with typings.firebaseFirestore.distInternalMod.PersistenceTransactionMode
       with typings.firebaseFirestore.distPackagesFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransactionMode
       with typings.firebaseFirestore.distPrivateMod.PersistenceTransactionMode
       with typings.firebaseFirestore.distFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransactionMode
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransactionMode
  inline def `readwrite-primary`: `readwrite-primary` = "readwrite-primary".asInstanceOf[`readwrite-primary`]
  
  @js.native
  sealed trait rejected
    extends StObject
       with MutationBatchState
       with typings.firebaseFirestore.distLiteFirestoreSrcCoreTypesMod.MutationBatchState
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreTypesMod.MutationBatchState
       with typings.firebaseFirestore.distPackagesFirestoreSrcCoreTypesMod.MutationBatchState
       with QueryTargetState
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcLocalSharedClientStateSyncerMod.QueryTargetState
       with typings.firebaseFirestore.distPackagesFirestoreSrcLocalSharedClientStateSyncerMod.QueryTargetState
       with typings.firebaseFirestore.distPrivateMod.QueryTargetState
       with typings.firebaseFirestore.distFirestoreSrcLocalSharedClientStateSyncerMod.QueryTargetState
       with typings.firebaseFirestore.distLiteFirestoreSrcLocalSharedClientStateSyncerMod.QueryTargetState
  inline def rejected: rejected = "rejected".asInstanceOf[rejected]
  
  @js.native
  sealed trait removed
    extends StObject
       with DocumentChangeType
       with typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentChangeType
       with typings.firebaseFirestore.distInternalMod.DocumentChangeType
       with typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.DocumentChangeType
       with typings.firebaseFirestore.distLiteFirestoreSrcApiSnapshotMod.DocumentChangeType
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.DocumentChangeType
       with typings.firebaseFirestore.distPrivateMod.DocumentChangeType
  inline def removed: removed = "removed".asInstanceOf[removed]
  
  @js.native
  sealed trait `resource-exhausted`
    extends StObject
       with FirestoreErrorCode
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typings.firebaseFirestore.mod.FirestoreErrorCode
       with typings.firebaseFirestore.distLiteInternalMod.FirestoreErrorCode
       with typings.firebaseFirestore.distInternalMod.FirestoreErrorCode
       with typings.firebaseFirestore.distLiteMod.FirestoreErrorCode
       with typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typings.firebaseFirestore.distLitePrivateMod.FirestoreErrorCode
       with typings.firebaseFirestore.distPrivateMod.FirestoreErrorCode
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
  inline def `resource-exhausted`: `resource-exhausted` = "resource-exhausted".asInstanceOf[`resource-exhausted`]
  
  @js.native
  sealed trait startAfter
    extends StObject
       with QueryConstraintType
       with typings.firebaseFirestore.distLiteInternalMod.QueryConstraintType
       with typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typings.firebaseFirestore.distInternalMod.QueryConstraintType
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typings.firebaseFirestore.distLiteMod.QueryConstraintType
       with typings.firebaseFirestore.distLitePrivateMod.QueryConstraintType
       with typings.firebaseFirestore.distPrivateMod.QueryConstraintType
       with typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraintType
  inline def startAfter: startAfter = "startAfter".asInstanceOf[startAfter]
  
  @js.native
  sealed trait startAt
    extends StObject
       with QueryConstraintType
       with typings.firebaseFirestore.distLiteInternalMod.QueryConstraintType
       with typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typings.firebaseFirestore.distInternalMod.QueryConstraintType
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typings.firebaseFirestore.distLiteMod.QueryConstraintType
       with typings.firebaseFirestore.distLitePrivateMod.QueryConstraintType
       with typings.firebaseFirestore.distPrivateMod.QueryConstraintType
       with typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraintType
  inline def startAt: startAt = "startAt".asInstanceOf[startAt]
  
  @js.native
  sealed trait string
    extends StObject
       with ValidationType
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilInputValidationMod.ValidationType
       with typings.firebaseFirestore.distLiteFirestoreSrcUtilInputValidationMod.ValidationType
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilInputValidationMod.ValidationType
  inline def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait transaction_retry
    extends StObject
       with TimerId
       with typings.firebaseFirestore.distFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distLiteInternalMod.TimerId
       with typings.firebaseFirestore.distInternalMod.TimerId
       with typings.firebaseFirestore.distLiteFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distLitePrivateMod.TimerId
       with typings.firebaseFirestore.distPrivateMod.TimerId
  inline def transaction_retry: transaction_retry = "transaction_retry".asInstanceOf[transaction_retry]
  
  @js.native
  sealed trait unauthenticated
    extends StObject
       with FirestoreErrorCode
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typings.firebaseFirestore.mod.FirestoreErrorCode
       with typings.firebaseFirestore.distLiteInternalMod.FirestoreErrorCode
       with typings.firebaseFirestore.distInternalMod.FirestoreErrorCode
       with typings.firebaseFirestore.distLiteMod.FirestoreErrorCode
       with typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typings.firebaseFirestore.distLitePrivateMod.FirestoreErrorCode
       with typings.firebaseFirestore.distPrivateMod.FirestoreErrorCode
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
  inline def unauthenticated: unauthenticated = "unauthenticated".asInstanceOf[unauthenticated]
  
  @js.native
  sealed trait unavailable
    extends StObject
       with FirestoreErrorCode
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typings.firebaseFirestore.mod.FirestoreErrorCode
       with typings.firebaseFirestore.distLiteInternalMod.FirestoreErrorCode
       with typings.firebaseFirestore.distInternalMod.FirestoreErrorCode
       with typings.firebaseFirestore.distLiteMod.FirestoreErrorCode
       with typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typings.firebaseFirestore.distLitePrivateMod.FirestoreErrorCode
       with typings.firebaseFirestore.distPrivateMod.FirestoreErrorCode
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
  inline def unavailable: unavailable = "unavailable".asInstanceOf[unavailable]
  
  @js.native
  sealed trait undefined
    extends StObject
       with ValidationType
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilInputValidationMod.ValidationType
       with typings.firebaseFirestore.distLiteFirestoreSrcUtilInputValidationMod.ValidationType
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilInputValidationMod.ValidationType
  inline def undefined: undefined = "undefined".asInstanceOf[undefined]
  
  @js.native
  sealed trait unimplemented
    extends StObject
       with FirestoreErrorCode
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typings.firebaseFirestore.mod.FirestoreErrorCode
       with typings.firebaseFirestore.distLiteInternalMod.FirestoreErrorCode
       with typings.firebaseFirestore.distInternalMod.FirestoreErrorCode
       with typings.firebaseFirestore.distLiteMod.FirestoreErrorCode
       with typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typings.firebaseFirestore.distLitePrivateMod.FirestoreErrorCode
       with typings.firebaseFirestore.distPrivateMod.FirestoreErrorCode
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
  inline def unimplemented: unimplemented = "unimplemented".asInstanceOf[unimplemented]
  
  @js.native
  sealed trait unknown_
    extends StObject
       with FirestoreErrorCode
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typings.firebaseFirestore.mod.FirestoreErrorCode
       with typings.firebaseFirestore.distLiteInternalMod.FirestoreErrorCode
       with typings.firebaseFirestore.distInternalMod.FirestoreErrorCode
       with typings.firebaseFirestore.distLiteMod.FirestoreErrorCode
       with typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typings.firebaseFirestore.distLitePrivateMod.FirestoreErrorCode
       with typings.firebaseFirestore.distPrivateMod.FirestoreErrorCode
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
  inline def unknown_ : unknown_ = "unknown".asInstanceOf[unknown_]
  
  @js.native
  sealed trait updateClientMetadataAndTryBecomePrimary
    extends StObject
       with PersistenceAction
       with typings.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typings.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def updateClientMetadataAndTryBecomePrimary: updateClientMetadataAndTryBecomePrimary = "updateClientMetadataAndTryBecomePrimary".asInstanceOf[updateClientMetadataAndTryBecomePrimary]
  
  @js.native
  sealed trait watchChange
    extends StObject
       with StreamEventType
       with typings.firebaseFirestore.distLiteFirestoreTestIntegrationRemoteStreamDottestMod.StreamEventType
       with typings.firebaseFirestore.distLitePackagesFirestoreTestIntegrationRemoteStreamDottestMod.StreamEventType
       with typings.firebaseFirestore.distFirestoreTestIntegrationRemoteStreamDottestMod.StreamEventType
  inline def watchChange: watchChange = "watchChange".asInstanceOf[watchChange]
  
  @js.native
  sealed trait where
    extends StObject
       with QueryConstraintType
       with typings.firebaseFirestore.distLiteInternalMod.QueryConstraintType
       with typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typings.firebaseFirestore.distInternalMod.QueryConstraintType
       with typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typings.firebaseFirestore.distLiteMod.QueryConstraintType
       with typings.firebaseFirestore.distLitePrivateMod.QueryConstraintType
       with typings.firebaseFirestore.distPrivateMod.QueryConstraintType
       with typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraintType
  inline def where: where = "where".asInstanceOf[where]
  
  @js.native
  sealed trait write_stream_connection_backoff
    extends StObject
       with TimerId
       with typings.firebaseFirestore.distFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distLiteInternalMod.TimerId
       with typings.firebaseFirestore.distInternalMod.TimerId
       with typings.firebaseFirestore.distLiteFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distLitePrivateMod.TimerId
       with typings.firebaseFirestore.distPrivateMod.TimerId
  inline def write_stream_connection_backoff: write_stream_connection_backoff = "write_stream_connection_backoff".asInstanceOf[write_stream_connection_backoff]
  
  @js.native
  sealed trait write_stream_idle
    extends StObject
       with TimerId
       with typings.firebaseFirestore.distFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distLiteInternalMod.TimerId
       with typings.firebaseFirestore.distInternalMod.TimerId
       with typings.firebaseFirestore.distLiteFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distPackagesFirestoreSrcUtilAsyncQueueMod.TimerId
       with typings.firebaseFirestore.distLitePrivateMod.TimerId
       with typings.firebaseFirestore.distPrivateMod.TimerId
  inline def write_stream_idle: write_stream_idle = "write_stream_idle".asInstanceOf[write_stream_idle]
}
