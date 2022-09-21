package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindGamesOpts extends StObject {
  
  var direction: js.UndefOr[GameOrderDirection] = js.undefined
  
  var filter: js.UndefOr[FilterGameOpts] = js.undefined
  
  var getTotal: js.UndefOr[Boolean] = js.undefined
  
  var orderBy: js.UndefOr[GameOrderBy] = js.undefined
  
  /** Ranges of games to fetch (all games are fetched if undefined). */
  var ranges: js.UndefOr[js.Array[RequestGameRange]] = js.undefined
}
object FindGamesOpts {
  
  inline def apply(): FindGamesOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindGamesOpts]
  }
  
  extension [Self <: FindGamesOpts](x: Self) {
    
    inline def setDirection(value: GameOrderDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setFilter(value: FilterGameOpts): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setGetTotal(value: Boolean): Self = StObject.set(x, "getTotal", value.asInstanceOf[js.Any])
    
    inline def setGetTotalUndefined: Self = StObject.set(x, "getTotal", js.undefined)
    
    inline def setOrderBy(value: GameOrderBy): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setRanges(value: js.Array[RequestGameRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    inline def setRangesVarargs(value: RequestGameRange*): Self = StObject.set(x, "ranges", js.Array(value*))
  }
}
