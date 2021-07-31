package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyResult extends StObject {
  
  var dbId: Double
  
  var externalId: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var properties: js.Array[Property]
}
object PropertyResult {
  
  @scala.inline
  def apply(dbId: Double, properties: js.Array[Property]): PropertyResult = {
    val __obj = js.Dynamic.literal(dbId = dbId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyResult]
  }
  
  @scala.inline
  implicit class PropertyResultMutableBuilder[Self <: PropertyResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDbId(value: Double): Self = StObject.set(x, "dbId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProperties(value: js.Array[Property]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesVarargs(value: Property*): Self = StObject.set(x, "properties", js.Array(value :_*))
  }
}
