package typings.findProjectRoot

import typings.findProjectRoot.findProjectRootInts.`9`
import typings.findProjectRoot.findProjectRootStrings.Dotgit
import typings.findProjectRoot.findProjectRootStrings.Dothg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(path: String): Null | String = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[Null | String]
  inline def apply(path: String, options: Options): Null | String = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Null | String]
  
  @JSImport("find-project-root", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("find-project-root", "MARKERS")
  @js.native
  val MARKERS: js.Tuple2[Dotgit, Dothg] = js.native
  
  @JSImport("find-project-root", "MAX_DEPTH")
  @js.native
  val MAX_DEPTH: `9` = js.native
  
  trait Options extends StObject {
    
    /**
      * markers that it will search for
      */
    var markers: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * total number of levels the algorithm can traverse
      */
    var maxDepth: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setMarkers(value: js.Array[String]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
      
      inline def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
      
      inline def setMarkersVarargs(value: String*): Self = StObject.set(x, "markers", js.Array(value*))
      
      inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      inline def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
    }
  }
}
