package typings.firebaseFirestore.distLiteInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/internal", "QueryOrderByConstraint")
@js.native
open class QueryOrderByConstraint protected ()
  extends QueryConstraint
     with QueryNonFilterConstraint {
  /**
    * @internal
    */
  /* protected */ def this(_field: FieldPath2, _direction: Direction) = this()
  
  /* private */ var _direction: Any = js.native
  
  /* private */ val _field: Any = js.native
  
  /** The type of this query constraint */
  @JSName("type")
  val type_QueryOrderByConstraint: /* "orderBy" */ String = js.native
}
/* static members */
object QueryOrderByConstraint {
  
  @JSImport("@firebase/firestore/dist/lite/internal", "QueryOrderByConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _create(_field: FieldPath2, _direction: Direction): QueryOrderByConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(_field.asInstanceOf[js.Any], _direction.asInstanceOf[js.Any])).asInstanceOf[QueryOrderByConstraint]
}
