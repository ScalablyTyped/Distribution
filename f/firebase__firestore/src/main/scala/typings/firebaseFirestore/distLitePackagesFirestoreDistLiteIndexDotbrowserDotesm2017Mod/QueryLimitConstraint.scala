package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `QueryLimitConstraint` is used to limit the number of documents returned by
  * a Firestore query.
  * `QueryLimitConstraint`s are created by invoking {@link limit} or
  * {@link limitToLast} and can then be passed to {@link (query:1)} to create a new
  * query instance that also contains this `QueryLimitConstraint`.
  */ @JSImport("@firebase/firestore/dist/lite/packages/firestore/dist/lite/index.browser.esm2017", "QueryLimitConstraint")
@js.native
open class QueryLimitConstraint protected ()
  extends StObject
     with Dr {
  /**
    * @internal
    */
  def this(t: Any, e: Any, n: Any) = this()
  
  /* CompleteClass */
  override def _apply(t: Any): Nn = js.native
  
  /* CompleteClass */
  var _limit: Any = js.native
  
  /* CompleteClass */
  var _limitType: Any = js.native
  
  /* CompleteClass */
  var `type`: Any = js.native
}
object QueryLimitConstraint {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/dist/lite/index.browser.esm2017", "QueryLimitConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def create(t: Any, e: Any, n: Any): Dr = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Dr]
}
