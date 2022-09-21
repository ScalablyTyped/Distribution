package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGridItem extends StObject {
  
  /**
    * A user-specified identifier for this grid item. This identifier will be returned in the parent Grid's on_click callback's parameters.
    */
  var identifier: js.UndefOr[String | Null] = js.undefined
  
  var image: js.UndefOr[SchemaImageComponent] = js.undefined
  
  var layout: js.UndefOr[String | Null] = js.undefined
  
  var subtitle: js.UndefOr[String | Null] = js.undefined
  
  var textAlignment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Text properties.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaGridItem {
  
  inline def apply(): SchemaGridItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGridItem]
  }
  
  extension [Self <: SchemaGridItem](x: Self) {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierNull: Self = StObject.set(x, "identifier", null)
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setImage(value: SchemaImageComponent): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutNull: Self = StObject.set(x, "layout", null)
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleNull: Self = StObject.set(x, "subtitle", null)
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTextAlignment(value: String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
    
    inline def setTextAlignmentNull: Self = StObject.set(x, "textAlignment", null)
    
    inline def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
