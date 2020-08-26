package typings.googleAdwordsScripts

import typings.googleAppsScript.GoogleAppsScript.Base.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageBuilder[Media] extends AdWordsBuilder[Media] {
  def withData(data: Blob): ImageBuilder[Media] = js.native
  def withName(name: String): ImageBuilder[Media] = js.native
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
  @scala.inline
  implicit class ImageBuilderOps[Self <: ImageBuilder[_], Media] (val x: Self with ImageBuilder[Media]) extends AnyVal {
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
    def setWithData(value: Blob => ImageBuilder[Media]): Self = this.set("withData", js.Any.fromFunction1(value))
    @scala.inline
    def setWithName(value: String => ImageBuilder[Media]): Self = this.set("withName", js.Any.fromFunction1(value))
  }
  
}

