package typings.firebaseAdmin

import typings.firebaseAdmin.anon.Force
import typings.firebaseAdmin.coreMod.App
import typings.firebaseAdmin.remoteConfigApiMod.ListVersionsOptions
import typings.firebaseAdmin.remoteConfigApiMod.ListVersionsResult
import typings.firebaseAdmin.remoteConfigApiMod.RemoteConfigTemplate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remoteConfigRemoteConfigMod {
  
  @JSImport("firebase-admin/lib/remote-config/remote-config", "RemoteConfig")
  @js.native
  open class RemoteConfig () extends StObject {
    
    val app: App = js.native
    
    /* private */ val client: Any = js.native
    
    /**
      * Creates and returns a new Remote Config template from a JSON string.
      *
      * @param json - The JSON string to populate a Remote Config template.
      *
      * @returns A new template instance.
      */
    def createTemplateFromJSON(json: String): RemoteConfigTemplate = js.native
    
    /**
      * Gets the current active version of the {@link RemoteConfigTemplate} of the project.
      *
      * @returns A promise that fulfills with a `RemoteConfigTemplate`.
      */
    def getTemplate(): js.Promise[RemoteConfigTemplate] = js.native
    
    def getTemplateAtVersion(versionNumber: String): js.Promise[RemoteConfigTemplate] = js.native
    /**
      * Gets the requested version of the {@link RemoteConfigTemplate} of the project.
      *
      * @param versionNumber - Version number of the Remote Config template to look up.
      *
      * @returns A promise that fulfills with a `RemoteConfigTemplate`.
      */
    def getTemplateAtVersion(versionNumber: Double): js.Promise[RemoteConfigTemplate] = js.native
    
    /**
      * Gets a list of Remote Config template versions that have been published, sorted in reverse
      * chronological order. Only the last 300 versions are stored.
      * All versions that correspond to non-active Remote Config templates (i.e., all except the
      * template that is being fetched by clients) are also deleted if they are older than 90 days.
      *
      * @param options - Optional options object for getting a list of versions.
      * @returns A promise that fulfills with a `ListVersionsResult`.
      */
    def listVersions(): js.Promise[ListVersionsResult] = js.native
    def listVersions(options: ListVersionsOptions): js.Promise[ListVersionsResult] = js.native
    
    /**
      * Publishes a Remote Config template.
      *
      * @param template - The Remote Config template to be published.
      * @param options - Optional options object when publishing a Remote Config template:
      *    - `force`: Setting this to `true` forces the Remote Config template to
      *      be updated and circumvent the ETag. This approach is not recommended
      *      because it risks causing the loss of updates to your Remote Config
      *      template if multiple clients are updating the Remote Config template.
      *      See {@link https://firebase.google.com/docs/remote-config/use-config-rest#etag_usage_and_forced_updates |
      *      ETag usage and forced updates}.
      *
      * @returns A Promise that fulfills with the published `RemoteConfigTemplate`.
      */
    def publishTemplate(template: RemoteConfigTemplate): js.Promise[RemoteConfigTemplate] = js.native
    def publishTemplate(template: RemoteConfigTemplate, options: Force): js.Promise[RemoteConfigTemplate] = js.native
    
    def rollback(versionNumber: String): js.Promise[RemoteConfigTemplate] = js.native
    /**
      * Rolls back a project's published Remote Config template to the specified version.
      * A rollback is equivalent to getting a previously published Remote Config
      * template and re-publishing it using a force update.
      *
      * @param versionNumber - The version number of the Remote Config template to roll back to.
      *    The specified version number must be lower than the current version number, and not have
      *    been deleted due to staleness. Only the last 300 versions are stored.
      *    All versions that correspond to non-active Remote Config templates (that is, all except the
      *    template that is being fetched by clients) are also deleted if they are more than 90 days old.
      * @returns A promise that fulfills with the published `RemoteConfigTemplate`.
      */
    def rollback(versionNumber: Double): js.Promise[RemoteConfigTemplate] = js.native
    
    /**
      * Validates a {@link RemoteConfigTemplate}.
      *
      * @param template - The Remote Config template to be validated.
      * @returns A promise that fulfills with the validated `RemoteConfigTemplate`.
      */
    def validateTemplate(template: RemoteConfigTemplate): js.Promise[RemoteConfigTemplate] = js.native
  }
}
