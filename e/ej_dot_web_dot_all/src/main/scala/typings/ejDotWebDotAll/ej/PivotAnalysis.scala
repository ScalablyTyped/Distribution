package typings.ejDotWebDotAll.ej

import typings.ejDotWebDotAll.ej.PivotAnalysis.SummaryType
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
    
    /* 0 */ val Exclude: typings.ejDotWebDotAll.ej.PivotAnalysis.FilterType.Exclude with Double = js.native
    /* 1 */ val Include: typings.ejDotWebDotAll.ej.PivotAnalysis.FilterType.Include with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ej.PivotAnalysis.FilterType with Double] = js.native
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
    
    /* 0 */ val Ascending: typings.ejDotWebDotAll.ej.PivotAnalysis.SortOrder.Ascending with Double = js.native
    /* 1 */ val Descending: typings.ejDotWebDotAll.ej.PivotAnalysis.SortOrder.Descending with Double = js.native
    /* 2 */ val None: typings.ejDotWebDotAll.ej.PivotAnalysis.SortOrder.None with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ej.PivotAnalysis.SortOrder with Double] = js.native
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
    
    /* 1 */ val Average: typings.ejDotWebDotAll.ej.PivotAnalysis.SummaryType.Average with Double = js.native
    /* 2 */ val Count: typings.ejDotWebDotAll.ej.PivotAnalysis.SummaryType.Count with Double = js.native
    /* 4 */ val Max: typings.ejDotWebDotAll.ej.PivotAnalysis.SummaryType.Max with Double = js.native
    /* 3 */ val Min: typings.ejDotWebDotAll.ej.PivotAnalysis.SummaryType.Min with Double = js.native
    /* 0 */ val Sum: typings.ejDotWebDotAll.ej.PivotAnalysis.SummaryType.Sum with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SummaryType with Double] = js.native
  }
  
}

