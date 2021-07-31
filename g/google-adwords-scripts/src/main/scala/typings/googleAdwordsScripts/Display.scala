package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Display extends StObject {
  
  def audiences(): AdWordsSelector[Audience]
  
  def keywords(): AdWordsSelector[DisplayKeyword]
  
  def placements(): AdWordsSelector[Placement]
  
  def topics(): AdWordsSelector[Topic]
}
object Display {
  
  @scala.inline
  def apply(
    audiences: () => AdWordsSelector[Audience],
    keywords: () => AdWordsSelector[DisplayKeyword],
    placements: () => AdWordsSelector[Placement],
    topics: () => AdWordsSelector[Topic]
  ): Display = {
    val __obj = js.Dynamic.literal(audiences = js.Any.fromFunction0(audiences), keywords = js.Any.fromFunction0(keywords), placements = js.Any.fromFunction0(placements), topics = js.Any.fromFunction0(topics))
    __obj.asInstanceOf[Display]
  }
  
  @scala.inline
  implicit class DisplayMutableBuilder[Self <: Display] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudiences(value: () => AdWordsSelector[Audience]): Self = StObject.set(x, "audiences", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKeywords(value: () => AdWordsSelector[DisplayKeyword]): Self = StObject.set(x, "keywords", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlacements(value: () => AdWordsSelector[Placement]): Self = StObject.set(x, "placements", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTopics(value: () => AdWordsSelector[Topic]): Self = StObject.set(x, "topics", js.Any.fromFunction0(value))
  }
}
