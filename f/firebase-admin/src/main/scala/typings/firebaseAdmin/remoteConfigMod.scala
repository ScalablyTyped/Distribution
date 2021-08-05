package typings.firebaseAdmin

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAdmin.anon.Force
import typings.firebaseAdmin.firebaseAdminStrings.ADMIN_SDK_NODE
import typings.firebaseAdmin.firebaseAdminStrings.CONSOLE
import typings.firebaseAdmin.firebaseAdminStrings.FORCED_UPDATE
import typings.firebaseAdmin.firebaseAdminStrings.INCREMENTAL_UPDATE
import typings.firebaseAdmin.firebaseAdminStrings.REMOTE_CONFIG_UPDATE_ORIGIN_UNSPECIFIED
import typings.firebaseAdmin.firebaseAdminStrings.REMOTE_CONFIG_UPDATE_TYPE_UNSPECIFIED
import typings.firebaseAdmin.firebaseAdminStrings.REST_API
import typings.firebaseAdmin.firebaseAdminStrings.ROLLBACK
import typings.firebaseAdmin.firebaseNamespaceApiMod.app.App
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remoteConfigMod {
  
  object remoteConfig {
    
    inline def apply(): RemoteConfig = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RemoteConfig]
    inline def apply(app: App): RemoteConfig = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[RemoteConfig]
    
    @JSImport("firebase-admin/lib/remote-config", "remoteConfig")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Interface representing an explicit parameter value.
      */
    trait ExplicitParameterValue
      extends StObject
         with RemoteConfigParameterValue {
      
      /**
        * The `string` value that the parameter is set to.
        */
      var value: String
    }
    object ExplicitParameterValue {
      
      inline def apply(value: String): ExplicitParameterValue = {
        val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[ExplicitParameterValue]
      }
      
      extension [Self <: ExplicitParameterValue](x: Self) {
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Interface representing an in-app-default value.
      */
    trait InAppDefaultValue
      extends StObject
         with RemoteConfigParameterValue {
      
      /**
        * If `true`, the parameter is omitted from the parameter values returned to a client.
        */
      var useInAppDefault: Boolean
    }
    object InAppDefaultValue {
      
      inline def apply(useInAppDefault: Boolean): InAppDefaultValue = {
        val __obj = js.Dynamic.literal(useInAppDefault = useInAppDefault.asInstanceOf[js.Any])
        __obj.asInstanceOf[InAppDefaultValue]
      }
      
      extension [Self <: InAppDefaultValue](x: Self) {
        
        inline def setUseInAppDefault(value: Boolean): Self = StObject.set(x, "useInAppDefault", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Interface representing options for Remote Config list versions operation.
      */
    trait ListVersionsOptions extends StObject {
      
      /**
        * Specifies the latest update time to include in the results. Any entries updated on or after
        * this time are omitted.
        */
      var endTime: js.UndefOr[Date | String] = js.undefined
      
      /**
        * Specifies the newest version number to include in the results.
        * If specified, must be greater than zero. Defaults to the newest version.
        */
      var endVersionNumber: js.UndefOr[String | Double] = js.undefined
      
      /**
        * The maximum number of items to return per page.
        */
      var pageSize: js.UndefOr[Double] = js.undefined
      
      /**
        * The `nextPageToken` value returned from a previous list versions request, if any.
        */
      var pageToken: js.UndefOr[String] = js.undefined
      
      /**
        * Specifies the earliest update time to include in the results. Any entries updated before this
        * time are omitted.
        */
      var startTime: js.UndefOr[Date | String] = js.undefined
    }
    object ListVersionsOptions {
      
      inline def apply(): ListVersionsOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListVersionsOptions]
      }
      
      extension [Self <: ListVersionsOptions](x: Self) {
        
        inline def setEndTime(value: Date | String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
        
        inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
        
        inline def setEndVersionNumber(value: String | Double): Self = StObject.set(x, "endVersionNumber", value.asInstanceOf[js.Any])
        
        inline def setEndVersionNumberUndefined: Self = StObject.set(x, "endVersionNumber", js.undefined)
        
        inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
        
        inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
        
        inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
        
        inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
        
        inline def setStartTime(value: Date | String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
        
        inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      }
    }
    
    /**
      * Interface representing a list of Remote Config template versions.
      */
    trait ListVersionsResult extends StObject {
      
      /**
        * Token to retrieve the next page of results, or empty if there are no more results
        * in the list.
        */
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      /**
        * A list of version metadata objects, sorted in reverse chronological order.
        */
      var versions: js.Array[Version]
    }
    object ListVersionsResult {
      
      inline def apply(versions: js.Array[Version]): ListVersionsResult = {
        val __obj = js.Dynamic.literal(versions = versions.asInstanceOf[js.Any])
        __obj.asInstanceOf[ListVersionsResult]
      }
      
      extension [Self <: ListVersionsResult](x: Self) {
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setVersions(value: js.Array[Version]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
        
        inline def setVersionsVarargs(value: Version*): Self = StObject.set(x, "versions", js.Array(value :_*))
      }
    }
    
    /**
      * The Firebase `RemoteConfig` service interface.
      */
    @js.native
    trait RemoteConfig extends StObject {
      
      var app: App = js.native
      
      /**
        * Creates and returns a new Remote Config template from a JSON string.
        *
        * @param json The JSON string to populate a Remote Config template.
        *
        * @return A new template instance.
        */
      def createTemplateFromJSON(json: String): RemoteConfigTemplate = js.native
      
      /**
        * Gets the current active version of the {@link remoteConfig.RemoteConfigTemplate
        * `RemoteConfigTemplate`} of the project.
        *
        * @return A promise that fulfills with a `RemoteConfigTemplate`.
        */
      def getTemplate(): js.Promise[RemoteConfigTemplate] = js.native
      
      def getTemplateAtVersion(versionNumber: String): js.Promise[RemoteConfigTemplate] = js.native
      /**
        * Gets the requested version of the {@link remoteConfig.RemoteConfigTemplate
        * `RemoteConfigTemplate`} of the project.
        *
        * @param versionNumber Version number of the Remote Config template to look up.
        *
        * @return A promise that fulfills with a `RemoteConfigTemplate`.
        */
      def getTemplateAtVersion(versionNumber: Double): js.Promise[RemoteConfigTemplate] = js.native
      
      /**
        * Gets a list of Remote Config template versions that have been published, sorted in reverse
        * chronological order. Only the last 300 versions are stored.
        * All versions that correspond to non-active Remote Config templates (that is, all except the
        * template that is being fetched by clients) are also deleted if they are more than 90 days old.
        *
        * @param options Optional {@link remoteConfig.ListVersionsOptions `ListVersionsOptions`}
        *    object for getting a list of template versions.
        * @return A promise that fulfills with a `ListVersionsResult`.
        */
      def listVersions(): js.Promise[ListVersionsResult] = js.native
      def listVersions(options: ListVersionsOptions): js.Promise[ListVersionsResult] = js.native
      
      /**
        * Publishes a Remote Config template.
        *
        * @param template The Remote Config template to be published.
        * @param options Optional options object when publishing a Remote Config template:
        *    - {boolean} `force` Setting this to `true` forces the Remote Config template to
        *      be updated and circumvent the ETag. This approach is not recommended
        *      because it risks causing the loss of updates to your Remote Config
        *      template if multiple clients are updating the Remote Config template.
        *      See {@link https://firebase.google.com/docs/remote-config/use-config-rest#etag_usage_and_forced_updates
        *      ETag usage and forced updates}.
        *
        * @return A Promise that fulfills with the published `RemoteConfigTemplate`.
        */
      def publishTemplate(template: RemoteConfigTemplate): js.Promise[RemoteConfigTemplate] = js.native
      def publishTemplate(template: RemoteConfigTemplate, options: Force): js.Promise[RemoteConfigTemplate] = js.native
      
      /**
        * Rolls back a project's published Remote Config template to the specified version.
        * A rollback is equivalent to getting a previously published Remote Config
        * template and re-publishing it using a force update.
        *
        * @param versionNumber The version number of the Remote Config template to roll back to.
        *    The specified version number must be lower than the current version number, and not have
        *    been deleted due to staleness. Only the last 300 versions are stored.
        *    All versions that correspond to non-active Remote Config templates (that is, all except the
        *    template that is being fetched by clients) are also deleted if they are more than 90 days old.
        * @return A promise that fulfills with the published `RemoteConfigTemplate`.
        */
      def rollback(versionNumber: String): js.Promise[RemoteConfigTemplate] = js.native
      def rollback(versionNumber: Double): js.Promise[RemoteConfigTemplate] = js.native
      
      /**
        * Validates a {@link remoteConfig.RemoteConfigTemplate `RemoteConfigTemplate`}.
        *
        * @param template The Remote Config template to be validated.
        * @returns A promise that fulfills with the validated `RemoteConfigTemplate`.
        */
      def validateTemplate(template: RemoteConfigTemplate): js.Promise[RemoteConfigTemplate] = js.native
    }
    
    /**
      * Interface representing a Remote Config condition.
      * A condition targets a specific group of users. A list of these conditions make up
      * part of a Remote Config template.
      */
    trait RemoteConfigCondition extends StObject {
      
      /**
        * The logic of this condition.
        * See the documentation on
        * {@link https://firebase.google.com/docs/remote-config/condition-reference condition expressions}
        * for the expected syntax of this field.
        */
      var expression: String
      
      /**
        * A non-empty and unique name of this condition.
        */
      var name: String
      
      /**
        * The color associated with this condition for display purposes in the Firebase Console.
        * Not specifying this value results in the console picking an arbitrary color to associate
        * with the condition.
        */
      var tagColor: js.UndefOr[TagColor] = js.undefined
    }
    object RemoteConfigCondition {
      
      inline def apply(expression: String, name: String): RemoteConfigCondition = {
        val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[RemoteConfigCondition]
      }
      
      extension [Self <: RemoteConfigCondition](x: Self) {
        
        inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setTagColor(value: TagColor): Self = StObject.set(x, "tagColor", value.asInstanceOf[js.Any])
        
        inline def setTagColorUndefined: Self = StObject.set(x, "tagColor", js.undefined)
      }
    }
    
    /**
      * Interface representing a Remote Config parameter.
      * At minimum, a `defaultValue` or a `conditionalValues` entry must be present for the
      * parameter to have any effect.
      */
    trait RemoteConfigParameter extends StObject {
      
      /**
        * A `(condition name, value)` map. The condition name of the highest priority
        * (the one listed first in the Remote Config template's conditions list) determines the value of
        * this parameter.
        */
      var conditionalValues: js.UndefOr[StringDictionary[RemoteConfigParameterValue]] = js.undefined
      
      /**
        * The value to set the parameter to, when none of the named conditions evaluate to `true`.
        */
      var defaultValue: js.UndefOr[RemoteConfigParameterValue] = js.undefined
      
      /**
        * A description for this parameter. Should not be over 100 characters and may contain any
        * Unicode characters.
        */
      var description: js.UndefOr[String] = js.undefined
    }
    object RemoteConfigParameter {
      
      inline def apply(): RemoteConfigParameter = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RemoteConfigParameter]
      }
      
      extension [Self <: RemoteConfigParameter](x: Self) {
        
        inline def setConditionalValues(value: StringDictionary[RemoteConfigParameterValue]): Self = StObject.set(x, "conditionalValues", value.asInstanceOf[js.Any])
        
        inline def setConditionalValuesUndefined: Self = StObject.set(x, "conditionalValues", js.undefined)
        
        inline def setDefaultValue(value: RemoteConfigParameterValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
        
        inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      }
    }
    
    /**
      * Interface representing a Remote Config parameter group.
      * Grouping parameters is only for management purposes and does not affect client-side
      * fetching of parameter values.
      */
    trait RemoteConfigParameterGroup extends StObject {
      
      /**
        * A description for the group. Its length must be less than or equal to 256 characters.
        * A description may contain any Unicode characters.
        */
      var description: js.UndefOr[String] = js.undefined
      
      /**
        * Map of parameter keys to their optional default values and optional conditional values for
        * parameters that belong to this group. A parameter only appears once per
        * Remote Config template. An ungrouped parameter appears at the top level, whereas a
        * parameter organized within a group appears within its group's map of parameters.
        */
      var parameters: StringDictionary[RemoteConfigParameter]
    }
    object RemoteConfigParameterGroup {
      
      inline def apply(parameters: StringDictionary[RemoteConfigParameter]): RemoteConfigParameterGroup = {
        val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
        __obj.asInstanceOf[RemoteConfigParameterGroup]
      }
      
      extension [Self <: RemoteConfigParameterGroup](x: Self) {
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setParameters(value: StringDictionary[RemoteConfigParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Type representing a Remote Config parameter value.
      * A `RemoteConfigParameterValue` could be either an `ExplicitParameterValue` or
      * an `InAppDefaultValue`.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.firebaseAdmin.remoteConfigMod.remoteConfig.ExplicitParameterValue
      - typings.firebaseAdmin.remoteConfigMod.remoteConfig.InAppDefaultValue
    */
    trait RemoteConfigParameterValue extends StObject
    object RemoteConfigParameterValue {
      
      inline def ExplicitParameterValue(value: String): typings.firebaseAdmin.remoteConfigMod.remoteConfig.ExplicitParameterValue = {
        val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.firebaseAdmin.remoteConfigMod.remoteConfig.ExplicitParameterValue]
      }
      
      inline def InAppDefaultValue(useInAppDefault: Boolean): typings.firebaseAdmin.remoteConfigMod.remoteConfig.InAppDefaultValue = {
        val __obj = js.Dynamic.literal(useInAppDefault = useInAppDefault.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.firebaseAdmin.remoteConfigMod.remoteConfig.InAppDefaultValue]
      }
    }
    
    /**
      * Interface representing a Remote Config template.
      */
    trait RemoteConfigTemplate extends StObject {
      
      /**
        * A list of conditions in descending order by priority.
        */
      var conditions: js.Array[RemoteConfigCondition]
      
      /**
        * ETag of the current Remote Config template (readonly).
        */
      val etag: String
      
      /**
        * Map of parameter group names to their parameter group objects.
        * A group's name is mutable but must be unique among groups in the Remote Config template.
        * The name is limited to 256 characters and intended to be human-readable. Any Unicode
        * characters are allowed.
        */
      var parameterGroups: StringDictionary[RemoteConfigParameterGroup]
      
      /**
        * Map of parameter keys to their optional default values and optional conditional values.
        */
      var parameters: StringDictionary[RemoteConfigParameter]
      
      /**
        * Version information for the current Remote Config template.
        */
      var version: js.UndefOr[Version] = js.undefined
    }
    object RemoteConfigTemplate {
      
      inline def apply(
        conditions: js.Array[RemoteConfigCondition],
        etag: String,
        parameterGroups: StringDictionary[RemoteConfigParameterGroup],
        parameters: StringDictionary[RemoteConfigParameter]
      ): RemoteConfigTemplate = {
        val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], parameterGroups = parameterGroups.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
        __obj.asInstanceOf[RemoteConfigTemplate]
      }
      
      extension [Self <: RemoteConfigTemplate](x: Self) {
        
        inline def setConditions(value: js.Array[RemoteConfigCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
        
        inline def setConditionsVarargs(value: RemoteConfigCondition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setParameterGroups(value: StringDictionary[RemoteConfigParameterGroup]): Self = StObject.set(x, "parameterGroups", value.asInstanceOf[js.Any])
        
        inline def setParameters(value: StringDictionary[RemoteConfigParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
        
        inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      }
    }
    
    /**
      * Interface representing a Remote Config user.
      */
    trait RemoteConfigUser extends StObject {
      
      /**
        * Email address. Output only.
        */
      var email: String
      
      /**
        * Image URL. Output only.
        */
      var imageUrl: js.UndefOr[String] = js.undefined
      
      /**
        * Display name. Output only.
        */
      var name: js.UndefOr[String] = js.undefined
    }
    object RemoteConfigUser {
      
      inline def apply(email: String): RemoteConfigUser = {
        val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
        __obj.asInstanceOf[RemoteConfigUser]
      }
      
      extension [Self <: RemoteConfigUser](x: Self) {
        
        inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
        
        inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
        
        inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    /**
      * Colors that are associated with conditions for display purposes.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.firebaseAdmin.firebaseAdminStrings.BLUE
      - typings.firebaseAdmin.firebaseAdminStrings.BROWN
      - typings.firebaseAdmin.firebaseAdminStrings.CYAN
      - typings.firebaseAdmin.firebaseAdminStrings.DEEP_ORANGE
      - typings.firebaseAdmin.firebaseAdminStrings.GREEN
      - typings.firebaseAdmin.firebaseAdminStrings.INDIGO
      - typings.firebaseAdmin.firebaseAdminStrings.LIME
      - typings.firebaseAdmin.firebaseAdminStrings.ORANGE
      - typings.firebaseAdmin.firebaseAdminStrings.PINK
      - typings.firebaseAdmin.firebaseAdminStrings.PURPLE
      - typings.firebaseAdmin.firebaseAdminStrings.TEAL
    */
    trait TagColor extends StObject
    object TagColor {
      
      inline def BLUE: typings.firebaseAdmin.firebaseAdminStrings.BLUE = "BLUE".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.BLUE]
      
      inline def BROWN: typings.firebaseAdmin.firebaseAdminStrings.BROWN = "BROWN".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.BROWN]
      
      inline def CYAN: typings.firebaseAdmin.firebaseAdminStrings.CYAN = "CYAN".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.CYAN]
      
      inline def DEEP_ORANGE: typings.firebaseAdmin.firebaseAdminStrings.DEEP_ORANGE = "DEEP_ORANGE".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.DEEP_ORANGE]
      
      inline def GREEN: typings.firebaseAdmin.firebaseAdminStrings.GREEN = "GREEN".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.GREEN]
      
      inline def INDIGO: typings.firebaseAdmin.firebaseAdminStrings.INDIGO = "INDIGO".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.INDIGO]
      
      inline def LIME: typings.firebaseAdmin.firebaseAdminStrings.LIME = "LIME".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.LIME]
      
      inline def ORANGE: typings.firebaseAdmin.firebaseAdminStrings.ORANGE = "ORANGE".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.ORANGE]
      
      inline def PINK: typings.firebaseAdmin.firebaseAdminStrings.PINK = "PINK".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.PINK]
      
      inline def PURPLE: typings.firebaseAdmin.firebaseAdminStrings.PURPLE = "PURPLE".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.PURPLE]
      
      inline def TEAL: typings.firebaseAdmin.firebaseAdminStrings.TEAL = "TEAL".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.TEAL]
    }
    
    /**
      * Interface representing a Remote Config template version.
      * Output only, except for the version description. Contains metadata about a particular
      * version of the Remote Config template. All fields are set at the time the specified Remote
      * Config template is published. A version's description field may be specified in
      * `publishTemplate` calls.
      */
    trait Version extends StObject {
      
      /**
        * The user-provided description of the corresponding Remote Config template.
        */
      var description: js.UndefOr[String] = js.undefined
      
      /**
        * Indicates whether this Remote Config template was published before version history was
        * supported.
        */
      var isLegacy: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The version number of the Remote Config template that has become the current version
        * due to a rollback. Only present if this version is the result of a rollback.
        */
      var rollbackSource: js.UndefOr[String] = js.undefined
      
      /**
        * The origin of the template update action.
        */
      var updateOrigin: js.UndefOr[REMOTE_CONFIG_UPDATE_ORIGIN_UNSPECIFIED | CONSOLE | REST_API | ADMIN_SDK_NODE] = js.undefined
      
      /**
        * The timestamp of when this version of the Remote Config template was written to the
        * Remote Config backend.
        */
      var updateTime: js.UndefOr[String] = js.undefined
      
      /**
        * The type of the template update action.
        */
      var updateType: js.UndefOr[
            REMOTE_CONFIG_UPDATE_TYPE_UNSPECIFIED | INCREMENTAL_UPDATE | FORCED_UPDATE | ROLLBACK
          ] = js.undefined
      
      /**
        * Aggregation of all metadata fields about the account that performed the update.
        */
      var updateUser: js.UndefOr[RemoteConfigUser] = js.undefined
      
      /**
        * The version number of a Remote Config template.
        */
      var versionNumber: js.UndefOr[String] = js.undefined
    }
    object Version {
      
      inline def apply(): Version = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Version]
      }
      
      extension [Self <: Version](x: Self) {
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setIsLegacy(value: Boolean): Self = StObject.set(x, "isLegacy", value.asInstanceOf[js.Any])
        
        inline def setIsLegacyUndefined: Self = StObject.set(x, "isLegacy", js.undefined)
        
        inline def setRollbackSource(value: String): Self = StObject.set(x, "rollbackSource", value.asInstanceOf[js.Any])
        
        inline def setRollbackSourceUndefined: Self = StObject.set(x, "rollbackSource", js.undefined)
        
        inline def setUpdateOrigin(value: REMOTE_CONFIG_UPDATE_ORIGIN_UNSPECIFIED | CONSOLE | REST_API | ADMIN_SDK_NODE): Self = StObject.set(x, "updateOrigin", value.asInstanceOf[js.Any])
        
        inline def setUpdateOriginUndefined: Self = StObject.set(x, "updateOrigin", js.undefined)
        
        inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
        
        inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
        
        inline def setUpdateType(value: REMOTE_CONFIG_UPDATE_TYPE_UNSPECIFIED | INCREMENTAL_UPDATE | FORCED_UPDATE | ROLLBACK): Self = StObject.set(x, "updateType", value.asInstanceOf[js.Any])
        
        inline def setUpdateTypeUndefined: Self = StObject.set(x, "updateType", js.undefined)
        
        inline def setUpdateUser(value: RemoteConfigUser): Self = StObject.set(x, "updateUser", value.asInstanceOf[js.Any])
        
        inline def setUpdateUserUndefined: Self = StObject.set(x, "updateUser", js.undefined)
        
        inline def setVersionNumber(value: String): Self = StObject.set(x, "versionNumber", value.asInstanceOf[js.Any])
        
        inline def setVersionNumberUndefined: Self = StObject.set(x, "versionNumber", js.undefined)
      }
    }
  }
}
