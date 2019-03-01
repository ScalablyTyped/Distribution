package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// A hypertext link.
trait Link extends js.Object {
  // The kinds of links.
  var kind: LinkKind
}

object Link {
  @scala.inline
  def apply(kind: LinkKind): Link = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[Link]
  }
}

