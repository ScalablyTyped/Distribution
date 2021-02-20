package typings.evernote.anon

import typings.evernote.mod.Types.SharedNotebook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchingShares extends StObject {
  
  var matchingShares: js.UndefOr[js.Array[SharedNotebook]] = js.native
  
  var updateSequenceNum: js.UndefOr[Double] = js.native
}
object MatchingShares {
  
  @scala.inline
  def apply(): MatchingShares = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchingShares]
  }
  
  @scala.inline
  implicit class MatchingSharesMutableBuilder[Self <: MatchingShares] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatchingShares(value: js.Array[SharedNotebook]): Self = StObject.set(x, "matchingShares", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchingSharesUndefined: Self = StObject.set(x, "matchingShares", js.undefined)
    
    @scala.inline
    def setMatchingSharesVarargs(value: SharedNotebook*): Self = StObject.set(x, "matchingShares", js.Array(value :_*))
    
    @scala.inline
    def setUpdateSequenceNum(value: Double): Self = StObject.set(x, "updateSequenceNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateSequenceNumUndefined: Self = StObject.set(x, "updateSequenceNum", js.undefined)
  }
}
