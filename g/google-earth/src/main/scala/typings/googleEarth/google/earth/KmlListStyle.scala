package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlListStyle
  extends StObject
     with KmlObject {
  
  /**
    * Background color for the Snippet.
    */
  def getBgColor(): KmlColor
  
  /**
    * Specifies how a feature should be displayed in a list view.
    */
  def getListItemType(): KmlListItemTypeEnum
  
  /**
    * Maximum number of lines of text for the Snippet.
    */
  def getMaxSnippetLines(): Double
  
  /**
    * Maximum number of lines of text for the Snippet.
    */
  def setMaxSnippetLines(maxSnippetLines: Double): Unit
}
object KmlListStyle {
  
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals_ : KmlObject => Boolean,
    getBgColor: () => KmlColor,
    getId: () => String,
    getListItemType: () => KmlListItemTypeEnum,
    getMaxSnippetLines: () => Double,
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
    setMaxSnippetLines: Double => Unit
  ): KmlListStyle = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), getBgColor = js.Any.fromFunction0(getBgColor), getId = js.Any.fromFunction0(getId), getListItemType = js.Any.fromFunction0(getListItemType), getMaxSnippetLines = js.Any.fromFunction0(getMaxSnippetLines), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setMaxSnippetLines = js.Any.fromFunction1(setMaxSnippetLines))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlListStyle]
  }
  
  @scala.inline
  implicit class KmlListStyleMutableBuilder[Self <: KmlListStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetBgColor(value: () => KmlColor): Self = StObject.set(x, "getBgColor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetListItemType(value: () => KmlListItemTypeEnum): Self = StObject.set(x, "getListItemType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxSnippetLines(value: () => Double): Self = StObject.set(x, "getMaxSnippetLines", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetMaxSnippetLines(value: Double => Unit): Self = StObject.set(x, "setMaxSnippetLines", js.Any.fromFunction1(value))
  }
}
