package typings.ecmarkup.anon

import typings.grammarkdown.mod.OneOfList
import typings.grammarkdown.mod.RightHandSide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Production extends js.Object {
  var production: typings.grammarkdown.mod.Production
  var rhses: js.Array[RightHandSide | OneOfList]
}

object Production {
  @scala.inline
  def apply(production: typings.grammarkdown.mod.Production, rhses: js.Array[RightHandSide | OneOfList]): Production = {
    val __obj = js.Dynamic.literal(production = production.asInstanceOf[js.Any], rhses = rhses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Production]
  }
}

