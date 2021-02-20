package typings.gatsbyTransformerRemark

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Absolute extends StObject {
    
    var absolute: js.UndefOr[Boolean] = js.native
    
    var heading: js.UndefOr[Null | String] = js.native
    
    var maxDepth: js.UndefOr[Double] = js.native
    
    var pathToSlugField: js.UndefOr[String] = js.native
  }
  object Absolute {
    
    @scala.inline
    def apply(): Absolute = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Absolute]
    }
    
    @scala.inline
    implicit class AbsoluteMutableBuilder[Self <: Absolute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
      
      @scala.inline
      def setHeading(value: String): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadingNull: Self = StObject.set(x, "heading", null)
      
      @scala.inline
      def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
      
      @scala.inline
      def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
      
      @scala.inline
      def setPathToSlugField(value: String): Self = StObject.set(x, "pathToSlugField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathToSlugFieldUndefined: Self = StObject.set(x, "pathToSlugField", js.undefined)
    }
  }
}
