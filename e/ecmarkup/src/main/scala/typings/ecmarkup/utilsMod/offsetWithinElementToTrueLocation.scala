package typings.ecmarkup.utilsMod

import typings.ecmarkup.anon.Column
import typings.std.Element
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecmarkup/lib/lint/utils", "offsetWithinElementToTrueLocation")
@js.native
object offsetWithinElementToTrueLocation extends js.Object {
  def apply(
    elementLoc: ReturnType[js.Function2[/* dom */ _, /* node */ Element, ElementLocation]],
    string: String,
    offset: Double
  ): Column = js.native
}

