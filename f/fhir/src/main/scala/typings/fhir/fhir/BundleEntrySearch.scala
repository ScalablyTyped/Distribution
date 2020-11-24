package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Search related information
  */
@js.native
trait BundleEntrySearch extends BackboneElement {
  
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'score'.
    */
  var _score: js.UndefOr[Element] = js.native
  
  /**
    * match | include | outcome - why this is in the result set
    */
  var mode: js.UndefOr[code] = js.native
  
  /**
    * Search ranking (between 0 and 1)
    */
  var score: js.UndefOr[decimal] = js.native
}
object BundleEntrySearch {
  
  @scala.inline
  def apply(): BundleEntrySearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BundleEntrySearch]
  }
  
  @scala.inline
  implicit class BundleEntrySearchOps[Self <: BundleEntrySearch] (val x: Self) extends AnyVal {
    
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
    def set_mode(value: Element): Self = this.set("_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_mode: Self = this.set("_mode", js.undefined)
    
    @scala.inline
    def set_score(value: Element): Self = this.set("_score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_score: Self = this.set("_score", js.undefined)
    
    @scala.inline
    def setMode(value: code): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setScore(value: decimal): Self = this.set("score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScore: Self = this.set("score", js.undefined)
  }
}
