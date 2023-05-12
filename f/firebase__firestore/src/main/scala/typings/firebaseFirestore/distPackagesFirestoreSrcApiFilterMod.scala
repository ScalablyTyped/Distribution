package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcCoreFilterMod.Operator
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreOrderByMod.Direction
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.LimitType
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.OrderByDirection
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryFilterConstraint
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryNonFilterConstraint
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.Query
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot
import typings.firebaseFirestore.distPackagesFirestoreSrcModelPathMod.FieldPath
import typings.firebaseFirestore.firebaseFirestoreStrings.and_
import typings.firebaseFirestore.firebaseFirestoreStrings.endAt
import typings.firebaseFirestore.firebaseFirestoreStrings.endBefore
import typings.firebaseFirestore.firebaseFirestoreStrings.limit
import typings.firebaseFirestore.firebaseFirestoreStrings.limitToLast_
import typings.firebaseFirestore.firebaseFirestoreStrings.or_
import typings.firebaseFirestore.firebaseFirestoreStrings.startAfter
import typings.firebaseFirestore.firebaseFirestoreStrings.startAt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcApiFilterMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/api/filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/api/filter", "QueryCompositeFilterConstraint")
  @js.native
  open class QueryCompositeFilterConstraint protected ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryCompositeFilterConstraint {
    /**
      * @internal
      */
    /* protected */ def this(
      /** The type of this query constraint */
    `type`: or_ | and_,
      _queryConstraints: js.Array[QueryFilterConstraint]
    ) = this()
  }
  /* static members */
  object QueryCompositeFilterConstraint {
    
    @JSImport("@firebase/firestore/dist/packages/firestore/src/api/filter", "QueryCompositeFilterConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _create(`type`: or_ | and_, _queryConstraints: js.Array[QueryFilterConstraint]): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryCompositeFilterConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(`type`.asInstanceOf[js.Any], _queryConstraints.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryCompositeFilterConstraint]
  }
  
  /* note: abstract class */ @JSImport("@firebase/firestore/dist/packages/firestore/src/api/filter", "QueryConstraint")
  @js.native
  open class QueryConstraint ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/api/filter", "QueryEndAtConstraint")
  @js.native
  open class QueryEndAtConstraint protected ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint {
    /**
      * @internal
      */
    /* protected */ def this(
      /** The type of this query constraint */
    `type`: endBefore | endAt,
      _docOrFields: js.Array[Any | DocumentSnapshot[Any]],
      _inclusive: Boolean
    ) = this()
  }
  /* static members */
  object QueryEndAtConstraint {
    
    @JSImport("@firebase/firestore/dist/packages/firestore/src/api/filter", "QueryEndAtConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _create(
      `type`: endBefore | endAt,
      _docOrFields: js.Array[Any | DocumentSnapshot[Any]],
      _inclusive: Boolean
    ): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(`type`.asInstanceOf[js.Any], _docOrFields.asInstanceOf[js.Any], _inclusive.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint]
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/api/filter", "QueryFieldFilterConstraint")
  @js.native
  open class QueryFieldFilterConstraint protected ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryFieldFilterConstraint {
    /**
      * @internal
      */
    /* protected */ def this(_field: FieldPath, _op: Operator, _value: Any) = this()
  }
  /* static members */
  object QueryFieldFilterConstraint {
    
    @JSImport("@firebase/firestore/dist/packages/firestore/src/api/filter", "QueryFieldFilterConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _create(_field: FieldPath, _op: Operator, _value: Any): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryFieldFilterConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(_field.asInstanceOf[js.Any], _op.asInstanceOf[js.Any], _value.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryFieldFilterConstraint]
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/api/filter", "QueryLimitConstraint")
  @js.native
  open class QueryLimitConstraint protected ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryLimitConstraint {
    /**
      * @internal
      */
    /* protected */ def this(
      /** The type of this query constraint */
    `type`: limit | limitToLast_,
      _limit: Double,
      _limitType: LimitType
    ) = this()
  }
  /* static members */
  object QueryLimitConstraint {
    
    @JSImport("@firebase/firestore/dist/packages/firestore/src/api/filter", "QueryLimitConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _create(`type`: limit | limitToLast_, _limit: Double, _limitType: LimitType): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryLimitConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(`type`.asInstanceOf[js.Any], _limit.asInstanceOf[js.Any], _limitType.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryLimitConstraint]
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/api/filter", "QueryOrderByConstraint")
  @js.native
  open class QueryOrderByConstraint protected ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint {
    /**
      * @internal
      */
    /* protected */ def this(_field: FieldPath, _direction: Direction) = this()
  }
  /* static members */
  object QueryOrderByConstraint {
    
    @JSImport("@firebase/firestore/dist/packages/firestore/src/api/filter", "QueryOrderByConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _create(_field: FieldPath, _direction: Direction): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(_field.asInstanceOf[js.Any], _direction.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint]
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/api/filter", "QueryStartAtConstraint")
  @js.native
  open class QueryStartAtConstraint protected ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint {
    /**
      * @internal
      */
    /* protected */ def this(
      /** The type of this query constraint */
    `type`: startAt | startAfter,
      _docOrFields: js.Array[Any | DocumentSnapshot[Any]],
      _inclusive: Boolean
    ) = this()
  }
  /* static members */
  object QueryStartAtConstraint {
    
    @JSImport("@firebase/firestore/dist/packages/firestore/src/api/filter", "QueryStartAtConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _create(
      `type`: startAt | startAfter,
      _docOrFields: js.Array[Any | DocumentSnapshot[Any]],
      _inclusive: Boolean
    ): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(`type`.asInstanceOf[js.Any], _docOrFields.asInstanceOf[js.Any], _inclusive.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint]
  }
  
  inline def and(queryConstraints: QueryFilterConstraint*): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryCompositeFilterConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(queryConstraints.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryCompositeFilterConstraint]
  
  inline def endAt(fieldValues: Any*): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint]
  inline def endAt(snapshot: DocumentSnapshot[Any]): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint]
  
  inline def endBefore(fieldValues: Any*): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint]
  inline def endBefore(snapshot: DocumentSnapshot[Any]): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint]
  
  inline def limit(limit: Double): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryLimitConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limit")(limit.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryLimitConstraint]
  
  inline def limitToLast(limit: Double): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryLimitConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToLast")(limit.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryLimitConstraint]
  
  inline def or(queryConstraints: QueryFilterConstraint*): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryCompositeFilterConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(queryConstraints.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryCompositeFilterConstraint]
  
  inline def orderBy(fieldPath: String): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint]
  inline def orderBy(fieldPath: String, directionStr: OrderByDirection): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint]
  inline def orderBy(fieldPath: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiFieldPathMod.FieldPath): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint]
  inline def orderBy(
    fieldPath: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiFieldPathMod.FieldPath,
    directionStr: OrderByDirection
  ): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint]
  
  inline def query[T](
    query: Query[T],
    compositeFilter: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryCompositeFilterConstraint,
    queryConstraints: QueryNonFilterConstraint*
  ): Query[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("query")((scala.List(query.asInstanceOf[js.Any], compositeFilter.asInstanceOf[js.Any])).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Query[T]]
  inline def query[T](
    query: Query[T],
    queryConstraints: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint*
  ): Query[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(scala.List(query.asInstanceOf[js.Any]).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Query[T]]
  
  inline def startAfter(fieldValues: Any*): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint]
  inline def startAfter(snapshot: DocumentSnapshot[Any]): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint]
  
  inline def startAt(fieldValues: Any*): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint]
  inline def startAt(snapshot: DocumentSnapshot[Any]): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint]
  
  inline def where(fieldPath: String, opStr: WhereFilterOp, value: Any): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryFieldFilterConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryFieldFilterConstraint]
  inline def where(
    fieldPath: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiFieldPathMod.FieldPath,
    opStr: WhereFilterOp,
    value: Any
  ): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryFieldFilterConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryFieldFilterConstraint]
}
