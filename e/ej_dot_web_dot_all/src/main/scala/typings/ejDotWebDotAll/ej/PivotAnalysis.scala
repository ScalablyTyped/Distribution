package typings.ejDotWebDotAll.ej

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.PivotAnalysis.FilterType.Exclude
import typings.ejDotWebDotAll.ej.PivotAnalysis.FilterType.Include
import typings.ejDotWebDotAll.ej.PivotAnalysis.SortOrder.Ascending
import typings.ejDotWebDotAll.ej.PivotAnalysis.SortOrder.Descending
import typings.ejDotWebDotAll.ej.PivotAnalysis.SortOrder.None
import typings.ejDotWebDotAll.ej.PivotAnalysis.SummaryType
import typings.ejDotWebDotAll.ej.PivotAnalysis.SummaryType.Average
import typings.ejDotWebDotAll.ej.PivotAnalysis.SummaryType.Count
import typings.ejDotWebDotAll.ej.PivotAnalysis.SummaryType.Max
import typings.ejDotWebDotAll.ej.PivotAnalysis.SummaryType.Min
import typings.ejDotWebDotAll.ej.PivotAnalysis.SummaryType.Sum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.PivotAnalysis")
@js.native
object PivotAnalysis extends js.Object {
  @js.native
  sealed trait FilterType extends js.Object
  
  @js.native
  sealed trait SortOrder extends js.Object
  
  @js.native
  sealed trait SummaryType extends js.Object
  
  @js.native
  object FilterType extends js.Object {
    //Excludes the specified values among the members of the field.
    @js.native
    sealed trait Exclude
      extends typings.ejDotWebDotAll.ej.PivotAnalysis.FilterType
    
    //Includes the specified values alone among the members of the field.
    @js.native
    sealed trait Include
      extends typings.ejDotWebDotAll.ej.PivotAnalysis.FilterType
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ej.PivotAnalysis.FilterType with Double] = js.native
    /* 0 */ @js.native
    object Exclude extends TopLevel[Exclude with Double]
    
    /* 1 */ @js.native
    object Include extends TopLevel[Include with Double]
    
  }
  
  @js.native
  object SortOrder extends js.Object {
    //Sorts the members of the field in ascending order.
    @js.native
    sealed trait Ascending
      extends typings.ejDotWebDotAll.ej.PivotAnalysis.SortOrder
    
    //Sorts the members of the field in descending order.
    @js.native
    sealed trait Descending
      extends typings.ejDotWebDotAll.ej.PivotAnalysis.SortOrder
    
    //Displays the members without sorting in default order.
    @js.native
    sealed trait None
      extends typings.ejDotWebDotAll.ej.PivotAnalysis.SortOrder
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ej.PivotAnalysis.SortOrder with Double] = js.native
    /* 0 */ @js.native
    object Ascending extends TopLevel[Ascending with Double]
    
    /* 1 */ @js.native
    object Descending extends TopLevel[Descending with Double]
    
    /* 2 */ @js.native
    object None extends TopLevel[None with Double]
    
  }
  
  @js.native
  object SummaryType extends js.Object {
    //Displays the average of all values as the summaries.
    @js.native
    sealed trait Average extends SummaryType
    
    //Displays the count of items in summaries.
    @js.native
    sealed trait Count extends SummaryType
    
    //Displays the maximum value of all the items in the summary.
    @js.native
    sealed trait Max extends SummaryType
    
    //Displays the minimum value of all the items in the summary.
    @js.native
    sealed trait Min extends SummaryType
    
    //Calculates the summary as the total of all values.
    @js.native
    sealed trait Sum extends SummaryType
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SummaryType with Double] = js.native
    /* 1 */ @js.native
    object Average extends TopLevel[Average with Double]
    
    /* 2 */ @js.native
    object Count extends TopLevel[Count with Double]
    
    /* 4 */ @js.native
    object Max extends TopLevel[Max with Double]
    
    /* 3 */ @js.native
    object Min extends TopLevel[Min with Double]
    
    /* 0 */ @js.native
    object Sum extends TopLevel[Sum with Double]
    
  }
  
}

