package typings.googleAppsScript.global.GoogleAppsScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Optimization {
  
  /**
    * Status of the solution. Before solving a problem the status will be NOT_SOLVED;
    * afterwards it will take any of the other values depending if it successfully found a solution and
    * if the solution is optimal.
    */
  @JSGlobal("GoogleAppsScript.Optimization.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Optimization.Status & Double] = js.native
    
    /* 4 */ val ABNORMAL: typings.googleAppsScript.GoogleAppsScript.Optimization.Status.ABNORMAL & Double = js.native
    
    /* 1 */ val FEASIBLE: typings.googleAppsScript.GoogleAppsScript.Optimization.Status.FEASIBLE & Double = js.native
    
    /* 2 */ val INFEASIBLE: typings.googleAppsScript.GoogleAppsScript.Optimization.Status.INFEASIBLE & Double = js.native
    
    /* 5 */ val MODEL_INVALID: typings.googleAppsScript.GoogleAppsScript.Optimization.Status.MODEL_INVALID & Double = js.native
    
    /* 6 */ val NOT_SOLVED: typings.googleAppsScript.GoogleAppsScript.Optimization.Status.NOT_SOLVED & Double = js.native
    
    /* 0 */ val OPTIMAL: typings.googleAppsScript.GoogleAppsScript.Optimization.Status.OPTIMAL & Double = js.native
    
    /* 3 */ val UNBOUNDED: typings.googleAppsScript.GoogleAppsScript.Optimization.Status.UNBOUNDED & Double = js.native
  }
  
  /**
    * Type of variables created by the engine.
    */
  @JSGlobal("GoogleAppsScript.Optimization.VariableType")
  @js.native
  object VariableType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Optimization.VariableType & Double] = js.native
    
    /* 1 */ val CONTINUOUS: typings.googleAppsScript.GoogleAppsScript.Optimization.VariableType.CONTINUOUS & Double = js.native
    
    /* 0 */ val INTEGER: typings.googleAppsScript.GoogleAppsScript.Optimization.VariableType.INTEGER & Double = js.native
  }
}
