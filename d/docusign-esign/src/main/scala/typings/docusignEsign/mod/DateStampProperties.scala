package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateStampProperties extends StObject {
  
  /**
    * The height of the rectangle.
    */
  var dateAreaHeight: js.UndefOr[String] = js.undefined
  
  /**
    * The width of the rectangle.
    */
  var dateAreaWidth: js.UndefOr[String] = js.undefined
  
  /**
    * The X axis position of the top-left corner.
    */
  var dateAreaX: js.UndefOr[String] = js.undefined
  
  /**
    * The Y axis position of the top-left corner.
    */
  var dateAreaY: js.UndefOr[String] = js.undefined
}
object DateStampProperties {
  
  inline def apply(): DateStampProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateStampProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateStampProperties] (val x: Self) extends AnyVal {
    
    inline def setDateAreaHeight(value: String): Self = StObject.set(x, "dateAreaHeight", value.asInstanceOf[js.Any])
    
    inline def setDateAreaHeightUndefined: Self = StObject.set(x, "dateAreaHeight", js.undefined)
    
    inline def setDateAreaWidth(value: String): Self = StObject.set(x, "dateAreaWidth", value.asInstanceOf[js.Any])
    
    inline def setDateAreaWidthUndefined: Self = StObject.set(x, "dateAreaWidth", js.undefined)
    
    inline def setDateAreaX(value: String): Self = StObject.set(x, "dateAreaX", value.asInstanceOf[js.Any])
    
    inline def setDateAreaXUndefined: Self = StObject.set(x, "dateAreaX", js.undefined)
    
    inline def setDateAreaY(value: String): Self = StObject.set(x, "dateAreaY", value.asInstanceOf[js.Any])
    
    inline def setDateAreaYUndefined: Self = StObject.set(x, "dateAreaY", js.undefined)
  }
}
