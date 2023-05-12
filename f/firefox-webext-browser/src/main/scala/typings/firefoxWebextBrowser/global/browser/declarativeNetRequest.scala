package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.browser.declarativeNetRequest.Rule
import typings.firefoxWebextBrowser.browser.declarativeNetRequest.TestMatchOutcomeOptions
import typings.firefoxWebextBrowser.browser.declarativeNetRequest.TestMatchOutcomeRequest
import typings.firefoxWebextBrowser.browser.declarativeNetRequest.TestMatchOutcomeReturnResult
import typings.firefoxWebextBrowser.browser.declarativeNetRequest.UpdateDynamicRulesOptions
import typings.firefoxWebextBrowser.browser.declarativeNetRequest.UpdateEnabledRulesetsUpdateRulesetOptions
import typings.firefoxWebextBrowser.browser.declarativeNetRequest.UpdateSessionRulesOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the declarativeNetRequest API to block or modify network requests by specifying declarative rules.
  *
  * Permissions: `declarativeNetRequest`, `declarativeNetRequestWithHostAccess`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object declarativeNetRequest {
  
  @JSGlobal("browser.declarativeNetRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /* declarativeNetRequest properties */
  /** Ruleset ID for the dynamic rules added by the extension. */
  @JSGlobal("browser.declarativeNetRequest.DYNAMIC_RULESET_ID")
  @js.native
  val DYNAMIC_RULESET_ID: String = js.native
  
  /**
    * The minimum number of static rules guaranteed to an extension across its enabled static rulesets. Any rules above this limit will count towards the global static rule limit.
    */
  @JSGlobal("browser.declarativeNetRequest.GUARANTEED_MINIMUM_STATIC_RULES")
  @js.native
  val GUARANTEED_MINIMUM_STATIC_RULES: Double = js.native
  
  /**
    * The maximum number of dynamic and session rules an extension can add. NOTE: in the Firefox we are enforcing this limit to the session and dynamic rules count separately, instead of enforcing it to the rules count for both combined as the Chrome implementation does.
    */
  @JSGlobal("browser.declarativeNetRequest.MAX_NUMBER_OF_DYNAMIC_AND_SESSION_RULES")
  @js.native
  val MAX_NUMBER_OF_DYNAMIC_AND_SESSION_RULES: Double = js.native
  
  /** The maximum number of static Rulesets an extension can enable at any one time. */
  @JSGlobal("browser.declarativeNetRequest.MAX_NUMBER_OF_ENABLED_STATIC_RULESETS")
  @js.native
  val MAX_NUMBER_OF_ENABLED_STATIC_RULESETS: Double = js.native
  
  /**
    * The maximum number of static Rulesets an extension can specify as part of the rule_resources manifest key.
    */
  @JSGlobal("browser.declarativeNetRequest.MAX_NUMBER_OF_STATIC_RULESETS")
  @js.native
  val MAX_NUMBER_OF_STATIC_RULESETS: Double = js.native
  
  /** Ruleset ID for the session-scoped rules added by the extension. */
  @JSGlobal("browser.declarativeNetRequest.SESSION_RULESET_ID")
  @js.native
  val SESSION_RULESET_ID: String = js.native
  
  /** Returns the remaining number of static rules an extension can enable */
  inline def getAvailableStaticRuleCount(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAvailableStaticRuleCount")().asInstanceOf[js.Promise[Double]]
  
  /** Returns the current set of dynamic rules for the extension. */
  inline def getDynamicRules(): js.Promise[js.Array[Rule]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDynamicRules")().asInstanceOf[js.Promise[js.Array[Rule]]]
  
  /** Returns the ids for the current set of enabled static rulesets. */
  inline def getEnabledRulesets(): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnabledRulesets")().asInstanceOf[js.Promise[js.Array[String]]]
  
  /** Returns the current set of session scoped rules for the extension. */
  inline def getSessionRules(): js.Promise[js.Array[Rule]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSessionRules")().asInstanceOf[js.Promise[js.Array[Rule]]]
  
  /**
    * Checks if any of the extension's declarativeNetRequest rules would match a hypothetical request.
    * @param request The details of the request to test.
    */
  inline def testMatchOutcome(request: TestMatchOutcomeRequest): js.Promise[TestMatchOutcomeReturnResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("testMatchOutcome")(request.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TestMatchOutcomeReturnResult]]
  inline def testMatchOutcome(request: TestMatchOutcomeRequest, options: TestMatchOutcomeOptions): js.Promise[TestMatchOutcomeReturnResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("testMatchOutcome")(request.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TestMatchOutcomeReturnResult]]
  
  /* declarativeNetRequest functions */
  /**
    * Modifies the current set of dynamic rules for the extension. The rules with IDs listed in options.removeRuleIds are first removed, and then the rules given in options.addRules are added. These rules are persisted across browser sessions and extension updates.
    */
  inline def updateDynamicRules(options: UpdateDynamicRulesOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateDynamicRules")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /** Returns the ids for the current set of enabled static rulesets. */
  inline def updateEnabledRulesets(updateRulesetOptions: UpdateEnabledRulesetsUpdateRulesetOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateEnabledRulesets")(updateRulesetOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Modifies the current set of session scoped rules for the extension. The rules with IDs listed in options.removeRuleIds are first removed, and then the rules given in options.addRules are added. These rules are not persisted across sessions and are backed in memory.
    */
  inline def updateSessionRules(options: UpdateSessionRulesOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateSessionRules")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
