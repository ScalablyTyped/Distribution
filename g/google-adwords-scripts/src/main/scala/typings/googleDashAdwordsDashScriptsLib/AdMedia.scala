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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("media")(media)
    __obj.updateDynamic("newImageBuilder")(newImageBuilder)
    __obj.updateDynamic("newMediaBundleBuilder")(newMediaBundleBuilder)
    __obj.updateDynamic("newVideoBuilder")(newVideoBuilder)
    __obj.asInstanceOf[AdMedia]
  }
}

