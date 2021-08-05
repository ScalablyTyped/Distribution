package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details of the user&#39;s name.
  */
trait SchemaName extends StObject {
  
  /**
    * The user&#39;s last name.  Read-only.
    */
  var familyName: js.UndefOr[String] = js.undefined
  
  /**
    * The user&#39;s full name formed by concatenating the first and last name
    * values.  Read-only.
    */
  var fullName: js.UndefOr[String] = js.undefined
  
  /**
    * The user&#39;s first name.  Read-only.
    */
  var givenName: js.UndefOr[String] = js.undefined
}
object SchemaName {
  
  inline def apply(): SchemaName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaName]
  }
  
  extension [Self <: SchemaName](x: Self) {
    
    inline def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    inline def setFamilyNameUndefined: Self = StObject.set(x, "familyName", js.undefined)
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setFullNameUndefined: Self = StObject.set(x, "fullName", js.undefined)
    
    inline def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
    
    inline def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
  }
}
