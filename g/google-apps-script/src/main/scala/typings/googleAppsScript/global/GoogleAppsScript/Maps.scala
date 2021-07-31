package typings.googleAppsScript.global.GoogleAppsScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Maps {
  
  /**
    * An enum representing the types of restrictions to avoid when finding directions.
    */
  @JSGlobal("GoogleAppsScript.Maps.Avoid")
  @js.native
  object Avoid extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Maps.Avoid & Double] = js.native
    
    /* 1 */ val HIGHWAYS: typings.googleAppsScript.GoogleAppsScript.Maps.Avoid.HIGHWAYS & Double = js.native
    
    /* 0 */ val TOLLS: typings.googleAppsScript.GoogleAppsScript.Maps.Avoid.TOLLS & Double = js.native
  }
  
  /**
    * An enum representing the named colors available to use in map images.
    */
  @JSGlobal("GoogleAppsScript.Maps.Color")
  @js.native
  object Color extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Maps.Color & Double] = js.native
    
    /* 0 */ val BLACK: typings.googleAppsScript.GoogleAppsScript.Maps.Color.BLACK & Double = js.native
    
    /* 5 */ val BLUE: typings.googleAppsScript.GoogleAppsScript.Maps.Color.BLUE & Double = js.native
    
    /* 1 */ val BROWN: typings.googleAppsScript.GoogleAppsScript.Maps.Color.BROWN & Double = js.native
    
    /* 6 */ val GRAY: typings.googleAppsScript.GoogleAppsScript.Maps.Color.GRAY & Double = js.native
    
    /* 2 */ val GREEN: typings.googleAppsScript.GoogleAppsScript.Maps.Color.GREEN & Double = js.native
    
    /* 7 */ val ORANGE: typings.googleAppsScript.GoogleAppsScript.Maps.Color.ORANGE & Double = js.native
    
    /* 3 */ val PURPLE: typings.googleAppsScript.GoogleAppsScript.Maps.Color.PURPLE & Double = js.native
    
    /* 8 */ val RED: typings.googleAppsScript.GoogleAppsScript.Maps.Color.RED & Double = js.native
    
    /* 9 */ val WHITE: typings.googleAppsScript.GoogleAppsScript.Maps.Color.WHITE & Double = js.native
    
    /* 4 */ val YELLOW: typings.googleAppsScript.GoogleAppsScript.Maps.Color.YELLOW & Double = js.native
  }
  
  /**
    * An enum representing the format of the map image.
    * See also
    *
    * Google Static Maps API
    */
  @JSGlobal("GoogleAppsScript.Maps.Format")
  @js.native
  object Format extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Maps.Format & Double] = js.native
    
    /* 3 */ val GIF: typings.googleAppsScript.GoogleAppsScript.Maps.Format.GIF & Double = js.native
    
    /* 4 */ val JPG: typings.googleAppsScript.GoogleAppsScript.Maps.Format.JPG & Double = js.native
    
    /* 5 */ val JPG_BASELINE: typings.googleAppsScript.GoogleAppsScript.Maps.Format.JPG_BASELINE & Double = js.native
    
    /* 0 */ val PNG: typings.googleAppsScript.GoogleAppsScript.Maps.Format.PNG & Double = js.native
    
    /* 2 */ val PNG32: typings.googleAppsScript.GoogleAppsScript.Maps.Format.PNG32 & Double = js.native
    
    /* 1 */ val PNG8: typings.googleAppsScript.GoogleAppsScript.Maps.Format.PNG8 & Double = js.native
  }
  
  /**
    * An enum representing the size of a marker added to a map.
    * See also
    *
    * Google Static Maps API
    */
  @JSGlobal("GoogleAppsScript.Maps.MarkerSize")
  @js.native
  object MarkerSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Maps.MarkerSize & Double] = js.native
    
    /* 1 */ val MID: typings.googleAppsScript.GoogleAppsScript.Maps.MarkerSize.MID & Double = js.native
    
    /* 2 */ val SMALL: typings.googleAppsScript.GoogleAppsScript.Maps.MarkerSize.SMALL & Double = js.native
    
    /* 0 */ val TINY: typings.googleAppsScript.GoogleAppsScript.Maps.MarkerSize.TINY & Double = js.native
  }
  
  /**
    * An enum representing the mode of travel to use when finding directions.
    */
  @JSGlobal("GoogleAppsScript.Maps.Mode")
  @js.native
  object Mode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Maps.Mode & Double] = js.native
    
    /* 2 */ val BICYCLING: typings.googleAppsScript.GoogleAppsScript.Maps.Mode.BICYCLING & Double = js.native
    
    /* 0 */ val DRIVING: typings.googleAppsScript.GoogleAppsScript.Maps.Mode.DRIVING & Double = js.native
    
    /* 3 */ val TRANSIT: typings.googleAppsScript.GoogleAppsScript.Maps.Mode.TRANSIT & Double = js.native
    
    /* 1 */ val WALKING: typings.googleAppsScript.GoogleAppsScript.Maps.Mode.WALKING & Double = js.native
  }
  
  /**
    * An enum representing the type of map to render.
    * See also
    *
    * Google Static Maps API
    */
  @JSGlobal("GoogleAppsScript.Maps.Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Maps.Type & Double] = js.native
    
    /* 3 */ val HYBRID: typings.googleAppsScript.GoogleAppsScript.Maps.Type.HYBRID & Double = js.native
    
    /* 0 */ val ROADMAP: typings.googleAppsScript.GoogleAppsScript.Maps.Type.ROADMAP & Double = js.native
    
    /* 1 */ val SATELLITE: typings.googleAppsScript.GoogleAppsScript.Maps.Type.SATELLITE & Double = js.native
    
    /* 2 */ val TERRAIN: typings.googleAppsScript.GoogleAppsScript.Maps.Type.TERRAIN & Double = js.native
  }
}
