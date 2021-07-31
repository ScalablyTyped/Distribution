package typings.devtoolsProtocol.mod.Protocol.LayerTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaySnapshotResponse extends StObject {
  
  /**
    * A data: URL for resulting image.
    */
  var dataURL: String
}
object ReplaySnapshotResponse {
  
  @scala.inline
  def apply(dataURL: String): ReplaySnapshotResponse = {
    val __obj = js.Dynamic.literal(dataURL = dataURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaySnapshotResponse]
  }
  
  @scala.inline
  implicit class ReplaySnapshotResponseMutableBuilder[Self <: ReplaySnapshotResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataURL(value: String): Self = StObject.set(x, "dataURL", value.asInstanceOf[js.Any])
  }
}
