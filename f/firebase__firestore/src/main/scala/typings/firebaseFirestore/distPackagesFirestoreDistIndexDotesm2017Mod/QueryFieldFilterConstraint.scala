package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `QueryFieldFilterConstraint` is used to narrow the set of documents returned by
  * a Firestore query by filtering on one or more document fields.
  * `QueryFieldFilterConstraint`s are created by invoking {@link where} and can then
  * be passed to {@link (query:1)} to create a new query instance that also contains
  * this `QueryFieldFilterConstraint`.
  */ @JSImport("@firebase/firestore/dist/packages/firestore/dist/index.esm2017", "QueryFieldFilterConstraint")
@js.native
open class QueryFieldFilterConstraint protected ()
  extends StObject
     with Pl_ {
  /**
    * @internal
    */
  def this(t: Any, e: Any, n: Any) = this()
  
  /* CompleteClass */
  override def _apply(t: Any): dh = js.native
  
  /* CompleteClass */
  var _field: Any = js.native
  
  /* CompleteClass */
  var _op: Any = js.native
  
  /* CompleteClass */
  override def _parse(t: Any): mn | bn | Nn = js.native
  
  /* CompleteClass */
  var _value: Any = js.native
  
  /** The type of this query constraint */
  /* CompleteClass */
  var `type`: String = js.native
}
object QueryFieldFilterConstraint {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/dist/index.esm2017", "QueryFieldFilterConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def create(t: Any, e: Any, n: Any): Pl_ = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Pl_]
}
