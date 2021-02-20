package typings.fitfont

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fitfont", "FitFont")
  @js.native
  class FitFont protected () extends StObject {
    def this(options: Options) = this()
    
    /**
      * Horizontal alignment
      */
    var halign: HorizontalAlign = js.native
    
    /**
      * Letter spacing
      */
    var letterspacing: Double = js.native
    
    /**
      * Force the redraw
      */
    def redraw(): Unit = js.native
    
    /**
      * Text to show
      */
    var text: String = js.native
    
    /**
      * Vertical alignment
      */
    var valign: VerticalAlign = js.native
    
    /**
      * With (read only)
      */
    val width: Double = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fitfont.fitfontStrings.start
    - typings.fitfont.fitfontStrings.middle
    - typings.fitfont.fitfontStrings.end
  */
  trait HorizontalAlign extends StObject
  object HorizontalAlign {
    
    @scala.inline
    def end: typings.fitfont.fitfontStrings.end = "end".asInstanceOf[typings.fitfont.fitfontStrings.end]
    
    @scala.inline
    def middle: typings.fitfont.fitfontStrings.middle = "middle".asInstanceOf[typings.fitfont.fitfontStrings.middle]
    
    @scala.inline
    def start: typings.fitfont.fitfontStrings.start = "start".asInstanceOf[typings.fitfont.fitfontStrings.start]
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * name of the generated font folder
      */
    var font: String = js.native
    
    /**
      * Horizontal alignment
      */
    var halign: js.UndefOr[HorizontalAlign] = js.native
    
    /**
      * Id fo the symbol or the Element to use
      */
    var id: String | js.Object = js.native
    
    /**
      * Letter spacing
      */
    var letterspacing: js.UndefOr[Double] = js.native
    
    /**
      * Vertical alignment
      */
    var valign: js.UndefOr[VerticalAlign] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(font: String, id: String | js.Object): Options = {
      val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalign(value: HorizontalAlign): Self = StObject.set(x, "halign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalignUndefined: Self = StObject.set(x, "halign", js.undefined)
      
      @scala.inline
      def setId(value: String | js.Object): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLetterspacing(value: Double): Self = StObject.set(x, "letterspacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLetterspacingUndefined: Self = StObject.set(x, "letterspacing", js.undefined)
      
      @scala.inline
      def setValign(value: VerticalAlign): Self = StObject.set(x, "valign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValignUndefined: Self = StObject.set(x, "valign", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fitfont.fitfontStrings.top
    - typings.fitfont.fitfontStrings.middle
    - typings.fitfont.fitfontStrings.bottom
    - typings.fitfont.fitfontStrings.baseline
  */
  trait VerticalAlign extends StObject
  object VerticalAlign {
    
    @scala.inline
    def baseline: typings.fitfont.fitfontStrings.baseline = "baseline".asInstanceOf[typings.fitfont.fitfontStrings.baseline]
    
    @scala.inline
    def bottom: typings.fitfont.fitfontStrings.bottom = "bottom".asInstanceOf[typings.fitfont.fitfontStrings.bottom]
    
    @scala.inline
    def middle: typings.fitfont.fitfontStrings.middle = "middle".asInstanceOf[typings.fitfont.fitfontStrings.middle]
    
    @scala.inline
    def top: typings.fitfont.fitfontStrings.top = "top".asInstanceOf[typings.fitfont.fitfontStrings.top]
  }
}
