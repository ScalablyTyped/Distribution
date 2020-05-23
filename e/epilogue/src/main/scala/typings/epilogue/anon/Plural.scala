package typings.epilogue.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plural extends js.Object {
  var plural: String
  var singular: String
}

object Plural {
  @scala.inline
  def apply(plural: String, singular: String): Plural = {
    val __obj = js.Dynamic.literal(plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plural]
  }
}

