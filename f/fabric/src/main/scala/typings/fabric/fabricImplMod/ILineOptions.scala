package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILineOptions
  extends StObject
     with IObjectOptions {
  
  /**
    * x value or first line edge
    */
  var x1: js.UndefOr[Double] = js.undefined
  
  /**
    * x value or second line edge
    */
  var x2: js.UndefOr[Double] = js.undefined
  
  /**
    * y value or first line edge
    */
  var y1: js.UndefOr[Double] = js.undefined
  
  /**
    * y value or second line edge
    */
  var y2: js.UndefOr[Double] = js.undefined
}
object ILineOptions {
  
  @scala.inline
  def apply(): ILineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILineOptions]
  }
  
  @scala.inline
  implicit class ILineOptionsMutableBuilder[Self <: ILineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
    
    @scala.inline
    def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
    
    @scala.inline
    def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
    
    @scala.inline
    def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
  }
}
