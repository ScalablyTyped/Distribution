package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Media extends js.Object {
  def getDimensions(): MediaDimensions
  def getFileSize(): Double
  def getId(): Double
  def getMimeType(): String
  def getName(): String
  def getReferenceId(): String
  def getSourceUrl(): String
  def getType(): MediaType
  def getUrls(): MediaUrls
  def getYouTubeVideoId(): String | Unit
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
}

