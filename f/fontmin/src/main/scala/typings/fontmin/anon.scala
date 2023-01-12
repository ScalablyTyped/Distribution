package typings.fontmin

import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AjdustToEmBox extends StObject {
    
    var ajdustToEmBox: Boolean
    
    var ajdustToEmPadding: Double
    
    var leftSidebearing: Double
    
    var rightSidebearing: Double
  }
  object AjdustToEmBox {
    
    inline def apply(
      ajdustToEmBox: Boolean,
      ajdustToEmPadding: Double,
      leftSidebearing: Double,
      rightSidebearing: Double
    ): AjdustToEmBox = {
      val __obj = js.Dynamic.literal(ajdustToEmBox = ajdustToEmBox.asInstanceOf[js.Any], ajdustToEmPadding = ajdustToEmPadding.asInstanceOf[js.Any], leftSidebearing = leftSidebearing.asInstanceOf[js.Any], rightSidebearing = rightSidebearing.asInstanceOf[js.Any])
      __obj.asInstanceOf[AjdustToEmBox]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AjdustToEmBox] (val x: Self) extends AnyVal {
      
      inline def setAjdustToEmBox(value: Boolean): Self = StObject.set(x, "ajdustToEmBox", value.asInstanceOf[js.Any])
      
      inline def setAjdustToEmPadding(value: Double): Self = StObject.set(x, "ajdustToEmPadding", value.asInstanceOf[js.Any])
      
      inline def setLeftSidebearing(value: Double): Self = StObject.set(x, "leftSidebearing", value.asInstanceOf[js.Any])
      
      inline def setRightSidebearing(value: Double): Self = StObject.set(x, "rightSidebearing", value.asInstanceOf[js.Any])
    }
  }
  
  trait Contents extends StObject {
    
    var _contents: Readable
  }
  object Contents {
    
    inline def apply(_contents: Readable): Contents = {
      val __obj = js.Dynamic.literal(_contents = _contents.asInstanceOf[js.Any])
      __obj.asInstanceOf[Contents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Contents] (val x: Self) extends AnyVal {
      
      inline def set_contents(value: Readable): Self = StObject.set(x, "_contents", value.asInstanceOf[js.Any])
    }
  }
  
  trait FontFamily extends StObject {
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontSubFamily: js.UndefOr[String] = js.undefined
    
    var postScriptName: js.UndefOr[String] = js.undefined
    
    var uniqueSubFamily: js.UndefOr[String] = js.undefined
  }
  object FontFamily {
    
    inline def apply(): FontFamily = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FontFamily]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FontFamily] (val x: Self) extends AnyVal {
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSubFamily(value: String): Self = StObject.set(x, "fontSubFamily", value.asInstanceOf[js.Any])
      
      inline def setFontSubFamilyUndefined: Self = StObject.set(x, "fontSubFamily", js.undefined)
      
      inline def setPostScriptName(value: String): Self = StObject.set(x, "postScriptName", value.asInstanceOf[js.Any])
      
      inline def setPostScriptNameUndefined: Self = StObject.set(x, "postScriptName", js.undefined)
      
      inline def setUniqueSubFamily(value: String): Self = StObject.set(x, "uniqueSubFamily", value.asInstanceOf[js.Any])
      
      inline def setUniqueSubFamilyUndefined: Self = StObject.set(x, "uniqueSubFamily", js.undefined)
    }
  }
}
