package typings.googleMaps.global.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * Settings which control the behavior of the Maps JavaScript API as a whole.
  */
@JSGlobal("google.maps.Settings")
@js.native
open class Settings ()
  extends StObject
     with typings.googleMaps.google.maps.Settings {
  
  /**
    * Available only in the v=beta channel: https://goo.gle/3oAthT3.
    * A collection of unique experience IDs to which to attribute Maps JS API
    * calls. The returned value is a copy of the internal value that is stored
    * in the <code>Settings</code> class singleton instance. Operations on
    * <code>google.maps.Settings.getInstance().experienceIds</code> will
    * therefore only modify the copy and not the internal value.<br/><br/>To
    * update the internal value, set the property equal to the new value on the
    * singleton instance (ex:
    * <code>google.maps.Settings.getInstance().experienceIds =
    * [experienceId];</code>).
    */
  /* CompleteClass */
  var experienceIds: js.Iterable[String] = js.native
}
object Settings {
  
  @JSGlobal("google.maps.Settings")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Available only in the v=beta channel: https://goo.gle/3oAthT3.
    * Returns the singleton instance of <code>google.maps.Settings</code>.
    */
  /* static member */
  inline def getInstance(): typings.googleMaps.google.maps.Settings = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[typings.googleMaps.google.maps.Settings]
}
