package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLivegraphBacktraceRecordInfoExpInfo extends StObject {
  
  var deletedIns: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaLivegraphBacktraceRecordInfoExpInfo {
  
  inline def apply(): SchemaLivegraphBacktraceRecordInfoExpInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLivegraphBacktraceRecordInfoExpInfo]
  }
  
  extension [Self <: SchemaLivegraphBacktraceRecordInfoExpInfo](x: Self) {
    
    inline def setDeletedIns(value: js.Array[String]): Self = StObject.set(x, "deletedIns", value.asInstanceOf[js.Any])
    
    inline def setDeletedInsUndefined: Self = StObject.set(x, "deletedIns", js.undefined)
    
    inline def setDeletedInsVarargs(value: String*): Self = StObject.set(x, "deletedIns", js.Array(value :_*))
  }
}
