package typings.googleAdwordsScripts

import typings.googleAppsScript.GoogleAppsScript.Base.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaBundleBuilder[Media] extends AdWordsBuilder[Media] {
  def withData(data: Blob): MediaBundleBuilder[Media] = js.native
  def withName(name: String): MediaBundleBuilder[Media] = js.native
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
  @scala.inline
  implicit class MediaBundleBuilderOps[Self <: MediaBundleBuilder[_], Media] (val x: Self with MediaBundleBuilder[Media]) extends AnyVal {
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
    def setWithData(value: Blob => MediaBundleBuilder[Media]): Self = this.set("withData", js.Any.fromFunction1(value))
    @scala.inline
    def setWithName(value: String => MediaBundleBuilder[Media]): Self = this.set("withName", js.Any.fromFunction1(value))
  }
  
}

