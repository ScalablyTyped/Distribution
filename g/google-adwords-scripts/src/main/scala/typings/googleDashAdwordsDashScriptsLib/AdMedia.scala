package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Media
trait AdMedia extends js.Object {
  def media(): AdWordsSelector[Media]
  def newImageBuilder(): ImageBuilder[Media]
  def newMediaBundleBuilder(): MediaBundleBuilder[Media]
  def newVideoBuilder(): VideoBuilder[Media]
}

object AdMedia {
  @scala.inline
  def apply(
    media: js.Function0[AdWordsSelector[Media]],
    newImageBuilder: js.Function0[ImageBuilder[Media]],
    newMediaBundleBuilder: js.Function0[MediaBundleBuilder[Media]],
    newVideoBuilder: js.Function0[VideoBuilder[Media]]
  ): AdMedia = {
    val __obj = js.Dynamic.literal(media = media, newImageBuilder = newImageBuilder, newMediaBundleBuilder = newMediaBundleBuilder, newVideoBuilder = newVideoBuilder)
  
    __obj.asInstanceOf[AdMedia]
  }
}

