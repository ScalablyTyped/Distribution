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
    define: js.Object => scala.Unit,
    extension: java.lang.String => java.lang.String,
    load: java.lang.String => scala.Unit,
    lookup: java.lang.String => java.lang.String
  ): Anon_Charsets = {
    val __obj = js.Dynamic.literal(charsets = charsets, define = js.Any.fromFunction1(define), extension = js.Any.fromFunction1(extension), load = js.Any.fromFunction1(load), lookup = js.Any.fromFunction1(lookup))
  
    __obj.asInstanceOf[Anon_Charsets]
  }
}

