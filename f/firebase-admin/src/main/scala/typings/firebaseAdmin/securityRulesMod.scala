package typings.firebaseAdmin

import typings.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object securityRulesMod {
  
  @JSImport("firebase-admin/security-rules", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/security-rules", "Ruleset")
  @js.native
  open class Ruleset ()
    extends typings.firebaseAdmin.libSecurityRulesMod.Ruleset
  
  @JSImport("firebase-admin/security-rules", "RulesetMetadataList")
  @js.native
  open class RulesetMetadataList ()
    extends typings.firebaseAdmin.libSecurityRulesMod.RulesetMetadataList
  
  @JSImport("firebase-admin/security-rules", "SecurityRules")
  @js.native
  open class SecurityRules ()
    extends typings.firebaseAdmin.libSecurityRulesMod.SecurityRules
  /* static members */
  object SecurityRules {
    
    @JSImport("firebase-admin/security-rules", "SecurityRules.CLOUD_FIRESTORE")
    @js.native
    val CLOUD_FIRESTORE: Any = js.native
    
    @JSImport("firebase-admin/security-rules", "SecurityRules.FIREBASE_STORAGE")
    @js.native
    val FIREBASE_STORAGE: Any = js.native
  }
  
  inline def getSecurityRules(): typings.firebaseAdmin.libSecurityRulesSecurityRulesMod.SecurityRules = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecurityRules")().asInstanceOf[typings.firebaseAdmin.libSecurityRulesSecurityRulesMod.SecurityRules]
  inline def getSecurityRules(app: App): typings.firebaseAdmin.libSecurityRulesSecurityRulesMod.SecurityRules = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecurityRules")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAdmin.libSecurityRulesSecurityRulesMod.SecurityRules]
}
