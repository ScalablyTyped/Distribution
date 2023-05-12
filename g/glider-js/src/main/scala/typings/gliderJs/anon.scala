package typings.gliderJs

import typings.gliderJs.gliderJsStrings.`glider-add`
import typings.gliderJs.gliderJsStrings.`glider-animated`
import typings.gliderJs.gliderJsStrings.`glider-destroy`
import typings.gliderJs.gliderJsStrings.`glider-loaded`
import typings.gliderJs.gliderJsStrings.`glider-refresh`
import typings.gliderJs.gliderJsStrings.`glider-remove`
import typings.gliderJs.gliderJsStrings.`glider-slide-hidden`
import typings.gliderJs.gliderJsStrings.`glider-slide-visible`
import typings.gliderJs.gliderJsStrings.arrow
import typings.gliderJs.gliderJsStrings.dot
import typings.gliderJs.gliderJsStrings.slide
import typings.gliderJs.mod.Arrow
import typings.gliderJs.mod.Glider
import typings.gliderJs.mod.GliderEvent
import typings.gliderJs.mod.Selector
import typings.gliderJs.mod.global.HTMLElement
import typings.std.AddEventListenerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined glider-js.glider-js.<global>.HTMLElement & {  _glider :glider-js.glider-js.Glider<glider-js.glider-js.<global>.HTMLElement> | undefined} */
  @js.native
  trait HTMLElementgliderGliderHT extends StObject {
    
    var _glider: js.UndefOr[Glider[HTMLElement]] = js.native
    
    @JSName("addEventListener")
    def addEventListener_glideradd(`type`: `glider-add`, listener: js.Function1[/* event */ GliderEvent[Scroll], Unit]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_glideradd(
      `type`: `glider-add`,
      listener: js.Function1[/* event */ GliderEvent[Scroll], Unit],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_glideradd(
      `type`: `glider-add`,
      listener: js.Function1[/* event */ GliderEvent[Scroll], Unit],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_glideranimated(`type`: `glider-animated`, listener: js.Function1[/* event */ GliderEvent[Type], Unit]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_glideranimated(
      `type`: `glider-animated`,
      listener: js.Function1[/* event */ GliderEvent[Type], Unit],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_glideranimated(
      `type`: `glider-animated`,
      listener: js.Function1[/* event */ GliderEvent[Type], Unit],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gliderdestroy(`type`: `glider-destroy`, listener: js.Function1[/* event */ GliderEvent[Unit], Unit]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gliderdestroy(
      `type`: `glider-destroy`,
      listener: js.Function1[/* event */ GliderEvent[Unit], Unit],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gliderdestroy(
      `type`: `glider-destroy`,
      listener: js.Function1[/* event */ GliderEvent[Unit], Unit],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gliderloaded(`type`: `glider-loaded`, listener: js.Function1[/* event */ GliderEvent[Unit], Unit]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gliderloaded(
      `type`: `glider-loaded`,
      listener: js.Function1[/* event */ GliderEvent[Unit], Unit],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gliderloaded(
      `type`: `glider-loaded`,
      listener: js.Function1[/* event */ GliderEvent[Unit], Unit],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gliderrefresh(`type`: `glider-refresh`, listener: js.Function1[/* event */ GliderEvent[Unit], Unit]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gliderrefresh(
      `type`: `glider-refresh`,
      listener: js.Function1[/* event */ GliderEvent[Unit], Unit],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gliderrefresh(
      `type`: `glider-refresh`,
      listener: js.Function1[/* event */ GliderEvent[Unit], Unit],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gliderremove(`type`: `glider-remove`, listener: js.Function1[/* event */ GliderEvent[Unit], Unit]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gliderremove(
      `type`: `glider-remove`,
      listener: js.Function1[/* event */ GliderEvent[Unit], Unit],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gliderremove(
      `type`: `glider-remove`,
      listener: js.Function1[/* event */ GliderEvent[Unit], Unit],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gliderslidehidden(`type`: `glider-slide-hidden`, listener: js.Function1[/* event */ GliderEvent[Slide], Unit]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gliderslidehidden(
      `type`: `glider-slide-hidden`,
      listener: js.Function1[/* event */ GliderEvent[Slide], Unit],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gliderslidehidden(
      `type`: `glider-slide-hidden`,
      listener: js.Function1[/* event */ GliderEvent[Slide], Unit],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gliderslidevisible(`type`: `glider-slide-visible`, listener: js.Function1[/* event */ GliderEvent[Slide], Unit]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gliderslidevisible(
      `type`: `glider-slide-visible`,
      listener: js.Function1[/* event */ GliderEvent[Slide], Unit],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gliderslidevisible(
      `type`: `glider-slide-visible`,
      listener: js.Function1[/* event */ GliderEvent[Slide], Unit],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    @JSName("removeEventListener")
    def removeEventListener_glideradd(`type`: `glider-add`, listener: js.Function1[/* event */ GliderEvent[Scroll], Unit]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_glideradd(
      `type`: `glider-add`,
      listener: js.Function1[/* event */ GliderEvent[Scroll], Unit],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_glideradd(
      `type`: `glider-add`,
      listener: js.Function1[/* event */ GliderEvent[Scroll], Unit],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_glideranimated(`type`: `glider-animated`, listener: js.Function1[/* event */ GliderEvent[Type], Unit]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_glideranimated(
      `type`: `glider-animated`,
      listener: js.Function1[/* event */ GliderEvent[Type], Unit],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_glideranimated(
      `type`: `glider-animated`,
      listener: js.Function1[/* event */ GliderEvent[Type], Unit],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gliderdestroy(`type`: `glider-destroy`, listener: js.Function1[/* event */ GliderEvent[Unit], Unit]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gliderdestroy(
      `type`: `glider-destroy`,
      listener: js.Function1[/* event */ GliderEvent[Unit], Unit],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gliderdestroy(
      `type`: `glider-destroy`,
      listener: js.Function1[/* event */ GliderEvent[Unit], Unit],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gliderloaded(`type`: `glider-loaded`, listener: js.Function1[/* event */ GliderEvent[Unit], Unit]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gliderloaded(
      `type`: `glider-loaded`,
      listener: js.Function1[/* event */ GliderEvent[Unit], Unit],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gliderloaded(
      `type`: `glider-loaded`,
      listener: js.Function1[/* event */ GliderEvent[Unit], Unit],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gliderrefresh(`type`: `glider-refresh`, listener: js.Function1[/* event */ GliderEvent[Unit], Unit]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gliderrefresh(
      `type`: `glider-refresh`,
      listener: js.Function1[/* event */ GliderEvent[Unit], Unit],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gliderrefresh(
      `type`: `glider-refresh`,
      listener: js.Function1[/* event */ GliderEvent[Unit], Unit],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gliderremove(`type`: `glider-remove`, listener: js.Function1[/* event */ GliderEvent[Unit], Unit]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gliderremove(
      `type`: `glider-remove`,
      listener: js.Function1[/* event */ GliderEvent[Unit], Unit],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gliderremove(
      `type`: `glider-remove`,
      listener: js.Function1[/* event */ GliderEvent[Unit], Unit],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gliderslidehidden(`type`: `glider-slide-hidden`, listener: js.Function1[/* event */ GliderEvent[Slide], Unit]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gliderslidehidden(
      `type`: `glider-slide-hidden`,
      listener: js.Function1[/* event */ GliderEvent[Slide], Unit],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gliderslidehidden(
      `type`: `glider-slide-hidden`,
      listener: js.Function1[/* event */ GliderEvent[Slide], Unit],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gliderslidevisible(`type`: `glider-slide-visible`, listener: js.Function1[/* event */ GliderEvent[Slide], Unit]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gliderslidevisible(
      `type`: `glider-slide-visible`,
      listener: js.Function1[/* event */ GliderEvent[Slide], Unit],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gliderslidevisible(
      `type`: `glider-slide-visible`,
      listener: js.Function1[/* event */ GliderEvent[Slide], Unit],
      options: AddEventListenerOptions
    ): Unit = js.native
  }
  
  trait Next extends StObject {
    
    var next: Selector | Null
    
    var prev: Selector | Null
  }
  object Next {
    
    inline def apply(): Next = {
      val __obj = js.Dynamic.literal(next = null, prev = null)
      __obj.asInstanceOf[Next]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Next] (val x: Self) extends AnyVal {
      
      inline def setNext(value: Selector): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextNull: Self = StObject.set(x, "next", null)
      
      inline def setPrev(value: Selector): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setPrevNull: Self = StObject.set(x, "prev", null)
    }
  }
  
  trait Prev extends StObject {
    
    var next: js.UndefOr[Arrow] = js.undefined
    
    var prev: js.UndefOr[Arrow] = js.undefined
  }
  object Prev {
    
    inline def apply(): Prev = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Prev]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Prev] (val x: Self) extends AnyVal {
      
      inline def setNext(value: Arrow): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setPrev(value: Arrow): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
    }
  }
  
  trait Scroll extends StObject {
    
    def scroll(): Unit
  }
  object Scroll {
    
    inline def apply(scroll: () => Unit): Scroll = {
      val __obj = js.Dynamic.literal(scroll = js.Any.fromFunction0(scroll))
      __obj.asInstanceOf[Scroll]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Scroll] (val x: Self) extends AnyVal {
      
      inline def setScroll(value: () => Unit): Self = StObject.set(x, "scroll", js.Any.fromFunction0(value))
    }
  }
  
  trait Slide extends StObject {
    
    var slide: Double
  }
  object Slide {
    
    inline def apply(slide: Double): Slide = {
      val __obj = js.Dynamic.literal(slide = slide.asInstanceOf[js.Any])
      __obj.asInstanceOf[Slide]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Slide] (val x: Self) extends AnyVal {
      
      inline def setSlide(value: Double): Self = StObject.set(x, "slide", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var `type`: arrow | dot | slide
    
    var value: String | Double
  }
  object Type {
    
    inline def apply(`type`: arrow | dot | slide, value: String | Double): Type = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      inline def setType(value: arrow | dot | slide): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
