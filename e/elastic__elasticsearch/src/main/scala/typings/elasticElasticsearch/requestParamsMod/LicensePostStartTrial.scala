package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LicensePostStartTrial extends Generic {
  
  var acknowledge: js.UndefOr[Boolean] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object LicensePostStartTrial {
  
  @scala.inline
  def apply(): LicensePostStartTrial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicensePostStartTrial]
  }
  
  @scala.inline
  implicit class LicensePostStartTrialMutableBuilder[Self <: LicensePostStartTrial] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcknowledge(value: Boolean): Self = StObject.set(x, "acknowledge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcknowledgeUndefined: Self = StObject.set(x, "acknowledge", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
