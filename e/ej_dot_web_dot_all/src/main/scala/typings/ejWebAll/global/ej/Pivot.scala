package typings.ejWebAll.global.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Pivot")
@js.native
object Pivot extends js.Object {
  @js.native
  object AnalysisMode extends js.Object {
    /* 0 */ val OLAP: typings.ejWebAll.ej.Pivot.AnalysisMode.OLAP with Double = js.native
    /* 1 */ val Pivot: typings.ejWebAll.ej.Pivot.AnalysisMode.Pivot with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Pivot.AnalysisMode with Double] = js.native
  }
  
  @js.native
  object OperationalMode extends js.Object {
    /* 0 */ val ClientMode: typings.ejWebAll.ej.Pivot.OperationalMode.ClientMode with Double = js.native
    /* 1 */ val ServerMode: typings.ejWebAll.ej.Pivot.OperationalMode.ServerMode with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Pivot.OperationalMode with Double] = js.native
  }
  
}

