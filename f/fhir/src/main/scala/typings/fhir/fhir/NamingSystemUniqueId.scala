package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Unique identifiers used for system
  */
trait NamingSystemUniqueId
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'preferred'.
    */
  var _preferred: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.undefined
  
  /**
    * Notes about identifier usage
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * When is identifier valid?
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Is this the id that should be used for this type
    */
  var preferred: js.UndefOr[Boolean] = js.undefined
  
  /**
    * oid | uuid | uri | other
    */
  var `type`: code
  
  /**
    * The unique identifier
    */
  var value: String
}
object NamingSystemUniqueId {
  
  inline def apply(`type`: code, value: String): NamingSystemUniqueId = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamingSystemUniqueId]
  }
  
  extension [Self <: NamingSystemUniqueId](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPreferred(value: Boolean): Self = StObject.set(x, "preferred", value.asInstanceOf[js.Any])
    
    inline def setPreferredUndefined: Self = StObject.set(x, "preferred", js.undefined)
    
    inline def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def set_comment(value: Element): Self = StObject.set(x, "_comment", value.asInstanceOf[js.Any])
    
    inline def set_commentUndefined: Self = StObject.set(x, "_comment", js.undefined)
    
    inline def set_preferred(value: Element): Self = StObject.set(x, "_preferred", value.asInstanceOf[js.Any])
    
    inline def set_preferredUndefined: Self = StObject.set(x, "_preferred", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    inline def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    inline def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}
