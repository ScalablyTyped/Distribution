package typings.evernote.anon

import typings.evernote.mod.Types.SharedNotebook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchingShares extends StObject {
  
  var matchingShares: js.UndefOr[js.Array[SharedNotebook]] = js.undefined
  
  var updateSequenceNum: js.UndefOr[Double] = js.undefined
}
object MatchingShares {
  
  inline def apply(): MatchingShares = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchingShares]
  }
  
  extension [Self <: MatchingShares](x: Self) {
    
    inline def setMatchingShares(value: js.Array[SharedNotebook]): Self = StObject.set(x, "matchingShares", value.asInstanceOf[js.Any])
    
    inline def setMatchingSharesUndefined: Self = StObject.set(x, "matchingShares", js.undefined)
    
    inline def setMatchingSharesVarargs(value: SharedNotebook*): Self = StObject.set(x, "matchingShares", js.Array(value :_*))
    
    inline def setUpdateSequenceNum(value: Double): Self = StObject.set(x, "updateSequenceNum", value.asInstanceOf[js.Any])
    
    inline def setUpdateSequenceNumUndefined: Self = StObject.set(x, "updateSequenceNum", js.undefined)
  }
}
