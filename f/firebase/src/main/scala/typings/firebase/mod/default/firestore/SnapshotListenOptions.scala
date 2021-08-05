package typings.firebase.mod.default.firestore

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
  
  extension [Self <: SnapshotListenOptions](x: Self) {
    
    inline def setIncludeMetadataChanges(value: Boolean): Self = StObject.set(x, "includeMetadataChanges", value.asInstanceOf[js.Any])
    
    inline def setIncludeMetadataChangesUndefined: Self = StObject.set(x, "includeMetadataChanges", js.undefined)
  }
}
