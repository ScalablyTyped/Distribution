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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Types extends StObject {
  
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
  implicit class TypesMutableBuilder[Self <: Types] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDIAMOND(value: DIAMOND): Self = StObject.set(x, "DIAMOND", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOCUMENT(value: DOCUMENT): Self = StObject.set(x, "DOCUMENT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setELLIPSE(value: ELLIPSE): Self = StObject.set(x, "ELLIPSE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHOTSPOT(value: HOTSPOT): Self = StObject.set(x, "HOTSPOT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIMAGE(value: IMAGE): Self = StObject.set(x, "IMAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLAYER(value: LAYER): Self = StObject.set(x, "LAYER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPAGE(value: PAGE): Self = StObject.set(x, "PAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRECTANGLE(value: RECT): Self = StObject.set(x, "RECTANGLE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSCREEN(value: SCREEN): Self = StObject.set(x, "SCREEN", value.asInstanceOf[js.Any])
  }
}
