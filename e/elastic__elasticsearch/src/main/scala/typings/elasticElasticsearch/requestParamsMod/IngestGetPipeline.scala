package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IngestGetPipeline extends Generic {
  
  var id: js.UndefOr[String] = js.native
  
  var master_timeout: js.UndefOr[String] = js.native
}
object IngestGetPipeline {
  
  @scala.inline
  def apply(): IngestGetPipeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngestGetPipeline]
  }
  
  @scala.inline
  implicit class IngestGetPipelineMutableBuilder[Self <: IngestGetPipeline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMaster_timeout(value: String): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
  }
}
