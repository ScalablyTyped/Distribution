package typings.formatjsEcma402Abstract.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dialect extends StObject {
  
  var dialect: LongNarrow
  
  var standard: LongNarrow
}
object Dialect {
  
  inline def apply(dialect: LongNarrow, standard: LongNarrow): Dialect = {
    val __obj = js.Dynamic.literal(dialect = dialect.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dialect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dialect] (val x: Self) extends AnyVal {
    
    inline def setDialect(value: LongNarrow): Self = StObject.set(x, "dialect", value.asInstanceOf[js.Any])
    
    inline def setStandard(value: LongNarrow): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
  }
}
