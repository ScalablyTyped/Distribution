package typings.electron.global.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Electron.WebFrameMain")
@js.native
open class WebFrameMain_ ()
  extends typings.electron.Electron.WebFrameMain_
object WebFrameMain_ {
  
  @JSGlobal("Electron.WebFrameMain")
  @js.native
  val ^ : js.Any = js.native
  
  // Docs: https://electronjs.org/docs/api/web-frame-main
  /**
    * A frame with the given process and routing IDs, or `undefined` if there is no
    * WebFrameMain associated with the given IDs.
    */
  /* static member */
  inline def fromId(processId: Double, routingId: Double): js.UndefOr[typings.electron.Electron.WebFrameMain_] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromId")(processId.asInstanceOf[js.Any], routingId.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.electron.Electron.WebFrameMain_]]
}
