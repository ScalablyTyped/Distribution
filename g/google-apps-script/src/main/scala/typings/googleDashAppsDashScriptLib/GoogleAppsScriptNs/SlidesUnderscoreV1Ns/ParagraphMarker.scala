package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// A TextElement kind that represents the beginning of a new paragraph.
trait ParagraphMarker extends js.Object {
  // The bullet for this paragraph. If not present, the paragraph does not
  // belong to a list.
  var bullet: Bullet
  // The paragraph's style
  var style: ParagraphStyle
}

object ParagraphMarker {
  @scala.inline
  def apply(bullet: Bullet, style: ParagraphStyle): ParagraphMarker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bullet")(bullet)
    __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ParagraphMarker]
  }
}

