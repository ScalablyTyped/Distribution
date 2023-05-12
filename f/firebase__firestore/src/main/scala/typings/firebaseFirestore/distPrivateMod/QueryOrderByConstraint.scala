package typings.firebaseFirestore.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/private", "QueryOrderByConstraint")
@js.native
open class QueryOrderByConstraint ()
  extends QueryConstraint
     with QueryNonFilterConstraint {
  
  /* private */ var _direction: Any = js.native
  
  /* private */ val _field: Any = js.native
  
  /** The type of this query constraint */
  @JSName("type")
  val type_QueryOrderByConstraint: /* "orderBy" */ String = js.native
}
/* static members */
object QueryOrderByConstraint {
  
  @JSImport("@firebase/firestore/dist/private", "QueryOrderByConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  /* Excluded from this release type: __constructor */
  inline def _create(
    _field: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FieldPath */ Any,
    _direction: Direction
  ): QueryOrderByConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(_field.asInstanceOf[js.Any], _direction.asInstanceOf[js.Any])).asInstanceOf[QueryOrderByConstraint]
}
