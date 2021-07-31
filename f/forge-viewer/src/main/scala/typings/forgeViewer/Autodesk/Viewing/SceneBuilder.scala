package typings.forgeViewer.Autodesk.Viewing

import typings.forgeViewer.anon.ConserveMemory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneBuilder
  extends StObject
     with Extension {
  
  def addNewModel(options: ConserveMemory): js.Promise[ModelBuilder] = js.native
}
