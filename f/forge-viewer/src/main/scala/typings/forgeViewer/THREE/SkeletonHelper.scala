package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkeletonHelper
  extends StObject
     with LineSegments {
  
  var bones: js.Array[Bone] = js.native
  
  def getBoneList(`object`: Object3D): js.Array[Bone] = js.native
  
  var root: Object3D = js.native
  
  def update(): Unit = js.native
}
