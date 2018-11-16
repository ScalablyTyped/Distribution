package typings
package firefoxDashWebextDashBrowserLib.browserNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Setting extends js.Object {
  /**
           * Fired after the setting changes.
           * @deprecated Unsupported on Firefox at this time.
           */
  var onChange: firefoxDashWebextDashBrowserLib.WebExtEvent[
    js.Function1[/* details */ firefoxDashWebextDashBrowserLib.Anon_LevelOfControl, scala.Unit]
  ]
  /**
           * Clears the setting, restoring any default value.
           * @param details Which setting to clear.
           */
  def clear(details: firefoxDashWebextDashBrowserLib.Anon_Scope): stdLib.Promise[scala.Unit]
  /**
           * Gets the value of a setting.
           * @param details Which setting to consider.
           */
  def get(details: firefoxDashWebextDashBrowserLib.Anon_Incognito): stdLib.Promise[firefoxDashWebextDashBrowserLib.Anon_LevelOfControl]
  /**
           * Sets the value of a setting.
           * @param details Which setting to change.
           */
  def set(details: firefoxDashWebextDashBrowserLib.Anon_ValueScope): stdLib.Promise[scala.Unit]
}

