package typings.gliderJs

import typings.gliderJs.gliderJsStrings.arrow
import typings.gliderJs.gliderJsStrings.dot
import typings.gliderJs.gliderJsStrings.slide
import typings.gliderJs.mod.Selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Next extends StObject {
    
    var next: Selector | Null
    
    var prev: Selector | Null
  }
  object Next {
    
    @scala.inline
    def apply(): Next = {
      val __obj = js.Dynamic.literal(next = null, prev = null)
      __obj.asInstanceOf[Next]
    }
    
    @scala.inline
    implicit class NextMutableBuilder[Self <: Next] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNext(value: Selector): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextNull: Self = StObject.set(x, "next", null)
      
      @scala.inline
      def setPrev(value: Selector): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevNull: Self = StObject.set(x, "prev", null)
    }
  }
  
  trait Scroll extends StObject {
    
    def scroll(): Unit
  }
  object Scroll {
    
    @scala.inline
    def apply(scroll: () => Unit): Scroll = {
      val __obj = js.Dynamic.literal(scroll = js.Any.fromFunction0(scroll))
      __obj.asInstanceOf[Scroll]
    }
    
    @scala.inline
    implicit class ScrollMutableBuilder[Self <: Scroll] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScroll(value: () => Unit): Self = StObject.set(x, "scroll", js.Any.fromFunction0(value))
    }
  }
  
  trait Slide extends StObject {
    
    var slide: Double
  }
  object Slide {
    
    @scala.inline
    def apply(slide: Double): Slide = {
      val __obj = js.Dynamic.literal(slide = slide.asInstanceOf[js.Any])
      __obj.asInstanceOf[Slide]
    }
    
    @scala.inline
    implicit class SlideMutableBuilder[Self <: Slide] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSlide(value: Double): Self = StObject.set(x, "slide", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var `type`: arrow | dot | slide
    
    var value: String | Double
  }
  object Type {
    
    @scala.inline
    def apply(`type`: arrow | dot | slide, value: String | Double): Type = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: arrow | dot | slide): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
