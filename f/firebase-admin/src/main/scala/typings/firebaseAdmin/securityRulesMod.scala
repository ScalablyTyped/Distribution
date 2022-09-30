package typings.firebaseAdmin

import typings.firebaseAdmin.coreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object securityRulesMod {
  
  @JSImport("firebase-admin/lib/security-rules", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/security-rules", "Ruleset")
  @js.native
  open class Ruleset ()
    extends typings.firebaseAdmin.securityRulesSecurityRulesMod.Ruleset
  
  @JSImport("firebase-admin/lib/security-rules", "RulesetMetadataList")
  @js.native
  open class RulesetMetadataList ()
    extends typings.firebaseAdmin.securityRulesSecurityRulesMod.RulesetMetadataList
  
  @JSImport("firebase-admin/lib/security-rules", "SecurityRules")
  @js.native
  open class SecurityRules ()
    extends typings.firebaseAdmin.securityRulesSecurityRulesMod.SecurityRules
  /* static members */
  object SecurityRules {
    
    @JSImport("firebase-admin/lib/security-rules", "SecurityRules.CLOUD_FIRESTORE")
    @js.native
    val CLOUD_FIRESTORE: Any = js.native
    
    @JSImport("firebase-admin/lib/security-rules", "SecurityRules.FIREBASE_STORAGE")
    @js.native
    val FIREBASE_STORAGE: Any = js.native
  }
  
  inline def getSecurityRules(): typings.firebaseAdmin.securityRulesSecurityRulesMod.SecurityRules = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecurityRules")().asInstanceOf[typings.firebaseAdmin.securityRulesSecurityRulesMod.SecurityRules]
  inline def getSecurityRules(app: App): typings.firebaseAdmin.securityRulesSecurityRulesMod.SecurityRules = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecurityRules")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAdmin.securityRulesSecurityRulesMod.SecurityRules]
}
