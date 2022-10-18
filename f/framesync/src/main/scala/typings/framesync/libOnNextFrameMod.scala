package typings.framesync

import typings.node.timersMod.global.NodeJS.Timeout
import typings.std.FrameRequestCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOnNextFrameMod {
  
  @JSImport("framesync/lib/on-next-frame", "defaultTimestep")
  @js.native
  val defaultTimestep: Double = js.native
  
  @JSImport("framesync/lib/on-next-frame", "onNextFrame")
  @js.native
  val onNextFrame: js.Function1[/* callback */ FrameRequestCallback, Double | Timeout] = js.native
}
