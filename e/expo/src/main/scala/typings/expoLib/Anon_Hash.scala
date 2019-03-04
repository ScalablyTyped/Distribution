package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hash extends js.Object {
  var hash: java.lang.String
  var height: js.UndefOr[scala.Double] = js.undefined
  var name: java.lang.String
  var `type`: java.lang.String
  var uri: java.lang.String
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Hash {
  @scala.inline
  def apply(
    hash: java.lang.String,
    name: java.lang.String,
    `type`: java.lang.String,
    uri: java.lang.String,
    height: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): Anon_Hash = {
    val __obj = js.Dynamic.literal(hash = hash, name = name, uri = uri)
    __obj.updateDynamic("type")(`type`)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Hash]
  }
}

