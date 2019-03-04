package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Media extends js.Object {
  def getDimensions(): MediaDimensions
  def getFileSize(): scala.Double
  def getId(): scala.Double
  def getMimeType(): java.lang.String
  def getName(): java.lang.String
  def getReferenceId(): java.lang.String
  def getSourceUrl(): java.lang.String
  def getType(): MediaType
  def getUrls(): MediaUrls
  def getYouTubeVideoId(): java.lang.String | scala.Unit
}

object Media {
  @scala.inline
  def apply(
    getDimensions: js.Function0[MediaDimensions],
    getFileSize: js.Function0[scala.Double],
    getId: js.Function0[scala.Double],
    getMimeType: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getReferenceId: js.Function0[java.lang.String],
    getSourceUrl: js.Function0[java.lang.String],
    getType: js.Function0[MediaType],
    getUrls: js.Function0[MediaUrls],
    getYouTubeVideoId: js.Function0[java.lang.String | scala.Unit]
  ): Media = {
    val __obj = js.Dynamic.literal(getDimensions = getDimensions, getFileSize = getFileSize, getId = getId, getMimeType = getMimeType, getName = getName, getReferenceId = getReferenceId, getSourceUrl = getSourceUrl, getType = getType, getUrls = getUrls, getYouTubeVideoId = getYouTubeVideoId)
  
    __obj.asInstanceOf[Media]
  }
}

