package typings.fakeDiff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(previous: String, next: String): String = (^.asInstanceOf[js.Dynamic].apply(previous.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(previous: String, next: String, options: FakeDiffOptions): String = (^.asInstanceOf[js.Dynamic].apply(previous.asInstanceOf[js.Any], next.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("fake-diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FakeDiffOptions extends StObject {
    
    /** Hide not changed lines (as default `true`). */
    var hideLines: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Maximum number of adjacent not changed lines shown.
      * Only takes effect if `hideLines` is `true` (as default `2`).
      */
    var maxAdjacentStaticLines: js.UndefOr[Double] = js.undefined
  }
  object FakeDiffOptions {
    
    inline def apply(): FakeDiffOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FakeDiffOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FakeDiffOptions] (val x: Self) extends AnyVal {
      
      inline def setHideLines(value: Boolean): Self = StObject.set(x, "hideLines", value.asInstanceOf[js.Any])
      
      inline def setHideLinesUndefined: Self = StObject.set(x, "hideLines", js.undefined)
      
      inline def setMaxAdjacentStaticLines(value: Double): Self = StObject.set(x, "maxAdjacentStaticLines", value.asInstanceOf[js.Any])
      
      inline def setMaxAdjacentStaticLinesUndefined: Self = StObject.set(x, "maxAdjacentStaticLines", js.undefined)
    }
  }
}
