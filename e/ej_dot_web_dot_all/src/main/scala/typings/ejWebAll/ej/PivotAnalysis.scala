package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PivotAnalysis {
  
  @js.native
  sealed trait FilterType extends StObject
  @JSGlobal("ej.PivotAnalysis.FilterType")
  @js.native
  object FilterType extends StObject {
    
    //Excludes the specified values among the members of the field.
    @js.native
    sealed trait Exclude
      extends StObject
         with FilterType
    
    //Includes the specified values alone among the members of the field.
    @js.native
    sealed trait Include
      extends StObject
         with FilterType
  }
  
  @js.native
  sealed trait SortOrder extends StObject
  @JSGlobal("ej.PivotAnalysis.SortOrder")
  @js.native
  object SortOrder extends StObject {
    
    //Sorts the members of the field in ascending order.
    @js.native
    sealed trait Ascending
      extends StObject
         with SortOrder
    
    //Sorts the members of the field in descending order.
    @js.native
    sealed trait Descending
      extends StObject
         with SortOrder
    
    //Displays the members without sorting in default order.
    @js.native
    sealed trait None
      extends StObject
         with SortOrder
  }
  
  @js.native
  sealed trait SummaryType extends StObject
  @JSGlobal("ej.PivotAnalysis.SummaryType")
  @js.native
  object SummaryType extends StObject {
    
    //Displays the average of all values as the summaries.
    @js.native
    sealed trait Average
      extends StObject
         with SummaryType
    
    //Displays the count of items in summaries.
    @js.native
    sealed trait Count
      extends StObject
         with SummaryType
    
    //Displays the maximum value of all the items in the summary.
    @js.native
    sealed trait Max
      extends StObject
         with SummaryType
    
    //Displays the minimum value of all the items in the summary.
    @js.native
    sealed trait Min
      extends StObject
         with SummaryType
    
    //Calculates the summary as the total of all values.
    @js.native
    sealed trait Sum
      extends StObject
         with SummaryType
  }
}
