package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contact information
  */
trait ContactDetail
  extends StObject
     with Element {
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Name of an individual to contact
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Contact details for individual or organization
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}
object ContactDetail {
  
  @scala.inline
  def apply(): ContactDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactDetail]
  }
  
  @scala.inline
  implicit class ContactDetailMutableBuilder[Self <: ContactDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTelecom(value: js.Array[ContactPoint]): Self = StObject.set(x, "telecom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelecomUndefined: Self = StObject.set(x, "telecom", js.undefined)
    
    @scala.inline
    def setTelecomVarargs(value: ContactPoint*): Self = StObject.set(x, "telecom", js.Array(value :_*))
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
