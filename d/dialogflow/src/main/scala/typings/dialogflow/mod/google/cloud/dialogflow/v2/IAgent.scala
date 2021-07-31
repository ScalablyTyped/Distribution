package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.dialogflow.mod.google.cloud.dialogflow.v2.Agent.ApiVersion
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Agent.MatchMode
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Agent.Tier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an Agent. */
trait IAgent extends StObject {
  
  /** Agent apiVersion */
  var apiVersion: js.UndefOr[
    ApiVersion | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Agent.ApiVersion * / any */ String) | Null
  ] = js.undefined
  
  /** Agent avatarUri */
  var avatarUri: js.UndefOr[String | Null] = js.undefined
  
  /** Agent classificationThreshold */
  var classificationThreshold: js.UndefOr[Double | Null] = js.undefined
  
  /** Agent defaultLanguageCode */
  var defaultLanguageCode: js.UndefOr[String | Null] = js.undefined
  
  /** Agent description */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /** Agent displayName */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /** Agent enableLogging */
  var enableLogging: js.UndefOr[Boolean | Null] = js.undefined
  
  /** Agent matchMode */
  var matchMode: js.UndefOr[
    MatchMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Agent.MatchMode * / any */ String) | Null
  ] = js.undefined
  
  /** Agent parent */
  var parent: js.UndefOr[String | Null] = js.undefined
  
  /** Agent supportedLanguageCodes */
  var supportedLanguageCodes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** Agent tier */
  var tier: js.UndefOr[
    Tier | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Agent.Tier * / any */ String) | Null
  ] = js.undefined
  
  /** Agent timeZone */
  var timeZone: js.UndefOr[String | Null] = js.undefined
}
object IAgent {
  
  @scala.inline
  def apply(): IAgent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAgent]
  }
  
  @scala.inline
  implicit class IAgentMutableBuilder[Self <: IAgent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(
      value: ApiVersion | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Agent.ApiVersion * / any */ String)
    ): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersionNull: Self = StObject.set(x, "apiVersion", null)
    
    @scala.inline
    def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    @scala.inline
    def setAvatarUri(value: String): Self = StObject.set(x, "avatarUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvatarUriNull: Self = StObject.set(x, "avatarUri", null)
    
    @scala.inline
    def setAvatarUriUndefined: Self = StObject.set(x, "avatarUri", js.undefined)
    
    @scala.inline
    def setClassificationThreshold(value: Double): Self = StObject.set(x, "classificationThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassificationThresholdNull: Self = StObject.set(x, "classificationThreshold", null)
    
    @scala.inline
    def setClassificationThresholdUndefined: Self = StObject.set(x, "classificationThreshold", js.undefined)
    
    @scala.inline
    def setDefaultLanguageCode(value: String): Self = StObject.set(x, "defaultLanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLanguageCodeNull: Self = StObject.set(x, "defaultLanguageCode", null)
    
    @scala.inline
    def setDefaultLanguageCodeUndefined: Self = StObject.set(x, "defaultLanguageCode", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEnableLogging(value: Boolean): Self = StObject.set(x, "enableLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableLoggingNull: Self = StObject.set(x, "enableLogging", null)
    
    @scala.inline
    def setEnableLoggingUndefined: Self = StObject.set(x, "enableLogging", js.undefined)
    
    @scala.inline
    def setMatchMode(
      value: MatchMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Agent.MatchMode * / any */ String)
    ): Self = StObject.set(x, "matchMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchModeNull: Self = StObject.set(x, "matchMode", null)
    
    @scala.inline
    def setMatchModeUndefined: Self = StObject.set(x, "matchMode", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = StObject.set(x, "parent", null)
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setSupportedLanguageCodes(value: js.Array[String]): Self = StObject.set(x, "supportedLanguageCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedLanguageCodesNull: Self = StObject.set(x, "supportedLanguageCodes", null)
    
    @scala.inline
    def setSupportedLanguageCodesUndefined: Self = StObject.set(x, "supportedLanguageCodes", js.undefined)
    
    @scala.inline
    def setSupportedLanguageCodesVarargs(value: String*): Self = StObject.set(x, "supportedLanguageCodes", js.Array(value :_*))
    
    @scala.inline
    def setTier(
      value: Tier | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Agent.Tier * / any */ String)
    ): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTierNull: Self = StObject.set(x, "tier", null)
    
    @scala.inline
    def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneNull: Self = StObject.set(x, "timeZone", null)
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
