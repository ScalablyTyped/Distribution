package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hash extends js.Object {
  var hash: String
  var height: js.UndefOr[Double] = js.undefined
  var name: String
  var `type`: String
  var uri: String
  var width: js.UndefOr[Double] = js.undefined
}

object Anon_Hash {
  @scala.inline
  def apply(
    hash: String,
    name: String,
    `type`: String,
    uri: String,
    height: Int | Double = null,
    width: Int | Double = null
  ): Anon_Hash = {
    val __obj = js.Dynamic.literal(hash = hash, name = name, uri = uri)
    __obj.updateDynamic("type")(`type`)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Hash]
  }
}

