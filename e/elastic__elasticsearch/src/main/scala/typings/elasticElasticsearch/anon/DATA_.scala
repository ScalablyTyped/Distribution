package typings.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DATA_ extends StObject {
  
  var DATA: String
  
  var INGEST: String
  
  var MASTER: String
  
  var ML: String
}
object DATA_ {
  
  @scala.inline
  def apply(DATA: String, INGEST: String, MASTER: String, ML: String): DATA_ = {
    val __obj = js.Dynamic.literal(DATA = DATA.asInstanceOf[js.Any], INGEST = INGEST.asInstanceOf[js.Any], MASTER = MASTER.asInstanceOf[js.Any], ML = ML.asInstanceOf[js.Any])
    __obj.asInstanceOf[DATA_]
  }
  
  @scala.inline
  implicit class DATA_MutableBuilder[Self <: DATA_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDATA(value: String): Self = StObject.set(x, "DATA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINGEST(value: String): Self = StObject.set(x, "INGEST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMASTER(value: String): Self = StObject.set(x, "MASTER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setML(value: String): Self = StObject.set(x, "ML", value.asInstanceOf[js.Any])
  }
}
