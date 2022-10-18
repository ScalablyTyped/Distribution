package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherPutWatchResponse extends StObject {
  
  var _id: Id
  
  var _primary_term: long
  
  var _seq_no: SequenceNumber
  
  var _version: VersionNumber
  
  var created: Boolean
}
object WatcherPutWatchResponse {
  
  inline def apply(_id: Id, _primary_term: long, _seq_no: SequenceNumber, _version: VersionNumber, created: Boolean): WatcherPutWatchResponse = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _primary_term = _primary_term.asInstanceOf[js.Any], _seq_no = _seq_no.asInstanceOf[js.Any], _version = _version.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherPutWatchResponse]
  }
  
  extension [Self <: WatcherPutWatchResponse](x: Self) {
    
    inline def setCreated(value: Boolean): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def set_id(value: Id): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_primary_term(value: long): Self = StObject.set(x, "_primary_term", value.asInstanceOf[js.Any])
    
    inline def set_seq_no(value: SequenceNumber): Self = StObject.set(x, "_seq_no", value.asInstanceOf[js.Any])
    
    inline def set_version(value: VersionNumber): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
  }
}
