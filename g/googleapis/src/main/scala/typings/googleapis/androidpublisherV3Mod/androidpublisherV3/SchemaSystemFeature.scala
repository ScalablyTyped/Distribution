package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSystemFeature extends StObject {
  
  /**
    * The name of the feature.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaSystemFeature {
  
  inline def apply(): SchemaSystemFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSystemFeature]
  }
  
  extension [Self <: SchemaSystemFeature](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
