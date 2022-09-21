package typings.forgeViewer.THREE

import typings.forgeViewer.anon.GenerateSideWallUV
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtrudeGeometry
  extends StObject
     with Geometry {
  
  var WorldUVGenerator: GenerateSideWallUV = js.native
  
  def addShape(shape: Shape): Unit = js.native
  def addShape(shape: Shape, options: Any): Unit = js.native
  
  def addShapeList(shapes: js.Array[Shape]): Unit = js.native
  def addShapeList(shapes: js.Array[Shape], options: Any): Unit = js.native
}
