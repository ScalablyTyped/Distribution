package typings.fbjs

import typings.fbjs.anon.PageX
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object touchEventUtilsMod {
  
  @JSImport("fbjs/lib/TouchEventUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Utility function for common case of extracting out the primary touch from a
    * touch event.
    * - `touchEnd` events usually do not have the `touches` property.
    *   https://stackoverflow.com/questions/3666929/
    *   mobile-sarai-touchend-event-not-firing-when-last-touch-is-removed
    */
  inline def extractSingleTouch(nativeEvent: Event): PageX | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("extractSingleTouch")(nativeEvent.asInstanceOf[js.Any]).asInstanceOf[PageX | Null]
}
