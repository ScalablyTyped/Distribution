package typings.forgeViewer.Autodesk.Viewing.Private

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewerState extends StObject {
  
  def areEqual(viewerStateA: js.Object, viewerStateB: js.Object): Boolean = js.native
  def areEqual(viewerStateA: js.Object, viewerStateB: js.Object, filter: js.Object): Boolean = js.native
  
  def getSeedUrn(): String = js.native
  
  def getState(): js.Object = js.native
  def getState(filter: js.Object): js.Object = js.native
  
  def restoreState(viewerState: js.Object): Boolean = js.native
  def restoreState(viewerState: js.Object, filter: js.Object): Boolean = js.native
  def restoreState(viewerState: js.Object, filter: js.Object, immediate: Boolean): Boolean = js.native
  def restoreState(viewerState: js.Object, filter: Unit, immediate: Boolean): Boolean = js.native
}
