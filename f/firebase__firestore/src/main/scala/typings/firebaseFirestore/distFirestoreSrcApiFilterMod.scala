package typings.firebaseFirestore

import typings.firebaseFirestore.distFirestoreSrcLiteApiFieldPathMod.FieldPath
import typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.OrderByDirection
import typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.WhereFilterOp
import typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.Query
import typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreSrcApiFilterMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/api/filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@firebase/firestore/dist/firestore/src/api/filter", "QueryConstraint")
  @js.native
  open class QueryConstraint ()
    extends typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint
  
  inline def endAt(fieldValues: Any*): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def endAt(snapshot: DocumentSnapshot[Any]): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def endBefore(fieldValues: Any*): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def endBefore(snapshot: DocumentSnapshot[Any]): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def limit(limit: Double): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limit")(limit.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def limitToLast(limit: Double): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToLast")(limit.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def orderBy(fieldPath: String): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def orderBy(fieldPath: String, directionStr: OrderByDirection): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def orderBy(fieldPath: FieldPath): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def orderBy(fieldPath: FieldPath, directionStr: OrderByDirection): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def query[T](
    query: Query[T],
    queryConstraints: typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint*
  ): Query[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(scala.List(query.asInstanceOf[js.Any]).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Query[T]]
  
  inline def startAfter(fieldValues: Any*): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def startAfter(snapshot: DocumentSnapshot[Any]): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def startAt(fieldValues: Any*): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def startAt(snapshot: DocumentSnapshot[Any]): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def where(fieldPath: String, opStr: WhereFilterOp, value: Any): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def where(fieldPath: FieldPath, opStr: WhereFilterOp, value: Any): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
}
