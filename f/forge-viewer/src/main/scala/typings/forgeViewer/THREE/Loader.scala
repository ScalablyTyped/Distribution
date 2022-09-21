package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Loader extends StObject {
  
  def createMaterial(m: Material, texturePath: String): Boolean = js.native
  def createMaterial(m: Material, texturePath: String, crossOrigin: String): Boolean = js.native
  
  var crossOrigin: String = js.native
  
  def extractUrlBase(url: String): String = js.native
  
  def initMaterials(materials: js.Array[Material], texturePath: String): js.Array[Material] = js.native
  
  def onLoadComplete(): Unit = js.native
  
  def onLoadProgress(): Unit = js.native
  
  def onLoadStart(): Unit = js.native
}
