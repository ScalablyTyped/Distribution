package typings.eggDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PathType extends js.Object {
  var path: String
  var `type`: String
}

object Anon_PathType {
  @scala.inline
  def apply(path: String, `type`: String): Anon_PathType = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PathType]
  }
}

