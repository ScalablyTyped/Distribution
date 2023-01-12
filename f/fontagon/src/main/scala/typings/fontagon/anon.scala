package typings.fontagon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Record<fontagon.fontagon.StyleSheetGenerationType, string> */
  trait RecordStyleSheetGeneratio extends StObject {
    
    var css: String
    
    var less: String
    
    var sass: String
    
    var stylus: String
  }
  object RecordStyleSheetGeneratio {
    
    inline def apply(css: String, less: String, sass: String, stylus: String): RecordStyleSheetGeneratio = {
      val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], less = less.asInstanceOf[js.Any], sass = sass.asInstanceOf[js.Any], stylus = stylus.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordStyleSheetGeneratio]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RecordStyleSheetGeneratio] (val x: Self) extends AnyVal {
      
      inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setLess(value: String): Self = StObject.set(x, "less", value.asInstanceOf[js.Any])
      
      inline def setSass(value: String): Self = StObject.set(x, "sass", value.asInstanceOf[js.Any])
      
      inline def setStylus(value: String): Self = StObject.set(x, "stylus", value.asInstanceOf[js.Any])
    }
  }
}
