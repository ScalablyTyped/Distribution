package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name
  extends expoLib.expoMod.DocumentPickerNs.Response {
  var name: java.lang.String
  var size: scala.Double
  var `type`: expoLib.expoLibStrings.success
  var uri: java.lang.String
}

object Anon_Name {
  @scala.inline
  def apply(
    name: java.lang.String,
    size: scala.Double,
    `type`: expoLib.expoLibStrings.success,
    uri: java.lang.String
  ): Anon_Name = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[Anon_Name]
  }
}

