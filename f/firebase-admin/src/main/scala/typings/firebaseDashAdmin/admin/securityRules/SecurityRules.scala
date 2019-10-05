package typings.firebaseDashAdmin.admin.securityRules

import typings.firebaseDashAdmin.admin.app.App
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Firebase `SecurityRules` service interface.
  *
  * Do not call this constructor directly. Instead, use
  * [`admin.securityRules()`](admin.securityRules#securityRules).
  */
@js.native
trait SecurityRules extends js.Object {
  var app: App = js.native
  /**
    * Creates a {@link admin.securityRules.RulesFile `RuleFile`} with the given name
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
    * Creates a new {@link admin.securityRules.Ruleset `Ruleset`} from the given
    * {@link admin.securityRules.RulesFile `RuleFile`}.
    *
    * @param file Rules file to include in the new `Ruleset`.
    * @returns A promise that fulfills with the newly created `Ruleset`.
    */
  def createRuleset(file: RulesFile): js.Promise[Ruleset] = js.native
  /**
    * Deletes the {@link admin.securityRules.Ruleset `Ruleset`} identified by the given
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
    * Gets the {@link admin.securityRules.Ruleset `Ruleset`} currently applied to
    * Cloud Firestore. Rejects with a `not-found` error if no ruleset is applied
    * on Firestore.
    *
    * @return A promise that fulfills with the Firestore ruleset.
    */
  def getFirestoreRuleset(): js.Promise[Ruleset] = js.native
  /**
    * Gets the {@link admin.securityRules.Ruleset `Ruleset`} identified by the given
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
    * Gets the {@link admin.securityRules.Ruleset `Ruleset`} currently applied to a
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
  /**
    * Applies the specified {@link admin.securityRules.Ruleset `Ruleset`} ruleset
    * to Cloud Firestore.
    *
    * @param ruleset Name of the ruleset to apply or a `RulesetMetadata` object
    *   containing the name.
    * @return A promise that fulfills when the ruleset is released.
    */
  def releaseFirestoreRuleset(ruleset: String): js.Promise[Unit] = js.native
  def releaseFirestoreRuleset(ruleset: RulesetMetadata): js.Promise[Unit] = js.native
  /**
    * Creates a new {@link admin.securityRules.Ruleset `Ruleset`} from the given
    * source, and applies it to Cloud Firestore.
    *
    * @param source Rules source to apply.
    * @return A promise that fulfills when the ruleset is created and released.
    */
  def releaseFirestoreRulesetFromSource(source: String): js.Promise[Ruleset] = js.native
  def releaseFirestoreRulesetFromSource(source: Buffer): js.Promise[Ruleset] = js.native
  /**
    * Applies the specified {@link admin.securityRules.Ruleset `Ruleset`} ruleset
    * to a Cloud Storage bucket.
    *
    * @param ruleset Name of the ruleset to apply or a `RulesetMetadata` object
    *   containing the name.
    * @param bucket Optional name of the Cloud Storage bucket to apply the rules on. If
    *   not specified, applies the ruleset on the default bucket configured via
    *   {@link admin.AppOptions `AppOptions`}.
    * @return A promise that fulfills when the ruleset is released.
    */
  def releaseStorageRuleset(ruleset: String): js.Promise[Unit] = js.native
  def releaseStorageRuleset(ruleset: String, bucket: String): js.Promise[Unit] = js.native
  def releaseStorageRuleset(ruleset: RulesetMetadata): js.Promise[Unit] = js.native
  def releaseStorageRuleset(ruleset: RulesetMetadata, bucket: String): js.Promise[Unit] = js.native
  /**
    * Creates a new {@link admin.securityRules.Ruleset `Ruleset`} from the given
    * source, and applies it to a Cloud Storage bucket.
    *
    * @param source Rules source to apply.
    * @param bucket Optional name of the Cloud Storage bucket to apply the rules on. If
    *   not specified, applies the ruleset on the default bucket configured via
    *   {@link admin.AppOptions `AppOptions`}.
    * @return A promise that fulfills when the ruleset is created and released.
    */
  def releaseStorageRulesetFromSource(source: String): js.Promise[Ruleset] = js.native
  def releaseStorageRulesetFromSource(source: String, bucket: String): js.Promise[Ruleset] = js.native
  def releaseStorageRulesetFromSource(source: Buffer): js.Promise[Ruleset] = js.native
  def releaseStorageRulesetFromSource(source: Buffer, bucket: String): js.Promise[Ruleset] = js.native
}

