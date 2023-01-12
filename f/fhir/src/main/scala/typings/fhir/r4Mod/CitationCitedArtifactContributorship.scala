package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CitationCitedArtifactContributorship
  extends StObject
     with BackboneElement {
  
  var _complete: js.UndefOr[Element] = js.undefined
  
  /**
    * If list is incomplete "et al" can be appended to Contributorship.summary.value for display purposes.
    */
  var complete: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Used to report contributorship in individualized ways.
    */
  var entry: js.UndefOr[js.Array[CitationCitedArtifactContributorshipEntry]] = js.undefined
  
  /**
    * Used to record a display of the author/contributor list without separate coding for each list member.
    */
  var summary: js.UndefOr[js.Array[CitationCitedArtifactContributorshipSummary]] = js.undefined
}
object CitationCitedArtifactContributorship {
  
  inline def apply(): CitationCitedArtifactContributorship = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CitationCitedArtifactContributorship]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CitationCitedArtifactContributorship] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setEntry(value: js.Array[CitationCitedArtifactContributorshipEntry]): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
    
    inline def setEntryVarargs(value: CitationCitedArtifactContributorshipEntry*): Self = StObject.set(x, "entry", js.Array(value*))
    
    inline def setSummary(value: js.Array[CitationCitedArtifactContributorshipSummary]): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setSummaryVarargs(value: CitationCitedArtifactContributorshipSummary*): Self = StObject.set(x, "summary", js.Array(value*))
    
    inline def set_complete(value: Element): Self = StObject.set(x, "_complete", value.asInstanceOf[js.Any])
    
    inline def set_completeUndefined: Self = StObject.set(x, "_complete", js.undefined)
  }
}
