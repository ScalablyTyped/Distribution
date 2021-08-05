package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPathOptions
  extends StObject
     with IObjectOptions {
  
  /**
    * Array of path points
    */
  var path: js.UndefOr[js.Array[Point]] = js.undefined
}
object IPathOptions {
  
  inline def apply(): IPathOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPathOptions]
  }
  
  extension [Self <: IPathOptions](x: Self) {
    
    inline def setPath(value: js.Array[Point]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPathVarargs(value: Point*): Self = StObject.set(x, "path", js.Array(value :_*))
  }
}
