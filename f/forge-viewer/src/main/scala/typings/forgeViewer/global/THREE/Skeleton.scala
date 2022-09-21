package typings.forgeViewer.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.Skeleton")
@js.native
open class Skeleton protected ()
  extends StObject
     with typings.forgeViewer.THREE.Skeleton {
  def this(bones: js.Array[typings.forgeViewer.THREE.Bone]) = this()
  def this(
    bones: js.Array[typings.forgeViewer.THREE.Bone],
    boneInverses: js.Array[typings.forgeViewer.THREE.Matrix4]
  ) = this()
  def this(
    bones: js.Array[typings.forgeViewer.THREE.Bone],
    boneInverses: js.Array[typings.forgeViewer.THREE.Matrix4],
    useVertexTexture: Boolean
  ) = this()
  def this(bones: js.Array[typings.forgeViewer.THREE.Bone], boneInverses: Unit, useVertexTexture: Boolean) = this()
  
  /* CompleteClass */
  var boneInverses: js.Array[typings.forgeViewer.THREE.Matrix4] = js.native
  
  /* CompleteClass */
  var boneMatrices: js.typedarray.Float32Array = js.native
  
  /* CompleteClass */
  var boneTexture: typings.forgeViewer.THREE.DataTexture = js.native
  
  /* CompleteClass */
  var boneTextureHeight: Double = js.native
  
  /* CompleteClass */
  var boneTextureWidth: Double = js.native
  
  /* CompleteClass */
  var bones: js.Array[typings.forgeViewer.THREE.Bone] = js.native
  
  /* CompleteClass */
  override def calculateInverses(bone: typings.forgeViewer.THREE.Bone): Unit = js.native
  
  /* CompleteClass */
  var identityMatrix: typings.forgeViewer.THREE.Matrix4 = js.native
  
  /* CompleteClass */
  override def pose(): Unit = js.native
  
  /* CompleteClass */
  override def update(): Unit = js.native
  
  /* CompleteClass */
  var useVertexTexture: Boolean = js.native
}
