package typings.extjs.Ext.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBelongsToAssociation
  extends StObject
     with typings.extjs.Ext.data.association.IAssociation {
  
  /** [Config Option] (String) */
  var foreignKey: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var getterName: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var setterName: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var `type`: js.UndefOr[String] = js.undefined
}
object IBelongsToAssociation {
  
  inline def apply(): IBelongsToAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBelongsToAssociation]
  }
  
  extension [Self <: IBelongsToAssociation](x: Self) {
    
    inline def setForeignKey(value: String): Self = StObject.set(x, "foreignKey", value.asInstanceOf[js.Any])
    
    inline def setForeignKeyUndefined: Self = StObject.set(x, "foreignKey", js.undefined)
    
    inline def setGetterName(value: String): Self = StObject.set(x, "getterName", value.asInstanceOf[js.Any])
    
    inline def setGetterNameUndefined: Self = StObject.set(x, "getterName", js.undefined)
    
    inline def setSetterName(value: String): Self = StObject.set(x, "setterName", value.asInstanceOf[js.Any])
    
    inline def setSetterNameUndefined: Self = StObject.set(x, "setterName", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
