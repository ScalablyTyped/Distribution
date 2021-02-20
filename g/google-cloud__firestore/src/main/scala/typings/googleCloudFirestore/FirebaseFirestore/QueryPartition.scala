package typings.googleCloudFirestore.FirebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryPartition[T] extends StObject {
  
  /**
    * The cursor that defines the first result after this partition or
    * `undefined` if this is the last partition.  The cursor value must be
    * destructured when passed to `endBefore()` (for example with
    * `query.endBefore(...queryPartition.endBefore)`).
    *
    * @return Cursor values that can be used with {@link Query#endBefore} or
    * `undefined` if this is the last partition.
    */
  def endBefore: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * The cursor that defines the first result for this partition or
    * `undefined` if this is the first partition.  The cursor value must be
    * destructured when passed to `startAt()` (for example with
    * `query.startAt(...queryPartition.startAt)`).
    *
    * @return Cursor values that can be used with {@link Query#startAt} or
    * `undefined` if this is the first partition.
    */
  def startAt: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Returns a query that only returns the documents for this partition.
    *
    * @return A query partitioned by a {@link Query#startAt} and {@link
    * Query#endBefore} cursor.
    */
  def toQuery(): Query[T] = js.native
}
