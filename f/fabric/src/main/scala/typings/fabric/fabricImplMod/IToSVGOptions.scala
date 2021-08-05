package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IToSVGOptions extends StObject {
  
  /**
    * Encoding of SVG output
    */
  var encoding: js.UndefOr[String] = js.undefined
  
  /**
    * desired height of svg with or without units
    */
  var height: js.UndefOr[Double | String] = js.undefined
  
  /**
    * If true xml tag is not included
    */
  var suppressPreamble: js.UndefOr[Boolean] = js.undefined
  
  /**
    * SVG viewbox object
    */
  var viewBox: js.UndefOr[IViewBox] = js.undefined
  
  /**
    * desired width of svg with or without units
    */
  var width: js.UndefOr[Double | String] = js.undefined
}
object IToSVGOptions {
  
  inline def apply(): IToSVGOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToSVGOptions]
  }
  
  extension [Self <: IToSVGOptions](x: Self) {
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setSuppressPreamble(value: Boolean): Self = StObject.set(x, "suppressPreamble", value.asInstanceOf[js.Any])
    
    inline def setSuppressPreambleUndefined: Self = StObject.set(x, "suppressPreamble", js.undefined)
    
    inline def setViewBox(value: IViewBox): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    
    inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
