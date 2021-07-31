package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterGetSettings
  extends StObject
     with Generic {
  
  var flat_settings: js.UndefOr[Boolean] = js.undefined
  
  var include_defaults: js.UndefOr[Boolean] = js.undefined
  
  var master_timeout: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[String] = js.undefined
}
object ClusterGetSettings {
  
  @scala.inline
  def apply(): ClusterGetSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterGetSettings]
  }
  
  @scala.inline
  implicit class ClusterGetSettingsMutableBuilder[Self <: ClusterGetSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlat_settings(value: Boolean): Self = StObject.set(x, "flat_settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlat_settingsUndefined: Self = StObject.set(x, "flat_settings", js.undefined)
    
    @scala.inline
    def setInclude_defaults(value: Boolean): Self = StObject.set(x, "include_defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_defaultsUndefined: Self = StObject.set(x, "include_defaults", js.undefined)
    
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
