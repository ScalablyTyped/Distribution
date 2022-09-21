package typings.forgeViewer.global.THREE

import typings.forgeViewer.THREE.MorphTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.AnimationClip")
@js.native
open class AnimationClip ()
  extends StObject
     with typings.forgeViewer.THREE.AnimationClip {
  def this(name: String) = this()
  def this(name: String, duration: Double) = this()
  def this(name: Unit, duration: Double) = this()
  def this(name: String, duration: Double, tracks: js.Array[typings.forgeViewer.THREE.KeyframeTrack]) = this()
  def this(name: String, duration: Unit, tracks: js.Array[typings.forgeViewer.THREE.KeyframeTrack]) = this()
  def this(name: Unit, duration: Double, tracks: js.Array[typings.forgeViewer.THREE.KeyframeTrack]) = this()
  def this(name: Unit, duration: Unit, tracks: js.Array[typings.forgeViewer.THREE.KeyframeTrack]) = this()
  
  /* CompleteClass */
  var duration: Double = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  override def optimize(): typings.forgeViewer.THREE.AnimationClip = js.native
  
  /* CompleteClass */
  override def resetDuration(): Unit = js.native
  
  /* CompleteClass */
  var results: js.Array[Any] = js.native
  
  /* CompleteClass */
  var tracks: js.Array[typings.forgeViewer.THREE.KeyframeTrack] = js.native
  
  /* CompleteClass */
  override def trim(): typings.forgeViewer.THREE.AnimationClip = js.native
  
  /* CompleteClass */
  var uuid: String = js.native
}
object AnimationClip {
  
  @JSGlobal("THREE.AnimationClip")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def CreateClipsFromMorphTargetSequences(morphTargets: js.Array[MorphTarget], fps: Double, noLoop: Boolean): js.Array[typings.forgeViewer.THREE.AnimationClip] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateClipsFromMorphTargetSequences")(morphTargets.asInstanceOf[js.Any], fps.asInstanceOf[js.Any], noLoop.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.forgeViewer.THREE.AnimationClip]]
  
  /* static member */
  inline def CreateFromMorphTargetSequence(name: String, morphTargetSequence: js.Array[MorphTarget], fps: Double, noLoop: Boolean): typings.forgeViewer.THREE.AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromMorphTargetSequence")(name.asInstanceOf[js.Any], morphTargetSequence.asInstanceOf[js.Any], fps.asInstanceOf[js.Any], noLoop.asInstanceOf[js.Any])).asInstanceOf[typings.forgeViewer.THREE.AnimationClip]
  
  /* static member */
  inline def findByName(clipArray: typings.forgeViewer.THREE.AnimationClip, name: String): typings.forgeViewer.THREE.AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("findByName")(clipArray.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.forgeViewer.THREE.AnimationClip]
  
  /* static member */
  inline def parse(json: Any): typings.forgeViewer.THREE.AnimationClip = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(json.asInstanceOf[js.Any]).asInstanceOf[typings.forgeViewer.THREE.AnimationClip]
  
  /* static member */
  inline def parseAnimation(animation: Any, bones: js.Array[typings.forgeViewer.THREE.Bone], nodeName: String): typings.forgeViewer.THREE.AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAnimation")(animation.asInstanceOf[js.Any], bones.asInstanceOf[js.Any], nodeName.asInstanceOf[js.Any])).asInstanceOf[typings.forgeViewer.THREE.AnimationClip]
  
  /* static member */
  inline def toJSON(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")().asInstanceOf[Any]
}
