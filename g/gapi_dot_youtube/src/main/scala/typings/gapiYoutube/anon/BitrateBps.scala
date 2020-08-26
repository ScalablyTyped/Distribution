package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BitrateBps extends js.Object {
  /**
    * The audio streams bitrate, in bits per second.
    */
  var bitrateBps: Double = js.native
  /**
    * The number of audio channels that the stream contains.
    */
  var channelCount: Double = js.native
  /**
    * The audio codec that the stream uses.
    */
  var codec: String = js.native
  /**
    * A value that uniquely identifies a video vendor. Typically, the value is a four-letter vendor code.
    */
  var vendor: String = js.native
}

object BitrateBps {
  @scala.inline
  def apply(bitrateBps: Double, channelCount: Double, codec: String, vendor: String): BitrateBps = {
    val __obj = js.Dynamic.literal(bitrateBps = bitrateBps.asInstanceOf[js.Any], channelCount = channelCount.asInstanceOf[js.Any], codec = codec.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitrateBps]
  }
  @scala.inline
  implicit class BitrateBpsOps[Self <: BitrateBps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBitrateBps(value: Double): Self = this.set("bitrateBps", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannelCount(value: Double): Self = this.set("channelCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setCodec(value: String): Self = this.set("codec", value.asInstanceOf[js.Any])
    @scala.inline
    def setVendor(value: String): Self = this.set("vendor", value.asInstanceOf[js.Any])
  }
  
}

