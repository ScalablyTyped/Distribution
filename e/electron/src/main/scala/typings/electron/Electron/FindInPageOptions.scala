package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindInPageOptions extends StObject {
  
  /**
    * Whether the operation is first request or a follow up, defaults to `false`.
    */
  var findNext: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to search forward or backward, defaults to `true`.
    */
  var forward: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether search should be case-sensitive, defaults to `false`.
    */
  var matchCase: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When combined with `wordStart`, accepts a match in the middle of a word if the
    * match begins with an uppercase letter followed by a lowercase or non-letter.
    * Accepts several other intra-word matches, defaults to `false`.
    */
  var medialCapitalAsWordStart: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to look only at the start of words. defaults to `false`.
    */
  var wordStart: js.UndefOr[Boolean] = js.undefined
}
object FindInPageOptions {
  
  @scala.inline
  def apply(): FindInPageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindInPageOptions]
  }
  
  @scala.inline
  implicit class FindInPageOptionsMutableBuilder[Self <: FindInPageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindNext(value: Boolean): Self = StObject.set(x, "findNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindNextUndefined: Self = StObject.set(x, "findNext", js.undefined)
    
    @scala.inline
    def setForward(value: Boolean): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardUndefined: Self = StObject.set(x, "forward", js.undefined)
    
    @scala.inline
    def setMatchCase(value: Boolean): Self = StObject.set(x, "matchCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchCaseUndefined: Self = StObject.set(x, "matchCase", js.undefined)
    
    @scala.inline
    def setMedialCapitalAsWordStart(value: Boolean): Self = StObject.set(x, "medialCapitalAsWordStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedialCapitalAsWordStartUndefined: Self = StObject.set(x, "medialCapitalAsWordStart", js.undefined)
    
    @scala.inline
    def setWordStart(value: Boolean): Self = StObject.set(x, "wordStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordStartUndefined: Self = StObject.set(x, "wordStart", js.undefined)
  }
}
