package typings.googleAdwordsScripts

import typings.googleAppsScript.GoogleAppsScript.Base.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaBundleBuilder[Media] extends AdWordsBuilder[Media] {
  def withData(data: Blob): MediaBundleBuilder[Media]
  def withName(name: String): MediaBundleBuilder[Media]
}

object MediaBundleBuilder {
  @scala.inline
  def apply[Media](
    build: () => AdWordsOperation[Media],
    withData: Blob => MediaBundleBuilder[Media],
    withName: String => MediaBundleBuilder[Media]
  ): MediaBundleBuilder[Media] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withData = js.Any.fromFunction1(withData), withName = js.Any.fromFunction1(withName))
    __obj.asInstanceOf[MediaBundleBuilder[Media]]
  }
}

