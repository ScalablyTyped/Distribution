package typings.googleGax.pathTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Segment extends js.Object {
  var kind: Double
  var literal: String
}

object Segment {
  @scala.inline
  def apply(kind: Double, literal: String): Segment = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], literal = literal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Segment]
  }
}

