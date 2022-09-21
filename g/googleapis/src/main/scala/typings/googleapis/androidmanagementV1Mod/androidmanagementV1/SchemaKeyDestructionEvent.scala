package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaKeyDestructionEvent extends StObject {
  
  /**
    * UID of the application which owns the key.
    */
  var applicationUid: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Alias of the key.
    */
  var keyAlias: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the operation was successful.
    */
  var success: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaKeyDestructionEvent {
  
  inline def apply(): SchemaKeyDestructionEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKeyDestructionEvent]
  }
  
  extension [Self <: SchemaKeyDestructionEvent](x: Self) {
    
    inline def setApplicationUid(value: Double): Self = StObject.set(x, "applicationUid", value.asInstanceOf[js.Any])
    
    inline def setApplicationUidNull: Self = StObject.set(x, "applicationUid", null)
    
    inline def setApplicationUidUndefined: Self = StObject.set(x, "applicationUid", js.undefined)
    
    inline def setKeyAlias(value: String): Self = StObject.set(x, "keyAlias", value.asInstanceOf[js.Any])
    
    inline def setKeyAliasNull: Self = StObject.set(x, "keyAlias", null)
    
    inline def setKeyAliasUndefined: Self = StObject.set(x, "keyAlias", js.undefined)
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessNull: Self = StObject.set(x, "success", null)
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
