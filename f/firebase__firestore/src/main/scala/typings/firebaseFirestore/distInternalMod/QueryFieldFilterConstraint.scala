package typings.firebaseFirestore.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/internal", "QueryFieldFilterConstraint")
@js.native
open class QueryFieldFilterConstraint protected ()
  extends QueryConstraint
     with QueryFilterConstraint {
  /**
    * @internal
    */
  /* protected */ def this(_field: _FieldPath, _op: Operator, _value: Any) = this()
  
  /* private */ val _field: Any = js.native
  
  /* private */ var _op: Any = js.native
  
  def _parse[T](query: Query_[T]): FieldFilter = js.native
  
  /* private */ var _value: Any = js.native
  
  /** The type of this query constraint */
  @JSName("type")
  val type_QueryFieldFilterConstraint: /* "where" */ String = js.native
}
/* static members */
object QueryFieldFilterConstraint {
  
  @JSImport("@firebase/firestore/dist/internal", "QueryFieldFilterConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _create(_field: _FieldPath, _op: Operator, _value: Any): QueryFieldFilterConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(_field.asInstanceOf[js.Any], _op.asInstanceOf[js.Any], _value.asInstanceOf[js.Any])).asInstanceOf[QueryFieldFilterConstraint]
}
