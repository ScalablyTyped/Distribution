package typings.glimmerUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibDebugStepsMod {
  
  @JSImport("@glimmer/util/dist/types/lib/debug-steps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@glimmer/util/dist/types/lib/debug-steps", "beginTestSteps")
  @js.native
  def beginTestSteps: js.UndefOr[js.Function0[Unit]] = js.native
  inline def beginTestSteps_=(x: js.UndefOr[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beginTestSteps")(x.asInstanceOf[js.Any])
  
  @JSImport("@glimmer/util/dist/types/lib/debug-steps", "endTestSteps")
  @js.native
  def endTestSteps: js.UndefOr[js.Function0[Unit]] = js.native
  inline def endTestSteps_=(x: js.UndefOr[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("endTestSteps")(x.asInstanceOf[js.Any])
  
  @JSImport("@glimmer/util/dist/types/lib/debug-steps", "logStep")
  @js.native
  def logStep: js.UndefOr[js.Function2[/* type */ String, /* steps */ Any, Unit]] = js.native
  inline def logStep_=(x: js.UndefOr[js.Function2[/* type */ String, /* steps */ Any, Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logStep")(x.asInstanceOf[js.Any])
  
  @JSImport("@glimmer/util/dist/types/lib/debug-steps", "verifySteps")
  @js.native
  def verifySteps: js.UndefOr[
    js.Function3[
      /* type */ String, 
      /* steps */ js.Array[Any] | (js.Function1[/* steps */ js.Array[Any], Unit]), 
      /* message */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  inline def verifySteps_=(
    x: js.UndefOr[
      js.Function3[
        /* type */ String, 
        /* steps */ js.Array[Any] | (js.Function1[/* steps */ js.Array[Any], Unit]), 
        /* message */ js.UndefOr[String], 
        Unit
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("verifySteps")(x.asInstanceOf[js.Any])
}
