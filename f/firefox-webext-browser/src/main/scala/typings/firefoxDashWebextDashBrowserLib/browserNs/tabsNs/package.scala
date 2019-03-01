package typings
package firefoxDashWebextDashBrowserLib.browserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tabsNs {
  type _TabsOnUpdatedEvent[T] = firefoxDashWebextDashBrowserLib.WebExtEventBase[
    js.Function2[/* callback */ T, /* filter */ js.UndefOr[UpdateFilter], scala.Unit], 
    T
  ]
}
