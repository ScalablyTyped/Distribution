package typings.estimatedReadTime

import typings.estimatedReadTime.estimatedReadTimeInts.`1`
import typings.estimatedReadTime.estimatedReadTimeInts.`2`
import typings.estimatedReadTime.estimatedReadTimeInts.`3`
import typings.estimatedReadTime.estimatedReadTimeInts.`4`
import typings.estimatedReadTime.estimatedReadTimeInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("estimated-read-time", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def text(content: String): TextResult = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(content.asInstanceOf[js.Any]).asInstanceOf[TextResult]
  inline def text(content: String, options: TextOptions): TextResult = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TextResult]
  
  trait TextOptions extends StObject {
    
    var IS_TECHNICAL_DOC: js.UndefOr[Boolean] = js.undefined
    
    var MIN_WORD_LEN: js.UndefOr[Double] = js.undefined
    
    var TECH_DIFFICULTY: js.UndefOr[`1` | `2` | `3` | `4` | `5`] = js.undefined
    
    var TOTAL_SECONDS: js.UndefOr[Double] = js.undefined
    
    var TOTAL_WORDS: js.UndefOr[Double] = js.undefined
    
    var WPM: js.UndefOr[Double] = js.undefined
  }
  object TextOptions {
    
    inline def apply(): TextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextOptions]
    }
    
    extension [Self <: TextOptions](x: Self) {
      
      inline def setIS_TECHNICAL_DOC(value: Boolean): Self = StObject.set(x, "IS_TECHNICAL_DOC", value.asInstanceOf[js.Any])
      
      inline def setIS_TECHNICAL_DOCUndefined: Self = StObject.set(x, "IS_TECHNICAL_DOC", js.undefined)
      
      inline def setMIN_WORD_LEN(value: Double): Self = StObject.set(x, "MIN_WORD_LEN", value.asInstanceOf[js.Any])
      
      inline def setMIN_WORD_LENUndefined: Self = StObject.set(x, "MIN_WORD_LEN", js.undefined)
      
      inline def setTECH_DIFFICULTY(value: `1` | `2` | `3` | `4` | `5`): Self = StObject.set(x, "TECH_DIFFICULTY", value.asInstanceOf[js.Any])
      
      inline def setTECH_DIFFICULTYUndefined: Self = StObject.set(x, "TECH_DIFFICULTY", js.undefined)
      
      inline def setTOTAL_SECONDS(value: Double): Self = StObject.set(x, "TOTAL_SECONDS", value.asInstanceOf[js.Any])
      
      inline def setTOTAL_SECONDSUndefined: Self = StObject.set(x, "TOTAL_SECONDS", js.undefined)
      
      inline def setTOTAL_WORDS(value: Double): Self = StObject.set(x, "TOTAL_WORDS", value.asInstanceOf[js.Any])
      
      inline def setTOTAL_WORDSUndefined: Self = StObject.set(x, "TOTAL_WORDS", js.undefined)
      
      inline def setWPM(value: Double): Self = StObject.set(x, "WPM", value.asInstanceOf[js.Any])
      
      inline def setWPMUndefined: Self = StObject.set(x, "WPM", js.undefined)
    }
  }
  
  trait TextResult extends StObject {
    
    var seconds: Double
    
    // eslint-disable-next-line camelcase
    var word_count: Double
  }
  object TextResult {
    
    inline def apply(seconds: Double, word_count: Double): TextResult = {
      val __obj = js.Dynamic.literal(seconds = seconds.asInstanceOf[js.Any], word_count = word_count.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextResult]
    }
    
    extension [Self <: TextResult](x: Self) {
      
      inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      inline def setWord_count(value: Double): Self = StObject.set(x, "word_count", value.asInstanceOf[js.Any])
    }
  }
}
