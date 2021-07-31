package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizeOptions extends StObject {
  
  /**
    * Defaults to the image's height.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The desired quality of the resize image. Possible values are `good`, `better`,
    * or `best`. The default is `best`. These values express a desired quality/speed
    * tradeoff. They are translated into an algorithm-specific method that depends on
    * the capabilities (CPU, GPU) of the underlying platform. It is possible for all
    * three methods to be mapped to the same algorithm on a given platform.
    */
  var quality: js.UndefOr[String] = js.undefined
  
  /**
    * Defaults to the image's width.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ResizeOptions {
  
  @scala.inline
  def apply(): ResizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeOptions]
  }
  
  @scala.inline
  implicit class ResizeOptionsMutableBuilder[Self <: ResizeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setQuality(value: String): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
