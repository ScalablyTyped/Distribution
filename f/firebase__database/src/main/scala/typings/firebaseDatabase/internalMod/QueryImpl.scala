package typings.firebaseDatabase.internalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/internal", "_QueryImpl")
@js.native
open class QueryImpl protected ()
  extends StObject
     with Query_ {
  /**
    * @hideconstructor
    */
  def this(_repo: Repo, _path: Path, _queryParams: QueryParams, _orderByCalled: Boolean) = this()
  
  val _orderByCalled: Boolean = js.native
  
  /* CompleteClass */
  override val _path: Path = js.native
  
  /* CompleteClass */
  override val _queryIdentifier: String = js.native
  @JSName("_queryIdentifier")
  def _queryIdentifier_MQueryImpl: String = js.native
  
  /* CompleteClass */
  override val _queryObject: js.Object = js.native
  /**
    * An object representation of the query parameters used by this Query.
    */
  @JSName("_queryObject")
  def _queryObject_MQueryImpl: js.Object = js.native
  
  /* CompleteClass */
  override val _queryParams: QueryParams = js.native
  
  /* CompleteClass */
  override val _repo: Repo = js.native
  
  def isEqual(other: QueryImpl): Boolean = js.native
  
  def key: String | Null = js.native
  
  @JSName("ref")
  def ref_MQueryImpl: DatabaseReference = js.native
}
