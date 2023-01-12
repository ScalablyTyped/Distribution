package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestGameRange extends StObject {
  
  /**
    * Tuple of the last game of the previous page.
    * If this is set then "start" must be the index of the game after this (since this will be used instead of
    * "start" when selecting the games).
    */
  var index: js.UndefOr[PageTuple] = js.undefined
  
  /** Number of games to request (if undefined, all games until the end of the query will be included). */
  var length: js.UndefOr[Double] = js.undefined
  
  /** Index of the first game. */
  var start: Double
}
object RequestGameRange {
  
  inline def apply(start: Double): RequestGameRange = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestGameRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestGameRange] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: PageTuple): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
