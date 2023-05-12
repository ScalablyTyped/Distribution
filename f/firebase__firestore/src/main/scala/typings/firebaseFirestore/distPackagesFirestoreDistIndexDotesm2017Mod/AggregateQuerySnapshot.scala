package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The results of executing an aggregation query.
  */ @JSImport("@firebase/firestore/dist/packages/firestore/dist/index.esm2017", "AggregateQuerySnapshot")
@js.native
open class AggregateQuerySnapshot protected ()
  extends StObject
     with Lh_ {
  /** @hideconstructor */
  def this(t: Any, e: Any, n: Any) = this()
  
  /* CompleteClass */
  var _data: Any = js.native
  
  /* CompleteClass */
  var _userDataWriter: Any = js.native
  
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
    */ /* CompleteClass */
  override def data(): Any = js.native
  
  /* CompleteClass */
  var query: Any = js.native
  
  /** A type string to uniquely identify instances of this class. */
  /* CompleteClass */
  var `type`: String = js.native
}
