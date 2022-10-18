package typings.firebaseAdmin

import typings.firebaseAdmin.anon.CreateTime
import typings.firebaseAdmin.anon.Files
import typings.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSecurityRulesSecurityRulesApiClientInternalMod {
  
  @JSImport("firebase-admin/lib/security-rules/security-rules-api-client-internal", "SecurityRulesApiClient")
  @js.native
  open class SecurityRulesApiClient protected () extends StObject {
    def this(app: App) = this()
    
    /* private */ val app: Any = js.native
    
    def createRelease(name: String, rulesetName: String): js.Promise[Release] = js.native
    
    def createRuleset(ruleset: RulesetContent): js.Promise[RulesetResponse] = js.native
    
    def deleteRuleset(name: String): js.Promise[Unit] = js.native
    
    /* private */ var getProjectIdPrefix: Any = js.native
    
    def getRelease(name: String): js.Promise[Release] = js.native
    
    /* private */ var getReleaseDescription: Any = js.native
    
    /**
      * Gets the specified resource from the rules API. Resource names must be the short names without project
      * ID prefix (e.g. `rulesets/ruleset-name`).
      *
      * @param {string} name Full qualified name of the resource to get.
      * @returns {Promise<T>} A promise that fulfills with the resource.
      */
    /* private */ var getResource: Any = js.native
    
    def getRuleset(name: String): js.Promise[RulesetResponse] = js.native
    
    /* private */ var getRulesetName: Any = js.native
    
    /* private */ var getUrl: Any = js.native
    
    /* private */ val httpClient: Any = js.native
    
    def listRulesets(): js.Promise[ListRulesetsResponse] = js.native
    def listRulesets(pageSize: Double): js.Promise[ListRulesetsResponse] = js.native
    def listRulesets(pageSize: Double, pageToken: String): js.Promise[ListRulesetsResponse] = js.native
    def listRulesets(pageSize: Unit, pageToken: String): js.Promise[ListRulesetsResponse] = js.native
    
    /* private */ var projectIdPrefix: Any = js.native
    
    /* private */ var sendRequest: Any = js.native
    
    /* private */ var toFirebaseError: Any = js.native
    
    def updateOrCreateRelease(name: String, rulesetName: String): js.Promise[Release] = js.native
    
    def updateRelease(name: String, rulesetName: String): js.Promise[Release] = js.native
  }
  
  trait ListRulesetsResponse extends StObject {
    
    val nextPageToken: js.UndefOr[String] = js.undefined
    
    val rulesets: js.Array[CreateTime]
  }
  object ListRulesetsResponse {
    
    inline def apply(rulesets: js.Array[CreateTime]): ListRulesetsResponse = {
      val __obj = js.Dynamic.literal(rulesets = rulesets.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListRulesetsResponse]
    }
    
    extension [Self <: ListRulesetsResponse](x: Self) {
      
      inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
      
      inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      
      inline def setRulesets(value: js.Array[CreateTime]): Self = StObject.set(x, "rulesets", value.asInstanceOf[js.Any])
      
      inline def setRulesetsVarargs(value: CreateTime*): Self = StObject.set(x, "rulesets", js.Array(value*))
    }
  }
  
  trait Release extends StObject {
    
    val createTime: js.UndefOr[String] = js.undefined
    
    val name: String
    
    val rulesetName: String
    
    val updateTime: js.UndefOr[String] = js.undefined
  }
  object Release {
    
    inline def apply(name: String, rulesetName: String): Release = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], rulesetName = rulesetName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Release]
    }
    
    extension [Self <: Release](x: Self) {
      
      inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
      
      inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRulesetName(value: String): Self = StObject.set(x, "rulesetName", value.asInstanceOf[js.Any])
      
      inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
      
      inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    }
  }
  
  trait RulesetContent extends StObject {
    
    val source: Files
  }
  object RulesetContent {
    
    inline def apply(source: Files): RulesetContent = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[RulesetContent]
    }
    
    extension [Self <: RulesetContent](x: Self) {
      
      inline def setSource(value: Files): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait RulesetResponse
    extends StObject
       with RulesetContent {
    
    val createTime: String
    
    val name: String
  }
  object RulesetResponse {
    
    inline def apply(createTime: String, name: String, source: Files): RulesetResponse = {
      val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[RulesetResponse]
    }
    
    extension [Self <: RulesetResponse](x: Self) {
      
      inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
