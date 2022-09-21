package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Skeleton extends StObject {
  
  var boneInverses: js.Array[Matrix4]
  
  var boneMatrices: js.typedarray.Float32Array
  
  var boneTexture: DataTexture
  
  var boneTextureHeight: Double
  
  var boneTextureWidth: Double
  
  var bones: js.Array[Bone]
  
  def calculateInverses(bone: Bone): Unit
  
  var identityMatrix: Matrix4
  
  def pose(): Unit
  
  def update(): Unit
  
  var useVertexTexture: Boolean
}
object Skeleton {
  
  inline def apply(
    boneInverses: js.Array[Matrix4],
    boneMatrices: js.typedarray.Float32Array,
    boneTexture: DataTexture,
    boneTextureHeight: Double,
    boneTextureWidth: Double,
    bones: js.Array[Bone],
    calculateInverses: Bone => Unit,
    identityMatrix: Matrix4,
    pose: () => Unit,
    update: () => Unit,
    useVertexTexture: Boolean
  ): Skeleton = {
    val __obj = js.Dynamic.literal(boneInverses = boneInverses.asInstanceOf[js.Any], boneMatrices = boneMatrices.asInstanceOf[js.Any], boneTexture = boneTexture.asInstanceOf[js.Any], boneTextureHeight = boneTextureHeight.asInstanceOf[js.Any], boneTextureWidth = boneTextureWidth.asInstanceOf[js.Any], bones = bones.asInstanceOf[js.Any], calculateInverses = js.Any.fromFunction1(calculateInverses), identityMatrix = identityMatrix.asInstanceOf[js.Any], pose = js.Any.fromFunction0(pose), update = js.Any.fromFunction0(update), useVertexTexture = useVertexTexture.asInstanceOf[js.Any])
    __obj.asInstanceOf[Skeleton]
  }
  
  extension [Self <: Skeleton](x: Self) {
    
    inline def setBoneInverses(value: js.Array[Matrix4]): Self = StObject.set(x, "boneInverses", value.asInstanceOf[js.Any])
    
    inline def setBoneInversesVarargs(value: Matrix4*): Self = StObject.set(x, "boneInverses", js.Array(value*))
    
    inline def setBoneMatrices(value: js.typedarray.Float32Array): Self = StObject.set(x, "boneMatrices", value.asInstanceOf[js.Any])
    
    inline def setBoneTexture(value: DataTexture): Self = StObject.set(x, "boneTexture", value.asInstanceOf[js.Any])
    
    inline def setBoneTextureHeight(value: Double): Self = StObject.set(x, "boneTextureHeight", value.asInstanceOf[js.Any])
    
    inline def setBoneTextureWidth(value: Double): Self = StObject.set(x, "boneTextureWidth", value.asInstanceOf[js.Any])
    
    inline def setBones(value: js.Array[Bone]): Self = StObject.set(x, "bones", value.asInstanceOf[js.Any])
    
    inline def setBonesVarargs(value: Bone*): Self = StObject.set(x, "bones", js.Array(value*))
    
    inline def setCalculateInverses(value: Bone => Unit): Self = StObject.set(x, "calculateInverses", js.Any.fromFunction1(value))
    
    inline def setIdentityMatrix(value: Matrix4): Self = StObject.set(x, "identityMatrix", value.asInstanceOf[js.Any])
    
    inline def setPose(value: () => Unit): Self = StObject.set(x, "pose", js.Any.fromFunction0(value))
    
    inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    
    inline def setUseVertexTexture(value: Boolean): Self = StObject.set(x, "useVertexTexture", value.asInstanceOf[js.Any])
  }
}
