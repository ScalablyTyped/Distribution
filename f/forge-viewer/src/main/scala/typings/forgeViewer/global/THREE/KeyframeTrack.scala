package typings.forgeViewer.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.KeyframeTrack")
@js.native
open class KeyframeTrack protected ()
  extends StObject
     with typings.forgeViewer.THREE.KeyframeTrack {
  def this(
    name: String,
    times: js.Array[Any],
    values: js.Array[Any],
    interpolation: typings.forgeViewer.THREE.InterpolationModes
  ) = this()
  
  /* CompleteClass */
  var DefaultInterpolation: typings.forgeViewer.THREE.InterpolationModes = js.native
  
  /* CompleteClass */
  override def InterpolantFactoryMethodDiscrete(result: Any): typings.forgeViewer.THREE.DiscreteInterpolant = js.native
  
  /* CompleteClass */
  override def InterpolantFactoryMethodLinear(result: Any): typings.forgeViewer.THREE.LinearInterpolant = js.native
  
  /* CompleteClass */
  override def InterpolantFactoryMethodSmooth(result: Any): typings.forgeViewer.THREE.CubicInterpolant = js.native
  
  /* CompleteClass */
  var TimeBufferType: js.typedarray.Float32Array = js.native
  
  /* CompleteClass */
  var ValueBufferType: js.typedarray.Float32Array = js.native
  
  /* CompleteClass */
  var ValueTypeName: String = js.native
  
  /* CompleteClass */
  override def getInterpolation(): typings.forgeViewer.THREE.InterpolationModes = js.native
  
  /* CompleteClass */
  override def getValuesize(): Double = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  override def optimize(): typings.forgeViewer.THREE.KeyframeTrack = js.native
  
  /* CompleteClass */
  override def scale(timeScale: Double): typings.forgeViewer.THREE.KeyframeTrack = js.native
  
  /* CompleteClass */
  override def setInterpolation(interpolation: typings.forgeViewer.THREE.InterpolationModes): Unit = js.native
  
  /* CompleteClass */
  override def shift(timeOffset: Double): typings.forgeViewer.THREE.KeyframeTrack = js.native
  
  /* CompleteClass */
  var times: js.Array[Any] = js.native
  
  /* CompleteClass */
  override def trim(startTime: Double, endTime: Double): typings.forgeViewer.THREE.KeyframeTrack = js.native
  
  /* CompleteClass */
  override def validate(): Boolean = js.native
  
  /* CompleteClass */
  var values: js.Array[Any] = js.native
}
object KeyframeTrack {
  
  @JSGlobal("THREE.KeyframeTrack")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def parse(json: Any): typings.forgeViewer.THREE.KeyframeTrack = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(json.asInstanceOf[js.Any]).asInstanceOf[typings.forgeViewer.THREE.KeyframeTrack]
  
  /* static member */
  inline def toJSON(track: typings.forgeViewer.THREE.KeyframeTrack): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(track.asInstanceOf[js.Any]).asInstanceOf[Any]
}
