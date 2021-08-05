package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMessageSet extends StObject {
  
  var recordMessageSetExt: js.UndefOr[SchemaLivegraphBacktraceRecordInfo] = js.undefined
}
object SchemaMessageSet {
  
  inline def apply(): SchemaMessageSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMessageSet]
  }
  
  extension [Self <: SchemaMessageSet](x: Self) {
    
    inline def setRecordMessageSetExt(value: SchemaLivegraphBacktraceRecordInfo): Self = StObject.set(x, "recordMessageSetExt", value.asInstanceOf[js.Any])
    
    inline def setRecordMessageSetExtUndefined: Self = StObject.set(x, "recordMessageSetExt", js.undefined)
  }
}
