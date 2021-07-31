package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandedTextAdBuilder[ExpandedTextAd]
  extends StObject
     with AdBuilder[ExpandedTextAdBuilder[ExpandedTextAd]] {
  
  def withDescription(descriptions: String): ExpandedTextAdBuilder[ExpandedTextAd]
  
  def withHeadlinePart1(headline1: String): ExpandedTextAdBuilder[ExpandedTextAd]
  
  def withHeadlinePart2(headline2: String): ExpandedTextAdBuilder[ExpandedTextAd]
  
  def withPath1(path1: String): ExpandedTextAdBuilder[ExpandedTextAd]
  
  def withPath2(path2: String): ExpandedTextAdBuilder[ExpandedTextAd]
}
object ExpandedTextAdBuilder {
  
  @scala.inline
  def apply[ExpandedTextAd](
    build: () => AdWordsOperation[ExpandedTextAdBuilder[ExpandedTextAd]],
    withCustomParameters: js.Object => ExpandedTextAdBuilder[ExpandedTextAd],
    withDescription: String => ExpandedTextAdBuilder[ExpandedTextAd],
    withFinalUrl: String => ExpandedTextAdBuilder[ExpandedTextAd],
    withHeadlinePart1: String => ExpandedTextAdBuilder[ExpandedTextAd],
    withHeadlinePart2: String => ExpandedTextAdBuilder[ExpandedTextAd],
    withMobileFinalUrl: String => ExpandedTextAdBuilder[ExpandedTextAd],
    withPath1: String => ExpandedTextAdBuilder[ExpandedTextAd],
    withPath2: String => ExpandedTextAdBuilder[ExpandedTextAd],
    withTrackingTemplate: String => ExpandedTextAdBuilder[ExpandedTextAd]
  ): ExpandedTextAdBuilder[ExpandedTextAd] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withCustomParameters = js.Any.fromFunction1(withCustomParameters), withDescription = js.Any.fromFunction1(withDescription), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withHeadlinePart1 = js.Any.fromFunction1(withHeadlinePart1), withHeadlinePart2 = js.Any.fromFunction1(withHeadlinePart2), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl), withPath1 = js.Any.fromFunction1(withPath1), withPath2 = js.Any.fromFunction1(withPath2), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
    __obj.asInstanceOf[ExpandedTextAdBuilder[ExpandedTextAd]]
  }
  
  @scala.inline
  implicit class ExpandedTextAdBuilderMutableBuilder[Self <: ExpandedTextAdBuilder[?], ExpandedTextAd] (val x: Self & ExpandedTextAdBuilder[ExpandedTextAd]) extends AnyVal {
    
    @scala.inline
    def setWithDescription(value: String => ExpandedTextAdBuilder[ExpandedTextAd]): Self = StObject.set(x, "withDescription", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithHeadlinePart1(value: String => ExpandedTextAdBuilder[ExpandedTextAd]): Self = StObject.set(x, "withHeadlinePart1", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithHeadlinePart2(value: String => ExpandedTextAdBuilder[ExpandedTextAd]): Self = StObject.set(x, "withHeadlinePart2", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithPath1(value: String => ExpandedTextAdBuilder[ExpandedTextAd]): Self = StObject.set(x, "withPath1", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithPath2(value: String => ExpandedTextAdBuilder[ExpandedTextAd]): Self = StObject.set(x, "withPath2", js.Any.fromFunction1(value))
  }
}
