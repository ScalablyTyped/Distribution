package typings
package easyDashXDashHeadersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Charsets extends js.Object {
  var charsets: easyDashXDashHeadersLib.mimeMod.Charsets
  def define(mimes: js.Object): scala.Unit
  def extension(mime: java.lang.String): java.lang.String
  def load(filepath: java.lang.String): scala.Unit
  def lookup(path: java.lang.String): java.lang.String
}

object Anon_Charsets {
  @scala.inline
  def apply(
    charsets: easyDashXDashHeadersLib.mimeMod.Charsets,
    define: js.Function1[js.Object, scala.Unit],
    extension: js.Function1[java.lang.String, java.lang.String],
    load: js.Function1[java.lang.String, scala.Unit],
    lookup: js.Function1[java.lang.String, java.lang.String]
  ): Anon_Charsets = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("charsets")(charsets)
    __obj.updateDynamic("define")(define)
    __obj.updateDynamic("extension")(extension)
    __obj.updateDynamic("load")(load)
    __obj.updateDynamic("lookup")(lookup)
    __obj.asInstanceOf[Anon_Charsets]
  }
}

