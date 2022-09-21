package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDisplay extends StObject {
  
  /**
    * Display density expressed as dots-per-inch.
    */
  var density: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Unique display id.
    */
  var displayId: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Display height in pixels.
    */
  var height: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Name of the display.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Refresh rate of the display in frames per second.
    */
  var refreshRate: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * State of the display.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Display width in pixels.
    */
  var width: js.UndefOr[Double | Null] = js.undefined
}
object SchemaDisplay {
  
  inline def apply(): SchemaDisplay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisplay]
  }
  
  extension [Self <: SchemaDisplay](x: Self) {
    
    inline def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    inline def setDensityNull: Self = StObject.set(x, "density", null)
    
    inline def setDensityUndefined: Self = StObject.set(x, "density", js.undefined)
    
    inline def setDisplayId(value: Double): Self = StObject.set(x, "displayId", value.asInstanceOf[js.Any])
    
    inline def setDisplayIdNull: Self = StObject.set(x, "displayId", null)
    
    inline def setDisplayIdUndefined: Self = StObject.set(x, "displayId", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightNull: Self = StObject.set(x, "height", null)
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRefreshRate(value: Double): Self = StObject.set(x, "refreshRate", value.asInstanceOf[js.Any])
    
    inline def setRefreshRateNull: Self = StObject.set(x, "refreshRate", null)
    
    inline def setRefreshRateUndefined: Self = StObject.set(x, "refreshRate", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthNull: Self = StObject.set(x, "width", null)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
