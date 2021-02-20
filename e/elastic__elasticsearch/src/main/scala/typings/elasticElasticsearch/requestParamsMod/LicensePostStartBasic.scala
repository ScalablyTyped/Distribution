package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LicensePostStartBasic extends Generic {
  
  var acknowledge: js.UndefOr[Boolean] = js.native
}
object LicensePostStartBasic {
  
  @scala.inline
  def apply(): LicensePostStartBasic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicensePostStartBasic]
  }
  
  @scala.inline
  implicit class LicensePostStartBasicMutableBuilder[Self <: LicensePostStartBasic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcknowledge(value: Boolean): Self = StObject.set(x, "acknowledge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcknowledgeUndefined: Self = StObject.set(x, "acknowledge", js.undefined)
  }
}
