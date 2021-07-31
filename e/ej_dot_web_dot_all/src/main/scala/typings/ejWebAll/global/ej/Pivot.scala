package typings.ejWebAll.global.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pivot {
  
  @JSGlobal("ej.Pivot.AnalysisMode")
  @js.native
  object AnalysisMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Pivot.AnalysisMode & Double] = js.native
    
    /* 0 */ val OLAP: typings.ejWebAll.ej.Pivot.AnalysisMode.OLAP & Double = js.native
    
    /* 1 */ val Pivot: typings.ejWebAll.ej.Pivot.AnalysisMode.Pivot & Double = js.native
  }
  
  @JSGlobal("ej.Pivot.OperationalMode")
  @js.native
  object OperationalMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Pivot.OperationalMode & Double] = js.native
    
    /* 0 */ val ClientMode: typings.ejWebAll.ej.Pivot.OperationalMode.ClientMode & Double = js.native
    
    /* 1 */ val ServerMode: typings.ejWebAll.ej.Pivot.OperationalMode.ServerMode & Double = js.native
  }
}
