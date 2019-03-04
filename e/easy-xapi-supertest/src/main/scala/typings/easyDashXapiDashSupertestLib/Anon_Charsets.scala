package typings
package easyDashXapiDashSupertestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Charsets extends js.Object {
  var charsets: easyDashXapiDashSupertestLib.mimeMod.Charsets
  def define(mimes: js.Object): scala.Unit
  def extension(mime: java.lang.String): java.lang.String
  def load(filepath: java.lang.String): scala.Unit
  def lookup(path: java.lang.String): java.lang.String
}

object Anon_Charsets {
  @scala.inline
  def apply(
    charsets: easyDashXapiDashSupertestLib.mimeMod.Charsets,
    define: js.Function1[js.Object, scala.Unit],
    extension: js.Function1[java.lang.String, java.lang.String],
    load: js.Function1[java.lang.String, scala.Unit],
    lookup: js.Function1[java.lang.String, java.lang.String]
  ): Anon_Charsets = {
    val __obj = js.Dynamic.literal(charsets = charsets, define = define, extension = extension, load = load, lookup = lookup)
  
    __obj.asInstanceOf[Anon_Charsets]
  }
}

