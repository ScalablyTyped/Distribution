package typings.flowdoc.Flow

import typings.flowdoc.flowdocStrings.DIAMOND
import typings.flowdoc.flowdocStrings.DOCUMENT
import typings.flowdoc.flowdocStrings.ELLIPSE
import typings.flowdoc.flowdocStrings.HOTSPOT
import typings.flowdoc.flowdocStrings.IMAGE
import typings.flowdoc.flowdocStrings.LAYER
import typings.flowdoc.flowdocStrings.PAGE
import typings.flowdoc.flowdocStrings.RECT
import typings.flowdoc.flowdocStrings.SCREEN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Types extends js.Object {
  var DIAMOND: typings.flowdoc.flowdocStrings.DIAMOND = js.native
  var DOCUMENT: typings.flowdoc.flowdocStrings.DOCUMENT = js.native
  var ELLIPSE: typings.flowdoc.flowdocStrings.ELLIPSE = js.native
  var HOTSPOT: typings.flowdoc.flowdocStrings.HOTSPOT = js.native
  var IMAGE: typings.flowdoc.flowdocStrings.IMAGE = js.native
  var LAYER: typings.flowdoc.flowdocStrings.LAYER = js.native
  var PAGE: typings.flowdoc.flowdocStrings.PAGE = js.native
  var RECTANGLE: RECT = js.native
  var SCREEN: typings.flowdoc.flowdocStrings.SCREEN = js.native
}

object Types {
  @scala.inline
  def apply(
    DIAMOND: DIAMOND,
    DOCUMENT: DOCUMENT,
    ELLIPSE: ELLIPSE,
    HOTSPOT: HOTSPOT,
    IMAGE: IMAGE,
    LAYER: LAYER,
    PAGE: PAGE,
    RECTANGLE: RECT,
    SCREEN: SCREEN
  ): Types = {
    val __obj = js.Dynamic.literal(DIAMOND = DIAMOND.asInstanceOf[js.Any], DOCUMENT = DOCUMENT.asInstanceOf[js.Any], ELLIPSE = ELLIPSE.asInstanceOf[js.Any], HOTSPOT = HOTSPOT.asInstanceOf[js.Any], IMAGE = IMAGE.asInstanceOf[js.Any], LAYER = LAYER.asInstanceOf[js.Any], PAGE = PAGE.asInstanceOf[js.Any], RECTANGLE = RECTANGLE.asInstanceOf[js.Any], SCREEN = SCREEN.asInstanceOf[js.Any])
    __obj.asInstanceOf[Types]
  }
  @scala.inline
  implicit class TypesOps[Self <: Types] (val x: Self) extends AnyVal {
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
    def setDIAMOND(value: DIAMOND): Self = this.set("DIAMOND", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOCUMENT(value: DOCUMENT): Self = this.set("DOCUMENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setELLIPSE(value: ELLIPSE): Self = this.set("ELLIPSE", value.asInstanceOf[js.Any])
    @scala.inline
    def setHOTSPOT(value: HOTSPOT): Self = this.set("HOTSPOT", value.asInstanceOf[js.Any])
    @scala.inline
    def setIMAGE(value: IMAGE): Self = this.set("IMAGE", value.asInstanceOf[js.Any])
    @scala.inline
    def setLAYER(value: LAYER): Self = this.set("LAYER", value.asInstanceOf[js.Any])
    @scala.inline
    def setPAGE(value: PAGE): Self = this.set("PAGE", value.asInstanceOf[js.Any])
    @scala.inline
    def setRECTANGLE(value: RECT): Self = this.set("RECTANGLE", value.asInstanceOf[js.Any])
    @scala.inline
    def setSCREEN(value: SCREEN): Self = this.set("SCREEN", value.asInstanceOf[js.Any])
  }
  
}

