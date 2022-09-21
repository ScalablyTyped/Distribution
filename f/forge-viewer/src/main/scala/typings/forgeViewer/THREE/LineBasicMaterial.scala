package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineBasicMaterial
  extends StObject
     with Material {
  
  var color: Color = js.native
  
  def copy(source: LineBasicMaterial): LineBasicMaterial = js.native
  
  var linecap: String = js.native
  
  var linejoin: String = js.native
  
  var linewidth: Double = js.native
  
  def setValues(parameters: LineBasicMaterialParameters): Unit = js.native
}
