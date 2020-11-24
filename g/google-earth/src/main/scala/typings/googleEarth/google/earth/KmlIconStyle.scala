package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KmlIconStyle extends KmlColorStyle {
  
  /**
    * The direction that icons are set to point, clockwise, and in degrees.
    */
  def getHeading(): Double = js.native
  
  /**
    * Specifies the position within the Icon that is anchored to the point specified in the placemark.
    * The x and y values can be specified in three different ways: as pixels, as fractions of the icon, or as inset pixels, which is an offset in pixels from the upper right corner of the icon.
    * The x and y positions can be specified in different ways.
    * For example, x can be in pixels and y can be a fraction.
    * The origin of the coordinate system is in the lower left corner of the icon.
    */
  def getHotSpot(): KmlVec2 = js.native
  
  /**
    * A custom Icon. In KmlIconStyle, the only child element of KmlIcon is href and href is an HTTP address or a local file specification used to load an icon.
    */
  def getIcon(): KmlIcon = js.native
  
  /**
    * Resizes the icon.
    */
  def getScale(): Double = js.native
  
  /**
    * The direction that icons are set to point, clockwise, and in degrees.
    */
  def setHeading(heading: Double): Unit = js.native
  
  /**
    * A custom Icon. In KmlIconStyle, the only child element of KmlIcon is href and href is an HTTP address or a local file specification used to load an icon.
    */
  def setIcon(icon: KmlIcon): Unit = js.native
  
  /**
    * Resizes the icon.
    */
  def setScale(scale: Double): Unit = js.native
}
object KmlIconStyle {
  
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals: KmlObject => Boolean,
    getColor: () => KmlColor,
    getColorMode: () => KmlColorModeEnum,
    getHeading: () => Double,
    getHotSpot: () => KmlVec2,
    getIcon: () => KmlIcon,
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
    setHeading: Double => Unit,
    setIcon: KmlIcon => Unit,
    setScale: Double => Unit
  ): KmlIconStyle = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), equals = js.Any.fromFunction1(equals), getColor = js.Any.fromFunction0(getColor), getColorMode = js.Any.fromFunction0(getColorMode), getHeading = js.Any.fromFunction0(getHeading), getHotSpot = js.Any.fromFunction0(getHotSpot), getIcon = js.Any.fromFunction0(getIcon), getId = js.Any.fromFunction0(getId), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getScale = js.Any.fromFunction0(getScale), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setColorMode = js.Any.fromFunction1(setColorMode), setHeading = js.Any.fromFunction1(setHeading), setIcon = js.Any.fromFunction1(setIcon), setScale = js.Any.fromFunction1(setScale))
    __obj.asInstanceOf[KmlIconStyle]
  }
  
  @scala.inline
  implicit class KmlIconStyleOps[Self <: KmlIconStyle] (val x: Self) extends AnyVal {
    
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
    def setGetHeading(value: () => Double): Self = this.set("getHeading", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHotSpot(value: () => KmlVec2): Self = this.set("getHotSpot", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIcon(value: () => KmlIcon): Self = this.set("getIcon", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScale(value: () => Double): Self = this.set("getScale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetHeading(value: Double => Unit): Self = this.set("setHeading", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIcon(value: KmlIcon => Unit): Self = this.set("setIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetScale(value: Double => Unit): Self = this.set("setScale", js.Any.fromFunction1(value))
  }
}
