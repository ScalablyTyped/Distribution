package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BitrateBps extends js.Object {
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

object Anon_BitrateBps {
  @scala.inline
  def apply(bitrateBps: Double, channelCount: Double, codec: String, vendor: String): Anon_BitrateBps = {
    val __obj = js.Dynamic.literal(bitrateBps = bitrateBps, channelCount = channelCount, codec = codec, vendor = vendor)
  
    __obj.asInstanceOf[Anon_BitrateBps]
  }
}

