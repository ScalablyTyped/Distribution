package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Device display information.
  */
trait SchemaDisplay extends StObject {
  
  /**
    * Display density expressed as dots-per-inch.
    */
  var density: js.UndefOr[Double] = js.undefined
  
  /**
    * Unique display id.
    */
  var displayId: js.UndefOr[Double] = js.undefined
  
  /**
    * Display height in pixels.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Name of the display.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Refresh rate of the display in frames per second.
    */
  var refreshRate: js.UndefOr[Double] = js.undefined
  
  /**
    * State of the display.
    */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * Display width in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object SchemaDisplay {
  
  @scala.inline
  def apply(): SchemaDisplay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisplay]
  }
  
  @scala.inline
  implicit class SchemaDisplayMutableBuilder[Self <: SchemaDisplay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDensityUndefined: Self = StObject.set(x, "density", js.undefined)
    
    @scala.inline
    def setDisplayId(value: Double): Self = StObject.set(x, "displayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayIdUndefined: Self = StObject.set(x, "displayId", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRefreshRate(value: Double): Self = StObject.set(x, "refreshRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshRateUndefined: Self = StObject.set(x, "refreshRate", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
