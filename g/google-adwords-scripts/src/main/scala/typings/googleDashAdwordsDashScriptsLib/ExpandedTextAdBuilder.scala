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
    build: () => AdWordsOperation[ExpandedTextAdBuilder[ExpandedTextAd]],
    withCustomParameters: js.Object => ExpandedTextAdBuilder[ExpandedTextAd],
    withDescription: java.lang.String => ExpandedTextAdBuilder[ExpandedTextAd],
    withFinalUrl: java.lang.String => ExpandedTextAdBuilder[ExpandedTextAd],
    withHeadlinePart1: java.lang.String => ExpandedTextAdBuilder[ExpandedTextAd],
    withHeadlinePart2: java.lang.String => ExpandedTextAdBuilder[ExpandedTextAd],
    withMobileFinalUrl: java.lang.String => ExpandedTextAdBuilder[ExpandedTextAd],
    withPath1: java.lang.String => ExpandedTextAdBuilder[ExpandedTextAd],
    withPath2: java.lang.String => ExpandedTextAdBuilder[ExpandedTextAd],
    withTrackingTemplate: java.lang.String => ExpandedTextAdBuilder[ExpandedTextAd]
  ): ExpandedTextAdBuilder[ExpandedTextAd] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withCustomParameters = js.Any.fromFunction1(withCustomParameters), withDescription = js.Any.fromFunction1(withDescription), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withHeadlinePart1 = js.Any.fromFunction1(withHeadlinePart1), withHeadlinePart2 = js.Any.fromFunction1(withHeadlinePart2), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl), withPath1 = js.Any.fromFunction1(withPath1), withPath2 = js.Any.fromFunction1(withPath2), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
  
    __obj.asInstanceOf[ExpandedTextAdBuilder[ExpandedTextAd]]
  }
}

