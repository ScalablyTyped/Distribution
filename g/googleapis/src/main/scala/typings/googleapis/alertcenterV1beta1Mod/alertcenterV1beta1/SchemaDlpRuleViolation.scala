package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDlpRuleViolation extends StObject {
  
  /**
    * Details about the violated DLP rule. Admins can use the predefined detectors provided by Google Cloud DLP https://cloud.google.com/dlp/ when setting up a DLP rule. Matched Cloud DLP detectors in this violation if any will be captured in the MatchInfo.predefined_detector.
    */
  var ruleViolationInfo: js.UndefOr[SchemaRuleViolationInfo] = js.undefined
}
object SchemaDlpRuleViolation {
  
  inline def apply(): SchemaDlpRuleViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDlpRuleViolation]
  }
  
  extension [Self <: SchemaDlpRuleViolation](x: Self) {
    
    inline def setRuleViolationInfo(value: SchemaRuleViolationInfo): Self = StObject.set(x, "ruleViolationInfo", value.asInstanceOf[js.Any])
    
    inline def setRuleViolationInfoUndefined: Self = StObject.set(x, "ruleViolationInfo", js.undefined)
  }
}
