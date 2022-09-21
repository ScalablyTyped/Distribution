package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaKeyIntegrityViolationEvent extends StObject {
  
  /**
    * UID of the application which owns the key
    */
  var applicationUid: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Alias of the key.
    */
  var keyAlias: js.UndefOr[String | Null] = js.undefined
}
object SchemaKeyIntegrityViolationEvent {
  
  inline def apply(): SchemaKeyIntegrityViolationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKeyIntegrityViolationEvent]
  }
  
  extension [Self <: SchemaKeyIntegrityViolationEvent](x: Self) {
    
    inline def setApplicationUid(value: Double): Self = StObject.set(x, "applicationUid", value.asInstanceOf[js.Any])
    
    inline def setApplicationUidNull: Self = StObject.set(x, "applicationUid", null)
    
    inline def setApplicationUidUndefined: Self = StObject.set(x, "applicationUid", js.undefined)
    
    inline def setKeyAlias(value: String): Self = StObject.set(x, "keyAlias", value.asInstanceOf[js.Any])
    
    inline def setKeyAliasNull: Self = StObject.set(x, "keyAlias", null)
    
    inline def setKeyAliasUndefined: Self = StObject.set(x, "keyAlias", js.undefined)
  }
}
