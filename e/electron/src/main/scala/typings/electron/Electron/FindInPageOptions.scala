package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindInPageOptions extends js.Object {
  
  /**
    * Whether the operation is first request or a follow up, defaults to `false`.
    */
  var findNext: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to search forward or backward, defaults to `true`.
    */
  var forward: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether search should be case-sensitive, defaults to `false`.
    */
  var matchCase: js.UndefOr[Boolean] = js.native
  
  /**
    * When combined with `wordStart`, accepts a match in the middle of a word if the
    * match begins with an uppercase letter followed by a lowercase or non-letter.
    * Accepts several other intra-word matches, defaults to `false`.
    */
  var medialCapitalAsWordStart: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to look only at the start of words. defaults to `false`.
    */
  var wordStart: js.UndefOr[Boolean] = js.native
}
object FindInPageOptions {
  
  @scala.inline
  def apply(): FindInPageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindInPageOptions]
  }
  
  @scala.inline
  implicit class FindInPageOptionsOps[Self <: FindInPageOptions] (val x: Self) extends AnyVal {
    
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
    def setFindNext(value: Boolean): Self = this.set("findNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFindNext: Self = this.set("findNext", js.undefined)
    
    @scala.inline
    def setForward(value: Boolean): Self = this.set("forward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForward: Self = this.set("forward", js.undefined)
    
    @scala.inline
    def setMatchCase(value: Boolean): Self = this.set("matchCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchCase: Self = this.set("matchCase", js.undefined)
    
    @scala.inline
    def setMedialCapitalAsWordStart(value: Boolean): Self = this.set("medialCapitalAsWordStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedialCapitalAsWordStart: Self = this.set("medialCapitalAsWordStart", js.undefined)
    
    @scala.inline
    def setWordStart(value: Boolean): Self = this.set("wordStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordStart: Self = this.set("wordStart", js.undefined)
  }
}
