package typings.googleAppsScript.global.GoogleAppsScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("GoogleAppsScript.Maps")
@js.native
object Maps extends js.Object {
  
  /**
    * An enum representing the types of restrictions to avoid when finding directions.
    */
  @js.native
  object Avoid extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Maps.Avoid with Double] = js.native
    
    /* 1 */ val HIGHWAYS: typings.googleAppsScript.GoogleAppsScript.Maps.Avoid.HIGHWAYS with Double = js.native
    
    /* 0 */ val TOLLS: typings.googleAppsScript.GoogleAppsScript.Maps.Avoid.TOLLS with Double = js.native
  }
  
  /**
    * An enum representing the named colors available to use in map images.
    */
  @js.native
  object Color extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Maps.Color with Double] = js.native
    
    /* 0 */ val BLACK: typings.googleAppsScript.GoogleAppsScript.Maps.Color.BLACK with Double = js.native
    
    /* 5 */ val BLUE: typings.googleAppsScript.GoogleAppsScript.Maps.Color.BLUE with Double = js.native
    
    /* 1 */ val BROWN: typings.googleAppsScript.GoogleAppsScript.Maps.Color.BROWN with Double = js.native
    
    /* 6 */ val GRAY: typings.googleAppsScript.GoogleAppsScript.Maps.Color.GRAY with Double = js.native
    
    /* 2 */ val GREEN: typings.googleAppsScript.GoogleAppsScript.Maps.Color.GREEN with Double = js.native
    
    /* 7 */ val ORANGE: typings.googleAppsScript.GoogleAppsScript.Maps.Color.ORANGE with Double = js.native
    
    /* 3 */ val PURPLE: typings.googleAppsScript.GoogleAppsScript.Maps.Color.PURPLE with Double = js.native
    
    /* 8 */ val RED: typings.googleAppsScript.GoogleAppsScript.Maps.Color.RED with Double = js.native
    
    /* 9 */ val WHITE: typings.googleAppsScript.GoogleAppsScript.Maps.Color.WHITE with Double = js.native
    
    /* 4 */ val YELLOW: typings.googleAppsScript.GoogleAppsScript.Maps.Color.YELLOW with Double = js.native
  }
  
  /**
    * An enum representing the format of the map image.
    * See also
    *
    * Google Static Maps API
    */
  @js.native
  object Format extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Maps.Format with Double] = js.native
    
    /* 3 */ val GIF: typings.googleAppsScript.GoogleAppsScript.Maps.Format.GIF with Double = js.native
    
    /* 4 */ val JPG: typings.googleAppsScript.GoogleAppsScript.Maps.Format.JPG with Double = js.native
    
    /* 5 */ val JPG_BASELINE: typings.googleAppsScript.GoogleAppsScript.Maps.Format.JPG_BASELINE with Double = js.native
    
    /* 0 */ val PNG: typings.googleAppsScript.GoogleAppsScript.Maps.Format.PNG with Double = js.native
    
    /* 2 */ val PNG32: typings.googleAppsScript.GoogleAppsScript.Maps.Format.PNG32 with Double = js.native
    
    /* 1 */ val PNG8: typings.googleAppsScript.GoogleAppsScript.Maps.Format.PNG8 with Double = js.native
  }
  
  /**
    * An enum representing the size of a marker added to a map.
    * See also
    *
    * Google Static Maps API
    */
  @js.native
  object MarkerSize extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Maps.MarkerSize with Double] = js.native
    
    /* 1 */ val MID: typings.googleAppsScript.GoogleAppsScript.Maps.MarkerSize.MID with Double = js.native
    
    /* 2 */ val SMALL: typings.googleAppsScript.GoogleAppsScript.Maps.MarkerSize.SMALL with Double = js.native
    
    /* 0 */ val TINY: typings.googleAppsScript.GoogleAppsScript.Maps.MarkerSize.TINY with Double = js.native
  }
  
  /**
    * An enum representing the mode of travel to use when finding directions.
    */
  @js.native
  object Mode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Maps.Mode with Double] = js.native
    
    /* 2 */ val BICYCLING: typings.googleAppsScript.GoogleAppsScript.Maps.Mode.BICYCLING with Double = js.native
    
    /* 0 */ val DRIVING: typings.googleAppsScript.GoogleAppsScript.Maps.Mode.DRIVING with Double = js.native
    
    /* 3 */ val TRANSIT: typings.googleAppsScript.GoogleAppsScript.Maps.Mode.TRANSIT with Double = js.native
    
    /* 1 */ val WALKING: typings.googleAppsScript.GoogleAppsScript.Maps.Mode.WALKING with Double = js.native
  }
  
  /**
    * An enum representing the type of map to render.
    * See also
    *
    * Google Static Maps API
    */
  @js.native
  object Type extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Maps.Type with Double] = js.native
    
    /* 3 */ val HYBRID: typings.googleAppsScript.GoogleAppsScript.Maps.Type.HYBRID with Double = js.native
    
    /* 0 */ val ROADMAP: typings.googleAppsScript.GoogleAppsScript.Maps.Type.ROADMAP with Double = js.native
    
    /* 1 */ val SATELLITE: typings.googleAppsScript.GoogleAppsScript.Maps.Type.SATELLITE with Double = js.native
    
    /* 2 */ val TERRAIN: typings.googleAppsScript.GoogleAppsScript.Maps.Type.TERRAIN with Double = js.native
  }
}
