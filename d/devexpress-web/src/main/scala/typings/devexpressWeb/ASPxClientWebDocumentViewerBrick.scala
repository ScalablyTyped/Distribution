package typings.devexpressWeb

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASPxClientWebDocumentViewerBrick extends js.Object {
  var content: StringDictionary[String] = js.native
  var height: Double = js.native
  var left: Double = js.native
  var navigation: ASPxClientWebDocumentViewerBrickNavigation = js.native
  var rtl: Boolean = js.native
  var top: Double = js.native
  var width: Double = js.native
}

object ASPxClientWebDocumentViewerBrick {
  @scala.inline
  def apply(
    content: StringDictionary[String],
    height: Double,
    left: Double,
    navigation: ASPxClientWebDocumentViewerBrickNavigation,
    rtl: Boolean,
    top: Double,
    width: Double
  ): ASPxClientWebDocumentViewerBrick = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebDocumentViewerBrick]
  }
  @scala.inline
  implicit class ASPxClientWebDocumentViewerBrickOps[Self <: ASPxClientWebDocumentViewerBrick] (val x: Self) extends AnyVal {
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
    def setContent(value: StringDictionary[String]): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavigation(value: ASPxClientWebDocumentViewerBrickNavigation): Self = this.set("navigation", value.asInstanceOf[js.Any])
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

