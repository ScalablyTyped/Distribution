package typings.findProjectRoot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("find-project-root", JSImport.Namespace)
  @js.native
  def apply(path: String): Null | String = js.native
  @JSImport("find-project-root", JSImport.Namespace)
  @js.native
  def apply(path: String, options: Options): Null | String = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * markers that it will search for
      */
    var markers: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * total number of levels the algorithm can traverse
      */
    var maxDepth: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMarkers(value: js.Array[String]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
      
      @scala.inline
      def setMarkersVarargs(value: String*): Self = StObject.set(x, "markers", js.Array(value :_*))
      
      @scala.inline
      def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
    }
  }
}
