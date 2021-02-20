package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Profiles that apply globally
  */
@js.native
trait ImplementationGuideGlobal extends BackboneElement {
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  
  /**
    * Profile that all resources must conform to
    */
  var profile: Reference = js.native
  
  /**
    * Type this profiles applies to
    */
  var `type`: code = js.native
}
object ImplementationGuideGlobal {
  
  @scala.inline
  def apply(profile: Reference, `type`: code): ImplementationGuideGlobal = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationGuideGlobal]
  }
  
  @scala.inline
  implicit class ImplementationGuideGlobalMutableBuilder[Self <: ImplementationGuideGlobal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProfile(value: Reference): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
