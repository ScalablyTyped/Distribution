package typings.firebase.compatMod.firebase.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotListenOptions extends StObject {
  
  /**
    * Include a change even if only the metadata of the query or of a document
    * changed. Default is false.
    */
  val includeMetadataChanges: js.UndefOr[Boolean] = js.undefined
}
object SnapshotListenOptions {
  
  inline def apply(): SnapshotListenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotListenOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnapshotListenOptions] (val x: Self) extends AnyVal {
    
    inline def setIncludeMetadataChanges(value: Boolean): Self = StObject.set(x, "includeMetadataChanges", value.asInstanceOf[js.Any])
    
    inline def setIncludeMetadataChangesUndefined: Self = StObject.set(x, "includeMetadataChanges", js.undefined)
  }
}
