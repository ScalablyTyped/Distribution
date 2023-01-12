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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Types extends StObject {
  
  var DIAMOND: typings.flowdoc.flowdocStrings.DIAMOND
  
  var DOCUMENT: typings.flowdoc.flowdocStrings.DOCUMENT
  
  var ELLIPSE: typings.flowdoc.flowdocStrings.ELLIPSE
  
  var HOTSPOT: typings.flowdoc.flowdocStrings.HOTSPOT
  
  var IMAGE: typings.flowdoc.flowdocStrings.IMAGE
  
  var LAYER: typings.flowdoc.flowdocStrings.LAYER
  
  var PAGE: typings.flowdoc.flowdocStrings.PAGE
  
  var RECTANGLE: RECT
  
  var SCREEN: typings.flowdoc.flowdocStrings.SCREEN
}
object Types {
  
  inline def apply(): Types = {
    val __obj = js.Dynamic.literal(DIAMOND = "DIAMOND", DOCUMENT = "DOCUMENT", ELLIPSE = "ELLIPSE", HOTSPOT = "HOTSPOT", IMAGE = "IMAGE", LAYER = "LAYER", PAGE = "PAGE", RECTANGLE = "RECT", SCREEN = "SCREEN")
    __obj.asInstanceOf[Types]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Types] (val x: Self) extends AnyVal {
    
    inline def setDIAMOND(value: DIAMOND): Self = StObject.set(x, "DIAMOND", value.asInstanceOf[js.Any])
    
    inline def setDOCUMENT(value: DOCUMENT): Self = StObject.set(x, "DOCUMENT", value.asInstanceOf[js.Any])
    
    inline def setELLIPSE(value: ELLIPSE): Self = StObject.set(x, "ELLIPSE", value.asInstanceOf[js.Any])
    
    inline def setHOTSPOT(value: HOTSPOT): Self = StObject.set(x, "HOTSPOT", value.asInstanceOf[js.Any])
    
    inline def setIMAGE(value: IMAGE): Self = StObject.set(x, "IMAGE", value.asInstanceOf[js.Any])
    
    inline def setLAYER(value: LAYER): Self = StObject.set(x, "LAYER", value.asInstanceOf[js.Any])
    
    inline def setPAGE(value: PAGE): Self = StObject.set(x, "PAGE", value.asInstanceOf[js.Any])
    
    inline def setRECTANGLE(value: RECT): Self = StObject.set(x, "RECTANGLE", value.asInstanceOf[js.Any])
    
    inline def setSCREEN(value: SCREEN): Self = StObject.set(x, "SCREEN", value.asInstanceOf[js.Any])
  }
}
