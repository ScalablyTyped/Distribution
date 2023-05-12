package typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1

import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SynthesizeLongAudioMetadata. */
trait ISynthesizeLongAudioMetadata extends StObject {
  
  /** SynthesizeLongAudioMetadata lastUpdateTime */
  var lastUpdateTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** SynthesizeLongAudioMetadata progressPercentage */
  var progressPercentage: js.UndefOr[Double | Null] = js.undefined
  
  /** SynthesizeLongAudioMetadata startTime */
  var startTime: js.UndefOr[ITimestamp | Null] = js.undefined
}
object ISynthesizeLongAudioMetadata {
  
  inline def apply(): ISynthesizeLongAudioMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISynthesizeLongAudioMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISynthesizeLongAudioMetadata] (val x: Self) extends AnyVal {
    
    inline def setLastUpdateTime(value: ITimestamp): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeNull: Self = StObject.set(x, "lastUpdateTime", null)
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setProgressPercentage(value: Double): Self = StObject.set(x, "progressPercentage", value.asInstanceOf[js.Any])
    
    inline def setProgressPercentageNull: Self = StObject.set(x, "progressPercentage", null)
    
    inline def setProgressPercentageUndefined: Self = StObject.set(x, "progressPercentage", js.undefined)
    
    inline def setStartTime(value: ITimestamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
