package typings.extjs.Ext.util

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITextMetrics
  extends StObject
     with IBase {
  
  /** [Method] Binds this TextMetrics instance to a new element
    * @param el String/HTMLElement/Ext.Element The element or its ID.
    */
  var bind: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Destroy this instance */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Returns the measured height of the specified text
    * @param text String The text to measure
    * @returns Number height The height in pixels
    */
  var getHeight: js.UndefOr[js.Function1[/* text */ js.UndefOr[String], Double]] = js.undefined
  
  /** [Method] Returns the size of the specified text based on the internal element s style and width properties
    * @param text String The text to measure
    * @returns Object An object containing the text's size {width: (width), height: (height)}
    */
  var getSize: js.UndefOr[js.Function1[/* text */ js.UndefOr[String], js.Any]] = js.undefined
  
  /** [Method] Returns the measured width of the specified text
    * @param text String The text to measure
    * @returns Number width The width in pixels
    */
  var getWidth: js.UndefOr[js.Function1[/* text */ js.UndefOr[String], Double]] = js.undefined
  
  /** [Method] Sets a fixed width on the internal measurement element
    * @param width Number The width to set on the element
    */
  var setFixedWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[Double], Unit]] = js.undefined
}
object ITextMetrics {
  
  @scala.inline
  def apply(): ITextMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITextMetrics]
  }
  
  @scala.inline
  implicit class ITextMetricsMutableBuilder[Self <: ITextMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBind(value: /* el */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "bind", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    @scala.inline
    def setGetHeight(value: /* text */ js.UndefOr[String] => Double): Self = StObject.set(x, "getHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetHeightUndefined: Self = StObject.set(x, "getHeight", js.undefined)
    
    @scala.inline
    def setGetSize(value: /* text */ js.UndefOr[String] => js.Any): Self = StObject.set(x, "getSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSizeUndefined: Self = StObject.set(x, "getSize", js.undefined)
    
    @scala.inline
    def setGetWidth(value: /* text */ js.UndefOr[String] => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetWidthUndefined: Self = StObject.set(x, "getWidth", js.undefined)
    
    @scala.inline
    def setSetFixedWidth(value: /* width */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setFixedWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFixedWidthUndefined: Self = StObject.set(x, "setFixedWidth", js.undefined)
  }
}
