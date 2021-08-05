package typings.fullpageJs

import typings.fullpageJs.fullpageJsStrings.cover
import typings.fullpageJs.fullpageJsStrings.reveal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FadeBackground extends StObject {
    
    /**
      * @default true
      */
    var fadeBackground: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var fadeContent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default 100
      */
    var perspective: js.UndefOr[Double] = js.undefined
  }
  object FadeBackground {
    
    inline def apply(): FadeBackground = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FadeBackground]
    }
    
    extension [Self <: FadeBackground](x: Self) {
      
      inline def setFadeBackground(value: Boolean): Self = StObject.set(x, "fadeBackground", value.asInstanceOf[js.Any])
      
      inline def setFadeBackgroundUndefined: Self = StObject.set(x, "fadeBackground", js.undefined)
      
      inline def setFadeContent(value: Boolean): Self = StObject.set(x, "fadeContent", value.asInstanceOf[js.Any])
      
      inline def setFadeContentUndefined: Self = StObject.set(x, "fadeContent", js.undefined)
      
      inline def setPerspective(value: Double): Self = StObject.set(x, "perspective", value.asInstanceOf[js.Any])
      
      inline def setPerspectiveUndefined: Self = StObject.set(x, "perspective", js.undefined)
    }
  }
  
  trait Percentage extends StObject {
    
    var percentage: js.UndefOr[Double] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[cover | reveal] = js.undefined
  }
  object Percentage {
    
    inline def apply(): Percentage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Percentage]
    }
    
    extension [Self <: Percentage](x: Self) {
      
      inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      
      inline def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setType(value: cover | reveal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ToSections extends StObject {
    
    /**
      * Extension of fullpage.js. Requires fullpage.js >= 2.8.5.
      * Turns horizontal slides into vertical sections.
      */
    def toSections(): Unit
    
    /**
      * Extension of fullpage.js. Requires fullpage.js >= 2.8.5.
      * Turns back the original slides (now converted into
      * vertical sections) into horizontal slides again.
      */
    def toSlides(): Unit
  }
  object ToSections {
    
    inline def apply(toSections: () => Unit, toSlides: () => Unit): ToSections = {
      val __obj = js.Dynamic.literal(toSections = js.Any.fromFunction0(toSections), toSlides = js.Any.fromFunction0(toSlides))
      __obj.asInstanceOf[ToSections]
    }
    
    extension [Self <: ToSections](x: Self) {
      
      inline def setToSections(value: () => Unit): Self = StObject.set(x, "toSections", js.Any.fromFunction0(value))
      
      inline def setToSlides(value: () => Unit): Self = StObject.set(x, "toSlides", js.Any.fromFunction0(value))
    }
  }
}
