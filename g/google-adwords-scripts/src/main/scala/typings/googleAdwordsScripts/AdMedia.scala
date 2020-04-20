package typings.googleAdwordsScripts

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
    media: () => AdWordsSelector[Media],
    newImageBuilder: () => ImageBuilder[Media],
    newMediaBundleBuilder: () => MediaBundleBuilder[Media],
    newVideoBuilder: () => VideoBuilder[Media]
  ): AdMedia = {
    val __obj = js.Dynamic.literal(media = js.Any.fromFunction0(media), newImageBuilder = js.Any.fromFunction0(newImageBuilder), newMediaBundleBuilder = js.Any.fromFunction0(newMediaBundleBuilder), newVideoBuilder = js.Any.fromFunction0(newVideoBuilder))
    __obj.asInstanceOf[AdMedia]
  }
}

