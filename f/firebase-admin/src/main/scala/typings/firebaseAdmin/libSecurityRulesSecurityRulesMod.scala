package typings.firebaseAdmin

import typings.firebaseAdmin.libAppCoreMod.App
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSecurityRulesSecurityRulesMod {
  
  @JSImport("firebase-admin/lib/security-rules/security-rules", "Ruleset")
  @js.native
  open class Ruleset ()
    extends StObject
       with RulesetMetadata {
    
    /**
      * Creation time of the `Ruleset` as a UTC timestamp string.
      */
    /* CompleteClass */
    override val createTime: String = js.native
    
    /**
      * Name of the `Ruleset` as a short string. This can be directly passed into APIs
      * like {@link SecurityRules.getRuleset} and {@link SecurityRules.deleteRuleset}.
      */
    /* CompleteClass */
    override val name: String = js.native
    
    val source: js.Array[RulesFile] = js.native
  }
  
  @JSImport("firebase-admin/lib/security-rules/security-rules", "RulesetMetadataList")
  @js.native
  open class RulesetMetadataList () extends StObject {
    
    /**
      * The next page token if available. This is needed to retrieve the next batch.
      */
    val nextPageToken: js.UndefOr[String] = js.native
    
    /**
      * A batch of ruleset metadata.
      */
    val rulesets: js.Array[RulesetMetadata] = js.native
  }
  
  @JSImport("firebase-admin/lib/security-rules/security-rules", "SecurityRules")
  @js.native
  open class SecurityRules () extends StObject {
    
    val app: App = js.native
    
    /* private */ val client: Any = js.native
    
    /**
      * Creates a {@link RulesFile} with the given name
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
      * @param name - Name to assign to the rules file. This is usually a short file name that
      *   helps identify the file in a ruleset.
      * @param source - Contents of the rules file.
      * @returns A new rules file instance.
      */
    def createRulesFileFromSource(name: String, source: String): RulesFile = js.native
    def createRulesFileFromSource(name: String, source: Buffer): RulesFile = js.native
    
    /**
      * Creates a new {@link Ruleset} from the given {@link RulesFile}.
      *
      * @param file - Rules file to include in the new `Ruleset`.
      * @returns A promise that fulfills with the newly created `Ruleset`.
      */
    def createRuleset(file: RulesFile): js.Promise[Ruleset] = js.native
    
    /**
      * Deletes the {@link Ruleset} identified by the given
      * name. The input name should be the short name string without the project ID
      * prefix. For example, to delete the `projects/project-id/rulesets/my-ruleset`,
      * pass the  short name "my-ruleset". Rejects with a `not-found` error if the
      * specified `Ruleset` cannot be found.
      *
      * @param name - Name of the `Ruleset` to delete.
      * @returns A promise that fulfills when the `Ruleset` is deleted.
      */
    def deleteRuleset(name: String): js.Promise[Unit] = js.native
    
    /* private */ var getBucketName: Any = js.native
    
    /**
      * Gets the {@link Ruleset} currently applied to
      * Cloud Firestore. Rejects with a `not-found` error if no ruleset is applied
      * on Firestore.
      *
      * @returns A promise that fulfills with the Firestore ruleset.
      */
    def getFirestoreRuleset(): js.Promise[Ruleset] = js.native
    
    /**
      * Gets the {@link Ruleset} identified by the given
      * name. The input name should be the short name string without the project ID
      * prefix. For example, to retrieve the `projects/project-id/rulesets/my-ruleset`,
      * pass the short name "my-ruleset". Rejects with a `not-found` error if the
      * specified `Ruleset` cannot be found.
      *
      * @param name - Name of the `Ruleset` to retrieve.
      * @returns A promise that fulfills with the specified `Ruleset`.
      */
    def getRuleset(name: String): js.Promise[Ruleset] = js.native
    
    /* private */ var getRulesetForRelease: Any = js.native
    
    /**
      * Gets the {@link Ruleset} currently applied to a
      * Cloud Storage bucket. Rejects with a `not-found` error if no ruleset is applied
      * on the bucket.
      *
      * @param bucket - Optional name of the Cloud Storage bucket to be retrieved. If not
      *   specified, retrieves the ruleset applied on the default bucket configured via
      *   `AppOptions`.
      * @returns A promise that fulfills with the Cloud Storage ruleset.
      */
    def getStorageRuleset(): js.Promise[Ruleset] = js.native
    def getStorageRuleset(bucket: String): js.Promise[Ruleset] = js.native
    
    /**
      * Retrieves a page of ruleset metadata.
      *
      * @param pageSize - The page size, 100 if undefined. This is also the maximum allowed
      *   limit.
      * @param nextPageToken - The next page token. If not specified, returns rulesets
      *   starting without any offset.
      * @returns A promise that fulfills with a page of rulesets.
      */
    def listRulesetMetadata(): js.Promise[RulesetMetadataList] = js.native
    def listRulesetMetadata(pageSize: Double): js.Promise[RulesetMetadataList] = js.native
    def listRulesetMetadata(pageSize: Double, nextPageToken: String): js.Promise[RulesetMetadataList] = js.native
    def listRulesetMetadata(pageSize: Unit, nextPageToken: String): js.Promise[RulesetMetadataList] = js.native
    
    /**
      * Applies the specified {@link Ruleset} ruleset
      * to Cloud Firestore.
      *
      * @param ruleset - Name of the ruleset to apply or a `RulesetMetadata` object
      *   containing the name.
      * @returns A promise that fulfills when the ruleset is released.
      */
    def releaseFirestoreRuleset(ruleset: String): js.Promise[Unit] = js.native
    def releaseFirestoreRuleset(ruleset: RulesetMetadata): js.Promise[Unit] = js.native
    
    /**
      * Creates a new {@link Ruleset} from the given
      * source, and applies it to Cloud Firestore.
      *
      * @param source - Rules source to apply.
      * @returns A promise that fulfills when the ruleset is created and released.
      */
    def releaseFirestoreRulesetFromSource(source: String): js.Promise[Ruleset] = js.native
    def releaseFirestoreRulesetFromSource(source: Buffer): js.Promise[Ruleset] = js.native
    
    /* private */ var releaseRuleset: Any = js.native
    
    /**
      * Applies the specified {@link Ruleset} ruleset
      * to a Cloud Storage bucket.
      *
      * @param ruleset - Name of the ruleset to apply or a `RulesetMetadata` object
      *   containing the name.
      * @param bucket - Optional name of the Cloud Storage bucket to apply the rules on. If
      *   not specified, applies the ruleset on the default bucket configured via
      *   {@link firebase-admin.app#AppOptions}.
      * @returns A promise that fulfills when the ruleset is released.
      */
    def releaseStorageRuleset(ruleset: String): js.Promise[Unit] = js.native
    def releaseStorageRuleset(ruleset: String, bucket: String): js.Promise[Unit] = js.native
    def releaseStorageRuleset(ruleset: RulesetMetadata): js.Promise[Unit] = js.native
    def releaseStorageRuleset(ruleset: RulesetMetadata, bucket: String): js.Promise[Unit] = js.native
    
    /**
      * Creates a new {@link Ruleset} from the given
      * source, and applies it to a Cloud Storage bucket.
      *
      * @param source - Rules source to apply.
      * @param bucket - Optional name of the Cloud Storage bucket to apply the rules on. If
      *   not specified, applies the ruleset on the default bucket configured via
      *   {@link firebase-admin.app#AppOptions}.
      * @returns A promise that fulfills when the ruleset is created and released.
      */
    def releaseStorageRulesetFromSource(source: String): js.Promise[Ruleset] = js.native
    def releaseStorageRulesetFromSource(source: String, bucket: String): js.Promise[Ruleset] = js.native
    def releaseStorageRulesetFromSource(source: Buffer): js.Promise[Ruleset] = js.native
    def releaseStorageRulesetFromSource(source: Buffer, bucket: String): js.Promise[Ruleset] = js.native
  }
  /* static members */
  object SecurityRules {
    
    @JSImport("firebase-admin/lib/security-rules/security-rules", "SecurityRules.CLOUD_FIRESTORE")
    @js.native
    val CLOUD_FIRESTORE: Any = js.native
    
    @JSImport("firebase-admin/lib/security-rules/security-rules", "SecurityRules.FIREBASE_STORAGE")
    @js.native
    val FIREBASE_STORAGE: Any = js.native
  }
  
  trait RulesFile extends StObject {
    
    val content: String
    
    val name: String
  }
  object RulesFile {
    
    inline def apply(content: String, name: String): RulesFile = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RulesFile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RulesFile] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait RulesetMetadata extends StObject {
    
    /**
      * Creation time of the `Ruleset` as a UTC timestamp string.
      */
    val createTime: String
    
    /**
      * Name of the `Ruleset` as a short string. This can be directly passed into APIs
      * like {@link SecurityRules.getRuleset} and {@link SecurityRules.deleteRuleset}.
      */
    val name: String
  }
  object RulesetMetadata {
    
    inline def apply(createTime: String, name: String): RulesetMetadata = {
      val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RulesetMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RulesetMetadata] (val x: Self) extends AnyVal {
      
      inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
