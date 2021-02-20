package typings.fullpageJs

import typings.fullpageJs.fullpageJsStrings.cover
import typings.fullpageJs.fullpageJsStrings.reveal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FadeBackground extends StObject {
    
    /**
      * @default true
      */
    var fadeBackground: js.UndefOr[Boolean] = js.native
    
    /**
      * @default true
      */
    var fadeContent: js.UndefOr[Boolean] = js.native
    
    /**
      * @default 100
      */
    var perspective: js.UndefOr[Double] = js.native
  }
  object FadeBackground {
    
    @scala.inline
    def apply(): FadeBackground = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FadeBackground]
    }
    
    @scala.inline
    implicit class FadeBackgroundMutableBuilder[Self <: FadeBackground] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFadeBackground(value: Boolean): Self = StObject.set(x, "fadeBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFadeBackgroundUndefined: Self = StObject.set(x, "fadeBackground", js.undefined)
      
      @scala.inline
      def setFadeContent(value: Boolean): Self = StObject.set(x, "fadeContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFadeContentUndefined: Self = StObject.set(x, "fadeContent", js.undefined)
      
      @scala.inline
      def setPerspective(value: Double): Self = StObject.set(x, "perspective", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerspectiveUndefined: Self = StObject.set(x, "perspective", js.undefined)
    }
  }
  
  @js.native
  trait Percentage extends StObject {
    
    var percentage: js.UndefOr[Double] = js.native
    
    var property: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[cover | reveal] = js.native
  }
  object Percentage {
    
    @scala.inline
    def apply(): Percentage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Percentage]
    }
    
    @scala.inline
    implicit class PercentageMutableBuilder[Self <: Percentage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      @scala.inline
      def setType(value: cover | reveal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ToSections extends StObject {
    
    /**
      * Extension of fullpage.js. Requires fullpage.js >= 2.8.5.
      * Turns horizontal slides into vertical sections.
      */
    def toSections(): Unit = js.native
    
    /**
      * Extension of fullpage.js. Requires fullpage.js >= 2.8.5.
      * Turns back the original slides (now converted into
      * vertical sections) into horizontal slides again.
      */
    def toSlides(): Unit = js.native
  }
  object ToSections {
    
    @scala.inline
    def apply(toSections: () => Unit, toSlides: () => Unit): ToSections = {
      val __obj = js.Dynamic.literal(toSections = js.Any.fromFunction0(toSections), toSlides = js.Any.fromFunction0(toSlides))
      __obj.asInstanceOf[ToSections]
    }
    
    @scala.inline
    implicit class ToSectionsMutableBuilder[Self <: ToSections] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToSections(value: () => Unit): Self = StObject.set(x, "toSections", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSlides(value: () => Unit): Self = StObject.set(x, "toSlides", js.Any.fromFunction0(value))
    }
  }
}
