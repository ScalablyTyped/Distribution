package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlColorStyle
  extends StObject
     with KmlObject {
  
  /**
    * Color and opacity (alpha) values.
    */
  def getColor(): KmlColor
  
  /**
    * Specifies which color mode effect to apply to the base color.
    * 
    * See also:
    *
    * * GEPlugin.COLOR_NORMAL
    * * GEPlugin.COLOR_INHERIT
    * * GEPlugin.COLOR_RANDOM
    */
  def getColorMode(): KmlColorModeEnum
  
  /**
    * Specifies which color mode effect to apply to the base color.
    * 
    * See also:
    *
    * * GEPlugin.COLOR_NORMAL
    * * GEPlugin.COLOR_INHERIT
    * * GEPlugin.COLOR_RANDOM
    */
  def setColorMode(colorMode: KmlColorModeEnum): Unit
}
object KmlColorStyle {
  
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals_ : KmlObject => Boolean,
    getColor: () => KmlColor,
    getColorMode: () => KmlColorModeEnum,
    getId: () => String,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getType: () => String,
    getUrl: () => String,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit,
    setColorMode: KmlColorModeEnum => Unit
  ): KmlColorStyle = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), getColor = js.Any.fromFunction0(getColor), getColorMode = js.Any.fromFunction0(getColorMode), getId = js.Any.fromFunction0(getId), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setColorMode = js.Any.fromFunction1(setColorMode))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlColorStyle]
  }
  
  @scala.inline
  implicit class KmlColorStyleMutableBuilder[Self <: KmlColorStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetColor(value: () => KmlColor): Self = StObject.set(x, "getColor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetColorMode(value: () => KmlColorModeEnum): Self = StObject.set(x, "getColorMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetColorMode(value: KmlColorModeEnum => Unit): Self = StObject.set(x, "setColorMode", js.Any.fromFunction1(value))
  }
}
