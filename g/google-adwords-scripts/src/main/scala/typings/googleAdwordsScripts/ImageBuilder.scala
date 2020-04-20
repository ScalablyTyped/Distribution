package typings.googleAdwordsScripts

import typings.googleAppsScript.GoogleAppsScript.Base.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageBuilder[Media] extends AdWordsBuilder[Media] {
  def withData(data: Blob): ImageBuilder[Media]
  def withName(name: String): ImageBuilder[Media]
}

object ImageBuilder {
  @scala.inline
  def apply[Media](
    build: () => AdWordsOperation[Media],
    withData: Blob => ImageBuilder[Media],
    withName: String => ImageBuilder[Media]
  ): ImageBuilder[Media] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withData = js.Any.fromFunction1(withData), withName = js.Any.fromFunction1(withName))
    __obj.asInstanceOf[ImageBuilder[Media]]
  }
}

