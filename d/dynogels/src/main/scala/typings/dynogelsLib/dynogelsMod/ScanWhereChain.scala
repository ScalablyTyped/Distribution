package typings
package dynogelsLib.dynogelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScanWhereChain extends ExtendedChain[Scan] {
  def notNull(): Scan
}

object ScanWhereChain {
  @scala.inline
  def apply(
    beginsWith: js.Function1[js.Any, Scan],
    between: js.Function2[js.Any, js.Any, Scan],
    contains: js.Function1[js.Any, Scan],
    eq: js.Function1[js.Any, Scan],
    equals: js.Function1[js.Any, Scan],
    exists: js.Function0[Scan],
    gt: js.Function1[js.Any, Scan],
    gte: js.Function1[js.Any, Scan],
    in: js.Function1[js.Array[_], Scan],
    lt: js.Function1[js.Any, Scan],
    lte: js.Function1[js.Any, Scan],
    ne: js.Function1[js.Any, Scan],
    notContains: js.Function1[js.Any, Scan],
    notNull: js.Function0[Scan],
    `null`: js.Function0[Scan]
  ): ScanWhereChain = {
    val __obj = js.Dynamic.literal(`null` = `null`)
    __obj.updateDynamic("beginsWith")(beginsWith)
    __obj.updateDynamic("between")(between)
    __obj.updateDynamic("contains")(contains)
    __obj.updateDynamic("eq")(eq)
    __obj.updateDynamic("equals")(equals)
    __obj.updateDynamic("exists")(exists)
    __obj.updateDynamic("gt")(gt)
    __obj.updateDynamic("gte")(gte)
    __obj.updateDynamic("in")(in)
    __obj.updateDynamic("lt")(lt)
    __obj.updateDynamic("lte")(lte)
    __obj.updateDynamic("ne")(ne)
    __obj.updateDynamic("notContains")(notContains)
    __obj.updateDynamic("notNull")(notNull)
    __obj.asInstanceOf[ScanWhereChain]
  }
}

