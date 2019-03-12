package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Html5AdBuilder[Html5Ad] extends AdBuilder[Html5AdBuilder[Html5Ad]] {
  def withDimensions(dimensions: java.lang.String): Html5AdBuilder[Html5Ad]
  def withDisplayUrl(displayUrl: java.lang.String): Html5AdBuilder[Html5Ad]
  def withEntryPoint(entryPoint: java.lang.String): Html5AdBuilder[Html5Ad]
  def withMediaBundle(mediaBundle: Media): Html5AdBuilder[Html5Ad]
  def withName(name: java.lang.String): Html5AdBuilder[Html5Ad]
}

object Html5AdBuilder {
  @scala.inline
  def apply[Html5Ad](
    build: () => AdWordsOperation[Html5AdBuilder[Html5Ad]],
    withCustomParameters: js.Object => Html5AdBuilder[Html5Ad],
    withDimensions: java.lang.String => Html5AdBuilder[Html5Ad],
    withDisplayUrl: java.lang.String => Html5AdBuilder[Html5Ad],
    withEntryPoint: java.lang.String => Html5AdBuilder[Html5Ad],
    withFinalUrl: java.lang.String => Html5AdBuilder[Html5Ad],
    withMediaBundle: Media => Html5AdBuilder[Html5Ad],
    withMobileFinalUrl: java.lang.String => Html5AdBuilder[Html5Ad],
    withName: java.lang.String => Html5AdBuilder[Html5Ad],
    withTrackingTemplate: java.lang.String => Html5AdBuilder[Html5Ad]
  ): Html5AdBuilder[Html5Ad] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withCustomParameters = js.Any.fromFunction1(withCustomParameters), withDimensions = js.Any.fromFunction1(withDimensions), withDisplayUrl = js.Any.fromFunction1(withDisplayUrl), withEntryPoint = js.Any.fromFunction1(withEntryPoint), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withMediaBundle = js.Any.fromFunction1(withMediaBundle), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl), withName = js.Any.fromFunction1(withName), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
  
    __obj.asInstanceOf[Html5AdBuilder[Html5Ad]]
  }
}

