package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DidFrameNavigateEvent
  extends StObject
     with Event {
  
  var frameProcessId: Double = js.native
  
  var frameRoutingId: Double = js.native
  
  /**
    * -1 for non HTTP navigations
    */
  var httpResponseCode: Double = js.native
  
  /**
    * empty for non HTTP navigations,
    */
  var httpStatusText: String = js.native
  
  var isMainFrame: Boolean = js.native
  
  var url: String = js.native
}
