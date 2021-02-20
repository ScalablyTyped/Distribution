package typings.firebaseFirestoreTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotMetadata extends StObject {
  
  val fromCache: Boolean = js.native
  
  val hasPendingWrites: Boolean = js.native
  
  def isEqual(other: SnapshotMetadata): Boolean = js.native
}
object SnapshotMetadata {
  
  @scala.inline
  def apply(fromCache: Boolean, hasPendingWrites: Boolean, isEqual: SnapshotMetadata => Boolean): SnapshotMetadata = {
    val __obj = js.Dynamic.literal(fromCache = fromCache.asInstanceOf[js.Any], hasPendingWrites = hasPendingWrites.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual))
    __obj.asInstanceOf[SnapshotMetadata]
  }
  
  @scala.inline
  implicit class SnapshotMetadataMutableBuilder[Self <: SnapshotMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromCache(value: Boolean): Self = StObject.set(x, "fromCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasPendingWrites(value: Boolean): Self = StObject.set(x, "hasPendingWrites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEqual(value: SnapshotMetadata => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
  }
}
