package typings
package ejDotWebDotAllLib.ejNs.RibbonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ApplicationTab extends js.Object {
  /** Specifies the ribbon backstage page items.
               * @Default {Object}
               */
  var backstageSettings: js.UndefOr[ApplicationTabBackstageSettings] = js.undefined
  /** Specifies the ID of ul list to create application menu in the ribbon control.
               * @Default {null}
               */
  var menuItemID: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the menu members, events by using the menu settings for the menu in the application tab.
               * @Default {Object}
               */
  var menuSettings: js.UndefOr[js.Any] = js.undefined
  /** Specifies the application menu or backstage page. Specify the type of application tab as &quot;ej.Ribbon.ApplicationTabType.Menu&quot; to render the application menu or
               * &quot;ej.Ribbon.ApplicationTabType.Backstage&quot; to render backstage page in the ribbon control.
               * @Default {ej.Ribbon.ApplicationTabType.Menu}
               */
  var `type`: js.UndefOr[ApplicationTabType | java.lang.String] = js.undefined
}

