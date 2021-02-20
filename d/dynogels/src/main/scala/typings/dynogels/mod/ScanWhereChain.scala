package typings.dynogels.mod

import org.scalablytyped.runtime.StObject
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
    eq_ : js.Any => Scan,
    equals_ : js.Any => Scan,
    exists: () => Scan,
    gt: js.Any => Scan,
    gte: js.Any => Scan,
    in: js.Array[_] => Scan,
    lt: js.Any => Scan,
    lte: js.Any => Scan,
    ne_ : js.Any => Scan,
    notContains: js.Any => Scan,
    notNull: () => Scan,
    `null`: () => Scan
  ): ScanWhereChain = {
    val __obj = js.Dynamic.literal(beginsWith = js.Any.fromFunction1(beginsWith), between = js.Any.fromFunction2(between), contains = js.Any.fromFunction1(contains), exists = js.Any.fromFunction0(exists), gt = js.Any.fromFunction1(gt), gte = js.Any.fromFunction1(gte), in = js.Any.fromFunction1(in), lt = js.Any.fromFunction1(lt), lte = js.Any.fromFunction1(lte), notContains = js.Any.fromFunction1(notContains), notNull = js.Any.fromFunction0(notNull))
    __obj.updateDynamic("eq")(js.Any.fromFunction1(eq_))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.updateDynamic("ne")(js.Any.fromFunction1(ne_))
    __obj.updateDynamic("null")(js.Any.fromFunction0(`null`))
    __obj.asInstanceOf[ScanWhereChain]
  }
  
  @scala.inline
  implicit class ScanWhereChainMutableBuilder[Self <: ScanWhereChain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotNull(value: () => Scan): Self = StObject.set(x, "notNull", js.Any.fromFunction0(value))
  }
}
