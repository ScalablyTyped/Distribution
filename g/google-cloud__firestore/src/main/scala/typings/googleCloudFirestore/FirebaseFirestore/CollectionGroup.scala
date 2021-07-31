package typings.googleCloudFirestore.FirebaseFirestore

import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionGroup[T]
  extends StObject
     with Query[T] {
  
  /**
    * Partitions a query by returning partition cursors that can be used to run
    * the query in parallel. The returned cursors are split points that can be
    * used as starting and end points for individual query invocations.
    *
    * @param desiredPartitionCount The desired maximum number of partition
    * points. The number must be strictly positive. The actual number of
    * partitions returned may be fewer.
    * @return An AsyncIterable of `QueryPartition`s.
    */
  def getPartitions(desiredPartitionCount: Double): AsyncIterable[QueryPartition[T]] = js.native
}
