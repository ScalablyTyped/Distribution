package typings.firebaseFirestore.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/internal", "AggregateQuerySnapshot")
@js.native
open class AggregateQuerySnapshot[T /* <: AggregateSpec */] protected () extends StObject {
  /** @hideconstructor */
  def this(query: Query_[Any], _userDataWriter: AbstractUserDataWriter, _data: ApiClientObjectMap[Value]) = this()
  
  /* private */ val _data: Any = js.native
  
  /* private */ val _userDataWriter: Any = js.native
  
  /**
    * Returns the results of the aggregations performed over the underlying
    * query.
    *
    * The keys of the returned object will be the same as those of the
    * `AggregateSpec` object specified to the aggregation method, and the values
    * will be the corresponding aggregation result.
    *
    * @returns The results of the aggregations performed over the underlying
    * query.
    */
  def data(): AggregateSpecData[T] = js.native
  
  /**
    * The underlying query over which the aggregations recorded in this
    * `AggregateQuerySnapshot` were performed.
    */
  val query: Query_[Any] = js.native
  
  /** A type string to uniquely identify instances of this class. */
  val `type`: /* "AggregateQuerySnapshot" */ String = js.native
}
