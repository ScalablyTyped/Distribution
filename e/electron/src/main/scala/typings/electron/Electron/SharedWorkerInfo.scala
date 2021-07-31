package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedWorkerInfo extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/shared-worker-info
  /**
    * The unique id of the shared worker.
    */
  var id: String
  
  /**
    * The url of the shared worker.
    */
  var url: String
}
object SharedWorkerInfo {
  
  @scala.inline
  def apply(id: String, url: String): SharedWorkerInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedWorkerInfo]
  }
  
  @scala.inline
  implicit class SharedWorkerInfoMutableBuilder[Self <: SharedWorkerInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
