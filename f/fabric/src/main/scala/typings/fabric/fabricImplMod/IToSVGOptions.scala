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
  
  @scala.inline
  def apply(): IToSVGOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToSVGOptions]
  }
  
  @scala.inline
  implicit class IToSVGOptionsMutableBuilder[Self <: IToSVGOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setSuppressPreamble(value: Boolean): Self = StObject.set(x, "suppressPreamble", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressPreambleUndefined: Self = StObject.set(x, "suppressPreamble", js.undefined)
    
    @scala.inline
    def setViewBox(value: IViewBox): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
