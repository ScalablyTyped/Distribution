package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `QueryFieldFilterConstraint` is used to narrow the set of documents returned by
  * a Firestore query by filtering on one or more document fields.
  * `QueryFieldFilterConstraint`s are created by invoking {@link where} and can then
  * be passed to {@link (query:1)} to create a new query instance that also contains
  * this `QueryFieldFilterConstraint`.
  */ @JSImport("@firebase/firestore/dist/lite/packages/firestore/dist/lite/index.browser.esm2017", "QueryFieldFilterConstraint")
@js.native
open class QueryFieldFilterConstraint protected ()
  extends StObject
     with Tr_ {
  /**
    * @internal
    */
  def this(t: Any, e: Any, n: Any) = this()
  
  /* CompleteClass */
  override def _apply(t: Any): Fn = js.native
  
  /* CompleteClass */
  var _field: Any = js.native
  
  /* CompleteClass */
  var _op: Any = js.native
  
  /* CompleteClass */
  override def _parse(t: Any): Xt_ | ne_ | ce = js.native
  
  /* CompleteClass */
  var _value: Any = js.native
  
  /** The type of this query constraint */
  /* CompleteClass */
  var `type`: String = js.native
}
object QueryFieldFilterConstraint {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/dist/lite/index.browser.esm2017", "QueryFieldFilterConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def create(t: Any, e: Any, n: Any): Tr_ = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Tr_]
}
