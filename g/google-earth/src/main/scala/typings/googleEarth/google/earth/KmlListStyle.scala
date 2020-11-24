package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KmlListStyle extends KmlObject {
  
  /**
    * Background color for the Snippet.
    */
  def getBgColor(): KmlColor = js.native
  
  /**
    * Specifies how a feature should be displayed in a list view.
    */
  def getListItemType(): KmlListItemTypeEnum = js.native
  
  /**
    * Maximum number of lines of text for the Snippet.
    */
  def getMaxSnippetLines(): Double = js.native
  
  /**
    * Maximum number of lines of text for the Snippet.
    */
  def setMaxSnippetLines(maxSnippetLines: Double): Unit = js.native
}
object KmlListStyle {
  
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals: KmlObject => Boolean,
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
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), equals = js.Any.fromFunction1(equals), getBgColor = js.Any.fromFunction0(getBgColor), getId = js.Any.fromFunction0(getId), getListItemType = js.Any.fromFunction0(getListItemType), getMaxSnippetLines = js.Any.fromFunction0(getMaxSnippetLines), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setMaxSnippetLines = js.Any.fromFunction1(setMaxSnippetLines))
    __obj.asInstanceOf[KmlListStyle]
  }
  
  @scala.inline
  implicit class KmlListStyleOps[Self <: KmlListStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetBgColor(value: () => KmlColor): Self = this.set("getBgColor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetListItemType(value: () => KmlListItemTypeEnum): Self = this.set("getListItemType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxSnippetLines(value: () => Double): Self = this.set("getMaxSnippetLines", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetMaxSnippetLines(value: Double => Unit): Self = this.set("setMaxSnippetLines", js.Any.fromFunction1(value))
  }
}
