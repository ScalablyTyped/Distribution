package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPolylineOptions
  extends StObject
     with IObjectOptions {
  
  /**
    * Points array
    */
  var points: js.UndefOr[js.Array[Point]] = js.undefined
}
object IPolylineOptions {
  
  @scala.inline
  def apply(): IPolylineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPolylineOptions]
  }
  
  @scala.inline
  implicit class IPolylineOptionsMutableBuilder[Self <: IPolylineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPoints(value: js.Array[Point]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    @scala.inline
    def setPointsVarargs(value: Point*): Self = StObject.set(x, "points", js.Array(value :_*))
  }
}
