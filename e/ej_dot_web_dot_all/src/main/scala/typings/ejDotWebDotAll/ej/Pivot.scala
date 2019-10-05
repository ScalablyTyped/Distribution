package typings.ejDotWebDotAll.ej

import typings.ejDotWebDotAll.ej.Pivot.AnalysisMode
import typings.ejDotWebDotAll.ej.Pivot.OperationalMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Pivot")
@js.native
object Pivot extends js.Object {
  @js.native
  sealed trait AnalysisMode extends js.Object
  
  @js.native
  sealed trait OperationalMode extends js.Object
  
  @js.native
  object AnalysisMode extends js.Object {
    //To bind an OLAP data source to PivotGrid.
    @js.native
    sealed trait OLAP extends AnalysisMode
    
    //To bind a relational data source to PivotGrid.
    @js.native
    sealed trait Pivot extends AnalysisMode
    
    /* 0 */ val OLAP: typings.ejDotWebDotAll.ej.Pivot.AnalysisMode.OLAP with Double = js.native
    /* 1 */ val Pivot: typings.ejDotWebDotAll.ej.Pivot.AnalysisMode.Pivot with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AnalysisMode with Double] = js.native
  }
  
  @js.native
  object OperationalMode extends js.Object {
    //To bind data source completely from client-side.
    @js.native
    sealed trait ClientMode extends OperationalMode
    
    //To bind data source completely from server-side.
    @js.native
    sealed trait ServerMode extends OperationalMode
    
    /* 0 */ val ClientMode: typings.ejDotWebDotAll.ej.Pivot.OperationalMode.ClientMode with Double = js.native
    /* 1 */ val ServerMode: typings.ejDotWebDotAll.ej.Pivot.OperationalMode.ServerMode with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OperationalMode with Double] = js.native
  }
  
}

