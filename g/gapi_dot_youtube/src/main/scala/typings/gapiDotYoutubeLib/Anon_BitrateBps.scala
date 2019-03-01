package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BitrateBps extends js.Object {
  /**
    * The audio streams bitrate, in bits per second.
    */
  var bitrateBps: scala.Double
  /**
    * The number of audio channels that the stream contains.
    */
  var channelCount: scala.Double
  /**
    * The audio codec that the stream uses.
    */
  var codec: java.lang.String
  /**
    * A value that uniquely identifies a video vendor. Typically, the value is a four-letter vendor code.
    */
  var vendor: java.lang.String
}

object Anon_BitrateBps {
  @scala.inline
  def apply(
    bitrateBps: scala.Double,
    channelCount: scala.Double,
    codec: java.lang.String,
    vendor: java.lang.String
  ): Anon_BitrateBps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bitrateBps")(bitrateBps)
    __obj.updateDynamic("channelCount")(channelCount)
    __obj.updateDynamic("codec")(codec)
    __obj.updateDynamic("vendor")(vendor)
    __obj.asInstanceOf[Anon_BitrateBps]
  }
}

