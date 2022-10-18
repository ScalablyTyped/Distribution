package typings.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ingest extends StObject {
  
  var data: Boolean
  
  var ingest: Boolean
  
  var master: Boolean
  
  var ml: Boolean
}
object Ingest {
  
  inline def apply(data: Boolean, ingest: Boolean, master: Boolean, ml: Boolean): Ingest = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], ingest = ingest.asInstanceOf[js.Any], master = master.asInstanceOf[js.Any], ml = ml.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ingest]
  }
  
  extension [Self <: Ingest](x: Self) {
    
    inline def setData(value: Boolean): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setIngest(value: Boolean): Self = StObject.set(x, "ingest", value.asInstanceOf[js.Any])
    
    inline def setMaster(value: Boolean): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
    
    inline def setMl(value: Boolean): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
  }
}
