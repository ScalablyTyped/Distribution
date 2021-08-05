package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.TagManager.Collection.Accounts.Containers.EnvironmentsCollection
import typings.googleAppsScript.GoogleAppsScript.TagManager.Collection.Accounts.Containers.VersionHeadersCollection
import typings.googleAppsScript.GoogleAppsScript.TagManager.Collection.Accounts.Containers.VersionsCollection
import typings.googleAppsScript.GoogleAppsScript.TagManager.Collection.Accounts.Containers.Workspaces.BuiltInVariablesCollection
import typings.googleAppsScript.GoogleAppsScript.TagManager.Collection.Accounts.Containers.Workspaces.FoldersCollection
import typings.googleAppsScript.GoogleAppsScript.TagManager.Collection.Accounts.Containers.Workspaces.TagsCollection
import typings.googleAppsScript.GoogleAppsScript.TagManager.Collection.Accounts.Containers.Workspaces.TriggersCollection
import typings.googleAppsScript.GoogleAppsScript.TagManager.Collection.Accounts.Containers.Workspaces.VariablesCollection
import typings.googleAppsScript.GoogleAppsScript.TagManager.Collection.Accounts.Containers.Workspaces.ZonesCollection
import typings.googleAppsScript.GoogleAppsScript.TagManager.Collection.Accounts.Containers.WorkspacesCollection
import typings.googleAppsScript.GoogleAppsScript.TagManager.Collection.Accounts.ContainersCollection
import typings.googleAppsScript.GoogleAppsScript.TagManager.Collection.Accounts.UserPermissionsCollection
import typings.googleAppsScript.GoogleAppsScript.TagManager.Collection.AccountsCollection
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.Account
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.AccountAccess
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.BuiltInVariable
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.Condition
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.Container
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.ContainerAccess
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.ContainerVersion
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.ContainerVersionHeader
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.CreateBuiltInVariableResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.CreateContainerVersionRequestVersionOptions
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.CreateContainerVersionResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.CustomTemplate
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.Entity
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.Environment
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.Folder
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.FolderEntities
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.GetWorkspaceStatusResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.ListAccountsResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.ListContainerVersionsResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.ListContainersResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.ListEnabledBuiltInVariablesResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.ListEnvironmentsResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.ListFoldersResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.ListTagsResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.ListTriggersResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.ListUserPermissionsResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.ListVariablesResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.ListWorkspacesResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.ListZonesResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.Parameter
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.PublishContainerVersionResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.QuickPreviewResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.RevertBuiltInVariableResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.RevertFolderResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.RevertTagResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.RevertTriggerResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.RevertVariableResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.RevertZoneResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.SetupTag
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.SyncWorkspaceResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.Tag
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.TeardownTag
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.Timestamp
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.Trigger
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.UserPermission
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.Variable
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.VariableFormatValue
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.Workspace
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.Zone
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.ZoneBoundary
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.ZoneChildContainer
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.ZoneTypeRestriction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagManager extends StObject {
  
  var Accounts: js.UndefOr[AccountsCollection] = js.undefined
  
  // Create a new instance of Account
  def newAccount(): Account
  
  // Create a new instance of AccountAccess
  def newAccountAccess(): AccountAccess
  
  // Create a new instance of BuiltInVariable
  def newBuiltInVariable(): BuiltInVariable
  
  // Create a new instance of Condition
  def newCondition(): Condition
  
  // Create a new instance of Container
  def newContainer(): Container
  
  // Create a new instance of ContainerAccess
  def newContainerAccess(): ContainerAccess
  
  // Create a new instance of ContainerVersion
  def newContainerVersion(): ContainerVersion
  
  // Create a new instance of CreateContainerVersionRequestVersionOptions
  def newCreateContainerVersionRequestVersionOptions(): CreateContainerVersionRequestVersionOptions
  
  // Create a new instance of CustomTemplate
  def newCustomTemplate(): CustomTemplate
  
  // Create a new instance of Entity
  def newEntity(): Entity
  
  // Create a new instance of Environment
  def newEnvironment(): Environment
  
  // Create a new instance of Folder
  def newFolder(): Folder
  
  // Create a new instance of Parameter
  def newParameter(): Parameter
  
  // Create a new instance of SetupTag
  def newSetupTag(): SetupTag
  
  // Create a new instance of Tag
  def newTag(): Tag
  
  // Create a new instance of TeardownTag
  def newTeardownTag(): TeardownTag
  
  // Create a new instance of Timestamp
  def newTimestamp(): Timestamp
  
  // Create a new instance of Trigger
  def newTrigger(): Trigger
  
  // Create a new instance of UserPermission
  def newUserPermission(): UserPermission
  
  // Create a new instance of Variable
  def newVariable(): Variable
  
  // Create a new instance of VariableFormatValue
  def newVariableFormatValue(): VariableFormatValue
  
  // Create a new instance of Workspace
  def newWorkspace(): Workspace
  
  // Create a new instance of Zone
  def newZone(): Zone
  
  // Create a new instance of ZoneBoundary
  def newZoneBoundary(): ZoneBoundary
  
  // Create a new instance of ZoneChildContainer
  def newZoneChildContainer(): ZoneChildContainer
  
  // Create a new instance of ZoneTypeRestriction
  def newZoneTypeRestriction(): ZoneTypeRestriction
}
object TagManager {
  
  inline def apply(
    newAccount: () => Account,
    newAccountAccess: () => AccountAccess,
    newBuiltInVariable: () => BuiltInVariable,
    newCondition: () => Condition,
    newContainer: () => Container,
    newContainerAccess: () => ContainerAccess,
    newContainerVersion: () => ContainerVersion,
    newCreateContainerVersionRequestVersionOptions: () => CreateContainerVersionRequestVersionOptions,
    newCustomTemplate: () => CustomTemplate,
    newEntity: () => Entity,
    newEnvironment: () => Environment,
    newFolder: () => Folder,
    newParameter: () => Parameter,
    newSetupTag: () => SetupTag,
    newTag: () => Tag,
    newTeardownTag: () => TeardownTag,
    newTimestamp: () => Timestamp,
    newTrigger: () => Trigger,
    newUserPermission: () => UserPermission,
    newVariable: () => Variable,
    newVariableFormatValue: () => VariableFormatValue,
    newWorkspace: () => Workspace,
    newZone: () => Zone,
    newZoneBoundary: () => ZoneBoundary,
    newZoneChildContainer: () => ZoneChildContainer,
    newZoneTypeRestriction: () => ZoneTypeRestriction
  ): TagManager = {
    val __obj = js.Dynamic.literal(newAccount = js.Any.fromFunction0(newAccount), newAccountAccess = js.Any.fromFunction0(newAccountAccess), newBuiltInVariable = js.Any.fromFunction0(newBuiltInVariable), newCondition = js.Any.fromFunction0(newCondition), newContainer = js.Any.fromFunction0(newContainer), newContainerAccess = js.Any.fromFunction0(newContainerAccess), newContainerVersion = js.Any.fromFunction0(newContainerVersion), newCreateContainerVersionRequestVersionOptions = js.Any.fromFunction0(newCreateContainerVersionRequestVersionOptions), newCustomTemplate = js.Any.fromFunction0(newCustomTemplate), newEntity = js.Any.fromFunction0(newEntity), newEnvironment = js.Any.fromFunction0(newEnvironment), newFolder = js.Any.fromFunction0(newFolder), newParameter = js.Any.fromFunction0(newParameter), newSetupTag = js.Any.fromFunction0(newSetupTag), newTag = js.Any.fromFunction0(newTag), newTeardownTag = js.Any.fromFunction0(newTeardownTag), newTimestamp = js.Any.fromFunction0(newTimestamp), newTrigger = js.Any.fromFunction0(newTrigger), newUserPermission = js.Any.fromFunction0(newUserPermission), newVariable = js.Any.fromFunction0(newVariable), newVariableFormatValue = js.Any.fromFunction0(newVariableFormatValue), newWorkspace = js.Any.fromFunction0(newWorkspace), newZone = js.Any.fromFunction0(newZone), newZoneBoundary = js.Any.fromFunction0(newZoneBoundary), newZoneChildContainer = js.Any.fromFunction0(newZoneChildContainer), newZoneTypeRestriction = js.Any.fromFunction0(newZoneTypeRestriction))
    __obj.asInstanceOf[TagManager]
  }
  
  object Collection {
    
    object Accounts {
      
      object Containers {
        
        @js.native
        trait EnvironmentsCollection extends StObject {
          
          // Creates a GTM Environment.
          def create(resource: Environment, parent: String): Environment = js.native
          
          // Gets a GTM Environment.
          def get(path: String): Environment = js.native
          
          // Lists all GTM Environments of a GTM Container.
          def list(parent: String): ListEnvironmentsResponse = js.native
          // Lists all GTM Environments of a GTM Container.
          def list(parent: String, optionalArgs: js.Object): ListEnvironmentsResponse = js.native
          
          // Re-generates the authorization code for a GTM Environment.
          def reauthorize(resource: Environment, path: String): Environment = js.native
          
          // Deletes a GTM Environment.
          def remove(path: String): Unit = js.native
          
          // Updates a GTM Environment.
          def update(resource: Environment, path: String): Environment = js.native
          // Updates a GTM Environment.
          def update(resource: Environment, path: String, optionalArgs: js.Object): Environment = js.native
        }
        
        @js.native
        trait VersionHeadersCollection extends StObject {
          
          // Gets the latest container version header
          def latest(parent: String): ContainerVersionHeader = js.native
          
          // Lists all Container Versions of a GTM Container.
          def list(parent: String): ListContainerVersionsResponse = js.native
          // Lists all Container Versions of a GTM Container.
          def list(parent: String, optionalArgs: js.Object): ListContainerVersionsResponse = js.native
        }
        
        @js.native
        trait VersionsCollection extends StObject {
          
          // Gets a Container Version.
          def get(path: String): ContainerVersion = js.native
          // Gets a Container Version.
          def get(path: String, optionalArgs: js.Object): ContainerVersion = js.native
          
          // Gets the live (i.e. published) container version
          def live(parent: String): ContainerVersion = js.native
          
          // Publishes a Container Version.
          def publish(path: String): PublishContainerVersionResponse = js.native
          // Publishes a Container Version.
          def publish(path: String, optionalArgs: js.Object): PublishContainerVersionResponse = js.native
          
          // Deletes a Container Version.
          def remove(path: String): Unit = js.native
          
          // Sets the latest version used for synchronization of workspaces when detecting conflicts and errors.
          def set_latest(path: String): ContainerVersion = js.native
          
          // Undeletes a Container Version.
          def undelete(path: String): ContainerVersion = js.native
          
          // Updates a Container Version.
          def update(resource: ContainerVersion, path: String): ContainerVersion = js.native
          // Updates a Container Version.
          def update(resource: ContainerVersion, path: String, optionalArgs: js.Object): ContainerVersion = js.native
        }
        
        object Workspaces {
          
          @js.native
          trait BuiltInVariablesCollection extends StObject {
            
            // Creates one or more GTM Built-In Variables.
            def create(parent: String): CreateBuiltInVariableResponse = js.native
            // Creates one or more GTM Built-In Variables.
            def create(parent: String, optionalArgs: js.Object): CreateBuiltInVariableResponse = js.native
            
            // Lists all the enabled Built-In Variables of a GTM Container.
            def list(parent: String): ListEnabledBuiltInVariablesResponse = js.native
            // Lists all the enabled Built-In Variables of a GTM Container.
            def list(parent: String, optionalArgs: js.Object): ListEnabledBuiltInVariablesResponse = js.native
            
            // Deletes one or more GTM Built-In Variables.
            def remove(path: String): Unit = js.native
            // Deletes one or more GTM Built-In Variables.
            def remove(path: String, optionalArgs: js.Object): Unit = js.native
            
            // Reverts changes to a GTM Built-In Variables in a GTM Workspace.
            def revert(path: String): RevertBuiltInVariableResponse = js.native
            // Reverts changes to a GTM Built-In Variables in a GTM Workspace.
            def revert(path: String, optionalArgs: js.Object): RevertBuiltInVariableResponse = js.native
          }
          
          @js.native
          trait FoldersCollection extends StObject {
            
            // Creates a GTM Folder.
            def create(resource: Folder, parent: String): Folder = js.native
            
            // List all entities in a GTM Folder.
            def entities(path: String): FolderEntities = js.native
            // List all entities in a GTM Folder.
            def entities(path: String, optionalArgs: js.Object): FolderEntities = js.native
            
            // Gets a GTM Folder.
            def get(path: String): Folder = js.native
            
            // Lists all GTM Folders of a Container.
            def list(parent: String): ListFoldersResponse = js.native
            // Lists all GTM Folders of a Container.
            def list(parent: String, optionalArgs: js.Object): ListFoldersResponse = js.native
            
            // Moves entities to a GTM Folder.
            def move_entities_to_folder(resource: Folder, path: String): Unit = js.native
            // Moves entities to a GTM Folder.
            def move_entities_to_folder(resource: Folder, path: String, optionalArgs: js.Object): Unit = js.native
            
            // Deletes a GTM Folder.
            def remove(path: String): Unit = js.native
            
            // Reverts changes to a GTM Folder in a GTM Workspace.
            def revert(path: String): RevertFolderResponse = js.native
            // Reverts changes to a GTM Folder in a GTM Workspace.
            def revert(path: String, optionalArgs: js.Object): RevertFolderResponse = js.native
            
            // Updates a GTM Folder.
            def update(resource: Folder, path: String): Folder = js.native
            // Updates a GTM Folder.
            def update(resource: Folder, path: String, optionalArgs: js.Object): Folder = js.native
          }
          
          @js.native
          trait TagsCollection extends StObject {
            
            // Creates a GTM Tag.
            def create(resource: Tag, parent: String): Tag = js.native
            
            // Gets a GTM Tag.
            def get(path: String): Tag = js.native
            
            // Lists all GTM Tags of a Container.
            def list(parent: String): ListTagsResponse = js.native
            // Lists all GTM Tags of a Container.
            def list(parent: String, optionalArgs: js.Object): ListTagsResponse = js.native
            
            // Deletes a GTM Tag.
            def remove(path: String): Unit = js.native
            
            // Reverts changes to a GTM Tag in a GTM Workspace.
            def revert(path: String): RevertTagResponse = js.native
            // Reverts changes to a GTM Tag in a GTM Workspace.
            def revert(path: String, optionalArgs: js.Object): RevertTagResponse = js.native
            
            // Updates a GTM Tag.
            def update(resource: Tag, path: String): Tag = js.native
            // Updates a GTM Tag.
            def update(resource: Tag, path: String, optionalArgs: js.Object): Tag = js.native
          }
          
          @js.native
          trait TriggersCollection extends StObject {
            
            // Creates a GTM Trigger.
            def create(resource: Trigger, parent: String): Trigger = js.native
            
            // Gets a GTM Trigger.
            def get(path: String): Trigger = js.native
            
            // Lists all GTM Triggers of a Container.
            def list(parent: String): ListTriggersResponse = js.native
            // Lists all GTM Triggers of a Container.
            def list(parent: String, optionalArgs: js.Object): ListTriggersResponse = js.native
            
            // Deletes a GTM Trigger.
            def remove(path: String): Unit = js.native
            
            // Reverts changes to a GTM Trigger in a GTM Workspace.
            def revert(path: String): RevertTriggerResponse = js.native
            // Reverts changes to a GTM Trigger in a GTM Workspace.
            def revert(path: String, optionalArgs: js.Object): RevertTriggerResponse = js.native
            
            // Updates a GTM Trigger.
            def update(resource: Trigger, path: String): Trigger = js.native
            // Updates a GTM Trigger.
            def update(resource: Trigger, path: String, optionalArgs: js.Object): Trigger = js.native
          }
          
          @js.native
          trait VariablesCollection extends StObject {
            
            // Creates a GTM Variable.
            def create(resource: Variable, parent: String): Variable = js.native
            
            // Gets a GTM Variable.
            def get(path: String): Variable = js.native
            
            // Lists all GTM Variables of a Container.
            def list(parent: String): ListVariablesResponse = js.native
            // Lists all GTM Variables of a Container.
            def list(parent: String, optionalArgs: js.Object): ListVariablesResponse = js.native
            
            // Deletes a GTM Variable.
            def remove(path: String): Unit = js.native
            
            // Reverts changes to a GTM Variable in a GTM Workspace.
            def revert(path: String): RevertVariableResponse = js.native
            // Reverts changes to a GTM Variable in a GTM Workspace.
            def revert(path: String, optionalArgs: js.Object): RevertVariableResponse = js.native
            
            // Updates a GTM Variable.
            def update(resource: Variable, path: String): Variable = js.native
            // Updates a GTM Variable.
            def update(resource: Variable, path: String, optionalArgs: js.Object): Variable = js.native
          }
          
          @js.native
          trait ZonesCollection extends StObject {
            
            // Creates a GTM Zone.
            def create(resource: Zone, parent: String): Zone = js.native
            
            // Gets a GTM Zone.
            def get(path: String): Zone = js.native
            
            // Lists all GTM Zones of a GTM container workspace.
            def list(parent: String): ListZonesResponse = js.native
            // Lists all GTM Zones of a GTM container workspace.
            def list(parent: String, optionalArgs: js.Object): ListZonesResponse = js.native
            
            // Deletes a GTM Zone.
            def remove(path: String): Unit = js.native
            
            // Reverts changes to a GTM Zone in a GTM Workspace.
            def revert(path: String): RevertZoneResponse = js.native
            // Reverts changes to a GTM Zone in a GTM Workspace.
            def revert(path: String, optionalArgs: js.Object): RevertZoneResponse = js.native
            
            // Updates a GTM Zone.
            def update(resource: Zone, path: String): Zone = js.native
            // Updates a GTM Zone.
            def update(resource: Zone, path: String, optionalArgs: js.Object): Zone = js.native
          }
        }
        
        @js.native
        trait WorkspacesCollection extends StObject {
          
          var Built_in_variables: js.UndefOr[BuiltInVariablesCollection] = js.native
          
          var Folders: js.UndefOr[FoldersCollection] = js.native
          
          var Tags: js.UndefOr[TagsCollection] = js.native
          
          var Triggers: js.UndefOr[TriggersCollection] = js.native
          
          var Variables: js.UndefOr[VariablesCollection] = js.native
          
          var Zones: js.UndefOr[ZonesCollection] = js.native
          
          // Creates a Workspace.
          def create(resource: Workspace, parent: String): Workspace = js.native
          
          // Creates a Container Version from the entities present in the workspace, deletes the workspace, and sets the base container version to the newly created version.
          def create_version(resource: CreateContainerVersionRequestVersionOptions, path: String): CreateContainerVersionResponse = js.native
          
          // Gets a Workspace.
          def get(path: String): Workspace = js.native
          
          // Finds conflicting and modified entities in the workspace.
          def getStatus(path: String): GetWorkspaceStatusResponse = js.native
          
          // Lists all Workspaces that belong to a GTM Container.
          def list(parent: String): ListWorkspacesResponse = js.native
          // Lists all Workspaces that belong to a GTM Container.
          def list(parent: String, optionalArgs: js.Object): ListWorkspacesResponse = js.native
          
          // Quick previews a workspace by creating a fake container version from all entities in the provided workspace.
          def quick_preview(path: String): QuickPreviewResponse = js.native
          
          // Deletes a Workspace.
          def remove(path: String): Unit = js.native
          
          // Resolves a merge conflict for a workspace entity by updating it to the resolved entity passed in the request.
          def resolve_conflict(resource: Entity, path: String): Unit = js.native
          // Resolves a merge conflict for a workspace entity by updating it to the resolved entity passed in the request.
          def resolve_conflict(resource: Entity, path: String, optionalArgs: js.Object): Unit = js.native
          
          // Syncs a workspace to the latest container version by updating all unmodified workspace entities and displaying conflicts for modified entities.
          def sync(path: String): SyncWorkspaceResponse = js.native
          
          // Updates a Workspace.
          def update(resource: Workspace, path: String): Workspace = js.native
          // Updates a Workspace.
          def update(resource: Workspace, path: String, optionalArgs: js.Object): Workspace = js.native
        }
      }
      
      @js.native
      trait ContainersCollection extends StObject {
        
        var Environments: js.UndefOr[EnvironmentsCollection] = js.native
        
        var Version_headers: js.UndefOr[VersionHeadersCollection] = js.native
        
        var Versions: js.UndefOr[VersionsCollection] = js.native
        
        var Workspaces: js.UndefOr[WorkspacesCollection] = js.native
        
        // Creates a Container.
        def create(resource: Container, parent: String): Container = js.native
        
        // Gets a Container.
        def get(path: String): Container = js.native
        
        // Lists all Containers that belongs to a GTM Account.
        def list(parent: String): ListContainersResponse = js.native
        // Lists all Containers that belongs to a GTM Account.
        def list(parent: String, optionalArgs: js.Object): ListContainersResponse = js.native
        
        // Deletes a Container.
        def remove(path: String): Unit = js.native
        
        // Updates a Container.
        def update(resource: Container, path: String): Container = js.native
        // Updates a Container.
        def update(resource: Container, path: String, optionalArgs: js.Object): Container = js.native
      }
      
      @js.native
      trait UserPermissionsCollection extends StObject {
        
        // Creates a user's Account & Container access.
        def create(resource: UserPermission, parent: String): UserPermission = js.native
        
        // Gets a user's Account & Container access.
        def get(path: String): UserPermission = js.native
        
        // List all users that have access to the account along with Account and Container user access granted to each of them.
        def list(parent: String): ListUserPermissionsResponse = js.native
        // List all users that have access to the account along with Account and Container user access granted to each of them.
        def list(parent: String, optionalArgs: js.Object): ListUserPermissionsResponse = js.native
        
        // Removes a user from the account, revoking access to it and all of its containers.
        def remove(path: String): Unit = js.native
        
        // Updates a user's Account & Container access.
        def update(resource: UserPermission, path: String): UserPermission = js.native
      }
    }
    
    @js.native
    trait AccountsCollection extends StObject {
      
      var Containers: js.UndefOr[ContainersCollection] = js.native
      
      var User_permissions: js.UndefOr[UserPermissionsCollection] = js.native
      
      // Gets a GTM Account.
      def get(path: String): Account = js.native
      
      // Lists all GTM Accounts that a user has access to.
      def list(): ListAccountsResponse = js.native
      // Lists all GTM Accounts that a user has access to.
      def list(optionalArgs: js.Object): ListAccountsResponse = js.native
      
      // Updates a GTM Account.
      def update(resource: Account, path: String): Account = js.native
      // Updates a GTM Account.
      def update(resource: Account, path: String, optionalArgs: js.Object): Account = js.native
    }
  }
  
  object Schema {
    
    trait Account extends StObject {
      
      var accountId: js.UndefOr[String] = js.undefined
      
      var fingerprint: js.UndefOr[String] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var path: js.UndefOr[String] = js.undefined
      
      var shareData: js.UndefOr[Boolean] = js.undefined
      
      var tagManagerUrl: js.UndefOr[String] = js.undefined
    }
    object Account {
      
      inline def apply(): Account = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Account]
      }
      
      extension [Self <: Account](x: Self) {
        
        inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
        
        inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
        
        inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
        
        inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setShareData(value: Boolean): Self = StObject.set(x, "shareData", value.asInstanceOf[js.Any])
        
        inline def setShareDataUndefined: Self = StObject.set(x, "shareData", js.undefined)
        
        inline def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
        
        inline def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
      }
    }
    
    trait AccountAccess extends StObject {
      
      var permission: js.UndefOr[String] = js.undefined
    }
    object AccountAccess {
      
      inline def apply(): AccountAccess = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AccountAccess]
      }
      
      extension [Self <: AccountAccess](x: Self) {
        
        inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
        
        inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
      }
    }
    
    trait BuiltInVariable extends StObject {
      
      var accountId: js.UndefOr[String] = js.undefined
      
      var containerId: js.UndefOr[String] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var path: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
      
      var workspaceId: js.UndefOr[String] = js.undefined
    }
    object BuiltInVariable {
      
      inline def apply(): BuiltInVariable = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BuiltInVariable]
      }
      
      extension [Self <: BuiltInVariable](x: Self) {
        
        inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
        
        inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
        
        inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
        
        inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
        
        inline def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
      }
    }
    
    trait Condition extends StObject {
      
      var parameter: js.UndefOr[js.Array[Parameter]] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object Condition {
      
      inline def apply(): Condition = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Condition]
      }
      
      extension [Self <: Condition](x: Self) {
        
        inline def setParameter(value: js.Array[Parameter]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
        
        inline def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
        
        inline def setParameterVarargs(value: Parameter*): Self = StObject.set(x, "parameter", js.Array(value :_*))
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait Container extends StObject {
      
      var accountId: js.UndefOr[String] = js.undefined
      
      var containerId: js.UndefOr[String] = js.undefined
      
      var domainName: js.UndefOr[js.Array[String]] = js.undefined
      
      var fingerprint: js.UndefOr[String] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var notes: js.UndefOr[String] = js.undefined
      
      var path: js.UndefOr[String] = js.undefined
      
      var publicId: js.UndefOr[String] = js.undefined
      
      var tagManagerUrl: js.UndefOr[String] = js.undefined
      
      var usageContext: js.UndefOr[js.Array[String]] = js.undefined
    }
    object Container {
      
      inline def apply(): Container = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Container]
      }
      
      extension [Self <: Container](x: Self) {
        
        inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
        
        inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
        
        inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
        
        inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
        
        inline def setDomainName(value: js.Array[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
        
        inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
        
        inline def setDomainNameVarargs(value: String*): Self = StObject.set(x, "domainName", js.Array(value :_*))
        
        inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
        
        inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
        
        inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
        
        inline def setPublicIdUndefined: Self = StObject.set(x, "publicId", js.undefined)
        
        inline def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
        
        inline def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
        
        inline def setUsageContext(value: js.Array[String]): Self = StObject.set(x, "usageContext", value.asInstanceOf[js.Any])
        
        inline def setUsageContextUndefined: Self = StObject.set(x, "usageContext", js.undefined)
        
        inline def setUsageContextVarargs(value: String*): Self = StObject.set(x, "usageContext", js.Array(value :_*))
      }
    }
    
    trait ContainerAccess extends StObject {
      
      var containerId: js.UndefOr[String] = js.undefined
      
      var permission: js.UndefOr[String] = js.undefined
    }
    object ContainerAccess {
      
      inline def apply(): ContainerAccess = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ContainerAccess]
      }
      
      extension [Self <: ContainerAccess](x: Self) {
        
        inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
        
        inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
        
        inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
        
        inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
      }
    }
    
    trait ContainerVersion extends StObject {
      
      var accountId: js.UndefOr[String] = js.undefined
      
      var builtInVariable: js.UndefOr[js.Array[BuiltInVariable]] = js.undefined
      
      var container: js.UndefOr[Container] = js.undefined
      
      var containerId: js.UndefOr[String] = js.undefined
      
      var containerVersionId: js.UndefOr[String] = js.undefined
      
      var customTemplate: js.UndefOr[js.Array[CustomTemplate]] = js.undefined
      
      var deleted: js.UndefOr[Boolean] = js.undefined
      
      var description: js.UndefOr[String] = js.undefined
      
      var fingerprint: js.UndefOr[String] = js.undefined
      
      var folder: js.UndefOr[js.Array[Folder]] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var path: js.UndefOr[String] = js.undefined
      
      var tag: js.UndefOr[js.Array[Tag]] = js.undefined
      
      var tagManagerUrl: js.UndefOr[String] = js.undefined
      
      var trigger: js.UndefOr[js.Array[Trigger]] = js.undefined
      
      var variable: js.UndefOr[js.Array[Variable]] = js.undefined
      
      var zone: js.UndefOr[js.Array[Zone]] = js.undefined
    }
    object ContainerVersion {
      
      inline def apply(): ContainerVersion = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ContainerVersion]
      }
      
      extension [Self <: ContainerVersion](x: Self) {
        
        inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
        
        inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
        
        inline def setBuiltInVariable(value: js.Array[BuiltInVariable]): Self = StObject.set(x, "builtInVariable", value.asInstanceOf[js.Any])
        
        inline def setBuiltInVariableUndefined: Self = StObject.set(x, "builtInVariable", js.undefined)
        
        inline def setBuiltInVariableVarargs(value: BuiltInVariable*): Self = StObject.set(x, "builtInVariable", js.Array(value :_*))
        
        inline def setContainer(value: Container): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
        
        inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
        
        inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
        
        inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
        
        inline def setContainerVersionId(value: String): Self = StObject.set(x, "containerVersionId", value.asInstanceOf[js.Any])
        
        inline def setContainerVersionIdUndefined: Self = StObject.set(x, "containerVersionId", js.undefined)
        
        inline def setCustomTemplate(value: js.Array[CustomTemplate]): Self = StObject.set(x, "customTemplate", value.asInstanceOf[js.Any])
        
        inline def setCustomTemplateUndefined: Self = StObject.set(x, "customTemplate", js.undefined)
        
        inline def setCustomTemplateVarargs(value: CustomTemplate*): Self = StObject.set(x, "customTemplate", js.Array(value :_*))
        
        inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
        
        inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
        
        inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
        
        inline def setFolder(value: js.Array[Folder]): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
        
        inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
        
        inline def setFolderVarargs(value: Folder*): Self = StObject.set(x, "folder", js.Array(value :_*))
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setTag(value: js.Array[Tag]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
        
        inline def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
        
        inline def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
        
        inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
        
        inline def setTagVarargs(value: Tag*): Self = StObject.set(x, "tag", js.Array(value :_*))
        
        inline def setTrigger(value: js.Array[Trigger]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
        
        inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
        
        inline def setTriggerVarargs(value: Trigger*): Self = StObject.set(x, "trigger", js.Array(value :_*))
        
        inline def setVariable(value: js.Array[Variable]): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
        
        inline def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
        
        inline def setVariableVarargs(value: Variable*): Self = StObject.set(x, "variable", js.Array(value :_*))
        
        inline def setZone(value: js.Array[Zone]): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
        
        inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
        
        inline def setZoneVarargs(value: Zone*): Self = StObject.set(x, "zone", js.Array(value :_*))
      }
    }
    
    trait ContainerVersionHeader extends StObject {
      
      var accountId: js.UndefOr[String] = js.undefined
      
      var containerId: js.UndefOr[String] = js.undefined
      
      var containerVersionId: js.UndefOr[String] = js.undefined
      
      var deleted: js.UndefOr[Boolean] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var numCustomTemplates: js.UndefOr[String] = js.undefined
      
      var numMacros: js.UndefOr[String] = js.undefined
      
      var numRules: js.UndefOr[String] = js.undefined
      
      var numTags: js.UndefOr[String] = js.undefined
      
      var numTriggers: js.UndefOr[String] = js.undefined
      
      var numVariables: js.UndefOr[String] = js.undefined
      
      var numZones: js.UndefOr[String] = js.undefined
      
      var path: js.UndefOr[String] = js.undefined
    }
    object ContainerVersionHeader {
      
      inline def apply(): ContainerVersionHeader = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ContainerVersionHeader]
      }
      
      extension [Self <: ContainerVersionHeader](x: Self) {
        
        inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
        
        inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
        
        inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
        
        inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
        
        inline def setContainerVersionId(value: String): Self = StObject.set(x, "containerVersionId", value.asInstanceOf[js.Any])
        
        inline def setContainerVersionIdUndefined: Self = StObject.set(x, "containerVersionId", js.undefined)
        
        inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
        
        inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setNumCustomTemplates(value: String): Self = StObject.set(x, "numCustomTemplates", value.asInstanceOf[js.Any])
        
        inline def setNumCustomTemplatesUndefined: Self = StObject.set(x, "numCustomTemplates", js.undefined)
        
        inline def setNumMacros(value: String): Self = StObject.set(x, "numMacros", value.asInstanceOf[js.Any])
        
        inline def setNumMacrosUndefined: Self = StObject.set(x, "numMacros", js.undefined)
        
        inline def setNumRules(value: String): Self = StObject.set(x, "numRules", value.asInstanceOf[js.Any])
        
        inline def setNumRulesUndefined: Self = StObject.set(x, "numRules", js.undefined)
        
        inline def setNumTags(value: String): Self = StObject.set(x, "numTags", value.asInstanceOf[js.Any])
        
        inline def setNumTagsUndefined: Self = StObject.set(x, "numTags", js.undefined)
        
        inline def setNumTriggers(value: String): Self = StObject.set(x, "numTriggers", value.asInstanceOf[js.Any])
        
        inline def setNumTriggersUndefined: Self = StObject.set(x, "numTriggers", js.undefined)
        
        inline def setNumVariables(value: String): Self = StObject.set(x, "numVariables", value.asInstanceOf[js.Any])
        
        inline def setNumVariablesUndefined: Self = StObject.set(x, "numVariables", js.undefined)
        
        inline def setNumZones(value: String): Self = StObject.set(x, "numZones", value.asInstanceOf[js.Any])
        
        inline def setNumZonesUndefined: Self = StObject.set(x, "numZones", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      }
    }
    
    trait CreateBuiltInVariableResponse extends StObject {
      
      var builtInVariable: js.UndefOr[js.Array[BuiltInVariable]] = js.undefined
    }
    object CreateBuiltInVariableResponse {
      
      inline def apply(): CreateBuiltInVariableResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateBuiltInVariableResponse]
      }
      
      extension [Self <: CreateBuiltInVariableResponse](x: Self) {
        
        inline def setBuiltInVariable(value: js.Array[BuiltInVariable]): Self = StObject.set(x, "builtInVariable", value.asInstanceOf[js.Any])
        
        inline def setBuiltInVariableUndefined: Self = StObject.set(x, "builtInVariable", js.undefined)
        
        inline def setBuiltInVariableVarargs(value: BuiltInVariable*): Self = StObject.set(x, "builtInVariable", js.Array(value :_*))
      }
    }
    
    trait CreateContainerVersionRequestVersionOptions extends StObject {
      
      var name: js.UndefOr[String] = js.undefined
      
      var notes: js.UndefOr[String] = js.undefined
    }
    object CreateContainerVersionRequestVersionOptions {
      
      inline def apply(): CreateContainerVersionRequestVersionOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateContainerVersionRequestVersionOptions]
      }
      
      extension [Self <: CreateContainerVersionRequestVersionOptions](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
        
        inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
      }
    }
    
    trait CreateContainerVersionResponse extends StObject {
      
      var compilerError: js.UndefOr[Boolean] = js.undefined
      
      var containerVersion: js.UndefOr[ContainerVersion] = js.undefined
      
      var newWorkspacePath: js.UndefOr[String] = js.undefined
      
      var syncStatus: js.UndefOr[SyncStatus] = js.undefined
    }
    object CreateContainerVersionResponse {
      
      inline def apply(): CreateContainerVersionResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateContainerVersionResponse]
      }
      
      extension [Self <: CreateContainerVersionResponse](x: Self) {
        
        inline def setCompilerError(value: Boolean): Self = StObject.set(x, "compilerError", value.asInstanceOf[js.Any])
        
        inline def setCompilerErrorUndefined: Self = StObject.set(x, "compilerError", js.undefined)
        
        inline def setContainerVersion(value: ContainerVersion): Self = StObject.set(x, "containerVersion", value.asInstanceOf[js.Any])
        
        inline def setContainerVersionUndefined: Self = StObject.set(x, "containerVersion", js.undefined)
        
        inline def setNewWorkspacePath(value: String): Self = StObject.set(x, "newWorkspacePath", value.asInstanceOf[js.Any])
        
        inline def setNewWorkspacePathUndefined: Self = StObject.set(x, "newWorkspacePath", js.undefined)
        
        inline def setSyncStatus(value: SyncStatus): Self = StObject.set(x, "syncStatus", value.asInstanceOf[js.Any])
        
        inline def setSyncStatusUndefined: Self = StObject.set(x, "syncStatus", js.undefined)
      }
    }
    
    trait CustomTemplate extends StObject {
      
      var accountId: js.UndefOr[String] = js.undefined
      
      var containerId: js.UndefOr[String] = js.undefined
      
      var fingerprint: js.UndefOr[String] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var path: js.UndefOr[String] = js.undefined
      
      var tagManagerUrl: js.UndefOr[String] = js.undefined
      
      var templateData: js.UndefOr[String] = js.undefined
      
      var templateId: js.UndefOr[String] = js.undefined
      
      var workspaceId: js.UndefOr[String] = js.undefined
    }
    object CustomTemplate {
      
      inline def apply(): CustomTemplate = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CustomTemplate]
      }
      
      extension [Self <: CustomTemplate](x: Self) {
        
        inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
        
        inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
        
        inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
        
        inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
        
        inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
        
        inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
        
        inline def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
        
        inline def setTemplateData(value: String): Self = StObject.set(x, "templateData", value.asInstanceOf[js.Any])
        
        inline def setTemplateDataUndefined: Self = StObject.set(x, "templateData", js.undefined)
        
        inline def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
        
        inline def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
        
        inline def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
        
        inline def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
      }
    }
    
    trait Entity extends StObject {
      
      var changeStatus: js.UndefOr[String] = js.undefined
      
      var folder: js.UndefOr[Folder] = js.undefined
      
      var tag: js.UndefOr[Tag] = js.undefined
      
      var trigger: js.UndefOr[Trigger] = js.undefined
      
      var variable: js.UndefOr[Variable] = js.undefined
    }
    object Entity {
      
      inline def apply(): Entity = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Entity]
      }
      
      extension [Self <: Entity](x: Self) {
        
        inline def setChangeStatus(value: String): Self = StObject.set(x, "changeStatus", value.asInstanceOf[js.Any])
        
        inline def setChangeStatusUndefined: Self = StObject.set(x, "changeStatus", js.undefined)
        
        inline def setFolder(value: Folder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
        
        inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
        
        inline def setTag(value: Tag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
        
        inline def setTrigger(value: Trigger): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
        
        inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
        
        inline def setVariable(value: Variable): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
        
        inline def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
      }
    }
    
    trait Environment extends StObject {
      
      var accountId: js.UndefOr[String] = js.undefined
      
      var authorizationCode: js.UndefOr[String] = js.undefined
      
      var authorizationTimestamp: js.UndefOr[Timestamp] = js.undefined
      
      var containerId: js.UndefOr[String] = js.undefined
      
      var containerVersionId: js.UndefOr[String] = js.undefined
      
      var description: js.UndefOr[String] = js.undefined
      
      var enableDebug: js.UndefOr[Boolean] = js.undefined
      
      var environmentId: js.UndefOr[String] = js.undefined
      
      var fingerprint: js.UndefOr[String] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var path: js.UndefOr[String] = js.undefined
      
      var tagManagerUrl: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
      
      var url: js.UndefOr[String] = js.undefined
      
      var workspaceId: js.UndefOr[String] = js.undefined
    }
    object Environment {
      
      inline def apply(): Environment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Environment]
      }
      
      extension [Self <: Environment](x: Self) {
        
        inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
        
        inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
        
        inline def setAuthorizationCode(value: String): Self = StObject.set(x, "authorizationCode", value.asInstanceOf[js.Any])
        
        inline def setAuthorizationCodeUndefined: Self = StObject.set(x, "authorizationCode", js.undefined)
        
        inline def setAuthorizationTimestamp(value: Timestamp): Self = StObject.set(x, "authorizationTimestamp", value.asInstanceOf[js.Any])
        
        inline def setAuthorizationTimestampUndefined: Self = StObject.set(x, "authorizationTimestamp", js.undefined)
        
        inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
        
        inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
        
        inline def setContainerVersionId(value: String): Self = StObject.set(x, "containerVersionId", value.asInstanceOf[js.Any])
        
        inline def setContainerVersionIdUndefined: Self = StObject.set(x, "containerVersionId", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setEnableDebug(value: Boolean): Self = StObject.set(x, "enableDebug", value.asInstanceOf[js.Any])
        
        inline def setEnableDebugUndefined: Self = StObject.set(x, "enableDebug", js.undefined)
        
        inline def setEnvironmentId(value: String): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
        
        inline def setEnvironmentIdUndefined: Self = StObject.set(x, "environmentId", js.undefined)
        
        inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
        
        inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
        
        inline def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
        
        inline def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
        
        inline def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
      }
    }
    
    trait Folder extends StObject {
      
      var accountId: js.UndefOr[String] = js.undefined
      
      var containerId: js.UndefOr[String] = js.undefined
      
      var fingerprint: js.UndefOr[String] = js.undefined
      
      var folderId: js.UndefOr[String] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var notes: js.UndefOr[String] = js.undefined
      
      var path: js.UndefOr[String] = js.undefined
      
      var tagManagerUrl: js.UndefOr[String] = js.undefined
      
      var workspaceId: js.UndefOr[String] = js.undefined
    }
    object Folder {
      
      inline def apply(): Folder = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Folder]
      }
      
      extension [Self <: Folder](x: Self) {
        
        inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
        
        inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
        
        inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
        
        inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
        
        inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
        
        inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
        
        inline def setFolderId(value: String): Self = StObject.set(x, "folderId", value.asInstanceOf[js.Any])
        
        inline def setFolderIdUndefined: Self = StObject.set(x, "folderId", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
        
        inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
        
        inline def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
        
        inline def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
        
        inline def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
      }
    }
    
    trait FolderEntities extends StObject {
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var tag: js.UndefOr[js.Array[Tag]] = js.undefined
      
      var trigger: js.UndefOr[js.Array[Trigger]] = js.undefined
      
      var variable: js.UndefOr[js.Array[Variable]] = js.undefined
    }
    object FolderEntities {
      
      inline def apply(): FolderEntities = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FolderEntities]
      }
      
      extension [Self <: FolderEntities](x: Self) {
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setTag(value: js.Array[Tag]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
        
        inline def setTagVarargs(value: Tag*): Self = StObject.set(x, "tag", js.Array(value :_*))
        
        inline def setTrigger(value: js.Array[Trigger]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
        
        inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
        
        inline def setTriggerVarargs(value: Trigger*): Self = StObject.set(x, "trigger", js.Array(value :_*))
        
        inline def setVariable(value: js.Array[Variable]): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
        
        inline def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
        
        inline def setVariableVarargs(value: Variable*): Self = StObject.set(x, "variable", js.Array(value :_*))
      }
    }
    
    trait GetWorkspaceStatusResponse extends StObject {
      
      var mergeConflict: js.UndefOr[js.Array[MergeConflict]] = js.undefined
      
      var workspaceChange: js.UndefOr[js.Array[Entity]] = js.undefined
    }
    object GetWorkspaceStatusResponse {
      
      inline def apply(): GetWorkspaceStatusResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GetWorkspaceStatusResponse]
      }
      
      extension [Self <: GetWorkspaceStatusResponse](x: Self) {
        
        inline def setMergeConflict(value: js.Array[MergeConflict]): Self = StObject.set(x, "mergeConflict", value.asInstanceOf[js.Any])
        
        inline def setMergeConflictUndefined: Self = StObject.set(x, "mergeConflict", js.undefined)
        
        inline def setMergeConflictVarargs(value: MergeConflict*): Self = StObject.set(x, "mergeConflict", js.Array(value :_*))
        
        inline def setWorkspaceChange(value: js.Array[Entity]): Self = StObject.set(x, "workspaceChange", value.asInstanceOf[js.Any])
        
        inline def setWorkspaceChangeUndefined: Self = StObject.set(x, "workspaceChange", js.undefined)
        
        inline def setWorkspaceChangeVarargs(value: Entity*): Self = StObject.set(x, "workspaceChange", js.Array(value :_*))
      }
    }
    
    trait ListAccountsResponse extends StObject {
      
      var account: js.UndefOr[js.Array[Account]] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object ListAccountsResponse {
      
      inline def apply(): ListAccountsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListAccountsResponse]
      }
      
      extension [Self <: ListAccountsResponse](x: Self) {
        
        inline def setAccount(value: js.Array[Account]): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
        
        inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
        
        inline def setAccountVarargs(value: Account*): Self = StObject.set(x, "account", js.Array(value :_*))
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait ListContainerVersionsResponse extends StObject {
      
      var containerVersionHeader: js.UndefOr[js.Array[ContainerVersionHeader]] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object ListContainerVersionsResponse {
      
      inline def apply(): ListContainerVersionsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListContainerVersionsResponse]
      }
      
      extension [Self <: ListContainerVersionsResponse](x: Self) {
        
        inline def setContainerVersionHeader(value: js.Array[ContainerVersionHeader]): Self = StObject.set(x, "containerVersionHeader", value.asInstanceOf[js.Any])
        
        inline def setContainerVersionHeaderUndefined: Self = StObject.set(x, "containerVersionHeader", js.undefined)
        
        inline def setContainerVersionHeaderVarargs(value: ContainerVersionHeader*): Self = StObject.set(x, "containerVersionHeader", js.Array(value :_*))
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait ListContainersResponse extends StObject {
      
      var container: js.UndefOr[js.Array[Container]] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object ListContainersResponse {
      
      inline def apply(): ListContainersResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListContainersResponse]
      }
      
      extension [Self <: ListContainersResponse](x: Self) {
        
        inline def setContainer(value: js.Array[Container]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
        
        inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
        
        inline def setContainerVarargs(value: Container*): Self = StObject.set(x, "container", js.Array(value :_*))
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait ListEnabledBuiltInVariablesResponse extends StObject {
      
      var builtInVariable: js.UndefOr[js.Array[BuiltInVariable]] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object ListEnabledBuiltInVariablesResponse {
      
      inline def apply(): ListEnabledBuiltInVariablesResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListEnabledBuiltInVariablesResponse]
      }
      
      extension [Self <: ListEnabledBuiltInVariablesResponse](x: Self) {
        
        inline def setBuiltInVariable(value: js.Array[BuiltInVariable]): Self = StObject.set(x, "builtInVariable", value.asInstanceOf[js.Any])
        
        inline def setBuiltInVariableUndefined: Self = StObject.set(x, "builtInVariable", js.undefined)
        
        inline def setBuiltInVariableVarargs(value: BuiltInVariable*): Self = StObject.set(x, "builtInVariable", js.Array(value :_*))
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait ListEnvironmentsResponse extends StObject {
      
      var environment: js.UndefOr[js.Array[Environment]] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object ListEnvironmentsResponse {
      
      inline def apply(): ListEnvironmentsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListEnvironmentsResponse]
      }
      
      extension [Self <: ListEnvironmentsResponse](x: Self) {
        
        inline def setEnvironment(value: js.Array[Environment]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
        
        inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
        
        inline def setEnvironmentVarargs(value: Environment*): Self = StObject.set(x, "environment", js.Array(value :_*))
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait ListFoldersResponse extends StObject {
      
      var folder: js.UndefOr[js.Array[Folder]] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object ListFoldersResponse {
      
      inline def apply(): ListFoldersResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListFoldersResponse]
      }
      
      extension [Self <: ListFoldersResponse](x: Self) {
        
        inline def setFolder(value: js.Array[Folder]): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
        
        inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
        
        inline def setFolderVarargs(value: Folder*): Self = StObject.set(x, "folder", js.Array(value :_*))
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait ListTagsResponse extends StObject {
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var tag: js.UndefOr[js.Array[Tag]] = js.undefined
    }
    object ListTagsResponse {
      
      inline def apply(): ListTagsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListTagsResponse]
      }
      
      extension [Self <: ListTagsResponse](x: Self) {
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setTag(value: js.Array[Tag]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
        
        inline def setTagVarargs(value: Tag*): Self = StObject.set(x, "tag", js.Array(value :_*))
      }
    }
    
    trait ListTriggersResponse extends StObject {
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var trigger: js.UndefOr[js.Array[Trigger]] = js.undefined
    }
    object ListTriggersResponse {
      
      inline def apply(): ListTriggersResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListTriggersResponse]
      }
      
      extension [Self <: ListTriggersResponse](x: Self) {
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setTrigger(value: js.Array[Trigger]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
        
        inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
        
        inline def setTriggerVarargs(value: Trigger*): Self = StObject.set(x, "trigger", js.Array(value :_*))
      }
    }
    
    trait ListUserPermissionsResponse extends StObject {
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var userPermission: js.UndefOr[js.Array[UserPermission]] = js.undefined
    }
    object ListUserPermissionsResponse {
      
      inline def apply(): ListUserPermissionsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListUserPermissionsResponse]
      }
      
      extension [Self <: ListUserPermissionsResponse](x: Self) {
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setUserPermission(value: js.Array[UserPermission]): Self = StObject.set(x, "userPermission", value.asInstanceOf[js.Any])
        
        inline def setUserPermissionUndefined: Self = StObject.set(x, "userPermission", js.undefined)
        
        inline def setUserPermissionVarargs(value: UserPermission*): Self = StObject.set(x, "userPermission", js.Array(value :_*))
      }
    }
    
    trait ListVariablesResponse extends StObject {
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var variable: js.UndefOr[js.Array[Variable]] = js.undefined
    }
    object ListVariablesResponse {
      
      inline def apply(): ListVariablesResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListVariablesResponse]
      }
      
      extension [Self <: ListVariablesResponse](x: Self) {
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setVariable(value: js.Array[Variable]): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
        
        inline def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
        
        inline def setVariableVarargs(value: Variable*): Self = StObject.set(x, "variable", js.Array(value :_*))
      }
    }
    
    trait ListWorkspacesResponse extends StObject {
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var workspace: js.UndefOr[js.Array[Workspace]] = js.undefined
    }
    object ListWorkspacesResponse {
      
      inline def apply(): ListWorkspacesResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListWorkspacesResponse]
      }
      
      extension [Self <: ListWorkspacesResponse](x: Self) {
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setWorkspace(value: js.Array[Workspace]): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
        
        inline def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
        
        inline def setWorkspaceVarargs(value: Workspace*): Self = StObject.set(x, "workspace", js.Array(value :_*))
      }
    }
    
    trait ListZonesResponse extends StObject {
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var zone: js.UndefOr[js.Array[Zone]] = js.undefined
    }
    object ListZonesResponse {
      
      inline def apply(): ListZonesResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListZonesResponse]
      }
      
      extension [Self <: ListZonesResponse](x: Self) {
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setZone(value: js.Array[Zone]): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
        
        inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
        
        inline def setZoneVarargs(value: Zone*): Self = StObject.set(x, "zone", js.Array(value :_*))
      }
    }
    
    trait MergeConflict extends StObject {
      
      var entityInBaseVersion: js.UndefOr[Entity] = js.undefined
      
      var entityInWorkspace: js.UndefOr[Entity] = js.undefined
    }
    object MergeConflict {
      
      inline def apply(): MergeConflict = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MergeConflict]
      }
      
      extension [Self <: MergeConflict](x: Self) {
        
        inline def setEntityInBaseVersion(value: Entity): Self = StObject.set(x, "entityInBaseVersion", value.asInstanceOf[js.Any])
        
        inline def setEntityInBaseVersionUndefined: Self = StObject.set(x, "entityInBaseVersion", js.undefined)
        
        inline def setEntityInWorkspace(value: Entity): Self = StObject.set(x, "entityInWorkspace", value.asInstanceOf[js.Any])
        
        inline def setEntityInWorkspaceUndefined: Self = StObject.set(x, "entityInWorkspace", js.undefined)
      }
    }
    
    trait Parameter extends StObject {
      
      var key: js.UndefOr[String] = js.undefined
      
      var list: js.UndefOr[js.Array[Parameter]] = js.undefined
      
      var map: js.UndefOr[js.Array[Parameter]] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
    }
    object Parameter {
      
      inline def apply(): Parameter = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Parameter]
      }
      
      extension [Self <: Parameter](x: Self) {
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        inline def setList(value: js.Array[Parameter]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
        
        inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
        
        inline def setListVarargs(value: Parameter*): Self = StObject.set(x, "list", js.Array(value :_*))
        
        inline def setMap(value: js.Array[Parameter]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
        
        inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
        
        inline def setMapVarargs(value: Parameter*): Self = StObject.set(x, "map", js.Array(value :_*))
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait PublishContainerVersionResponse extends StObject {
      
      var compilerError: js.UndefOr[Boolean] = js.undefined
      
      var containerVersion: js.UndefOr[ContainerVersion] = js.undefined
    }
    object PublishContainerVersionResponse {
      
      inline def apply(): PublishContainerVersionResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PublishContainerVersionResponse]
      }
      
      extension [Self <: PublishContainerVersionResponse](x: Self) {
        
        inline def setCompilerError(value: Boolean): Self = StObject.set(x, "compilerError", value.asInstanceOf[js.Any])
        
        inline def setCompilerErrorUndefined: Self = StObject.set(x, "compilerError", js.undefined)
        
        inline def setContainerVersion(value: ContainerVersion): Self = StObject.set(x, "containerVersion", value.asInstanceOf[js.Any])
        
        inline def setContainerVersionUndefined: Self = StObject.set(x, "containerVersion", js.undefined)
      }
    }
    
    trait QuickPreviewResponse extends StObject {
      
      var compilerError: js.UndefOr[Boolean] = js.undefined
      
      var containerVersion: js.UndefOr[ContainerVersion] = js.undefined
      
      var syncStatus: js.UndefOr[SyncStatus] = js.undefined
    }
    object QuickPreviewResponse {
      
      inline def apply(): QuickPreviewResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[QuickPreviewResponse]
      }
      
      extension [Self <: QuickPreviewResponse](x: Self) {
        
        inline def setCompilerError(value: Boolean): Self = StObject.set(x, "compilerError", value.asInstanceOf[js.Any])
        
        inline def setCompilerErrorUndefined: Self = StObject.set(x, "compilerError", js.undefined)
        
        inline def setContainerVersion(value: ContainerVersion): Self = StObject.set(x, "containerVersion", value.asInstanceOf[js.Any])
        
        inline def setContainerVersionUndefined: Self = StObject.set(x, "containerVersion", js.undefined)
        
        inline def setSyncStatus(value: SyncStatus): Self = StObject.set(x, "syncStatus", value.asInstanceOf[js.Any])
        
        inline def setSyncStatusUndefined: Self = StObject.set(x, "syncStatus", js.undefined)
      }
    }
    
    trait RevertBuiltInVariableResponse extends StObject {
      
      var enabled: js.UndefOr[Boolean] = js.undefined
    }
    object RevertBuiltInVariableResponse {
      
      inline def apply(): RevertBuiltInVariableResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RevertBuiltInVariableResponse]
      }
      
      extension [Self <: RevertBuiltInVariableResponse](x: Self) {
        
        inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
        
        inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      }
    }
    
    trait RevertFolderResponse extends StObject {
      
      var folder: js.UndefOr[Folder] = js.undefined
    }
    object RevertFolderResponse {
      
      inline def apply(): RevertFolderResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RevertFolderResponse]
      }
      
      extension [Self <: RevertFolderResponse](x: Self) {
        
        inline def setFolder(value: Folder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
        
        inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
      }
    }
    
    trait RevertTagResponse extends StObject {
      
      var tag: js.UndefOr[Tag] = js.undefined
    }
    object RevertTagResponse {
      
      inline def apply(): RevertTagResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RevertTagResponse]
      }
      
      extension [Self <: RevertTagResponse](x: Self) {
        
        inline def setTag(value: Tag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      }
    }
    
    trait RevertTriggerResponse extends StObject {
      
      var trigger: js.UndefOr[Trigger] = js.undefined
    }
    object RevertTriggerResponse {
      
      inline def apply(): RevertTriggerResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RevertTriggerResponse]
      }
      
      extension [Self <: RevertTriggerResponse](x: Self) {
        
        inline def setTrigger(value: Trigger): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
        
        inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      }
    }
    
    trait RevertVariableResponse extends StObject {
      
      var variable: js.UndefOr[Variable] = js.undefined
    }
    object RevertVariableResponse {
      
      inline def apply(): RevertVariableResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RevertVariableResponse]
      }
      
      extension [Self <: RevertVariableResponse](x: Self) {
        
        inline def setVariable(value: Variable): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
        
        inline def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
      }
    }
    
    trait RevertZoneResponse extends StObject {
      
      var zone: js.UndefOr[Zone] = js.undefined
    }
    object RevertZoneResponse {
      
      inline def apply(): RevertZoneResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RevertZoneResponse]
      }
      
      extension [Self <: RevertZoneResponse](x: Self) {
        
        inline def setZone(value: Zone): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
        
        inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
      }
    }
    
    trait SetupTag extends StObject {
      
      var stopOnSetupFailure: js.UndefOr[Boolean] = js.undefined
      
      var tagName: js.UndefOr[String] = js.undefined
    }
    object SetupTag {
      
      inline def apply(): SetupTag = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SetupTag]
      }
      
      extension [Self <: SetupTag](x: Self) {
        
        inline def setStopOnSetupFailure(value: Boolean): Self = StObject.set(x, "stopOnSetupFailure", value.asInstanceOf[js.Any])
        
        inline def setStopOnSetupFailureUndefined: Self = StObject.set(x, "stopOnSetupFailure", js.undefined)
        
        inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
        
        inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      }
    }
    
    trait SyncStatus extends StObject {
      
      var mergeConflict: js.UndefOr[Boolean] = js.undefined
      
      var syncError: js.UndefOr[Boolean] = js.undefined
    }
    object SyncStatus {
      
      inline def apply(): SyncStatus = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SyncStatus]
      }
      
      extension [Self <: SyncStatus](x: Self) {
        
        inline def setMergeConflict(value: Boolean): Self = StObject.set(x, "mergeConflict", value.asInstanceOf[js.Any])
        
        inline def setMergeConflictUndefined: Self = StObject.set(x, "mergeConflict", js.undefined)
        
        inline def setSyncError(value: Boolean): Self = StObject.set(x, "syncError", value.asInstanceOf[js.Any])
        
        inline def setSyncErrorUndefined: Self = StObject.set(x, "syncError", js.undefined)
      }
    }
    
    trait SyncWorkspaceResponse extends StObject {
      
      var mergeConflict: js.UndefOr[js.Array[MergeConflict]] = js.undefined
      
      var syncStatus: js.UndefOr[SyncStatus] = js.undefined
    }
    object SyncWorkspaceResponse {
      
      inline def apply(): SyncWorkspaceResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SyncWorkspaceResponse]
      }
      
      extension [Self <: SyncWorkspaceResponse](x: Self) {
        
        inline def setMergeConflict(value: js.Array[MergeConflict]): Self = StObject.set(x, "mergeConflict", value.asInstanceOf[js.Any])
        
        inline def setMergeConflictUndefined: Self = StObject.set(x, "mergeConflict", js.undefined)
        
        inline def setMergeConflictVarargs(value: MergeConflict*): Self = StObject.set(x, "mergeConflict", js.Array(value :_*))
        
        inline def setSyncStatus(value: SyncStatus): Self = StObject.set(x, "syncStatus", value.asInstanceOf[js.Any])
        
        inline def setSyncStatusUndefined: Self = StObject.set(x, "syncStatus", js.undefined)
      }
    }
    
    trait Tag extends StObject {
      
      var accountId: js.UndefOr[String] = js.undefined
      
      var blockingRuleId: js.UndefOr[js.Array[String]] = js.undefined
      
      var blockingTriggerId: js.UndefOr[js.Array[String]] = js.undefined
      
      var containerId: js.UndefOr[String] = js.undefined
      
      var fingerprint: js.UndefOr[String] = js.undefined
      
      var firingRuleId: js.UndefOr[js.Array[String]] = js.undefined
      
      var firingTriggerId: js.UndefOr[js.Array[String]] = js.undefined
      
      var liveOnly: js.UndefOr[Boolean] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var notes: js.UndefOr[String] = js.undefined
      
      var parameter: js.UndefOr[js.Array[Parameter]] = js.undefined
      
      var parentFolderId: js.UndefOr[String] = js.undefined
      
      var path: js.UndefOr[String] = js.undefined
      
      var paused: js.UndefOr[Boolean] = js.undefined
      
      var priority: js.UndefOr[Parameter] = js.undefined
      
      var scheduleEndMs: js.UndefOr[String] = js.undefined
      
      var scheduleStartMs: js.UndefOr[String] = js.undefined
      
      var setupTag: js.UndefOr[js.Array[SetupTag]] = js.undefined
      
      var tagFiringOption: js.UndefOr[String] = js.undefined
      
      var tagId: js.UndefOr[String] = js.undefined
      
      var tagManagerUrl: js.UndefOr[String] = js.undefined
      
      var teardownTag: js.UndefOr[js.Array[TeardownTag]] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
      
      var workspaceId: js.UndefOr[String] = js.undefined
    }
    object Tag {
      
      inline def apply(): Tag = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Tag]
      }
      
      extension [Self <: Tag](x: Self) {
        
        inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
        
        inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
        
        inline def setBlockingRuleId(value: js.Array[String]): Self = StObject.set(x, "blockingRuleId", value.asInstanceOf[js.Any])
        
        inline def setBlockingRuleIdUndefined: Self = StObject.set(x, "blockingRuleId", js.undefined)
        
        inline def setBlockingRuleIdVarargs(value: String*): Self = StObject.set(x, "blockingRuleId", js.Array(value :_*))
        
        inline def setBlockingTriggerId(value: js.Array[String]): Self = StObject.set(x, "blockingTriggerId", value.asInstanceOf[js.Any])
        
        inline def setBlockingTriggerIdUndefined: Self = StObject.set(x, "blockingTriggerId", js.undefined)
        
        inline def setBlockingTriggerIdVarargs(value: String*): Self = StObject.set(x, "blockingTriggerId", js.Array(value :_*))
        
        inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
        
        inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
        
        inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
        
        inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
        
        inline def setFiringRuleId(value: js.Array[String]): Self = StObject.set(x, "firingRuleId", value.asInstanceOf[js.Any])
        
        inline def setFiringRuleIdUndefined: Self = StObject.set(x, "firingRuleId", js.undefined)
        
        inline def setFiringRuleIdVarargs(value: String*): Self = StObject.set(x, "firingRuleId", js.Array(value :_*))
        
        inline def setFiringTriggerId(value: js.Array[String]): Self = StObject.set(x, "firingTriggerId", value.asInstanceOf[js.Any])
        
        inline def setFiringTriggerIdUndefined: Self = StObject.set(x, "firingTriggerId", js.undefined)
        
        inline def setFiringTriggerIdVarargs(value: String*): Self = StObject.set(x, "firingTriggerId", js.Array(value :_*))
        
        inline def setLiveOnly(value: Boolean): Self = StObject.set(x, "liveOnly", value.asInstanceOf[js.Any])
        
        inline def setLiveOnlyUndefined: Self = StObject.set(x, "liveOnly", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
        
        inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
        
        inline def setParameter(value: js.Array[Parameter]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
        
        inline def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
        
        inline def setParameterVarargs(value: Parameter*): Self = StObject.set(x, "parameter", js.Array(value :_*))
        
        inline def setParentFolderId(value: String): Self = StObject.set(x, "parentFolderId", value.asInstanceOf[js.Any])
        
        inline def setParentFolderIdUndefined: Self = StObject.set(x, "parentFolderId", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
        
        inline def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
        
        inline def setPriority(value: Parameter): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
        
        inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
        
        inline def setScheduleEndMs(value: String): Self = StObject.set(x, "scheduleEndMs", value.asInstanceOf[js.Any])
        
        inline def setScheduleEndMsUndefined: Self = StObject.set(x, "scheduleEndMs", js.undefined)
        
        inline def setScheduleStartMs(value: String): Self = StObject.set(x, "scheduleStartMs", value.asInstanceOf[js.Any])
        
        inline def setScheduleStartMsUndefined: Self = StObject.set(x, "scheduleStartMs", js.undefined)
        
        inline def setSetupTag(value: js.Array[SetupTag]): Self = StObject.set(x, "setupTag", value.asInstanceOf[js.Any])
        
        inline def setSetupTagUndefined: Self = StObject.set(x, "setupTag", js.undefined)
        
        inline def setSetupTagVarargs(value: SetupTag*): Self = StObject.set(x, "setupTag", js.Array(value :_*))
        
        inline def setTagFiringOption(value: String): Self = StObject.set(x, "tagFiringOption", value.asInstanceOf[js.Any])
        
        inline def setTagFiringOptionUndefined: Self = StObject.set(x, "tagFiringOption", js.undefined)
        
        inline def setTagId(value: String): Self = StObject.set(x, "tagId", value.asInstanceOf[js.Any])
        
        inline def setTagIdUndefined: Self = StObject.set(x, "tagId", js.undefined)
        
        inline def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
        
        inline def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
        
        inline def setTeardownTag(value: js.Array[TeardownTag]): Self = StObject.set(x, "teardownTag", value.asInstanceOf[js.Any])
        
        inline def setTeardownTagUndefined: Self = StObject.set(x, "teardownTag", js.undefined)
        
        inline def setTeardownTagVarargs(value: TeardownTag*): Self = StObject.set(x, "teardownTag", js.Array(value :_*))
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
        
        inline def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
      }
    }
    
    trait TeardownTag extends StObject {
      
      var stopTeardownOnFailure: js.UndefOr[Boolean] = js.undefined
      
      var tagName: js.UndefOr[String] = js.undefined
    }
    object TeardownTag {
      
      inline def apply(): TeardownTag = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TeardownTag]
      }
      
      extension [Self <: TeardownTag](x: Self) {
        
        inline def setStopTeardownOnFailure(value: Boolean): Self = StObject.set(x, "stopTeardownOnFailure", value.asInstanceOf[js.Any])
        
        inline def setStopTeardownOnFailureUndefined: Self = StObject.set(x, "stopTeardownOnFailure", js.undefined)
        
        inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
        
        inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      }
    }
    
    trait Timestamp extends StObject {
      
      var nanos: js.UndefOr[Double] = js.undefined
      
      var seconds: js.UndefOr[String] = js.undefined
    }
    object Timestamp {
      
      inline def apply(): Timestamp = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Timestamp]
      }
      
      extension [Self <: Timestamp](x: Self) {
        
        inline def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
        
        inline def setNanosUndefined: Self = StObject.set(x, "nanos", js.undefined)
        
        inline def setSeconds(value: String): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
        
        inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
      }
    }
    
    trait Trigger extends StObject {
      
      var accountId: js.UndefOr[String] = js.undefined
      
      var autoEventFilter: js.UndefOr[js.Array[Condition]] = js.undefined
      
      var checkValidation: js.UndefOr[Parameter] = js.undefined
      
      var containerId: js.UndefOr[String] = js.undefined
      
      var continuousTimeMinMilliseconds: js.UndefOr[Parameter] = js.undefined
      
      var customEventFilter: js.UndefOr[js.Array[Condition]] = js.undefined
      
      var eventName: js.UndefOr[Parameter] = js.undefined
      
      var filter: js.UndefOr[js.Array[Condition]] = js.undefined
      
      var fingerprint: js.UndefOr[String] = js.undefined
      
      var horizontalScrollPercentageList: js.UndefOr[Parameter] = js.undefined
      
      var interval: js.UndefOr[Parameter] = js.undefined
      
      var intervalSeconds: js.UndefOr[Parameter] = js.undefined
      
      var limit: js.UndefOr[Parameter] = js.undefined
      
      var maxTimerLengthSeconds: js.UndefOr[Parameter] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var notes: js.UndefOr[String] = js.undefined
      
      var parameter: js.UndefOr[js.Array[Parameter]] = js.undefined
      
      var parentFolderId: js.UndefOr[String] = js.undefined
      
      var path: js.UndefOr[String] = js.undefined
      
      var selector: js.UndefOr[Parameter] = js.undefined
      
      var tagManagerUrl: js.UndefOr[String] = js.undefined
      
      var totalTimeMinMilliseconds: js.UndefOr[Parameter] = js.undefined
      
      var triggerId: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
      
      var uniqueTriggerId: js.UndefOr[Parameter] = js.undefined
      
      var verticalScrollPercentageList: js.UndefOr[Parameter] = js.undefined
      
      var visibilitySelector: js.UndefOr[Parameter] = js.undefined
      
      var visiblePercentageMax: js.UndefOr[Parameter] = js.undefined
      
      var visiblePercentageMin: js.UndefOr[Parameter] = js.undefined
      
      var waitForTags: js.UndefOr[Parameter] = js.undefined
      
      var waitForTagsTimeout: js.UndefOr[Parameter] = js.undefined
      
      var workspaceId: js.UndefOr[String] = js.undefined
    }
    object Trigger {
      
      inline def apply(): Trigger = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Trigger]
      }
      
      extension [Self <: Trigger](x: Self) {
        
        inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
        
        inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
        
        inline def setAutoEventFilter(value: js.Array[Condition]): Self = StObject.set(x, "autoEventFilter", value.asInstanceOf[js.Any])
        
        inline def setAutoEventFilterUndefined: Self = StObject.set(x, "autoEventFilter", js.undefined)
        
        inline def setAutoEventFilterVarargs(value: Condition*): Self = StObject.set(x, "autoEventFilter", js.Array(value :_*))
        
        inline def setCheckValidation(value: Parameter): Self = StObject.set(x, "checkValidation", value.asInstanceOf[js.Any])
        
        inline def setCheckValidationUndefined: Self = StObject.set(x, "checkValidation", js.undefined)
        
        inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
        
        inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
        
        inline def setContinuousTimeMinMilliseconds(value: Parameter): Self = StObject.set(x, "continuousTimeMinMilliseconds", value.asInstanceOf[js.Any])
        
        inline def setContinuousTimeMinMillisecondsUndefined: Self = StObject.set(x, "continuousTimeMinMilliseconds", js.undefined)
        
        inline def setCustomEventFilter(value: js.Array[Condition]): Self = StObject.set(x, "customEventFilter", value.asInstanceOf[js.Any])
        
        inline def setCustomEventFilterUndefined: Self = StObject.set(x, "customEventFilter", js.undefined)
        
        inline def setCustomEventFilterVarargs(value: Condition*): Self = StObject.set(x, "customEventFilter", js.Array(value :_*))
        
        inline def setEventName(value: Parameter): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
        
        inline def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
        
        inline def setFilter(value: js.Array[Condition]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
        
        inline def setFilterVarargs(value: Condition*): Self = StObject.set(x, "filter", js.Array(value :_*))
        
        inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
        
        inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
        
        inline def setHorizontalScrollPercentageList(value: Parameter): Self = StObject.set(x, "horizontalScrollPercentageList", value.asInstanceOf[js.Any])
        
        inline def setHorizontalScrollPercentageListUndefined: Self = StObject.set(x, "horizontalScrollPercentageList", js.undefined)
        
        inline def setInterval(value: Parameter): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
        
        inline def setIntervalSeconds(value: Parameter): Self = StObject.set(x, "intervalSeconds", value.asInstanceOf[js.Any])
        
        inline def setIntervalSecondsUndefined: Self = StObject.set(x, "intervalSeconds", js.undefined)
        
        inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
        
        inline def setLimit(value: Parameter): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
        
        inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
        
        inline def setMaxTimerLengthSeconds(value: Parameter): Self = StObject.set(x, "maxTimerLengthSeconds", value.asInstanceOf[js.Any])
        
        inline def setMaxTimerLengthSecondsUndefined: Self = StObject.set(x, "maxTimerLengthSeconds", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
        
        inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
        
        inline def setParameter(value: js.Array[Parameter]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
        
        inline def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
        
        inline def setParameterVarargs(value: Parameter*): Self = StObject.set(x, "parameter", js.Array(value :_*))
        
        inline def setParentFolderId(value: String): Self = StObject.set(x, "parentFolderId", value.asInstanceOf[js.Any])
        
        inline def setParentFolderIdUndefined: Self = StObject.set(x, "parentFolderId", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setSelector(value: Parameter): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
        
        inline def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
        
        inline def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
        
        inline def setTotalTimeMinMilliseconds(value: Parameter): Self = StObject.set(x, "totalTimeMinMilliseconds", value.asInstanceOf[js.Any])
        
        inline def setTotalTimeMinMillisecondsUndefined: Self = StObject.set(x, "totalTimeMinMilliseconds", js.undefined)
        
        inline def setTriggerId(value: String): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
        
        inline def setTriggerIdUndefined: Self = StObject.set(x, "triggerId", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setUniqueTriggerId(value: Parameter): Self = StObject.set(x, "uniqueTriggerId", value.asInstanceOf[js.Any])
        
        inline def setUniqueTriggerIdUndefined: Self = StObject.set(x, "uniqueTriggerId", js.undefined)
        
        inline def setVerticalScrollPercentageList(value: Parameter): Self = StObject.set(x, "verticalScrollPercentageList", value.asInstanceOf[js.Any])
        
        inline def setVerticalScrollPercentageListUndefined: Self = StObject.set(x, "verticalScrollPercentageList", js.undefined)
        
        inline def setVisibilitySelector(value: Parameter): Self = StObject.set(x, "visibilitySelector", value.asInstanceOf[js.Any])
        
        inline def setVisibilitySelectorUndefined: Self = StObject.set(x, "visibilitySelector", js.undefined)
        
        inline def setVisiblePercentageMax(value: Parameter): Self = StObject.set(x, "visiblePercentageMax", value.asInstanceOf[js.Any])
        
        inline def setVisiblePercentageMaxUndefined: Self = StObject.set(x, "visiblePercentageMax", js.undefined)
        
        inline def setVisiblePercentageMin(value: Parameter): Self = StObject.set(x, "visiblePercentageMin", value.asInstanceOf[js.Any])
        
        inline def setVisiblePercentageMinUndefined: Self = StObject.set(x, "visiblePercentageMin", js.undefined)
        
        inline def setWaitForTags(value: Parameter): Self = StObject.set(x, "waitForTags", value.asInstanceOf[js.Any])
        
        inline def setWaitForTagsTimeout(value: Parameter): Self = StObject.set(x, "waitForTagsTimeout", value.asInstanceOf[js.Any])
        
        inline def setWaitForTagsTimeoutUndefined: Self = StObject.set(x, "waitForTagsTimeout", js.undefined)
        
        inline def setWaitForTagsUndefined: Self = StObject.set(x, "waitForTags", js.undefined)
        
        inline def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
        
        inline def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
      }
    }
    
    trait UserPermission extends StObject {
      
      var accountAccess: js.UndefOr[AccountAccess] = js.undefined
      
      var accountId: js.UndefOr[String] = js.undefined
      
      var containerAccess: js.UndefOr[js.Array[ContainerAccess]] = js.undefined
      
      var emailAddress: js.UndefOr[String] = js.undefined
      
      var path: js.UndefOr[String] = js.undefined
    }
    object UserPermission {
      
      inline def apply(): UserPermission = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UserPermission]
      }
      
      extension [Self <: UserPermission](x: Self) {
        
        inline def setAccountAccess(value: AccountAccess): Self = StObject.set(x, "accountAccess", value.asInstanceOf[js.Any])
        
        inline def setAccountAccessUndefined: Self = StObject.set(x, "accountAccess", js.undefined)
        
        inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
        
        inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
        
        inline def setContainerAccess(value: js.Array[ContainerAccess]): Self = StObject.set(x, "containerAccess", value.asInstanceOf[js.Any])
        
        inline def setContainerAccessUndefined: Self = StObject.set(x, "containerAccess", js.undefined)
        
        inline def setContainerAccessVarargs(value: ContainerAccess*): Self = StObject.set(x, "containerAccess", js.Array(value :_*))
        
        inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
        
        inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      }
    }
    
    trait Variable extends StObject {
      
      var accountId: js.UndefOr[String] = js.undefined
      
      var containerId: js.UndefOr[String] = js.undefined
      
      var disablingTriggerId: js.UndefOr[js.Array[String]] = js.undefined
      
      var enablingTriggerId: js.UndefOr[js.Array[String]] = js.undefined
      
      var fingerprint: js.UndefOr[String] = js.undefined
      
      var formatValue: js.UndefOr[VariableFormatValue] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var notes: js.UndefOr[String] = js.undefined
      
      var parameter: js.UndefOr[js.Array[Parameter]] = js.undefined
      
      var parentFolderId: js.UndefOr[String] = js.undefined
      
      var path: js.UndefOr[String] = js.undefined
      
      var scheduleEndMs: js.UndefOr[String] = js.undefined
      
      var scheduleStartMs: js.UndefOr[String] = js.undefined
      
      var tagManagerUrl: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
      
      var variableId: js.UndefOr[String] = js.undefined
      
      var workspaceId: js.UndefOr[String] = js.undefined
    }
    object Variable {
      
      inline def apply(): Variable = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Variable]
      }
      
      extension [Self <: Variable](x: Self) {
        
        inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
        
        inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
        
        inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
        
        inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
        
        inline def setDisablingTriggerId(value: js.Array[String]): Self = StObject.set(x, "disablingTriggerId", value.asInstanceOf[js.Any])
        
        inline def setDisablingTriggerIdUndefined: Self = StObject.set(x, "disablingTriggerId", js.undefined)
        
        inline def setDisablingTriggerIdVarargs(value: String*): Self = StObject.set(x, "disablingTriggerId", js.Array(value :_*))
        
        inline def setEnablingTriggerId(value: js.Array[String]): Self = StObject.set(x, "enablingTriggerId", value.asInstanceOf[js.Any])
        
        inline def setEnablingTriggerIdUndefined: Self = StObject.set(x, "enablingTriggerId", js.undefined)
        
        inline def setEnablingTriggerIdVarargs(value: String*): Self = StObject.set(x, "enablingTriggerId", js.Array(value :_*))
        
        inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
        
        inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
        
        inline def setFormatValue(value: VariableFormatValue): Self = StObject.set(x, "formatValue", value.asInstanceOf[js.Any])
        
        inline def setFormatValueUndefined: Self = StObject.set(x, "formatValue", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
        
        inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
        
        inline def setParameter(value: js.Array[Parameter]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
        
        inline def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
        
        inline def setParameterVarargs(value: Parameter*): Self = StObject.set(x, "parameter", js.Array(value :_*))
        
        inline def setParentFolderId(value: String): Self = StObject.set(x, "parentFolderId", value.asInstanceOf[js.Any])
        
        inline def setParentFolderIdUndefined: Self = StObject.set(x, "parentFolderId", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setScheduleEndMs(value: String): Self = StObject.set(x, "scheduleEndMs", value.asInstanceOf[js.Any])
        
        inline def setScheduleEndMsUndefined: Self = StObject.set(x, "scheduleEndMs", js.undefined)
        
        inline def setScheduleStartMs(value: String): Self = StObject.set(x, "scheduleStartMs", value.asInstanceOf[js.Any])
        
        inline def setScheduleStartMsUndefined: Self = StObject.set(x, "scheduleStartMs", js.undefined)
        
        inline def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
        
        inline def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setVariableId(value: String): Self = StObject.set(x, "variableId", value.asInstanceOf[js.Any])
        
        inline def setVariableIdUndefined: Self = StObject.set(x, "variableId", js.undefined)
        
        inline def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
        
        inline def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
      }
    }
    
    trait VariableFormatValue extends StObject {
      
      var caseConversionType: js.UndefOr[String] = js.undefined
      
      var convertFalseToValue: js.UndefOr[Parameter] = js.undefined
      
      var convertNullToValue: js.UndefOr[Parameter] = js.undefined
      
      var convertTrueToValue: js.UndefOr[Parameter] = js.undefined
      
      var convertUndefinedToValue: js.UndefOr[Parameter] = js.undefined
    }
    object VariableFormatValue {
      
      inline def apply(): VariableFormatValue = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VariableFormatValue]
      }
      
      extension [Self <: VariableFormatValue](x: Self) {
        
        inline def setCaseConversionType(value: String): Self = StObject.set(x, "caseConversionType", value.asInstanceOf[js.Any])
        
        inline def setCaseConversionTypeUndefined: Self = StObject.set(x, "caseConversionType", js.undefined)
        
        inline def setConvertFalseToValue(value: Parameter): Self = StObject.set(x, "convertFalseToValue", value.asInstanceOf[js.Any])
        
        inline def setConvertFalseToValueUndefined: Self = StObject.set(x, "convertFalseToValue", js.undefined)
        
        inline def setConvertNullToValue(value: Parameter): Self = StObject.set(x, "convertNullToValue", value.asInstanceOf[js.Any])
        
        inline def setConvertNullToValueUndefined: Self = StObject.set(x, "convertNullToValue", js.undefined)
        
        inline def setConvertTrueToValue(value: Parameter): Self = StObject.set(x, "convertTrueToValue", value.asInstanceOf[js.Any])
        
        inline def setConvertTrueToValueUndefined: Self = StObject.set(x, "convertTrueToValue", js.undefined)
        
        inline def setConvertUndefinedToValue(value: Parameter): Self = StObject.set(x, "convertUndefinedToValue", value.asInstanceOf[js.Any])
        
        inline def setConvertUndefinedToValueUndefined: Self = StObject.set(x, "convertUndefinedToValue", js.undefined)
      }
    }
    
    trait Workspace extends StObject {
      
      var accountId: js.UndefOr[String] = js.undefined
      
      var containerId: js.UndefOr[String] = js.undefined
      
      var description: js.UndefOr[String] = js.undefined
      
      var fingerprint: js.UndefOr[String] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var path: js.UndefOr[String] = js.undefined
      
      var tagManagerUrl: js.UndefOr[String] = js.undefined
      
      var workspaceId: js.UndefOr[String] = js.undefined
    }
    object Workspace {
      
      inline def apply(): Workspace = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Workspace]
      }
      
      extension [Self <: Workspace](x: Self) {
        
        inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
        
        inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
        
        inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
        
        inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
        
        inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
        
        inline def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
        
        inline def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
        
        inline def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
      }
    }
    
    trait Zone extends StObject {
      
      var accountId: js.UndefOr[String] = js.undefined
      
      var boundary: js.UndefOr[ZoneBoundary] = js.undefined
      
      var childContainer: js.UndefOr[js.Array[ZoneChildContainer]] = js.undefined
      
      var containerId: js.UndefOr[String] = js.undefined
      
      var fingerprint: js.UndefOr[String] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var notes: js.UndefOr[String] = js.undefined
      
      var path: js.UndefOr[String] = js.undefined
      
      var tagManagerUrl: js.UndefOr[String] = js.undefined
      
      var typeRestriction: js.UndefOr[ZoneTypeRestriction] = js.undefined
      
      var workspaceId: js.UndefOr[String] = js.undefined
      
      var zoneId: js.UndefOr[String] = js.undefined
    }
    object Zone {
      
      inline def apply(): Zone = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Zone]
      }
      
      extension [Self <: Zone](x: Self) {
        
        inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
        
        inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
        
        inline def setBoundary(value: ZoneBoundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
        
        inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
        
        inline def setChildContainer(value: js.Array[ZoneChildContainer]): Self = StObject.set(x, "childContainer", value.asInstanceOf[js.Any])
        
        inline def setChildContainerUndefined: Self = StObject.set(x, "childContainer", js.undefined)
        
        inline def setChildContainerVarargs(value: ZoneChildContainer*): Self = StObject.set(x, "childContainer", js.Array(value :_*))
        
        inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
        
        inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
        
        inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
        
        inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
        
        inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
        
        inline def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
        
        inline def setTypeRestriction(value: ZoneTypeRestriction): Self = StObject.set(x, "typeRestriction", value.asInstanceOf[js.Any])
        
        inline def setTypeRestrictionUndefined: Self = StObject.set(x, "typeRestriction", js.undefined)
        
        inline def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
        
        inline def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
        
        inline def setZoneId(value: String): Self = StObject.set(x, "zoneId", value.asInstanceOf[js.Any])
        
        inline def setZoneIdUndefined: Self = StObject.set(x, "zoneId", js.undefined)
      }
    }
    
    trait ZoneBoundary extends StObject {
      
      var condition: js.UndefOr[js.Array[Condition]] = js.undefined
      
      var customEvaluationTriggerId: js.UndefOr[js.Array[String]] = js.undefined
    }
    object ZoneBoundary {
      
      inline def apply(): ZoneBoundary = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ZoneBoundary]
      }
      
      extension [Self <: ZoneBoundary](x: Self) {
        
        inline def setCondition(value: js.Array[Condition]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
        
        inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
        
        inline def setConditionVarargs(value: Condition*): Self = StObject.set(x, "condition", js.Array(value :_*))
        
        inline def setCustomEvaluationTriggerId(value: js.Array[String]): Self = StObject.set(x, "customEvaluationTriggerId", value.asInstanceOf[js.Any])
        
        inline def setCustomEvaluationTriggerIdUndefined: Self = StObject.set(x, "customEvaluationTriggerId", js.undefined)
        
        inline def setCustomEvaluationTriggerIdVarargs(value: String*): Self = StObject.set(x, "customEvaluationTriggerId", js.Array(value :_*))
      }
    }
    
    trait ZoneChildContainer extends StObject {
      
      var nickname: js.UndefOr[String] = js.undefined
      
      var publicId: js.UndefOr[String] = js.undefined
    }
    object ZoneChildContainer {
      
      inline def apply(): ZoneChildContainer = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ZoneChildContainer]
      }
      
      extension [Self <: ZoneChildContainer](x: Self) {
        
        inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
        
        inline def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
        
        inline def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
        
        inline def setPublicIdUndefined: Self = StObject.set(x, "publicId", js.undefined)
      }
    }
    
    trait ZoneTypeRestriction extends StObject {
      
      var enable: js.UndefOr[Boolean] = js.undefined
      
      var whitelistedTypeId: js.UndefOr[js.Array[String]] = js.undefined
    }
    object ZoneTypeRestriction {
      
      inline def apply(): ZoneTypeRestriction = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ZoneTypeRestriction]
      }
      
      extension [Self <: ZoneTypeRestriction](x: Self) {
        
        inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
        
        inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
        
        inline def setWhitelistedTypeId(value: js.Array[String]): Self = StObject.set(x, "whitelistedTypeId", value.asInstanceOf[js.Any])
        
        inline def setWhitelistedTypeIdUndefined: Self = StObject.set(x, "whitelistedTypeId", js.undefined)
        
        inline def setWhitelistedTypeIdVarargs(value: String*): Self = StObject.set(x, "whitelistedTypeId", js.Array(value :_*))
      }
    }
  }
  
  extension [Self <: TagManager](x: Self) {
    
    inline def setAccounts(value: AccountsCollection): Self = StObject.set(x, "Accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsUndefined: Self = StObject.set(x, "Accounts", js.undefined)
    
    inline def setNewAccount(value: () => Account): Self = StObject.set(x, "newAccount", js.Any.fromFunction0(value))
    
    inline def setNewAccountAccess(value: () => AccountAccess): Self = StObject.set(x, "newAccountAccess", js.Any.fromFunction0(value))
    
    inline def setNewBuiltInVariable(value: () => BuiltInVariable): Self = StObject.set(x, "newBuiltInVariable", js.Any.fromFunction0(value))
    
    inline def setNewCondition(value: () => Condition): Self = StObject.set(x, "newCondition", js.Any.fromFunction0(value))
    
    inline def setNewContainer(value: () => Container): Self = StObject.set(x, "newContainer", js.Any.fromFunction0(value))
    
    inline def setNewContainerAccess(value: () => ContainerAccess): Self = StObject.set(x, "newContainerAccess", js.Any.fromFunction0(value))
    
    inline def setNewContainerVersion(value: () => ContainerVersion): Self = StObject.set(x, "newContainerVersion", js.Any.fromFunction0(value))
    
    inline def setNewCreateContainerVersionRequestVersionOptions(value: () => CreateContainerVersionRequestVersionOptions): Self = StObject.set(x, "newCreateContainerVersionRequestVersionOptions", js.Any.fromFunction0(value))
    
    inline def setNewCustomTemplate(value: () => CustomTemplate): Self = StObject.set(x, "newCustomTemplate", js.Any.fromFunction0(value))
    
    inline def setNewEntity(value: () => Entity): Self = StObject.set(x, "newEntity", js.Any.fromFunction0(value))
    
    inline def setNewEnvironment(value: () => Environment): Self = StObject.set(x, "newEnvironment", js.Any.fromFunction0(value))
    
    inline def setNewFolder(value: () => Folder): Self = StObject.set(x, "newFolder", js.Any.fromFunction0(value))
    
    inline def setNewParameter(value: () => Parameter): Self = StObject.set(x, "newParameter", js.Any.fromFunction0(value))
    
    inline def setNewSetupTag(value: () => SetupTag): Self = StObject.set(x, "newSetupTag", js.Any.fromFunction0(value))
    
    inline def setNewTag(value: () => Tag): Self = StObject.set(x, "newTag", js.Any.fromFunction0(value))
    
    inline def setNewTeardownTag(value: () => TeardownTag): Self = StObject.set(x, "newTeardownTag", js.Any.fromFunction0(value))
    
    inline def setNewTimestamp(value: () => Timestamp): Self = StObject.set(x, "newTimestamp", js.Any.fromFunction0(value))
    
    inline def setNewTrigger(value: () => Trigger): Self = StObject.set(x, "newTrigger", js.Any.fromFunction0(value))
    
    inline def setNewUserPermission(value: () => UserPermission): Self = StObject.set(x, "newUserPermission", js.Any.fromFunction0(value))
    
    inline def setNewVariable(value: () => Variable): Self = StObject.set(x, "newVariable", js.Any.fromFunction0(value))
    
    inline def setNewVariableFormatValue(value: () => VariableFormatValue): Self = StObject.set(x, "newVariableFormatValue", js.Any.fromFunction0(value))
    
    inline def setNewWorkspace(value: () => Workspace): Self = StObject.set(x, "newWorkspace", js.Any.fromFunction0(value))
    
    inline def setNewZone(value: () => Zone): Self = StObject.set(x, "newZone", js.Any.fromFunction0(value))
    
    inline def setNewZoneBoundary(value: () => ZoneBoundary): Self = StObject.set(x, "newZoneBoundary", js.Any.fromFunction0(value))
    
    inline def setNewZoneChildContainer(value: () => ZoneChildContainer): Self = StObject.set(x, "newZoneChildContainer", js.Any.fromFunction0(value))
    
    inline def setNewZoneTypeRestriction(value: () => ZoneTypeRestriction): Self = StObject.set(x, "newZoneTypeRestriction", js.Any.fromFunction0(value))
  }
}
