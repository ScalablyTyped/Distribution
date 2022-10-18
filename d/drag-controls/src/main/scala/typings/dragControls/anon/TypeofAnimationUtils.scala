package typings.dragControls.anon

import typings.three.srcAnimationAnimationClipMod.AnimationClip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAnimationUtils extends StObject {
  
  def arraySlice(array: Any, from: Double, to: Double): Any = js.native
  
  def convertArray(array: Any, `type`: Any, forceClone: Boolean): Any = js.native
  
  def flattenJSON(jsonKeys: js.Array[String], times: js.Array[Any], values: js.Array[Any], valuePropertyName: String): Unit = js.native
  
  def getKeyframeOrder(times: js.Array[Double]): js.Array[Double] = js.native
  
  def isTypedArray(`object`: Any): Boolean = js.native
  
  def makeClipAdditive(targetClip: AnimationClip): AnimationClip = js.native
  def makeClipAdditive(targetClip: AnimationClip, referenceFrame: Double): AnimationClip = js.native
  def makeClipAdditive(targetClip: AnimationClip, referenceFrame: Double, referenceClip: Unit, fps: Double): AnimationClip = js.native
  def makeClipAdditive(targetClip: AnimationClip, referenceFrame: Double, referenceClip: AnimationClip): AnimationClip = js.native
  def makeClipAdditive(targetClip: AnimationClip, referenceFrame: Double, referenceClip: AnimationClip, fps: Double): AnimationClip = js.native
  def makeClipAdditive(targetClip: AnimationClip, referenceFrame: Unit, referenceClip: Unit, fps: Double): AnimationClip = js.native
  def makeClipAdditive(targetClip: AnimationClip, referenceFrame: Unit, referenceClip: AnimationClip): AnimationClip = js.native
  def makeClipAdditive(targetClip: AnimationClip, referenceFrame: Unit, referenceClip: AnimationClip, fps: Double): AnimationClip = js.native
  
  def sortedArray(values: js.Array[Any], stride: Double, order: js.Array[Double]): js.Array[Any] = js.native
  
  def subclip(sourceClip: AnimationClip, name: String, startFrame: Double, endFrame: Double): AnimationClip = js.native
  def subclip(sourceClip: AnimationClip, name: String, startFrame: Double, endFrame: Double, fps: Double): AnimationClip = js.native
}
