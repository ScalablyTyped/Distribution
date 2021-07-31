package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlLabelStyle
  extends StObject
     with KmlColorStyle {
  
  /**
    * Resizes the label.
    */
  def getScale(): Double
  
  /**
    * Resizes the label.
    */
  def setScale(scale: Double): Unit
}
object KmlLabelStyle {
  
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
    getScale: () => Double,
    getType: () => String,
    getUrl: () => String,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit,
    setColorMode: KmlColorModeEnum => Unit,
    setScale: Double => Unit
  ): KmlLabelStyle = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), getColor = js.Any.fromFunction0(getColor), getColorMode = js.Any.fromFunction0(getColorMode), getId = js.Any.fromFunction0(getId), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getScale = js.Any.fromFunction0(getScale), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setColorMode = js.Any.fromFunction1(setColorMode), setScale = js.Any.fromFunction1(setScale))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlLabelStyle]
  }
  
  @scala.inline
  implicit class KmlLabelStyleMutableBuilder[Self <: KmlLabelStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetScale(value: () => Double): Self = StObject.set(x, "getScale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetScale(value: Double => Unit): Self = StObject.set(x, "setScale", js.Any.fromFunction1(value))
  }
}
