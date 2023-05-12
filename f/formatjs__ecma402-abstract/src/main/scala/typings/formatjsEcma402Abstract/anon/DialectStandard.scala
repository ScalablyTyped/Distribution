package typings.formatjsEcma402Abstract.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialectStandard extends StObject {
  
  var dialect: LongRecordNarrowRecord
  
  var standard: LongRecordNarrowRecord
}
object DialectStandard {
  
  inline def apply(dialect: LongRecordNarrowRecord, standard: LongRecordNarrowRecord): DialectStandard = {
    val __obj = js.Dynamic.literal(dialect = dialect.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialectStandard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialectStandard] (val x: Self) extends AnyVal {
    
    inline def setDialect(value: LongRecordNarrowRecord): Self = StObject.set(x, "dialect", value.asInstanceOf[js.Any])
    
    inline def setStandard(value: LongRecordNarrowRecord): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
  }
}
