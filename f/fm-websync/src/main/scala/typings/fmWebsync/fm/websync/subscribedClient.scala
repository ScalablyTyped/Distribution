package typings.fmWebsync.fm.websync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait subscribedClient extends StObject {
  
  /**
    * The subscribed client's bound records.
    */
  var boundRecords: js.Any
  
  /**
    * The subscribed client's unique identifier.
    */
  var id: String
}
object subscribedClient {
  
  @scala.inline
  def apply(boundRecords: js.Any, id: String): subscribedClient = {
    val __obj = js.Dynamic.literal(boundRecords = boundRecords.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[subscribedClient]
  }
  
  @scala.inline
  implicit class subscribedClientMutableBuilder[Self <: subscribedClient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundRecords(value: js.Any): Self = StObject.set(x, "boundRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
