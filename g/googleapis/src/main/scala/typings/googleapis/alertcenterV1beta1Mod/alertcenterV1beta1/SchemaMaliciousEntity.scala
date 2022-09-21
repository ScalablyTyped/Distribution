package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMaliciousEntity extends StObject {
  
  /**
    * The header from display name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The actor who triggered a gmail phishing alert.
    */
  var entity: js.UndefOr[SchemaUser] = js.undefined
  
  /**
    * The sender email address.
    */
  var fromHeader: js.UndefOr[String | Null] = js.undefined
}
object SchemaMaliciousEntity {
  
  inline def apply(): SchemaMaliciousEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMaliciousEntity]
  }
  
  extension [Self <: SchemaMaliciousEntity](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEntity(value: SchemaUser): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    inline def setFromHeader(value: String): Self = StObject.set(x, "fromHeader", value.asInstanceOf[js.Any])
    
    inline def setFromHeaderNull: Self = StObject.set(x, "fromHeader", null)
    
    inline def setFromHeaderUndefined: Self = StObject.set(x, "fromHeader", js.undefined)
  }
}
