package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOfferTag extends StObject {
  
  /**
    * Must conform with RFC-1034. That is, this string can only contain lower-case letters (a-z), numbers (0-9), and hyphens (-), and be at most 20 characters.
    */
  var tag: js.UndefOr[String | Null] = js.undefined
}
object SchemaOfferTag {
  
  inline def apply(): SchemaOfferTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOfferTag]
  }
  
  extension [Self <: SchemaOfferTag](x: Self) {
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagNull: Self = StObject.set(x, "tag", null)
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
