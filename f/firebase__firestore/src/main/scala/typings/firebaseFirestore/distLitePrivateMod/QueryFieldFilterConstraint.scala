package typings.firebaseFirestore.distLitePrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/private", "QueryFieldFilterConstraint")
@js.native
open class QueryFieldFilterConstraint ()
  extends QueryConstraint
     with QueryFilterConstraint {
  
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
  
  @JSImport("@firebase/firestore/dist/lite/private", "QueryFieldFilterConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  /* Excluded from this release type: __constructor */
  inline def _create(
    _field: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FieldPath_2 */ Any,
    _op: Operator,
    _value: Any
  ): QueryFieldFilterConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(_field.asInstanceOf[js.Any], _op.asInstanceOf[js.Any], _value.asInstanceOf[js.Any])).asInstanceOf[QueryFieldFilterConstraint]
}
