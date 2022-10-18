package typings.firebaseFirestore

import typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiFieldPathMod.FieldPath
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.OrderByDirection
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.Query
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreSrcApiFilterMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/api/filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/api/filter", "QueryConstraint")
  @js.native
  open class QueryConstraint ()
    extends typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint
  
  inline def endAt(fieldValues: Any*): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def endAt(snapshot: DocumentSnapshot[Any]): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def endBefore(fieldValues: Any*): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def endBefore(snapshot: DocumentSnapshot[Any]): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def limit(limit: Double): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limit")(limit.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def limitToLast(limit: Double): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToLast")(limit.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def orderBy(fieldPath: String): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def orderBy(fieldPath: String, directionStr: OrderByDirection): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def orderBy(fieldPath: FieldPath): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def orderBy(fieldPath: FieldPath, directionStr: OrderByDirection): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def query[T](
    query: Query[T],
    queryConstraints: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint*
  ): Query[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(scala.List(query.asInstanceOf[js.Any]).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Query[T]]
  
  inline def startAfter(fieldValues: Any*): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def startAfter(snapshot: DocumentSnapshot[Any]): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def startAt(fieldValues: Any*): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def startAt(snapshot: DocumentSnapshot[Any]): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def where(fieldPath: String, opStr: WhereFilterOp, value: Any): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def where(fieldPath: FieldPath, opStr: WhereFilterOp, value: Any): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
}
