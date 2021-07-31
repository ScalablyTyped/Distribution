package typings.framesync

import typings.framesync.typesMod.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createRenderStepMod {
  
  @JSImport("framesync/lib/create-render-step", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(setRunNextFrame: js.Function1[/* fillRun */ Boolean, Unit]): Step = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(setRunNextFrame.asInstanceOf[js.Any]).asInstanceOf[Step]
}
