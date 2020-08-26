package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Html5AdBuilder[Html5Ad]
  extends AdWordsBuilder[Html5AdBuilder[Html5Ad]]
     with hasFinalUrlBuilder[Html5AdBuilder[Html5Ad]]
     with hasTrackingTemplateBuilder[Html5AdBuilder[Html5Ad]] {
  def withDimensions(dimensions: String): Html5AdBuilder[Html5Ad] = js.native
  def withDisplayUrl(displayUrl: String): Html5AdBuilder[Html5Ad] = js.native
  def withEntryPoint(entryPoint: String): Html5AdBuilder[Html5Ad] = js.native
  def withMediaBundle(mediaBundle: Media): Html5AdBuilder[Html5Ad] = js.native
  def withName(name: String): Html5AdBuilder[Html5Ad] = js.native
}

object Html5AdBuilder {
  @scala.inline
  def apply[Html5Ad](
    build: () => AdWordsOperation[Html5AdBuilder[Html5Ad]],
    withCustomParameters: js.Object => Html5AdBuilder[Html5Ad],
    withDimensions: String => Html5AdBuilder[Html5Ad],
    withDisplayUrl: String => Html5AdBuilder[Html5Ad],
    withEntryPoint: String => Html5AdBuilder[Html5Ad],
    withFinalUrl: String => Html5AdBuilder[Html5Ad],
    withMediaBundle: Media => Html5AdBuilder[Html5Ad],
    withMobileFinalUrl: String => Html5AdBuilder[Html5Ad],
    withName: String => Html5AdBuilder[Html5Ad],
    withTrackingTemplate: String => Html5AdBuilder[Html5Ad]
  ): Html5AdBuilder[Html5Ad] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withCustomParameters = js.Any.fromFunction1(withCustomParameters), withDimensions = js.Any.fromFunction1(withDimensions), withDisplayUrl = js.Any.fromFunction1(withDisplayUrl), withEntryPoint = js.Any.fromFunction1(withEntryPoint), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withMediaBundle = js.Any.fromFunction1(withMediaBundle), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl), withName = js.Any.fromFunction1(withName), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
    __obj.asInstanceOf[Html5AdBuilder[Html5Ad]]
  }
  @scala.inline
  implicit class Html5AdBuilderOps[Self <: Html5AdBuilder[_], Html5Ad] (val x: Self with Html5AdBuilder[Html5Ad]) extends AnyVal {
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
    def setWithDimensions(value: String => Html5AdBuilder[Html5Ad]): Self = this.set("withDimensions", js.Any.fromFunction1(value))
    @scala.inline
    def setWithDisplayUrl(value: String => Html5AdBuilder[Html5Ad]): Self = this.set("withDisplayUrl", js.Any.fromFunction1(value))
    @scala.inline
    def setWithEntryPoint(value: String => Html5AdBuilder[Html5Ad]): Self = this.set("withEntryPoint", js.Any.fromFunction1(value))
    @scala.inline
    def setWithMediaBundle(value: Media => Html5AdBuilder[Html5Ad]): Self = this.set("withMediaBundle", js.Any.fromFunction1(value))
    @scala.inline
    def setWithName(value: String => Html5AdBuilder[Html5Ad]): Self = this.set("withName", js.Any.fromFunction1(value))
  }
  
}

