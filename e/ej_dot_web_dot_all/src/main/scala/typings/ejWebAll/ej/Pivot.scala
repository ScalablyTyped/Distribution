package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pivot {
  
  @js.native
  sealed trait AnalysisMode extends StObject
  @JSGlobal("ej.Pivot.AnalysisMode")
  @js.native
  object AnalysisMode extends StObject {
    
    //To bind an OLAP data source to PivotGrid.
    @js.native
    sealed trait OLAP
      extends StObject
         with AnalysisMode
    
    //To bind a relational data source to PivotGrid.
    @js.native
    sealed trait Pivot
      extends StObject
         with AnalysisMode
  }
  
  @js.native
  sealed trait OperationalMode extends StObject
  @JSGlobal("ej.Pivot.OperationalMode")
  @js.native
  object OperationalMode extends StObject {
    
    //To bind data source completely from client-side.
    @js.native
    sealed trait ClientMode
      extends StObject
         with OperationalMode
    
    //To bind data source completely from server-side.
    @js.native
    sealed trait ServerMode
      extends StObject
         with OperationalMode
  }
}
