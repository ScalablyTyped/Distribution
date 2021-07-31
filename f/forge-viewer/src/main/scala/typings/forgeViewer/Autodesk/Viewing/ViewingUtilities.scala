package typings.forgeViewer.Autodesk.Viewing

import typings.three.mod.Box3
import typings.three.mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewingUtilities extends StObject {
  
  def getBoundingBox(): Box3 = js.native
  def getBoundingBox(ignoreSelection: Boolean): Box3 = js.native
  
  def getHitPoint(x: Double, y: Double): Vector3 = js.native
}
