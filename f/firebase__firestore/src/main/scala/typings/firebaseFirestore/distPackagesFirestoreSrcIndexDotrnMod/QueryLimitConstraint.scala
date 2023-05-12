package typings.firebaseFirestore.distPackagesFirestoreSrcIndexDotrnMod

import typings.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.LimitType
import typings.firebaseFirestore.firebaseFirestoreStrings.limitToLast_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/packages/firestore/src/index.rn", "QueryLimitConstraint")
@js.native
open class QueryLimitConstraint protected ()
  extends typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.QueryLimitConstraint {
  /**
    * @internal
    */
  /* protected */ def this(
    /** The type of this query constraint */
  `type`: typings.firebaseFirestore.firebaseFirestoreStrings.limit | limitToLast_,
    _limit: Double,
    _limitType: LimitType
  ) = this()
}
/* static members */
object QueryLimitConstraint {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/index.rn", "QueryLimitConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _create(
    `type`: typings.firebaseFirestore.firebaseFirestoreStrings.limit | limitToLast_,
    _limit: Double,
    _limitType: LimitType
  ): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryLimitConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(`type`.asInstanceOf[js.Any], _limit.asInstanceOf[js.Any], _limitType.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryLimitConstraint]
}
