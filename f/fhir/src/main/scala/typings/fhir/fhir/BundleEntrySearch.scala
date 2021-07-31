package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Search related information
  */
trait BundleEntrySearch
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'score'.
    */
  var _score: js.UndefOr[Element] = js.undefined
  
  /**
    * match | include | outcome - why this is in the result set
    */
  var mode: js.UndefOr[code] = js.undefined
  
  /**
    * Search ranking (between 0 and 1)
    */
  var score: js.UndefOr[decimal] = js.undefined
}
object BundleEntrySearch {
  
  @scala.inline
  def apply(): BundleEntrySearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BundleEntrySearch]
  }
  
  @scala.inline
  implicit class BundleEntrySearchMutableBuilder[Self <: BundleEntrySearch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: code): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setScore(value: decimal): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    @scala.inline
    def set_mode(value: Element): Self = StObject.set(x, "_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_modeUndefined: Self = StObject.set(x, "_mode", js.undefined)
    
    @scala.inline
    def set_score(value: Element): Self = StObject.set(x, "_score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_scoreUndefined: Self = StObject.set(x, "_score", js.undefined)
  }
}
