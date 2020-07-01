package typings.ecmarkup.utilsMod

import typings.ecmarkup.anon.Column
import typings.std.Element
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecmarkup/lib/lint/utils", "grammarkdownLocationToTrueLocation")
@js.native
object grammarkdownLocationToTrueLocation extends js.Object {
  def apply(
    elementLoc: ReturnType[js.Function2[/* dom */ _, /* node */ Element, ElementLocation]],
    gmdLine: Double,
    gmdCharacter: Double
  ): Column = js.native
}

