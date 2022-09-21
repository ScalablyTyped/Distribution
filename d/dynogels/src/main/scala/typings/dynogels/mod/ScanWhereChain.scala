package typings.dynogels.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanWhereChain
  extends StObject
     with ExtendedChain[Scan] {
  
  def notNull(): Scan
}
object ScanWhereChain {
  
  inline def apply(
    beginsWith: Any => Scan,
    between: (Any, Any) => Scan,
    contains: Any => Scan,
    exists: () => Scan,
    gt: Any => Scan,
    gte: Any => Scan,
    in: js.Array[Any] => Scan,
    lt: Any => Scan,
    lte: Any => Scan,
    notContains: Any => Scan,
    notNull: () => Scan,
    `null`: () => Scan
  ): ScanWhereChain = {
    val __obj = js.Dynamic.literal(beginsWith = js.Any.fromFunction1(beginsWith), between = js.Any.fromFunction2(between), contains = js.Any.fromFunction1(contains), exists = js.Any.fromFunction0(exists), gt = js.Any.fromFunction1(gt), gte = js.Any.fromFunction1(gte), in = js.Any.fromFunction1(in), lt = js.Any.fromFunction1(lt), lte = js.Any.fromFunction1(lte), notContains = js.Any.fromFunction1(notContains), notNull = js.Any.fromFunction0(notNull))
    __obj.updateDynamic("null")(js.Any.fromFunction0(`null`))
    __obj.asInstanceOf[ScanWhereChain]
  }
  
  extension [Self <: ScanWhereChain](x: Self) {
    
    inline def setNotNull(value: () => Scan): Self = StObject.set(x, "notNull", js.Any.fromFunction0(value))
  }
}
