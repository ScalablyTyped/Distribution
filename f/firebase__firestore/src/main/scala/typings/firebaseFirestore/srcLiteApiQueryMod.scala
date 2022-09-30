package typings.firebaseFirestore

import typings.firebaseFirestore.coreDatabaseInfoMod.DatabaseId
import typings.firebaseFirestore.coreTargetMod.Bound
import typings.firebaseFirestore.coreTargetMod.Direction
import typings.firebaseFirestore.coreTargetMod.FieldFilter
import typings.firebaseFirestore.coreTargetMod.Operator
import typings.firebaseFirestore.coreTargetMod.OrderBy
import typings.firebaseFirestore.firebaseFirestoreStrings.in_
import typings.firebaseFirestore.firebaseFirestoreStrings.limitToLast_
import typings.firebaseFirestore.liteApiUserDataReaderMod.UserDataReader
import typings.firebaseFirestore.modelDocumentMod.Document
import typings.firebaseFirestore.modelPathMod.FieldPath
import typings.firebaseFirestore.srcLiteApiReferenceMod.Query
import typings.firebaseFirestore.srcLiteApiSnapshotMod.DocumentSnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLiteApiQueryMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/lite-api/query", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/lite-api/query", "QueryConstraint")
  @js.native
  abstract class QueryConstraint () extends StObject {
    
    /**
      * Takes the provided {@link Query} and returns a copy of the {@link Query} with this
      * {@link QueryConstraint} applied.
      */
    def _apply[T](query: Query[T]): Query[T] = js.native
    
    /** The type of this query constraints */
    val `type`: QueryConstraintType = js.native
  }
  
  inline def endAt(fieldValues: Any*): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[QueryConstraint]
  inline def endAt(snapshot: DocumentSnapshot[Any]): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  
  inline def endBefore(fieldValues: Any*): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[QueryConstraint]
  inline def endBefore(snapshot: DocumentSnapshot[Any]): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(snapshot.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  
  inline def limit(limit: Double): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limit")(limit.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  
  inline def limitToLast(limit: Double): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToLast")(limit.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  
  inline def newQueryBoundFromDocument(
    query: typings.firebaseFirestore.coreQueryMod.Query,
    databaseId: DatabaseId,
    methodName: String,
    doc: Null,
    inclusive: Boolean
  ): Bound = (^.asInstanceOf[js.Dynamic].applyDynamic("newQueryBoundFromDocument")(query.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], doc.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[Bound]
  inline def newQueryBoundFromDocument(
    query: typings.firebaseFirestore.coreQueryMod.Query,
    databaseId: DatabaseId,
    methodName: String,
    doc: Document,
    inclusive: Boolean
  ): Bound = (^.asInstanceOf[js.Dynamic].applyDynamic("newQueryBoundFromDocument")(query.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], doc.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[Bound]
  
  inline def newQueryBoundFromFields(
    query: typings.firebaseFirestore.coreQueryMod.Query,
    databaseId: DatabaseId,
    dataReader: UserDataReader,
    methodName: String,
    values: js.Array[Any],
    inclusive: Boolean
  ): Bound = (^.asInstanceOf[js.Dynamic].applyDynamic("newQueryBoundFromFields")(query.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any], dataReader.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], values.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[Bound]
  
  inline def newQueryFilter(
    query: typings.firebaseFirestore.coreQueryMod.Query,
    methodName: String,
    dataReader: UserDataReader,
    databaseId: DatabaseId,
    fieldPath: FieldPath,
    op: Operator,
    value: Any
  ): FieldFilter = (^.asInstanceOf[js.Dynamic].applyDynamic("newQueryFilter")(query.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], dataReader.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any], fieldPath.asInstanceOf[js.Any], op.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[FieldFilter]
  
  inline def newQueryOrderBy(query: typings.firebaseFirestore.coreQueryMod.Query, fieldPath: FieldPath, direction: Direction): OrderBy = (^.asInstanceOf[js.Dynamic].applyDynamic("newQueryOrderBy")(query.asInstanceOf[js.Any], fieldPath.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[OrderBy]
  
  inline def orderBy(fieldPath: String): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def orderBy(fieldPath: String, directionStr: OrderByDirection): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def orderBy(fieldPath: typings.firebaseFirestore.srcLiteApiFieldPathMod.FieldPath): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def orderBy(
    fieldPath: typings.firebaseFirestore.srcLiteApiFieldPathMod.FieldPath,
    directionStr: OrderByDirection
  ): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  
  inline def query[T](query: Query[T], queryConstraints: QueryConstraint*): Query[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(scala.List(query.asInstanceOf[js.Any]).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Query[T]]
  
  inline def startAfter(fieldValues: Any*): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[QueryConstraint]
  inline def startAfter(snapshot: DocumentSnapshot[Any]): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(snapshot.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  
  inline def startAt(fieldValues: Any*): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[QueryConstraint]
  inline def startAt(snapshot: DocumentSnapshot[Any]): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  
  inline def validateHasExplicitOrderByForLimitToLast(query: typings.firebaseFirestore.coreQueryMod.Query): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateHasExplicitOrderByForLimitToLast")(query.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def where(fieldPath: String, opStr: WhereFilterOp, value: Any): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def where(
    fieldPath: typings.firebaseFirestore.srcLiteApiFieldPathMod.FieldPath,
    opStr: WhereFilterOp,
    value: Any
  ): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  
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
