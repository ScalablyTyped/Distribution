package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundImage extends js.Object {
  /** Defines how to align the background image over the diagram area.
    * @Default {ej.datavisualization.Diagram.ImageAlignment.XMidYMid}
    */
  var alignment: js.UndefOr[ImageAlignment | String] = js.undefined
}

object BackgroundImage {
  @scala.inline
  def apply(alignment: ImageAlignment | String = null): BackgroundImage = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundImage]
  }
}

