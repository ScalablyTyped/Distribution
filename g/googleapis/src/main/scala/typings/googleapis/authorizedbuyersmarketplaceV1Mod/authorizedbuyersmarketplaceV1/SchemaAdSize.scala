package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdSize extends StObject {
  
  /**
    * The height of the ad slot in pixels. This field will be present only when size type is `PIXEL`.
    */
  var height: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the ad slot size.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The width of the ad slot in pixels. This field will be present only when size type is `PIXEL`.
    */
  var width: js.UndefOr[String | Null] = js.undefined
}
object SchemaAdSize {
  
  inline def apply(): SchemaAdSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdSize]
  }
  
  extension [Self <: SchemaAdSize](x: Self) {
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightNull: Self = StObject.set(x, "height", null)
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthNull: Self = StObject.set(x, "width", null)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
