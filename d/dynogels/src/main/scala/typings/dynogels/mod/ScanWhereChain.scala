package typings.dynogels.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScanWhereChain extends ExtendedChain[Scan] {
  def notNull(): Scan
}

object ScanWhereChain {
  @scala.inline
  def apply(
    beginsWith: js.Any => Scan,
    between: (js.Any, js.Any) => Scan,
    contains: js.Any => Scan,
    eq: js.Any => Scan,
    equals: js.Any => Scan,
    exists: () => Scan,
    gt: js.Any => Scan,
    gte: js.Any => Scan,
    in: js.Array[_] => Scan,
    lt: js.Any => Scan,
    lte: js.Any => Scan,
    ne: js.Any => Scan,
    notContains: js.Any => Scan,
    notNull: () => Scan,
    `null`: () => Scan
  ): ScanWhereChain = {
    val __obj = js.Dynamic.literal(beginsWith = js.Any.fromFunction1(beginsWith), between = js.Any.fromFunction2(between), contains = js.Any.fromFunction1(contains), eq = js.Any.fromFunction1(eq), equals = js.Any.fromFunction1(equals), exists = js.Any.fromFunction0(exists), gt = js.Any.fromFunction1(gt), gte = js.Any.fromFunction1(gte), in = js.Any.fromFunction1(in), lt = js.Any.fromFunction1(lt), lte = js.Any.fromFunction1(lte), ne = js.Any.fromFunction1(ne), notContains = js.Any.fromFunction1(notContains), notNull = js.Any.fromFunction0(notNull))
    __obj.updateDynamic("null")(js.Any.fromFunction0(`null`))
    __obj.asInstanceOf[ScanWhereChain]
  }
}

