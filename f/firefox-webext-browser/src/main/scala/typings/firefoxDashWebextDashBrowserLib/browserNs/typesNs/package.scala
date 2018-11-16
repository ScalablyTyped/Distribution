package typings
package firefoxDashWebextDashBrowserLib.browserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesNs {
  /**
       * One of
       *
       * *   `not_controllable`: cannot be controlled by any extension
       * *   `controlled_by_other_extensions`: controlled by extensions with higher precedence
       * *   `controllable_by_this_extension`: can be controlled by this extension
       * *   `controlled_by_this_extension`: controlled by this extension
       */
  type LevelOfControl = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.not_controllable | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.controlled_by_other_extensions | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.controllable_by_this_extension | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.controlled_by_this_extension
  /* types types */
  /**
       * The scope of the Setting. One of
       *
       * *   `regular`: setting for the regular profile (which is inherited by the incognito profile if not overridden
       * elsewhere),
       * *   `regular_only`: setting for the regular profile only (not inherited by the incognito profile),
       * *   `incognito_persistent`: setting for the incognito profile that survives browser restarts (overrides regular
       * preferences),
       * *   `incognito_session_only`: setting for the incognito profile that can only be set during an incognito session
       * and is deleted when the incognito session ends (overrides regular and incognito_persistent preferences).
       *
       * Only `regular` is supported by Firefox at this time.
       */
  type SettingScope = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.regular | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.regular_only | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.incognito_persistent | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.incognito_session_only
}
