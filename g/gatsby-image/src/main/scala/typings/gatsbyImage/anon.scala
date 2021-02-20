package typings.gatsbyImage

import typings.gatsbyImage.gatsbyImageStrings.`scale-down`
import typings.gatsbyImage.gatsbyImageStrings.contain
import typings.gatsbyImage.gatsbyImageStrings.cover
import typings.gatsbyImage.gatsbyImageStrings.fill
import typings.gatsbyImage.gatsbyImageStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ObjectFit extends StObject {
    
    var objectFit: js.UndefOr[fill | contain | cover | none | `scale-down`] = js.native
    
    var objectPosition: js.UndefOr[String] = js.native
  }
  object ObjectFit {
    
    @scala.inline
    def apply(): ObjectFit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectFit]
    }
    
    @scala.inline
    implicit class ObjectFitMutableBuilder[Self <: ObjectFit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObjectFit(value: fill | contain | cover | none | `scale-down`): Self = StObject.set(x, "objectFit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectFitUndefined: Self = StObject.set(x, "objectFit", js.undefined)
      
      @scala.inline
      def setObjectPosition(value: String): Self = StObject.set(x, "objectPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectPositionUndefined: Self = StObject.set(x, "objectPosition", js.undefined)
    }
  }
  
  @js.native
  trait WasCached extends StObject {
    
    var wasCached: Boolean = js.native
  }
  object WasCached {
    
    @scala.inline
    def apply(wasCached: Boolean): WasCached = {
      val __obj = js.Dynamic.literal(wasCached = wasCached.asInstanceOf[js.Any])
      __obj.asInstanceOf[WasCached]
    }
    
    @scala.inline
    implicit class WasCachedMutableBuilder[Self <: WasCached] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWasCached(value: Boolean): Self = StObject.set(x, "wasCached", value.asInstanceOf[js.Any])
    }
  }
}
