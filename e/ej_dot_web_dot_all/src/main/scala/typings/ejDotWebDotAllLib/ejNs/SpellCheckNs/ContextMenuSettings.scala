package typings
package ejDotWebDotAllLib.ejNs.SpellCheckNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ContextMenuSettings extends js.Object {
  /** When set to true, enables the context menu options available for the SpellCheck.
               * @Default {true}
               */
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  /** Contains all the default context menu options that are applicable for SpellCheck. It also supports adding custom menu items. All the SpellCheck related context menu items are
               * grouped under this menu collection.
               * @Default {{% highlight javascript %}[{ id: IgnoreAll, text: Ignore All },{ id: AddToDictionary, text: Add To Dictionary }]{% endhighlight %}}
               */
  var menuItems: js.UndefOr[js.Array[_]] = js.undefined
}

