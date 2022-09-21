package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextureLoader extends StObject {
  
  var crossOrigin: String = js.native
  
  def load(url: String): Texture = js.native
  def load(url: String, onLoad: js.Function1[/* texture */ Texture, Unit]): Texture = js.native
  
  var manager: LoadingManager = js.native
  
  var path: String = js.native
  
  def setCrossOrigin(crossOrigin: String): TextureLoader = js.native
  
  def setPath(path: String): TextureLoader = js.native
}
