package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DidRedirectNavigationEvent
  extends StObject
     with Event {
  
  var frameProcessId: Double = js.native
  
  var frameRoutingId: Double = js.native
  
  var isInPlace: Boolean = js.native
  
  var isMainFrame: Boolean = js.native
  
  var url: String = js.native
}
