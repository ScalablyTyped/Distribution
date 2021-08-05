package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BitrateBps extends StObject {
  
  /**
    * The audio streams bitrate, in bits per second.
    */
  var bitrateBps: Double
  
  /**
    * The number of audio channels that the stream contains.
    */
  var channelCount: Double
  
  /**
    * The audio codec that the stream uses.
    */
  var codec: String
  
  /**
    * A value that uniquely identifies a video vendor. Typically, the value is a four-letter vendor code.
    */
  var vendor: String
}
object BitrateBps {
  
  inline def apply(bitrateBps: Double, channelCount: Double, codec: String, vendor: String): BitrateBps = {
    val __obj = js.Dynamic.literal(bitrateBps = bitrateBps.asInstanceOf[js.Any], channelCount = channelCount.asInstanceOf[js.Any], codec = codec.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitrateBps]
  }
  
  extension [Self <: BitrateBps](x: Self) {
    
    inline def setBitrateBps(value: Double): Self = StObject.set(x, "bitrateBps", value.asInstanceOf[js.Any])
    
    inline def setChannelCount(value: Double): Self = StObject.set(x, "channelCount", value.asInstanceOf[js.Any])
    
    inline def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
  }
}
