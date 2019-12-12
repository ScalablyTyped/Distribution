package typings.ejDotWebDotAll.ej

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Pivot.AnalysisMode
import typings.ejDotWebDotAll.ej.Pivot.AnalysisMode.OLAP
import typings.ejDotWebDotAll.ej.Pivot.OperationalMode
import typings.ejDotWebDotAll.ej.Pivot.OperationalMode.ClientMode
import typings.ejDotWebDotAll.ej.Pivot.OperationalMode.ServerMode
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AnalysisMode with Double] = js.native
    /* 0 */ @js.native
    object OLAP extends TopLevel[OLAP with Double]
    
    /* 1 */ @js.native
    object Pivot
      extends TopLevel[typings.ejDotWebDotAll.ej.Pivot.AnalysisMode.Pivot with Double]
    
  }
  
  @js.native
  object OperationalMode extends js.Object {
    //To bind data source completely from client-side.
    @js.native
    sealed trait ClientMode extends OperationalMode
    
    //To bind data source completely from server-side.
    @js.native
    sealed trait ServerMode extends OperationalMode
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OperationalMode with Double] = js.native
    /* 0 */ @js.native
    object ClientMode extends TopLevel[ClientMode with Double]
    
    /* 1 */ @js.native
    object ServerMode extends TopLevel[ServerMode with Double]
    
  }
  
}

