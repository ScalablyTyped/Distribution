package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WebExtEventBase[TAddListener /* <: js.Function1[/* repeated */js.Any, _] */, TCallback] extends js.Object {
  var addListener: TAddListener
  def hasListener(cb: TCallback): scala.Boolean
  def removeListener(cb: TCallback): scala.Unit
}

