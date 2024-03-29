package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManagedPropertyEntry extends StObject {
  
  /**
    * The human-readable name of the value. Localized.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The machine-readable value of the entry, which should be used in the configuration. Not localized.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaManagedPropertyEntry {
  
  inline def apply(): SchemaManagedPropertyEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedPropertyEntry]
  }
  
  extension [Self <: SchemaManagedPropertyEntry](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
