package typings.domWebcodecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioDataInit extends StObject {
  
  var data: AllowSharedBufferSource
  
  var format: AudioSampleFormat
  
  var numberOfChannels: Double
  
  var numberOfFrames: Double
  
  var sampleRate: Double
  
  var timestamp: Double
}
object AudioDataInit {
  
  inline def apply(
    data: AllowSharedBufferSource,
    format: AudioSampleFormat,
    numberOfChannels: Double,
    numberOfFrames: Double,
    sampleRate: Double,
    timestamp: Double
  ): AudioDataInit = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], numberOfChannels = numberOfChannels.asInstanceOf[js.Any], numberOfFrames = numberOfFrames.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioDataInit]
  }
  
  extension [Self <: AudioDataInit](x: Self) {
    
    inline def setData(value: AllowSharedBufferSource): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: AudioSampleFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setNumberOfChannels(value: Double): Self = StObject.set(x, "numberOfChannels", value.asInstanceOf[js.Any])
    
    inline def setNumberOfFrames(value: Double): Self = StObject.set(x, "numberOfFrames", value.asInstanceOf[js.Any])
    
    inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
