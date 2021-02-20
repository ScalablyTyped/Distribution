package typings.firebase.mod.default.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotListenOptions extends StObject {
  
  /**
    * Include a change even if only the metadata of the query or of a document
    * changed. Default is false.
    */
  val includeMetadataChanges: js.UndefOr[Boolean] = js.native
}
object SnapshotListenOptions {
  
  @scala.inline
  def apply(): SnapshotListenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotListenOptions]
  }
  
  @scala.inline
  implicit class SnapshotListenOptionsMutableBuilder[Self <: SnapshotListenOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeMetadataChanges(value: Boolean): Self = StObject.set(x, "includeMetadataChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeMetadataChangesUndefined: Self = StObject.set(x, "includeMetadataChanges", js.undefined)
  }
}
