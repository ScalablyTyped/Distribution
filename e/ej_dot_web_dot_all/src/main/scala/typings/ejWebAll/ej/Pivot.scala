package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Pivot")
@js.native
object Pivot extends js.Object {
  
  @js.native
  sealed trait AnalysisMode extends js.Object
  @js.native
  object AnalysisMode extends js.Object {
    
    //To bind an OLAP data source to PivotGrid.
    @js.native
    sealed trait OLAP extends AnalysisMode
    
    //To bind a relational data source to PivotGrid.
    @js.native
    sealed trait Pivot extends AnalysisMode
  }
  
  @js.native
  sealed trait OperationalMode extends js.Object
  @js.native
  object OperationalMode extends js.Object {
    
    //To bind data source completely from client-side.
    @js.native
    sealed trait ClientMode extends OperationalMode
    
    //To bind data source completely from server-side.
    @js.native
    sealed trait ServerMode extends OperationalMode
  }
}
