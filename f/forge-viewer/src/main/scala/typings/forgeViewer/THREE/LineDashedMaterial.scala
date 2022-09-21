package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineDashedMaterial
  extends StObject
     with Material {
  
  var color: Color = js.native
  
  def copy(source: LineDashedMaterial): LineDashedMaterial = js.native
  
  var dashSize: Double = js.native
  
  var gapSize: Double = js.native
  
  var linewidth: Double = js.native
  
  var scale: Double = js.native
  
  def setValues(parameters: LineDashedMaterialParameters): Unit = js.native
}
