package typings.firebaseAdmin

import typings.firebaseAdmin.libAuthProjectConfigMod.ProjectConfig
import typings.firebaseAdmin.libAuthProjectConfigMod.UpdateProjectConfigRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAuthProjectConfigManagerMod {
  
  @JSImport("firebase-admin/lib/auth/project-config-manager", "ProjectConfigManager")
  @js.native
  open class ProjectConfigManager () extends StObject {
    
    /* private */ val authRequestHandler: Any = js.native
    
    /**
      * Get the project configuration.
      *
      * @returns A promise fulfilled with the project configuration.
      */
    def getProjectConfig(): js.Promise[ProjectConfig] = js.native
    
    /**
      * Updates an existing project configuration.
      *
      * @param projectConfigOptions - The properties to update on the project.
      *
      * @returns A promise fulfilled with the updated project config.
      */
    def updateProjectConfig(projectConfigOptions: UpdateProjectConfigRequest): js.Promise[ProjectConfig] = js.native
  }
}
