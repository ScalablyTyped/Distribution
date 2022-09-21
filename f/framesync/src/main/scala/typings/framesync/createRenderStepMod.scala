package typings.framesync

import typings.framesync.typesMod.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createRenderStepMod {
  
  @JSImport("framesync/lib/create-render-step", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRenderStep(runNextFrame: js.Function0[Unit]): Step = ^.asInstanceOf[js.Dynamic].applyDynamic("createRenderStep")(runNextFrame.asInstanceOf[js.Any]).asInstanceOf[Step]
}
