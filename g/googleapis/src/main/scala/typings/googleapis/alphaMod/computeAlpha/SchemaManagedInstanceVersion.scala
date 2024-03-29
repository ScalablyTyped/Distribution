package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManagedInstanceVersion extends StObject {
  
  /**
    * [Output Only] The intended template of the instance. This field is empty when current_action is one of { DELETING, ABANDONING \}.
    */
  var instanceTemplate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Name of the version.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaManagedInstanceVersion {
  
  inline def apply(): SchemaManagedInstanceVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedInstanceVersion]
  }
  
  extension [Self <: SchemaManagedInstanceVersion](x: Self) {
    
    inline def setInstanceTemplate(value: String): Self = StObject.set(x, "instanceTemplate", value.asInstanceOf[js.Any])
    
    inline def setInstanceTemplateNull: Self = StObject.set(x, "instanceTemplate", null)
    
    inline def setInstanceTemplateUndefined: Self = StObject.set(x, "instanceTemplate", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
