package typings.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var data: Boolean
  
  var ingest: Boolean
  
  var master: Boolean
  
  var ml: Boolean
}
object Data {
  
  @scala.inline
  def apply(data: Boolean, ingest: Boolean, master: Boolean, ml: Boolean): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], ingest = ingest.asInstanceOf[js.Any], master = master.asInstanceOf[js.Any], ml = ml.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Boolean): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngest(value: Boolean): Self = StObject.set(x, "ingest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster(value: Boolean): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMl(value: Boolean): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
  }
}
