package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphicsContext extends StObject {
  
  /**
    * The fill color to use for the overlay. Colors are typically specified by their RGB hex values, but you can also use a [friendly CSS color
    * name](https://developer.mozilla.org/en-US/docs/Web/CSS/color_value).
    */
  var fillColor: js.UndefOr[String] = js.undefined
  
  /**
    * The line color to use for the overlay. Colors are typically specified by their RGB hex values, but you can also use a
    * [friendly CSS color name](https://developer.mozilla.org/en-US/docs/Web/CSS/color_value).
    */
  var lineColor: js.UndefOr[String] = js.undefined
  
  /**
    * The line weight or thickness to use for the overlay.
    */
  var lineWeight: js.UndefOr[String] = js.undefined
}
object GraphicsContext {
  
  @scala.inline
  def apply(): GraphicsContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphicsContext]
  }
  
  @scala.inline
  implicit class GraphicsContextMutableBuilder[Self <: GraphicsContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    @scala.inline
    def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    @scala.inline
    def setLineWeight(value: String): Self = StObject.set(x, "lineWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWeightUndefined: Self = StObject.set(x, "lineWeight", js.undefined)
  }
}
