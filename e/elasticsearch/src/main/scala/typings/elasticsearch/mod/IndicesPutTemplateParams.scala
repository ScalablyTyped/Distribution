package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesPutTemplateParams
  extends StObject
     with GenericParams {
  
  var create: js.UndefOr[Boolean] = js.undefined
  
  var flatSettings: js.UndefOr[Boolean] = js.undefined
  
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  
  var name: String
  
  var order: js.UndefOr[Double] = js.undefined
  
  var timeout: js.UndefOr[TimeSpan] = js.undefined
}
object IndicesPutTemplateParams {
  
  @scala.inline
  def apply(name: String): IndicesPutTemplateParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesPutTemplateParams]
  }
  
  @scala.inline
  implicit class IndicesPutTemplateParamsMutableBuilder[Self <: IndicesPutTemplateParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setFlatSettings(value: Boolean): Self = StObject.set(x, "flatSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlatSettingsUndefined: Self = StObject.set(x, "flatSettings", js.undefined)
    
    @scala.inline
    def setMasterTimeout(value: TimeSpan): Self = StObject.set(x, "masterTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterTimeoutUndefined: Self = StObject.set(x, "masterTimeout", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setTimeout(value: TimeSpan): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
