package typings.diff.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchOptions
  extends StObject
     with LinesOptions {
  
  /**
    * Describes how many lines of context should be included.
    * @default 4
    */
  var context: js.UndefOr[Double] = js.undefined
}
object PatchOptions {
  
  inline def apply(): PatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchOptions]
  }
  
  extension [Self <: PatchOptions](x: Self) {
    
    inline def setContext(value: Double): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
  }
}
