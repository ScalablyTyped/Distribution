package typings.firebaseFirestore

import typings.firebaseFirestore.distFirestoreSrcCoreFilterMod.Operator
import typings.firebaseFirestore.distFirestoreSrcCoreOrderByMod.Direction
import typings.firebaseFirestore.distFirestoreSrcCoreQueryMod.LimitType
import typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.OrderByDirection
import typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryFilterConstraint
import typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryNonFilterConstraint
import typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.WhereFilterOp
import typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.Query
import typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot
import typings.firebaseFirestore.distFirestoreSrcModelPathMod.FieldPath
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

object distFirestoreSrcApiFilterMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/api/filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/firestore/src/api/filter", "QueryCompositeFilterConstraint")
  @js.native
  open class QueryCompositeFilterConstraint protected ()
    extends typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryCompositeFilterConstraint {
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
    
    @JSImport("@firebase/firestore/dist/firestore/src/api/filter", "QueryCompositeFilterConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _create(`type`: or_ | and_, _queryConstraints: js.Array[QueryFilterConstraint]): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryCompositeFilterConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(`type`.asInstanceOf[js.Any], _queryConstraints.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryCompositeFilterConstraint]
  }
  
  /* note: abstract class */ @JSImport("@firebase/firestore/dist/firestore/src/api/filter", "QueryConstraint")
  @js.native
  open class QueryConstraint ()
    extends typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint
  
  @JSImport("@firebase/firestore/dist/firestore/src/api/filter", "QueryEndAtConstraint")
  @js.native
  open class QueryEndAtConstraint protected ()
    extends typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint {
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
    
    @JSImport("@firebase/firestore/dist/firestore/src/api/filter", "QueryEndAtConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _create(
      `type`: endBefore | endAt,
      _docOrFields: js.Array[Any | DocumentSnapshot[Any]],
      _inclusive: Boolean
    ): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(`type`.asInstanceOf[js.Any], _docOrFields.asInstanceOf[js.Any], _inclusive.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint]
  }
  
  @JSImport("@firebase/firestore/dist/firestore/src/api/filter", "QueryFieldFilterConstraint")
  @js.native
  open class QueryFieldFilterConstraint protected ()
    extends typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryFieldFilterConstraint {
    /**
      * @internal
      */
    /* protected */ def this(_field: FieldPath, _op: Operator, _value: Any) = this()
  }
  /* static members */
  object QueryFieldFilterConstraint {
    
    @JSImport("@firebase/firestore/dist/firestore/src/api/filter", "QueryFieldFilterConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _create(_field: FieldPath, _op: Operator, _value: Any): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryFieldFilterConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(_field.asInstanceOf[js.Any], _op.asInstanceOf[js.Any], _value.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryFieldFilterConstraint]
  }
  
  @JSImport("@firebase/firestore/dist/firestore/src/api/filter", "QueryLimitConstraint")
  @js.native
  open class QueryLimitConstraint protected ()
    extends typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryLimitConstraint {
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
    
    @JSImport("@firebase/firestore/dist/firestore/src/api/filter", "QueryLimitConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _create(`type`: limit | limitToLast_, _limit: Double, _limitType: LimitType): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryLimitConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(`type`.asInstanceOf[js.Any], _limit.asInstanceOf[js.Any], _limitType.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryLimitConstraint]
  }
  
  @JSImport("@firebase/firestore/dist/firestore/src/api/filter", "QueryOrderByConstraint")
  @js.native
  open class QueryOrderByConstraint protected ()
    extends typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint {
    /**
      * @internal
      */
    /* protected */ def this(_field: FieldPath, _direction: Direction) = this()
  }
  /* static members */
  object QueryOrderByConstraint {
    
    @JSImport("@firebase/firestore/dist/firestore/src/api/filter", "QueryOrderByConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _create(_field: FieldPath, _direction: Direction): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(_field.asInstanceOf[js.Any], _direction.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint]
  }
  
  @JSImport("@firebase/firestore/dist/firestore/src/api/filter", "QueryStartAtConstraint")
  @js.native
  open class QueryStartAtConstraint protected ()
    extends typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint {
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
    
    @JSImport("@firebase/firestore/dist/firestore/src/api/filter", "QueryStartAtConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _create(
      `type`: startAt | startAfter,
      _docOrFields: js.Array[Any | DocumentSnapshot[Any]],
      _inclusive: Boolean
    ): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(`type`.asInstanceOf[js.Any], _docOrFields.asInstanceOf[js.Any], _inclusive.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint]
  }
  
  inline def and(queryConstraints: QueryFilterConstraint*): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryCompositeFilterConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(queryConstraints.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryCompositeFilterConstraint]
  
  inline def endAt(fieldValues: Any*): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint]
  inline def endAt(snapshot: DocumentSnapshot[Any]): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint]
  
  inline def endBefore(fieldValues: Any*): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint]
  inline def endBefore(snapshot: DocumentSnapshot[Any]): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint]
  
  inline def limit(limit: Double): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryLimitConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limit")(limit.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryLimitConstraint]
  
  inline def limitToLast(limit: Double): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryLimitConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToLast")(limit.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryLimitConstraint]
  
  inline def or(queryConstraints: QueryFilterConstraint*): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryCompositeFilterConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(queryConstraints.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryCompositeFilterConstraint]
  
  inline def orderBy(fieldPath: String): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint]
  inline def orderBy(fieldPath: String, directionStr: OrderByDirection): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint]
  inline def orderBy(fieldPath: typings.firebaseFirestore.distFirestoreSrcLiteApiFieldPathMod.FieldPath): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint]
  inline def orderBy(
    fieldPath: typings.firebaseFirestore.distFirestoreSrcLiteApiFieldPathMod.FieldPath,
    directionStr: OrderByDirection
  ): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint]
  
  inline def query[T](
    query: Query[T],
    compositeFilter: typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryCompositeFilterConstraint,
    queryConstraints: QueryNonFilterConstraint*
  ): Query[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("query")((scala.List(query.asInstanceOf[js.Any], compositeFilter.asInstanceOf[js.Any])).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Query[T]]
  inline def query[T](
    query: Query[T],
    queryConstraints: typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint*
  ): Query[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(scala.List(query.asInstanceOf[js.Any]).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Query[T]]
  
  inline def startAfter(fieldValues: Any*): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint]
  inline def startAfter(snapshot: DocumentSnapshot[Any]): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint]
  
  inline def startAt(fieldValues: Any*): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint]
  inline def startAt(snapshot: DocumentSnapshot[Any]): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint]
  
  inline def where(fieldPath: String, opStr: WhereFilterOp, value: Any): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryFieldFilterConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryFieldFilterConstraint]
  inline def where(
    fieldPath: typings.firebaseFirestore.distFirestoreSrcLiteApiFieldPathMod.FieldPath,
    opStr: WhereFilterOp,
    value: Any
  ): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryFieldFilterConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryFieldFilterConstraint]
}
