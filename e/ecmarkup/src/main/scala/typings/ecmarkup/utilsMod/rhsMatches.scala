package typings.ecmarkup.utilsMod

import typings.grammarkdown.mod.OneOfList
import typings.grammarkdown.mod.RightHandSide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecmarkup/lib/lint/utils", "rhsMatches")
@js.native
object rhsMatches extends js.Object {
  def apply(a: OneOfList, b: OneOfList): Boolean = js.native
  def apply(a: OneOfList, b: RightHandSide): Boolean = js.native
  def apply(a: RightHandSide, b: OneOfList): Boolean = js.native
  def apply(a: RightHandSide, b: RightHandSide): Boolean = js.native
}

