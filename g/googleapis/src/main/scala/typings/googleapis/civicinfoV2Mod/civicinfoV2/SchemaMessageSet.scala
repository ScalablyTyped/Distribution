package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaMessageSet extends StObject {
  
  var recordMessageSetExt: js.UndefOr[SchemaLivegraphBacktraceRecordInfo] = js.native
}
object SchemaMessageSet {
  
  @scala.inline
  def apply(): SchemaMessageSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMessageSet]
  }
  
  @scala.inline
  implicit class SchemaMessageSetMutableBuilder[Self <: SchemaMessageSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecordMessageSetExt(value: SchemaLivegraphBacktraceRecordInfo): Self = StObject.set(x, "recordMessageSetExt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordMessageSetExtUndefined: Self = StObject.set(x, "recordMessageSetExt", js.undefined)
  }
}
