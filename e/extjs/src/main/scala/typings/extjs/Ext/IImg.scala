package typings.extjs.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IImg extends IComponent {
  
  /** [Config Option] (String) */
  var alt: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (Number/String) */
  var glyph: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var imgCls: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_IImg: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Updates the src of the image
    * @param src String
    */
  var setSrc: js.UndefOr[js.Function1[/* src */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Config Option] (String) */
  var src: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.native
}
object IImg {
  
  @scala.inline
  def apply(): IImg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IImg]
  }
  
  @scala.inline
  implicit class IImgMutableBuilder[Self <: IImg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlt(value: java.lang.String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def setGlyph(value: js.Any): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
    
    @scala.inline
    def setImgCls(value: java.lang.String): Self = StObject.set(x, "imgCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImgClsUndefined: Self = StObject.set(x, "imgCls", js.undefined)
    
    @scala.inline
    def setOnRender(value: () => Unit): Self = StObject.set(x, "onRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
    
    @scala.inline
    def setSetSrc(value: /* src */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setSrc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSrcUndefined: Self = StObject.set(x, "setSrc", js.undefined)
    
    @scala.inline
    def setSrc(value: java.lang.String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    @scala.inline
    def setTitle(value: java.lang.String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
