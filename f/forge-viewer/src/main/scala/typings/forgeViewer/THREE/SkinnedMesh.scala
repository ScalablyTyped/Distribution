package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkinnedMesh
  extends StObject
     with Mesh {
  
  def bind(skeleton: Skeleton): Unit = js.native
  def bind(skeleton: Skeleton, bindMatrix: Matrix4): Unit = js.native
  
  var bindMatrix: Matrix4 = js.native
  
  var bindMatrixInverse: Matrix4 = js.native
  
  var bindMode: String = js.native
  
  def copy(source: SkinnedMesh): SkinnedMesh = js.native
  
  def normalizeSkinWeights(): Unit = js.native
  
  def pose(): Unit = js.native
  
  var skeleton: Skeleton = js.native
  
  def updateMatrixWorld(): Unit = js.native
}
