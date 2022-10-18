package typings.firebaseFirestore.distLiteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite", "AggregateQuerySnapshot")
@js.native
/* private */ open class AggregateQuerySnapshot[T /* <: AggregateSpec */] () extends StObject {
  
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
