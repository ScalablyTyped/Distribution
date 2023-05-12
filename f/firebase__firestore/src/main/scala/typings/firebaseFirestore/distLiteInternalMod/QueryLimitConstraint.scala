package typings.firebaseFirestore.distLiteInternalMod

import typings.firebaseFirestore.firebaseFirestoreStrings.limitToLast_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/internal", "QueryLimitConstraint")
@js.native
open class QueryLimitConstraint protected ()
  extends QueryConstraint
     with QueryNonFilterConstraint {
  /**
    * @internal
    */
  /* protected */ def this(
    /** The type of this query constraint */
  `type`: typings.firebaseFirestore.firebaseFirestoreStrings.limit | limitToLast_,
    _limit: Double,
    _limitType: LimitType
  ) = this()
  
  /* private */ val _limit: Any = js.native
  
  /* private */ val _limitType: Any = js.native
  
  /** The type of this query constraint */
  @JSName("type")
  val type_QueryLimitConstraint: typings.firebaseFirestore.firebaseFirestoreStrings.limit | limitToLast_ = js.native
}
/* static members */
object QueryLimitConstraint {
  
  @JSImport("@firebase/firestore/dist/lite/internal", "QueryLimitConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _create(
    `type`: typings.firebaseFirestore.firebaseFirestoreStrings.limit | limitToLast_,
    _limit: Double,
    _limitType: LimitType
  ): QueryLimitConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(`type`.asInstanceOf[js.Any], _limit.asInstanceOf[js.Any], _limitType.asInstanceOf[js.Any])).asInstanceOf[QueryLimitConstraint]
}
