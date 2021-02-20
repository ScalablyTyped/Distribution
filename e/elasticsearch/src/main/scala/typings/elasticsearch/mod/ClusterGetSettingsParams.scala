package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterGetSettingsParams extends GenericParams {
  
  var flatSettings: js.UndefOr[Boolean] = js.native
  
  var includeDefaults: js.UndefOr[Boolean] = js.native
  
  var masterTimeout: js.UndefOr[TimeSpan] = js.native
  
  var timeout: js.UndefOr[TimeSpan] = js.native
}
object ClusterGetSettingsParams {
  
  @scala.inline
  def apply(): ClusterGetSettingsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterGetSettingsParams]
  }
  
  @scala.inline
  implicit class ClusterGetSettingsParamsMutableBuilder[Self <: ClusterGetSettingsParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlatSettings(value: Boolean): Self = StObject.set(x, "flatSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlatSettingsUndefined: Self = StObject.set(x, "flatSettings", js.undefined)
    
    @scala.inline
    def setIncludeDefaults(value: Boolean): Self = StObject.set(x, "includeDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDefaultsUndefined: Self = StObject.set(x, "includeDefaults", js.undefined)
    
    @scala.inline
    def setMasterTimeout(value: TimeSpan): Self = StObject.set(x, "masterTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterTimeoutUndefined: Self = StObject.set(x, "masterTimeout", js.undefined)
    
    @scala.inline
    def setTimeout(value: TimeSpan): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
