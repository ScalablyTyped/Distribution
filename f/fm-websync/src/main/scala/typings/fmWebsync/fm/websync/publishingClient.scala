package typings.fmWebsync.fm.websync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait publishingClient extends StObject {
  
  /**
    * The publishing client's bound records.
    */
  var boundRecords: Any
  
  /**
    * The publishing client's unique identifier.
    */
  var id: String
}
object publishingClient {
  
  inline def apply(boundRecords: Any, id: String): publishingClient = {
    val __obj = js.Dynamic.literal(boundRecords = boundRecords.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[publishingClient]
  }
  
  extension [Self <: publishingClient](x: Self) {
    
    inline def setBoundRecords(value: Any): Self = StObject.set(x, "boundRecords", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
