package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlSetUpgradeMode extends Generic {
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[String] = js.native
}
object MlSetUpgradeMode {
  
  @scala.inline
  def apply(): MlSetUpgradeMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlSetUpgradeMode]
  }
  
  @scala.inline
  implicit class MlSetUpgradeModeMutableBuilder[Self <: MlSetUpgradeMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
