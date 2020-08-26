package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Media extends js.Object {
  def getDimensions(): MediaDimensions = js.native
  def getFileSize(): Double = js.native
  def getId(): Double = js.native
  def getMimeType(): String = js.native
  def getName(): String = js.native
  def getReferenceId(): String = js.native
  def getSourceUrl(): String = js.native
  def getType(): MediaType = js.native
  def getUrls(): MediaUrls = js.native
  def getYouTubeVideoId(): String | Unit = js.native
}

object Media {
  @scala.inline
  def apply(
    getDimensions: () => MediaDimensions,
    getFileSize: () => Double,
    getId: () => Double,
    getMimeType: () => String,
    getName: () => String,
    getReferenceId: () => String,
    getSourceUrl: () => String,
    getType: () => MediaType,
    getUrls: () => MediaUrls,
    getYouTubeVideoId: () => String | Unit
  ): Media = {
    val __obj = js.Dynamic.literal(getDimensions = js.Any.fromFunction0(getDimensions), getFileSize = js.Any.fromFunction0(getFileSize), getId = js.Any.fromFunction0(getId), getMimeType = js.Any.fromFunction0(getMimeType), getName = js.Any.fromFunction0(getName), getReferenceId = js.Any.fromFunction0(getReferenceId), getSourceUrl = js.Any.fromFunction0(getSourceUrl), getType = js.Any.fromFunction0(getType), getUrls = js.Any.fromFunction0(getUrls), getYouTubeVideoId = js.Any.fromFunction0(getYouTubeVideoId))
    __obj.asInstanceOf[Media]
  }
  @scala.inline
  implicit class MediaOps[Self <: Media] (val x: Self) extends AnyVal {
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
    def setGetDimensions(value: () => MediaDimensions): Self = this.set("getDimensions", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFileSize(value: () => Double): Self = this.set("getFileSize", js.Any.fromFunction0(value))
    @scala.inline
    def setGetId(value: () => Double): Self = this.set("getId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMimeType(value: () => String): Self = this.set("getMimeType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetReferenceId(value: () => String): Self = this.set("getReferenceId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSourceUrl(value: () => String): Self = this.set("getSourceUrl", js.Any.fromFunction0(value))
    @scala.inline
    def setGetType(value: () => MediaType): Self = this.set("getType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUrls(value: () => MediaUrls): Self = this.set("getUrls", js.Any.fromFunction0(value))
    @scala.inline
    def setGetYouTubeVideoId(value: () => String | Unit): Self = this.set("getYouTubeVideoId", js.Any.fromFunction0(value))
  }
  
}

