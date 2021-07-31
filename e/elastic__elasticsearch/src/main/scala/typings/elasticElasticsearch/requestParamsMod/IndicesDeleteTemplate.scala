package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesDeleteTemplate
  extends StObject
     with Generic {
  
  var master_timeout: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var timeout: js.UndefOr[String] = js.undefined
}
object IndicesDeleteTemplate {
  
  @scala.inline
  def apply(name: String): IndicesDeleteTemplate = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesDeleteTemplate]
  }
  
  @scala.inline
  implicit class IndicesDeleteTemplateMutableBuilder[Self <: IndicesDeleteTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaster_timeout(value: String): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
