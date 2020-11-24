package typings.elasticElasticsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DATA_ extends js.Object {
  
  var DATA: String = js.native
  
  var INGEST: String = js.native
  
  var MASTER: String = js.native
  
  var ML: String = js.native
}
object DATA_ {
  
  @scala.inline
  def apply(DATA: String, INGEST: String, MASTER: String, ML: String): DATA_ = {
    val __obj = js.Dynamic.literal(DATA = DATA.asInstanceOf[js.Any], INGEST = INGEST.asInstanceOf[js.Any], MASTER = MASTER.asInstanceOf[js.Any], ML = ML.asInstanceOf[js.Any])
    __obj.asInstanceOf[DATA_]
  }
  
  @scala.inline
  implicit class DATA_Ops[Self <: DATA_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDATA(value: String): Self = this.set("DATA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINGEST(value: String): Self = this.set("INGEST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMASTER(value: String): Self = this.set("MASTER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setML(value: String): Self = this.set("ML", value.asInstanceOf[js.Any])
  }
}
