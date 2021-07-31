package typings.fabric.fabricImplMod

import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFillOptions extends StObject {
  
  /**
    * Pattern horizontal offset from object's left/top corner
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * Pattern vertical offset from object's left/top corner
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  
  /**
    * Repeat property of a pattern (one of repeat, repeat-x, repeat-y or no-repeat)
    */
  var repeat: js.UndefOr[String] = js.undefined
  
  /**
    * options.source Pattern source
    */
  var source: String | HTMLImageElement
}
object IFillOptions {
  
  @scala.inline
  def apply(source: String | HTMLImageElement): IFillOptions = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFillOptions]
  }
  
  @scala.inline
  implicit class IFillOptionsMutableBuilder[Self <: IFillOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    @scala.inline
    def setRepeat(value: String): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    @scala.inline
    def setSource(value: String | HTMLImageElement): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
