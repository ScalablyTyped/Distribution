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
    val __obj = js.Dynamic.literal(beginsWith = beginsWith, between = between, contains = contains, eq = eq, equals = equals, exists = exists, gt = gt, gte = gte, in = in, lt = lt, lte = lte, ne = ne, notContains = notContains, notNull = notNull)
    __obj.updateDynamic("null")(`null`)
    __obj.asInstanceOf[ScanWhereChain]
  }
}

