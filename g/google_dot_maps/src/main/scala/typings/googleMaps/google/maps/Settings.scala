package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * Settings which control the behavior of the Maps JavaScript API as a whole.
  */
trait Settings extends StObject {
  
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
  var experienceIds: js.Iterable[String]
}
object Settings {
  
  inline def apply(experienceIds: js.Iterable[String]): Settings = {
    val __obj = js.Dynamic.literal(experienceIds = experienceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
    
    inline def setExperienceIds(value: js.Iterable[String]): Self = StObject.set(x, "experienceIds", value.asInstanceOf[js.Any])
  }
}
