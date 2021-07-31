package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterPutSettings[T]
  extends StObject
     with Generic {
  
  var body: T
  
  var flat_settings: js.UndefOr[Boolean] = js.undefined
  
  var master_timeout: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[String] = js.undefined
}
object ClusterPutSettings {
  
  @scala.inline
  def apply[T](body: T): ClusterPutSettings[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterPutSettings[T]]
  }
  
  @scala.inline
  implicit class ClusterPutSettingsMutableBuilder[Self <: ClusterPutSettings[?], T] (val x: Self & ClusterPutSettings[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlat_settings(value: Boolean): Self = StObject.set(x, "flat_settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlat_settingsUndefined: Self = StObject.set(x, "flat_settings", js.undefined)
    
    @scala.inline
    def setMaster_timeout(value: String): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
