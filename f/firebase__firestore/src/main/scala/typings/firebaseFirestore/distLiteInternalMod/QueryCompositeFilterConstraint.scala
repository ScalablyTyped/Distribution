package typings.firebaseFirestore.distLiteInternalMod

import typings.firebaseFirestore.firebaseFirestoreStrings.and_
import typings.firebaseFirestore.firebaseFirestoreStrings.or_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/internal", "QueryCompositeFilterConstraint")
@js.native
open class QueryCompositeFilterConstraint protected ()
  extends StObject
     with AppliableConstraint
     with QueryFilterConstraint {
  /**
    * @internal
    */
  /* protected */ def this(
    /** The type of this query constraint */
  `type`: or_ | and_,
    _queryConstraints: js.Array[QueryFilterConstraint]
  ) = this()
  
  /**
    * Takes the provided {@link Query} and returns a copy of the {@link Query} with this
    * {@link AppliableConstraint} applied.
    */
  /* CompleteClass */
  override def _apply[T](query: Query_[T]): Query_[T] = js.native
  
  def _getOperator(): CompositeOperator = js.native
  
  def _getQueryConstraints(): js.Array[AppliableConstraint] = js.native
  
  def _parse[T](query: Query_[T]): Filter = js.native
  
  /* private */ val _queryConstraints: Any = js.native
  
  /** The type of this query constraint */
  val `type`: or_ | and_ = js.native
}
/* static members */
object QueryCompositeFilterConstraint {
  
  @JSImport("@firebase/firestore/dist/lite/internal", "QueryCompositeFilterConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _create(`type`: or_ | and_, _queryConstraints: js.Array[QueryFilterConstraint]): QueryCompositeFilterConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(`type`.asInstanceOf[js.Any], _queryConstraints.asInstanceOf[js.Any])).asInstanceOf[QueryCompositeFilterConstraint]
}
