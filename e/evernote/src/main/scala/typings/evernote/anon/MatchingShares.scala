package typings.evernote.anon

import typings.evernote.mod.Types.SharedNotebook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchingShares extends js.Object {
  
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
  implicit class MatchingSharesOps[Self <: MatchingShares] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMatchingSharesVarargs(value: SharedNotebook*): Self = this.set("matchingShares", js.Array(value :_*))
    
    @scala.inline
    def setMatchingShares(value: js.Array[SharedNotebook]): Self = this.set("matchingShares", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchingShares: Self = this.set("matchingShares", js.undefined)
    
    @scala.inline
    def setUpdateSequenceNum(value: Double): Self = this.set("updateSequenceNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateSequenceNum: Self = this.set("updateSequenceNum", js.undefined)
  }
}
