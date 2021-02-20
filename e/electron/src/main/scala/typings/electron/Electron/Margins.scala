package typings.electron.Electron

import typings.electron.electronStrings.custom
import typings.electron.electronStrings.default
import typings.electron.electronStrings.none
import typings.electron.electronStrings.printableArea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Margins extends StObject {
  
  /**
    * The bottom margin of the printed web page, in pixels.
    */
  var bottom: js.UndefOr[Double] = js.native
  
  /**
    * The left margin of the printed web page, in pixels.
    */
  var left: js.UndefOr[Double] = js.native
  
  /**
    * Can be `default`, `none`, `printableArea`, or `custom`. If `custom` is chosen,
    * you will also need to specify `top`, `bottom`, `left`, and `right`.
    */
  var marginType: js.UndefOr[default | none | printableArea | custom] = js.native
  
  /**
    * The right margin of the printed web page, in pixels.
    */
  var right: js.UndefOr[Double] = js.native
  
  /**
    * The top margin of the printed web page, in pixels.
    */
  var top: js.UndefOr[Double] = js.native
}
object Margins {
  
  @scala.inline
  def apply(): Margins = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Margins]
  }
  
  @scala.inline
  implicit class MarginsMutableBuilder[Self <: Margins] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setMarginType(value: default | none | printableArea | custom): Self = StObject.set(x, "marginType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginTypeUndefined: Self = StObject.set(x, "marginType", js.undefined)
    
    @scala.inline
    def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
