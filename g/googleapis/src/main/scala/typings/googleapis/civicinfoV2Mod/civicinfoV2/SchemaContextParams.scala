package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContextParams extends StObject {
  
  var clientProfile: js.UndefOr[String] = js.undefined
}
object SchemaContextParams {
  
  @scala.inline
  def apply(): SchemaContextParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContextParams]
  }
  
  @scala.inline
  implicit class SchemaContextParamsMutableBuilder[Self <: SchemaContextParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientProfile(value: String): Self = StObject.set(x, "clientProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientProfileUndefined: Self = StObject.set(x, "clientProfile", js.undefined)
  }
}
