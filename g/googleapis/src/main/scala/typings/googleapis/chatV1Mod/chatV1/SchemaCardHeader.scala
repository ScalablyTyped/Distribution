package typings.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCardHeader extends js.Object {
  /**
    * The image&#39;s type (e.g. square border or circular border).
    */
  var imageStyle: js.UndefOr[String] = js.native
  /**
    * The URL of the image in the card header.
    */
  var imageUrl: js.UndefOr[String] = js.native
  /**
    * The subtitle of the card header.
    */
  var subtitle: js.UndefOr[String] = js.native
  /**
    * The title must be specified. The header has a fixed height: if both a
    * title and subtitle is specified, each will take up 1 line. If only the
    * title is specified, it will take up both lines.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaCardHeader {
  @scala.inline
  def apply(imageStyle: String = null, imageUrl: String = null, subtitle: String = null, title: String = null): SchemaCardHeader = {
    val __obj = js.Dynamic.literal()
    if (imageStyle != null) __obj.updateDynamic("imageStyle")(imageStyle.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCardHeader]
  }
}

