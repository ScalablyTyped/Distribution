package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlPolyStyle
  extends StObject
     with KmlColorStyle {
  
  /**
    * Specifies whether or not to fill the polygon. Possible values 1 (fill) and 0 (no fill).
    */
  def getFill(): Boolean
  
  /**
    * Specifies whether to outline the polygon. Polygon outlines use the current KmlLineStyle.
    */
  def getOutline(): Boolean
  
  /**
    * Specifies whether or not to fill the polygon. Possible values 1 (fill) and 0 (no fill).
    */
  def setFill(fill: Boolean): Unit
  
  /**
    * Specifies whether to outline the polygon. Polygon outlines use the current KmlLineStyle.
    */
  def setOutline(outline: Boolean): Unit
}
object KmlPolyStyle {
  
  inline def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals_ : KmlObject => Boolean,
    getColor: () => KmlColor,
    getColorMode: () => KmlColorModeEnum,
    getFill: () => Boolean,
    getId: () => String,
    getOutline: () => Boolean,
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
    setColorMode: KmlColorModeEnum => Unit,
    setFill: Boolean => Unit,
    setOutline: Boolean => Unit
  ): KmlPolyStyle = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), getColor = js.Any.fromFunction0(getColor), getColorMode = js.Any.fromFunction0(getColorMode), getFill = js.Any.fromFunction0(getFill), getId = js.Any.fromFunction0(getId), getOutline = js.Any.fromFunction0(getOutline), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setColorMode = js.Any.fromFunction1(setColorMode), setFill = js.Any.fromFunction1(setFill), setOutline = js.Any.fromFunction1(setOutline))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlPolyStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KmlPolyStyle] (val x: Self) extends AnyVal {
    
    inline def setGetFill(value: () => Boolean): Self = StObject.set(x, "getFill", js.Any.fromFunction0(value))
    
    inline def setGetOutline(value: () => Boolean): Self = StObject.set(x, "getOutline", js.Any.fromFunction0(value))
    
    inline def setSetFill(value: Boolean => Unit): Self = StObject.set(x, "setFill", js.Any.fromFunction1(value))
    
    inline def setSetOutline(value: Boolean => Unit): Self = StObject.set(x, "setOutline", js.Any.fromFunction1(value))
  }
}
