package typings.googleapis.cloudbuildV1beta1Mod.cloudbuildV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBuildApproval extends StObject {
  
  /**
    * Output only. Configuration for manual approval of this build.
    */
  var config: js.UndefOr[SchemaApprovalConfig] = js.undefined
  
  /**
    * Output only. Result of manual approval for this Build.
    */
  var result: js.UndefOr[SchemaApprovalResult] = js.undefined
  
  /**
    * Output only. The state of this build's approval.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaBuildApproval {
  
  inline def apply(): SchemaBuildApproval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildApproval]
  }
  
  extension [Self <: SchemaBuildApproval](x: Self) {
    
    inline def setConfig(value: SchemaApprovalConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setResult(value: SchemaApprovalResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
