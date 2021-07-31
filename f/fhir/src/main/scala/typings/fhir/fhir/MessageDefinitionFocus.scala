package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource(s) that are the subject of the event
  */
trait MessageDefinitionFocus
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'max'.
    */
  var _max: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'min'.
    */
  var _min: js.UndefOr[Element] = js.undefined
  
  /**
    * Type of resource
    */
  var code: typings.fhir.fhir.code
  
  /**
    * Maximum number of focuses of this type
    */
  var max: js.UndefOr[String] = js.undefined
  
  /**
    * Minimum number of focuses of this type
    */
  var min: js.UndefOr[unsignedInt] = js.undefined
  
  /**
    * Profile that must be adhered to by focus
    */
  var profile: js.UndefOr[Reference] = js.undefined
}
object MessageDefinitionFocus {
  
  @scala.inline
  def apply(code: code): MessageDefinitionFocus = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDefinitionFocus]
  }
  
  @scala.inline
  implicit class MessageDefinitionFocusMutableBuilder[Self <: MessageDefinitionFocus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: unsignedInt): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setProfile(value: Reference): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    @scala.inline
    def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    @scala.inline
    def set_max(value: Element): Self = StObject.set(x, "_max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_maxUndefined: Self = StObject.set(x, "_max", js.undefined)
    
    @scala.inline
    def set_min(value: Element): Self = StObject.set(x, "_min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_minUndefined: Self = StObject.set(x, "_min", js.undefined)
  }
}
