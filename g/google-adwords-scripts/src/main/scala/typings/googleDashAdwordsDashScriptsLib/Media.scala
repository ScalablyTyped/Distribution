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
    getDimensions: () => MediaDimensions,
    getFileSize: () => scala.Double,
    getId: () => scala.Double,
    getMimeType: () => java.lang.String,
    getName: () => java.lang.String,
    getReferenceId: () => java.lang.String,
    getSourceUrl: () => java.lang.String,
    getType: () => MediaType,
    getUrls: () => MediaUrls,
    getYouTubeVideoId: () => java.lang.String | scala.Unit
  ): Media = {
    val __obj = js.Dynamic.literal(getDimensions = js.Any.fromFunction0(getDimensions), getFileSize = js.Any.fromFunction0(getFileSize), getId = js.Any.fromFunction0(getId), getMimeType = js.Any.fromFunction0(getMimeType), getName = js.Any.fromFunction0(getName), getReferenceId = js.Any.fromFunction0(getReferenceId), getSourceUrl = js.Any.fromFunction0(getSourceUrl), getType = js.Any.fromFunction0(getType), getUrls = js.Any.fromFunction0(getUrls), getYouTubeVideoId = js.Any.fromFunction0(getYouTubeVideoId))
  
    __obj.asInstanceOf[Media]
  }
}

