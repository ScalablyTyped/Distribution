package typings.firebaseFirestore

import typings.firebaseFirestore.distFirestoreSrcCoreBoundMod.Bound
import typings.firebaseFirestore.distFirestoreSrcCoreDatabaseInfoMod.DatabaseId
import typings.firebaseFirestore.distFirestoreSrcCoreFilterMod.CompositeOperator
import typings.firebaseFirestore.distFirestoreSrcCoreFilterMod.FieldFilter
import typings.firebaseFirestore.distFirestoreSrcCoreFilterMod.Filter
import typings.firebaseFirestore.distFirestoreSrcCoreFilterMod.Operator
import typings.firebaseFirestore.distFirestoreSrcCoreOrderByMod.Direction
import typings.firebaseFirestore.distFirestoreSrcCoreOrderByMod.OrderBy
import typings.firebaseFirestore.distFirestoreSrcCoreQueryMod.LimitType
import typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.Query
import typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot
import typings.firebaseFirestore.distFirestoreSrcLiteApiUserDataReaderMod.UserDataReader
import typings.firebaseFirestore.distFirestoreSrcModelDocumentMod.Document
import typings.firebaseFirestore.distFirestoreSrcModelPathMod.FieldPath
import typings.firebaseFirestore.firebaseFirestoreStrings.and_
import typings.firebaseFirestore.firebaseFirestoreStrings.endAt
import typings.firebaseFirestore.firebaseFirestoreStrings.endBefore
import typings.firebaseFirestore.firebaseFirestoreStrings.in_
import typings.firebaseFirestore.firebaseFirestoreStrings.limit
import typings.firebaseFirestore.firebaseFirestoreStrings.limitToLast_
import typings.firebaseFirestore.firebaseFirestoreStrings.or_
import typings.firebaseFirestore.firebaseFirestoreStrings.startAfter
import typings.firebaseFirestore.firebaseFirestoreStrings.startAt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreSrcLiteApiQueryMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/lite-api/query", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@firebase/firestore/dist/firestore/src/lite-api/query", "AppliableConstraint")
  @js.native
  open class AppliableConstraint () extends StObject {
    
    /**
      * Takes the provided {@link Query} and returns a copy of the {@link Query} with this
      * {@link AppliableConstraint} applied.
      */
    def _apply[T](query: Query[T]): Query[T] = js.native
  }
  
  @JSImport("@firebase/firestore/dist/firestore/src/lite-api/query", "QueryCompositeFilterConstraint")
  @js.native
  open class QueryCompositeFilterConstraint protected ()
    extends AppliableConstraint
       with QueryFilterConstraint {
    /**
      * @internal
      */
    /* protected */ def this(
      /** The type of this query constraint */
    `type`: or_ | and_,
      _queryConstraints: js.Array[QueryFilterConstraint]
    ) = this()
    
    def _getOperator(): CompositeOperator = js.native
    
    def _getQueryConstraints(): js.Array[AppliableConstraint] = js.native
    
    def _parse[T](query: Query[T]): Filter = js.native
    
    /* private */ val _queryConstraints: Any = js.native
    
    /** The type of this query constraint */
    val `type`: or_ | and_ = js.native
  }
  /* static members */
  object QueryCompositeFilterConstraint {
    
    @JSImport("@firebase/firestore/dist/firestore/src/lite-api/query", "QueryCompositeFilterConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _create(`type`: or_ | and_, _queryConstraints: js.Array[QueryFilterConstraint]): QueryCompositeFilterConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(`type`.asInstanceOf[js.Any], _queryConstraints.asInstanceOf[js.Any])).asInstanceOf[QueryCompositeFilterConstraint]
  }
  
  /* note: abstract class */ @JSImport("@firebase/firestore/dist/firestore/src/lite-api/query", "QueryConstraint")
  @js.native
  open class QueryConstraint () extends AppliableConstraint {
    
    /** The type of this query constraint */
    val `type`: QueryConstraintType = js.native
  }
  
  @JSImport("@firebase/firestore/dist/firestore/src/lite-api/query", "QueryEndAtConstraint")
  @js.native
  open class QueryEndAtConstraint protected ()
    extends QueryConstraint
       with QueryNonFilterConstraint {
    /**
      * @internal
      */
    /* protected */ def this(
      /** The type of this query constraint */
    `type`: endBefore | endAt,
      _docOrFields: js.Array[Any | DocumentSnapshot[Any]],
      _inclusive: Boolean
    ) = this()
    
    /* private */ val _docOrFields: Any = js.native
    
    /* private */ val _inclusive: Any = js.native
    
    /** The type of this query constraint */
    @JSName("type")
    val type_QueryEndAtConstraint: endBefore | endAt = js.native
  }
  /* static members */
  object QueryEndAtConstraint {
    
    @JSImport("@firebase/firestore/dist/firestore/src/lite-api/query", "QueryEndAtConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _create(
      `type`: endBefore | endAt,
      _docOrFields: js.Array[Any | DocumentSnapshot[Any]],
      _inclusive: Boolean
    ): QueryEndAtConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(`type`.asInstanceOf[js.Any], _docOrFields.asInstanceOf[js.Any], _inclusive.asInstanceOf[js.Any])).asInstanceOf[QueryEndAtConstraint]
  }
  
  @JSImport("@firebase/firestore/dist/firestore/src/lite-api/query", "QueryFieldFilterConstraint")
  @js.native
  open class QueryFieldFilterConstraint protected ()
    extends QueryConstraint
       with QueryFilterConstraint {
    /**
      * @internal
      */
    /* protected */ def this(_field: FieldPath, _op: Operator, _value: Any) = this()
    
    /* private */ val _field: Any = js.native
    
    /* private */ var _op: Any = js.native
    
    def _parse[T](query: Query[T]): FieldFilter = js.native
    
    /* private */ var _value: Any = js.native
    
    /** The type of this query constraint */
    @JSName("type")
    val type_QueryFieldFilterConstraint: /* "where" */ String = js.native
  }
  /* static members */
  object QueryFieldFilterConstraint {
    
    @JSImport("@firebase/firestore/dist/firestore/src/lite-api/query", "QueryFieldFilterConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _create(_field: FieldPath, _op: Operator, _value: Any): QueryFieldFilterConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(_field.asInstanceOf[js.Any], _op.asInstanceOf[js.Any], _value.asInstanceOf[js.Any])).asInstanceOf[QueryFieldFilterConstraint]
  }
  
  @JSImport("@firebase/firestore/dist/firestore/src/lite-api/query", "QueryLimitConstraint")
  @js.native
  open class QueryLimitConstraint protected ()
    extends QueryConstraint
       with QueryNonFilterConstraint {
    /**
      * @internal
      */
    /* protected */ def this(
      /** The type of this query constraint */
    `type`: limit | limitToLast_,
      _limit: Double,
      _limitType: LimitType
    ) = this()
    
    /* private */ val _limit: Any = js.native
    
    /* private */ val _limitType: Any = js.native
    
    /** The type of this query constraint */
    @JSName("type")
    val type_QueryLimitConstraint: limit | limitToLast_ = js.native
  }
  /* static members */
  object QueryLimitConstraint {
    
    @JSImport("@firebase/firestore/dist/firestore/src/lite-api/query", "QueryLimitConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _create(`type`: limit | limitToLast_, _limit: Double, _limitType: LimitType): QueryLimitConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(`type`.asInstanceOf[js.Any], _limit.asInstanceOf[js.Any], _limitType.asInstanceOf[js.Any])).asInstanceOf[QueryLimitConstraint]
  }
  
  @JSImport("@firebase/firestore/dist/firestore/src/lite-api/query", "QueryOrderByConstraint")
  @js.native
  open class QueryOrderByConstraint protected ()
    extends QueryConstraint
       with QueryNonFilterConstraint {
    /**
      * @internal
      */
    /* protected */ def this(_field: FieldPath, _direction: Direction) = this()
    
    /* private */ var _direction: Any = js.native
    
    /* private */ val _field: Any = js.native
    
    /** The type of this query constraint */
    @JSName("type")
    val type_QueryOrderByConstraint: /* "orderBy" */ String = js.native
  }
  /* static members */
  object QueryOrderByConstraint {
    
    @JSImport("@firebase/firestore/dist/firestore/src/lite-api/query", "QueryOrderByConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _create(_field: FieldPath, _direction: Direction): QueryOrderByConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(_field.asInstanceOf[js.Any], _direction.asInstanceOf[js.Any])).asInstanceOf[QueryOrderByConstraint]
  }
  
  @JSImport("@firebase/firestore/dist/firestore/src/lite-api/query", "QueryStartAtConstraint")
  @js.native
  open class QueryStartAtConstraint protected ()
    extends QueryConstraint
       with QueryNonFilterConstraint {
    /**
      * @internal
      */
    /* protected */ def this(
      /** The type of this query constraint */
    `type`: startAt | startAfter,
      _docOrFields: js.Array[Any | DocumentSnapshot[Any]],
      _inclusive: Boolean
    ) = this()
    
    /* private */ val _docOrFields: Any = js.native
    
    /* private */ val _inclusive: Any = js.native
    
    /** The type of this query constraint */
    @JSName("type")
    val type_QueryStartAtConstraint: startAt | startAfter = js.native
  }
  /* static members */
  object QueryStartAtConstraint {
    
    @JSImport("@firebase/firestore/dist/firestore/src/lite-api/query", "QueryStartAtConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _create(
      `type`: startAt | startAfter,
      _docOrFields: js.Array[Any | DocumentSnapshot[Any]],
      _inclusive: Boolean
    ): QueryStartAtConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(`type`.asInstanceOf[js.Any], _docOrFields.asInstanceOf[js.Any], _inclusive.asInstanceOf[js.Any])).asInstanceOf[QueryStartAtConstraint]
  }
  
  inline def and(queryConstraints: QueryFilterConstraint*): QueryCompositeFilterConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(queryConstraints.asInstanceOf[Seq[js.Any]]*).asInstanceOf[QueryCompositeFilterConstraint]
  
  inline def endAt(fieldValues: Any*): QueryEndAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[QueryEndAtConstraint]
  inline def endAt(snapshot: DocumentSnapshot[Any]): QueryEndAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[QueryEndAtConstraint]
  
  inline def endBefore(fieldValues: Any*): QueryEndAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[QueryEndAtConstraint]
  inline def endBefore(snapshot: DocumentSnapshot[Any]): QueryEndAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(snapshot.asInstanceOf[js.Any]).asInstanceOf[QueryEndAtConstraint]
  
  inline def limit(limit: Double): QueryLimitConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limit")(limit.asInstanceOf[js.Any]).asInstanceOf[QueryLimitConstraint]
  
  inline def limitToLast(limit: Double): QueryLimitConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToLast")(limit.asInstanceOf[js.Any]).asInstanceOf[QueryLimitConstraint]
  
  inline def newQueryBoundFromDocument(
    query: typings.firebaseFirestore.distFirestoreSrcCoreQueryMod.Query,
    databaseId: DatabaseId,
    methodName: String,
    doc: Null,
    inclusive: Boolean
  ): Bound = (^.asInstanceOf[js.Dynamic].applyDynamic("newQueryBoundFromDocument")(query.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], doc.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[Bound]
  inline def newQueryBoundFromDocument(
    query: typings.firebaseFirestore.distFirestoreSrcCoreQueryMod.Query,
    databaseId: DatabaseId,
    methodName: String,
    doc: Document,
    inclusive: Boolean
  ): Bound = (^.asInstanceOf[js.Dynamic].applyDynamic("newQueryBoundFromDocument")(query.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], doc.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[Bound]
  
  inline def newQueryBoundFromFields(
    query: typings.firebaseFirestore.distFirestoreSrcCoreQueryMod.Query,
    databaseId: DatabaseId,
    dataReader: UserDataReader,
    methodName: String,
    values: js.Array[Any],
    inclusive: Boolean
  ): Bound = (^.asInstanceOf[js.Dynamic].applyDynamic("newQueryBoundFromFields")(query.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any], dataReader.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], values.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[Bound]
  
  inline def newQueryFilter(
    query: typings.firebaseFirestore.distFirestoreSrcCoreQueryMod.Query,
    methodName: String,
    dataReader: UserDataReader,
    databaseId: DatabaseId,
    fieldPath: FieldPath,
    op: Operator,
    value: Any
  ): FieldFilter = (^.asInstanceOf[js.Dynamic].applyDynamic("newQueryFilter")(query.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], dataReader.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any], fieldPath.asInstanceOf[js.Any], op.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[FieldFilter]
  
  inline def newQueryOrderBy(
    query: typings.firebaseFirestore.distFirestoreSrcCoreQueryMod.Query,
    fieldPath: FieldPath,
    direction: Direction
  ): OrderBy = (^.asInstanceOf[js.Dynamic].applyDynamic("newQueryOrderBy")(query.asInstanceOf[js.Any], fieldPath.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[OrderBy]
  
  inline def or(queryConstraints: QueryFilterConstraint*): QueryCompositeFilterConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(queryConstraints.asInstanceOf[Seq[js.Any]]*).asInstanceOf[QueryCompositeFilterConstraint]
  
  inline def orderBy(fieldPath: String): QueryOrderByConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[QueryOrderByConstraint]
  inline def orderBy(fieldPath: String, directionStr: OrderByDirection): QueryOrderByConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[QueryOrderByConstraint]
  inline def orderBy(fieldPath: typings.firebaseFirestore.distFirestoreSrcLiteApiFieldPathMod.FieldPath): QueryOrderByConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[QueryOrderByConstraint]
  inline def orderBy(
    fieldPath: typings.firebaseFirestore.distFirestoreSrcLiteApiFieldPathMod.FieldPath,
    directionStr: OrderByDirection
  ): QueryOrderByConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[QueryOrderByConstraint]
  
  inline def query[T](
    query: Query[T],
    compositeFilter: QueryCompositeFilterConstraint,
    queryConstraints: QueryNonFilterConstraint*
  ): Query[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("query")((scala.List(query.asInstanceOf[js.Any], compositeFilter.asInstanceOf[js.Any])).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Query[T]]
  inline def query[T](query: Query[T], queryConstraints: QueryConstraint*): Query[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(scala.List(query.asInstanceOf[js.Any]).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Query[T]]
  
  inline def startAfter(fieldValues: Any*): QueryStartAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[QueryStartAtConstraint]
  inline def startAfter(snapshot: DocumentSnapshot[Any]): QueryStartAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(snapshot.asInstanceOf[js.Any]).asInstanceOf[QueryStartAtConstraint]
  
  inline def startAt(fieldValues: Any*): QueryStartAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[QueryStartAtConstraint]
  inline def startAt(snapshot: DocumentSnapshot[Any]): QueryStartAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[QueryStartAtConstraint]
  
  inline def validateHasExplicitOrderByForLimitToLast(query: typings.firebaseFirestore.distFirestoreSrcCoreQueryMod.Query): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateHasExplicitOrderByForLimitToLast")(query.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateQueryFilterConstraint(functionName: String, queryConstraint: AppliableConstraint): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateQueryFilterConstraint")(functionName.asInstanceOf[js.Any], queryConstraint.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def where(fieldPath: String, opStr: WhereFilterOp, value: Any): QueryFieldFilterConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[QueryFieldFilterConstraint]
  inline def where(
    fieldPath: typings.firebaseFirestore.distFirestoreSrcLiteApiFieldPathMod.FieldPath,
    opStr: WhereFilterOp,
    value: Any
  ): QueryFieldFilterConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[QueryFieldFilterConstraint]
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreStrings.desc
    - typings.firebaseFirestore.firebaseFirestoreStrings.asc
  */
  trait OrderByDirection extends StObject
  object OrderByDirection {
    
    inline def asc: typings.firebaseFirestore.firebaseFirestoreStrings.asc = "asc".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.asc]
    
    inline def desc: typings.firebaseFirestore.firebaseFirestoreStrings.desc = "desc".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.desc]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreStrings.where
    - typings.firebaseFirestore.firebaseFirestoreStrings.orderBy
    - typings.firebaseFirestore.firebaseFirestoreStrings.limit
    - typings.firebaseFirestore.firebaseFirestoreStrings.limitToLast_
    - typings.firebaseFirestore.firebaseFirestoreStrings.startAt
    - typings.firebaseFirestore.firebaseFirestoreStrings.startAfter
    - typings.firebaseFirestore.firebaseFirestoreStrings.endAt
    - typings.firebaseFirestore.firebaseFirestoreStrings.endBefore
  */
  trait QueryConstraintType extends StObject
  object QueryConstraintType {
    
    inline def endAt: typings.firebaseFirestore.firebaseFirestoreStrings.endAt = "endAt".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.endAt]
    
    inline def endBefore: typings.firebaseFirestore.firebaseFirestoreStrings.endBefore = "endBefore".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.endBefore]
    
    inline def limit: typings.firebaseFirestore.firebaseFirestoreStrings.limit = "limit".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.limit]
    
    inline def limitToLast: limitToLast_ = "limitToLast".asInstanceOf[limitToLast_]
    
    inline def orderBy: typings.firebaseFirestore.firebaseFirestoreStrings.orderBy = "orderBy".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.orderBy]
    
    inline def startAfter: typings.firebaseFirestore.firebaseFirestoreStrings.startAfter = "startAfter".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.startAfter]
    
    inline def startAt: typings.firebaseFirestore.firebaseFirestoreStrings.startAt = "startAt".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.startAt]
    
    inline def where: typings.firebaseFirestore.firebaseFirestoreStrings.where = "where".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.where]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryFieldFilterConstraint
    - typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryCompositeFilterConstraint
  */
  trait QueryFilterConstraint extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint
    - typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryLimitConstraint
    - typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint
    - typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint
  */
  trait QueryNonFilterConstraint extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreStrings.Lessthansign
    - typings.firebaseFirestore.firebaseFirestoreStrings.LessthansignEqualssign
    - typings.firebaseFirestore.firebaseFirestoreStrings.EqualssignEqualssign
    - typings.firebaseFirestore.firebaseFirestoreStrings.ExclamationmarkEqualssign
    - typings.firebaseFirestore.firebaseFirestoreStrings.GreaterthansignEqualssign
    - typings.firebaseFirestore.firebaseFirestoreStrings.Greaterthansign
    - typings.firebaseFirestore.firebaseFirestoreStrings.`array-contains`
    - typings.firebaseFirestore.firebaseFirestoreStrings.in_
    - typings.firebaseFirestore.firebaseFirestoreStrings.`array-contains-any`
    - typings.firebaseFirestore.firebaseFirestoreStrings.`not-in`
  */
  trait WhereFilterOp extends StObject
  object WhereFilterOp {
    
    inline def EqualssignEqualssign: typings.firebaseFirestore.firebaseFirestoreStrings.EqualssignEqualssign = "==".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.EqualssignEqualssign]
    
    inline def ExclamationmarkEqualssign: typings.firebaseFirestore.firebaseFirestoreStrings.ExclamationmarkEqualssign = "!=".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.ExclamationmarkEqualssign]
    
    inline def Greaterthansign: typings.firebaseFirestore.firebaseFirestoreStrings.Greaterthansign = ">".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.Greaterthansign]
    
    inline def GreaterthansignEqualssign: typings.firebaseFirestore.firebaseFirestoreStrings.GreaterthansignEqualssign = ">=".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.GreaterthansignEqualssign]
    
    inline def Lessthansign: typings.firebaseFirestore.firebaseFirestoreStrings.Lessthansign = "<".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.Lessthansign]
    
    inline def LessthansignEqualssign: typings.firebaseFirestore.firebaseFirestoreStrings.LessthansignEqualssign = "<=".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.LessthansignEqualssign]
    
    inline def `array-contains`: typings.firebaseFirestore.firebaseFirestoreStrings.`array-contains` = "array-contains".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.`array-contains`]
    
    inline def `array-contains-any`: typings.firebaseFirestore.firebaseFirestoreStrings.`array-contains-any` = "array-contains-any".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.`array-contains-any`]
    
    inline def in: in_ = "in".asInstanceOf[in_]
    
    inline def `not-in`: typings.firebaseFirestore.firebaseFirestoreStrings.`not-in` = "not-in".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.`not-in`]
  }
}
