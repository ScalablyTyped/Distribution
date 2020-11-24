package typings.ejWebAll.global.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.PivotAnalysis")
@js.native
object PivotAnalysis extends js.Object {
  
  @js.native
  object FilterType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.PivotAnalysis.FilterType with Double] = js.native
    
    /* 0 */ val Exclude: typings.ejWebAll.ej.PivotAnalysis.FilterType.Exclude with Double = js.native
    
    /* 1 */ val Include: typings.ejWebAll.ej.PivotAnalysis.FilterType.Include with Double = js.native
  }
  
  @js.native
  object SortOrder extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.PivotAnalysis.SortOrder with Double] = js.native
    
    /* 0 */ val Ascending: typings.ejWebAll.ej.PivotAnalysis.SortOrder.Ascending with Double = js.native
    
    /* 1 */ val Descending: typings.ejWebAll.ej.PivotAnalysis.SortOrder.Descending with Double = js.native
    
    /* 2 */ val None: typings.ejWebAll.ej.PivotAnalysis.SortOrder.None with Double = js.native
  }
  
  @js.native
  object SummaryType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.PivotAnalysis.SummaryType with Double] = js.native
    
    /* 1 */ val Average: typings.ejWebAll.ej.PivotAnalysis.SummaryType.Average with Double = js.native
    
    /* 2 */ val Count: typings.ejWebAll.ej.PivotAnalysis.SummaryType.Count with Double = js.native
    
    /* 4 */ val Max: typings.ejWebAll.ej.PivotAnalysis.SummaryType.Max with Double = js.native
    
    /* 3 */ val Min: typings.ejWebAll.ej.PivotAnalysis.SummaryType.Min with Double = js.native
    
    /* 0 */ val Sum: typings.ejWebAll.ej.PivotAnalysis.SummaryType.Sum with Double = js.native
  }
}
