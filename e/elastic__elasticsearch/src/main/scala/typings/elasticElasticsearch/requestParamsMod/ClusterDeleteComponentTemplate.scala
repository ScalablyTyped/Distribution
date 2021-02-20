package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterDeleteComponentTemplate extends Generic {
  
  var master_timeout: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var timeout: js.UndefOr[String] = js.native
}
object ClusterDeleteComponentTemplate {
  
  @scala.inline
  def apply(name: String): ClusterDeleteComponentTemplate = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterDeleteComponentTemplate]
  }
  
  @scala.inline
  implicit class ClusterDeleteComponentTemplateMutableBuilder[Self <: ClusterDeleteComponentTemplate] (val x: Self) extends AnyVal {
    
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
