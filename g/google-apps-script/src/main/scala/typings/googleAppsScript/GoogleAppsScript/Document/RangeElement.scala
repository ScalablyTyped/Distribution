package typings.googleAppsScript.GoogleAppsScript.Document

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A wrapper around an Element with a possible start and end offset. These offsets allow a
  * range of characters within a Text
  * element to be represented in search results, document selections, and named ranges.
  */
trait RangeElement extends StObject {
  
  def getElement(): Element
  
  def getEndOffsetInclusive(): Integer
  
  def getStartOffset(): Integer
  
  def isPartial(): Boolean
}
object RangeElement {
  
  @scala.inline
  def apply(
    getElement: () => Element,
    getEndOffsetInclusive: () => Integer,
    getStartOffset: () => Integer,
    isPartial: () => Boolean
  ): RangeElement = {
    val __obj = js.Dynamic.literal(getElement = js.Any.fromFunction0(getElement), getEndOffsetInclusive = js.Any.fromFunction0(getEndOffsetInclusive), getStartOffset = js.Any.fromFunction0(getStartOffset), isPartial = js.Any.fromFunction0(isPartial))
    __obj.asInstanceOf[RangeElement]
  }
  
  @scala.inline
  implicit class RangeElementMutableBuilder[Self <: RangeElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetElement(value: () => Element): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEndOffsetInclusive(value: () => Integer): Self = StObject.set(x, "getEndOffsetInclusive", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStartOffset(value: () => Integer): Self = StObject.set(x, "getStartOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsPartial(value: () => Boolean): Self = StObject.set(x, "isPartial", js.Any.fromFunction0(value))
  }
}
