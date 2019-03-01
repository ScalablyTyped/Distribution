package typings
package easyDashXapiDashSupertestLib.mimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Charsets extends js.Object {
  def lookup(mime: java.lang.String): java.lang.String
}

object Charsets {
  @scala.inline
  def apply(lookup: js.Function1[java.lang.String, java.lang.String]): Charsets = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lookup")(lookup)
    __obj.asInstanceOf[Charsets]
  }
}

