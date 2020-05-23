package typings.googleGax.anon

import typings.googleGax.pathTemplateMod.Segment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Segments extends js.Object {
  var segments: js.Array[Segment]
  var size: Double
}

object Segments {
  @scala.inline
  def apply(segments: js.Array[Segment], size: Double): Segments = {
    val __obj = js.Dynamic.literal(segments = segments.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Segments]
  }
}

