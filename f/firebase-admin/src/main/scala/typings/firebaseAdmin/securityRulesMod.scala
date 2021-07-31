package typings.firebaseAdmin

import typings.firebaseAdmin.firebaseNamespaceApiMod.app.App
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object securityRulesMod {
  
  object securityRules {
    
    @scala.inline
    def apply(): SecurityRules = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[SecurityRules]
    @scala.inline
    def apply(app: App): SecurityRules = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[SecurityRules]
    
    @JSImport("firebase-admin/lib/security-rules", "securityRules")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A source file containing some Firebase security rules. The content includes raw
      * source code including text formatting, indentation and comments. Use the
      * [`securityRules.createRulesFileFromSource()`](securityRules.SecurityRules#createRulesFileFromSource)
      * method to create new instances of this type.
      */
    trait RulesFile extends StObject {
      
      val content: String
      
      val name: String
    }
    object RulesFile {
      
      @scala.inline
      def apply(content: String, name: String): RulesFile = {
        val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[RulesFile]
      }
      
      @scala.inline
      implicit class RulesFileMutableBuilder[Self <: RulesFile] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A set of Firebase security rules.
      */
    trait Ruleset
      extends StObject
         with RulesetMetadata {
      
      val source: js.Array[RulesFile]
    }
    object Ruleset {
      
      @scala.inline
      def apply(createTime: String, name: String, source: js.Array[RulesFile]): Ruleset = {
        val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
        __obj.asInstanceOf[Ruleset]
      }
      
      @scala.inline
      implicit class RulesetMutableBuilder[Self <: Ruleset] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSource(value: js.Array[RulesFile]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceVarargs(value: RulesFile*): Self = StObject.set(x, "source", js.Array(value :_*))
      }
    }
    
    /**
      * Required metadata associated with a ruleset.
      */
    trait RulesetMetadata extends StObject {
      
      /**
        * Creation time of the `Ruleset` as a UTC timestamp string.
        */
      val createTime: String
      
      /**
        * Name of the `Ruleset` as a short string. This can be directly passed into APIs
        * like {@link securityRules.SecurityRules.getRuleset `securityRules.getRuleset()`}
        * and {@link securityRules.SecurityRules.deleteRuleset `securityRules.deleteRuleset()`}.
        */
      val name: String
    }
    object RulesetMetadata {
      
      @scala.inline
      def apply(createTime: String, name: String): RulesetMetadata = {
        val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[RulesetMetadata]
      }
      
      @scala.inline
      implicit class RulesetMetadataMutableBuilder[Self <: RulesetMetadata] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A page of ruleset metadata.
      */
    trait RulesetMetadataList extends StObject {
      
      /**
        * The next page token if available. This is needed to retrieve the next batch.
        */
      val nextPageToken: js.UndefOr[String] = js.undefined
      
      /**
        * A batch of ruleset metadata.
        */
      val rulesets: js.Array[RulesetMetadata]
    }
    object RulesetMetadataList {
      
      @scala.inline
      def apply(rulesets: js.Array[RulesetMetadata]): RulesetMetadataList = {
        val __obj = js.Dynamic.literal(rulesets = rulesets.asInstanceOf[js.Any])
        __obj.asInstanceOf[RulesetMetadataList]
      }
      
      @scala.inline
      implicit class RulesetMetadataListMutableBuilder[Self <: RulesetMetadataList] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        @scala.inline
        def setRulesets(value: js.Array[RulesetMetadata]): Self = StObject.set(x, "rulesets", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRulesetsVarargs(value: RulesetMetadata*): Self = StObject.set(x, "rulesets", js.Array(value :_*))
      }
    }
    
    /**
      * The Firebase `SecurityRules` service interface.
      */
    @js.native
    trait SecurityRules extends StObject {
      
      var app: App = js.native
      
      /**
        * Creates a {@link securityRules.RulesFile `RuleFile`} with the given name
        * and source. Throws an error if any of the arguments are invalid. This is a local
        * operation, and does not involve any network API calls.
        *
        * @example
        * ```javascript
        * const source = '// Some rules source';
        * const rulesFile = admin.securityRules().createRulesFileFromSource(
        *   'firestore.rules', source);
        * ```
        *
        * @param name Name to assign to the rules file. This is usually a short file name that
        *   helps identify the file in a ruleset.
        * @param source Contents of the rules file.
        * @return A new rules file instance.
        */
      def createRulesFileFromSource(name: String, source: String): RulesFile = js.native
      def createRulesFileFromSource(name: String, source: Buffer): RulesFile = js.native
      
      /**
        * Creates a new {@link securityRules.Ruleset `Ruleset`} from the given
        * {@link securityRules.RulesFile `RuleFile`}.
        *
        * @param file Rules file to include in the new `Ruleset`.
        * @returns A promise that fulfills with the newly created `Ruleset`.
        */
      def createRuleset(file: RulesFile): js.Promise[Ruleset] = js.native
      
      /**
        * Deletes the {@link securityRules.Ruleset `Ruleset`} identified by the given
        * name. The input name should be the short name string without the project ID
        * prefix. For example, to delete the `projects/project-id/rulesets/my-ruleset`,
        * pass the  short name "my-ruleset". Rejects with a `not-found` error if the
        * specified `Ruleset` cannot be found.
        *
        * @param name Name of the `Ruleset` to delete.
        * @return A promise that fulfills when the `Ruleset` is deleted.
        */
      def deleteRuleset(name: String): js.Promise[Unit] = js.native
      
      /**
        * Gets the {@link securityRules.Ruleset `Ruleset`} currently applied to
        * Cloud Firestore. Rejects with a `not-found` error if no ruleset is applied
        * on Firestore.
        *
        * @return A promise that fulfills with the Firestore ruleset.
        */
      def getFirestoreRuleset(): js.Promise[Ruleset] = js.native
      
      /**
        * Gets the {@link securityRules.Ruleset `Ruleset`} identified by the given
        * name. The input name should be the short name string without the project ID
        * prefix. For example, to retrieve the `projects/project-id/rulesets/my-ruleset`,
        * pass the short name "my-ruleset". Rejects with a `not-found` error if the
        * specified `Ruleset` cannot be found.
        *
        * @param name Name of the `Ruleset` to retrieve.
        * @return A promise that fulfills with the specified `Ruleset`.
        */
      def getRuleset(name: String): js.Promise[Ruleset] = js.native
      
      /**
        * Gets the {@link securityRules.Ruleset `Ruleset`} currently applied to a
        * Cloud Storage bucket. Rejects with a `not-found` error if no ruleset is applied
        * on the bucket.
        *
        * @param bucket Optional name of the Cloud Storage bucket to be retrieved. If not
        *   specified, retrieves the ruleset applied on the default bucket configured via
        *   `AppOptions`.
        * @return A promise that fulfills with the Cloud Storage ruleset.
        */
      def getStorageRuleset(): js.Promise[Ruleset] = js.native
      def getStorageRuleset(bucket: String): js.Promise[Ruleset] = js.native
      
      /**
        * Retrieves a page of ruleset metadata.
        *
        * @param pageSize The page size, 100 if undefined. This is also the maximum allowed
        *   limit.
        * @param nextPageToken The next page token. If not specified, returns rulesets
        *   starting without any offset.
        * @return A promise that fulfills with a page of rulesets.
        */
      def listRulesetMetadata(): js.Promise[RulesetMetadataList] = js.native
      def listRulesetMetadata(pageSize: Double): js.Promise[RulesetMetadataList] = js.native
      def listRulesetMetadata(pageSize: Double, nextPageToken: String): js.Promise[RulesetMetadataList] = js.native
      def listRulesetMetadata(pageSize: Unit, nextPageToken: String): js.Promise[RulesetMetadataList] = js.native
      
      /**
        * Applies the specified {@link securityRules.Ruleset `Ruleset`} ruleset
        * to Cloud Firestore.
        *
        * @param ruleset Name of the ruleset to apply or a `RulesetMetadata` object
        *   containing the name.
        * @return A promise that fulfills when the ruleset is released.
        */
      def releaseFirestoreRuleset(ruleset: String): js.Promise[Unit] = js.native
      def releaseFirestoreRuleset(ruleset: RulesetMetadata): js.Promise[Unit] = js.native
      
      /**
        * Creates a new {@link securityRules.Ruleset `Ruleset`} from the given
        * source, and applies it to Cloud Firestore.
        *
        * @param source Rules source to apply.
        * @return A promise that fulfills when the ruleset is created and released.
        */
      def releaseFirestoreRulesetFromSource(source: String): js.Promise[Ruleset] = js.native
      def releaseFirestoreRulesetFromSource(source: Buffer): js.Promise[Ruleset] = js.native
      
      /**
        * Applies the specified {@link securityRules.Ruleset `Ruleset`} ruleset
        * to a Cloud Storage bucket.
        *
        * @param ruleset Name of the ruleset to apply or a `RulesetMetadata` object
        *   containing the name.
        * @param bucket Optional name of the Cloud Storage bucket to apply the rules on. If
        *   not specified, applies the ruleset on the default bucket configured via
        *   {@link AppOptions `AppOptions`}.
        * @return A promise that fulfills when the ruleset is released.
        */
      def releaseStorageRuleset(ruleset: String): js.Promise[Unit] = js.native
      def releaseStorageRuleset(ruleset: String, bucket: String): js.Promise[Unit] = js.native
      def releaseStorageRuleset(ruleset: RulesetMetadata): js.Promise[Unit] = js.native
      def releaseStorageRuleset(ruleset: RulesetMetadata, bucket: String): js.Promise[Unit] = js.native
      
      /**
        * Creates a new {@link securityRules.Ruleset `Ruleset`} from the given
        * source, and applies it to a Cloud Storage bucket.
        *
        * @param source Rules source to apply.
        * @param bucket Optional name of the Cloud Storage bucket to apply the rules on. If
        *   not specified, applies the ruleset on the default bucket configured via
        *   {@link AppOptions `AppOptions`}.
        * @return A promise that fulfills when the ruleset is created and released.
        */
      def releaseStorageRulesetFromSource(source: String): js.Promise[Ruleset] = js.native
      def releaseStorageRulesetFromSource(source: String, bucket: String): js.Promise[Ruleset] = js.native
      def releaseStorageRulesetFromSource(source: Buffer): js.Promise[Ruleset] = js.native
      def releaseStorageRulesetFromSource(source: Buffer, bucket: String): js.Promise[Ruleset] = js.native
    }
  }
}
