package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlBalloonStyle
  extends StObject
     with KmlObject {
  
  /**
    * Background color of the balloon (optional).
    */
  def getBgColor(): KmlColor
  
  /**
    * The text contained in the balloon. 
    */
  def getText(): String
  
  /**
    * Foreground color for text. The default is black (ff000000).
    */
  def getTextColor(): KmlColor
  
  /**
    * The text contained in the balloon. 
    */
  def setText(text: String): Unit
}
object KmlBalloonStyle {
  
  inline def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals_ : KmlObject => Boolean,
    getBgColor: () => KmlColor,
    getId: () => String,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getText: () => String,
    getTextColor: () => KmlColor,
    getType: () => String,
    getUrl: () => String,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit,
    setText: String => Unit
  ): KmlBalloonStyle = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), getBgColor = js.Any.fromFunction0(getBgColor), getId = js.Any.fromFunction0(getId), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getText = js.Any.fromFunction0(getText), getTextColor = js.Any.fromFunction0(getTextColor), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setText = js.Any.fromFunction1(setText))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlBalloonStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KmlBalloonStyle] (val x: Self) extends AnyVal {
    
    inline def setGetBgColor(value: () => KmlColor): Self = StObject.set(x, "getBgColor", js.Any.fromFunction0(value))
    
    inline def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    inline def setGetTextColor(value: () => KmlColor): Self = StObject.set(x, "getTextColor", js.Any.fromFunction0(value))
    
    inline def setSetText(value: String => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
  }
}
