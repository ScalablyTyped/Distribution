package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandedTextAdBuilder[ExpandedTextAd] extends AdBuilder[ExpandedTextAdBuilder[ExpandedTextAd]] {
  def withDescription(descriptions: java.lang.String): ExpandedTextAdBuilder[ExpandedTextAd]
  def withHeadlinePart1(headline1: java.lang.String): ExpandedTextAdBuilder[ExpandedTextAd]
  def withHeadlinePart2(headline2: java.lang.String): ExpandedTextAdBuilder[ExpandedTextAd]
  def withPath1(path1: java.lang.String): ExpandedTextAdBuilder[ExpandedTextAd]
  def withPath2(path2: java.lang.String): ExpandedTextAdBuilder[ExpandedTextAd]
}

object ExpandedTextAdBuilder {
  @scala.inline
  def apply[ExpandedTextAd](
    build: js.Function0[AdWordsOperation[ExpandedTextAdBuilder[ExpandedTextAd]]],
    withCustomParameters: js.Function1[js.Object, ExpandedTextAdBuilder[ExpandedTextAd]],
    withDescription: js.Function1[java.lang.String, ExpandedTextAdBuilder[ExpandedTextAd]],
    withFinalUrl: js.Function1[java.lang.String, ExpandedTextAdBuilder[ExpandedTextAd]],
    withHeadlinePart1: js.Function1[java.lang.String, ExpandedTextAdBuilder[ExpandedTextAd]],
    withHeadlinePart2: js.Function1[java.lang.String, ExpandedTextAdBuilder[ExpandedTextAd]],
    withMobileFinalUrl: js.Function1[java.lang.String, ExpandedTextAdBuilder[ExpandedTextAd]],
    withPath1: js.Function1[java.lang.String, ExpandedTextAdBuilder[ExpandedTextAd]],
    withPath2: js.Function1[java.lang.String, ExpandedTextAdBuilder[ExpandedTextAd]],
    withTrackingTemplate: js.Function1[java.lang.String, ExpandedTextAdBuilder[ExpandedTextAd]]
  ): ExpandedTextAdBuilder[ExpandedTextAd] = {
    val __obj = js.Dynamic.literal(build = build, withCustomParameters = withCustomParameters, withDescription = withDescription, withFinalUrl = withFinalUrl, withHeadlinePart1 = withHeadlinePart1, withHeadlinePart2 = withHeadlinePart2, withMobileFinalUrl = withMobileFinalUrl, withPath1 = withPath1, withPath2 = withPath2, withTrackingTemplate = withTrackingTemplate)
  
    __obj.asInstanceOf[ExpandedTextAdBuilder[ExpandedTextAd]]
  }
}

