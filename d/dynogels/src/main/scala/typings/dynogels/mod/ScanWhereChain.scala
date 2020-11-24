package typings.dynogels.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScanWhereChain extends ExtendedChain[Scan] {
  
  def notNull(): Scan = js.native
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
  
  @scala.inline
  implicit class ScanWhereChainOps[Self <: ScanWhereChain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNotNull(value: () => Scan): Self = this.set("notNull", js.Any.fromFunction0(value))
  }
}
