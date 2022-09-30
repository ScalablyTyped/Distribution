package typings.editly.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transition extends StObject {
  
  /**
  		 * [Fade in curve]{@link https://trac.ffmpeg.org/wiki/AfadeCurves} in audio cross fades.
  		 *
  		 * @default 'tri'
  		 */
  var audioInCurve: js.UndefOr[CurveType] = js.undefined
  
  /**
  		 * [Fade out curve]{@link https://trac.ffmpeg.org/wiki/AfadeCurves} in audio cross fades.
  		 *
  		 * @default 'tri'
  		 */
  var audioOutCurve: js.UndefOr[CurveType] = js.undefined
  
  /**
  		 * Transition duration.
  		 *
  		 * @default 0.5
  		 */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
  		 * WARNING: Undocumented feature!
  		 */
  var easing: js.UndefOr[String | Null] = js.undefined
  
  /**
  		 * Transition type.
  		 *
  		 * @default 'random'
  		 * @see [Transition types]{@link https://github.com/mifi/editly#transition-types}
  		 */
  var name: js.UndefOr[TransitionType] = js.undefined
  
  /**
  		 * WARNING: Undocumented feature!
  		 */
  var params: js.UndefOr[TransitionParams] = js.undefined
}
object Transition {
  
  inline def apply(): Transition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transition]
  }
  
  extension [Self <: Transition](x: Self) {
    
    inline def setAudioInCurve(value: CurveType): Self = StObject.set(x, "audioInCurve", value.asInstanceOf[js.Any])
    
    inline def setAudioInCurveUndefined: Self = StObject.set(x, "audioInCurve", js.undefined)
    
    inline def setAudioOutCurve(value: CurveType): Self = StObject.set(x, "audioOutCurve", value.asInstanceOf[js.Any])
    
    inline def setAudioOutCurveUndefined: Self = StObject.set(x, "audioOutCurve", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingNull: Self = StObject.set(x, "easing", null)
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setName(value: TransitionType): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParams(value: TransitionParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
