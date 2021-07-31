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
  
  @scala.inline
  def apply(
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
      
      @scala.inline
      def apply(): Account = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Account]
      }
      
      @scala.inline
      implicit class AccountMutableBuilder[Self <: Account] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
        
        @scala.inline
        def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        @scala.inline
        def setShareData(value: Boolean): Self = StObject.set(x, "shareData", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShareDataUndefined: Self = StObject.set(x, "shareData", js.undefined)
        
        @scala.inline
        def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
      }
    }
    
    trait AccountAccess extends StObject {
      
      var permission: js.UndefOr[String] = js.undefined
    }
    object AccountAccess {
      
      @scala.inline
      def apply(): AccountAccess = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AccountAccess]
      }
      
      @scala.inline
      implicit class AccountAccessMutableBuilder[Self <: AccountAccess] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
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
      
      @scala.inline
      def apply(): BuiltInVariable = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BuiltInVariable]
      }
      
      @scala.inline
      implicit class BuiltInVariableMutableBuilder[Self <: BuiltInVariable] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
        
        @scala.inline
        def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        @scala.inline
        def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
      }
    }
    
    trait Condition extends StObject {
      
      var parameter: js.UndefOr[js.Array[Parameter]] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object Condition {
      
      @scala.inline
      def apply(): Condition = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Condition]
      }
      
      @scala.inline
      implicit class ConditionMutableBuilder[Self <: Condition] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setParameter(value: js.Array[Parameter]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
        
        @scala.inline
        def setParameterVarargs(value: Parameter*): Self = StObject.set(x, "parameter", js.Array(value :_*))
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
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
      
      @scala.inline
      def apply(): Container = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Container]
      }
      
      @scala.inline
      implicit class ContainerMutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
        
        @scala.inline
        def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
        
        @scala.inline
        def setDomainName(value: js.Array[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
        
        @scala.inline
        def setDomainNameVarargs(value: String*): Self = StObject.set(x, "domainName", js.Array(value :_*))
        
        @scala.inline
        def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        @scala.inline
        def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPublicIdUndefined: Self = StObject.set(x, "publicId", js.undefined)
        
        @scala.inline
        def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
        
        @scala.inline
        def setUsageContext(value: js.Array[String]): Self = StObject.set(x, "usageContext", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUsageContextUndefined: Self = StObject.set(x, "usageContext", js.undefined)
        
        @scala.inline
        def setUsageContextVarargs(value: String*): Self = StObject.set(x, "usageContext", js.Array(value :_*))
      }
    }
    
    trait ContainerAccess extends StObject {
      
      var containerId: js.UndefOr[String] = js.undefined
      
      var permission: js.UndefOr[String] = js.undefined
    }
    object ContainerAccess {
      
      @scala.inline
      def apply(): ContainerAccess = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ContainerAccess]
      }
      
      @scala.inline
      implicit class ContainerAccessMutableBuilder[Self <: ContainerAccess] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
        
        @scala.inline
        def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
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
      
      @scala.inline
      def apply(): ContainerVersion = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ContainerVersion]
      }
      
      @scala.inline
      implicit class ContainerVersionMutableBuilder[Self <: ContainerVersion] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
        
        @scala.inline
        def setBuiltInVariable(value: js.Array[BuiltInVariable]): Self = StObject.set(x, "builtInVariable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBuiltInVariableUndefined: Self = StObject.set(x, "builtInVariable", js.undefined)
        
        @scala.inline
        def setBuiltInVariableVarargs(value: BuiltInVariable*): Self = StObject.set(x, "builtInVariable", js.Array(value :_*))
        
        @scala.inline
        def setContainer(value: Container): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
        
        @scala.inline
        def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
        
        @scala.inline
        def setContainerVersionId(value: String): Self = StObject.set(x, "containerVersionId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainerVersionIdUndefined: Self = StObject.set(x, "containerVersionId", js.undefined)
        
        @scala.inline
        def setCustomTemplate(value: js.Array[CustomTemplate]): Self = StObject.set(x, "customTemplate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomTemplateUndefined: Self = StObject.set(x, "customTemplate", js.undefined)
        
        @scala.inline
        def setCustomTemplateVarargs(value: CustomTemplate*): Self = StObject.set(x, "customTemplate", js.Array(value :_*))
        
        @scala.inline
        def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        @scala.inline
        def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
        
        @scala.inline
        def setFolder(value: js.Array[Folder]): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
        
        @scala.inline
        def setFolderVarargs(value: Folder*): Self = StObject.set(x, "folder", js.Array(value :_*))
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        @scala.inline
        def setTag(value: js.Array[Tag]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
        
        @scala.inline
        def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
        
        @scala.inline
        def setTagVarargs(value: Tag*): Self = StObject.set(x, "tag", js.Array(value :_*))
        
        @scala.inline
        def setTrigger(value: js.Array[Trigger]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
        
        @scala.inline
        def setTriggerVarargs(value: Trigger*): Self = StObject.set(x, "trigger", js.Array(value :_*))
        
        @scala.inline
        def setVariable(value: js.Array[Variable]): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
        
        @scala.inline
        def setVariableVarargs(value: Variable*): Self = StObject.set(x, "variable", js.Array(value :_*))
        
        @scala.inline
        def setZone(value: js.Array[Zone]): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
        
        @scala.inline
        def setZoneVarargs(value: Zone*): Self = StObject.set(x, "zone", js.Array(value :_*))
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
      
      @scala.inline
      def apply(): ContainerVersionHeader = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ContainerVersionHeader]
      }
      
      @scala.inline
      implicit class ContainerVersionHeaderMutableBuilder[Self <: ContainerVersionHeader] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
        
        @scala.inline
        def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
        
        @scala.inline
        def setContainerVersionId(value: String): Self = StObject.set(x, "containerVersionId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainerVersionIdUndefined: Self = StObject.set(x, "containerVersionId", js.undefined)
        
        @scala.inline
        def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setNumCustomTemplates(value: String): Self = StObject.set(x, "numCustomTemplates", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNumCustomTemplatesUndefined: Self = StObject.set(x, "numCustomTemplates", js.undefined)
        
        @scala.inline
        def setNumMacros(value: String): Self = StObject.set(x, "numMacros", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNumMacrosUndefined: Self = StObject.set(x, "numMacros", js.undefined)
        
        @scala.inline
        def setNumRules(value: String): Self = StObject.set(x, "numRules", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNumRulesUndefined: Self = StObject.set(x, "numRules", js.undefined)
        
        @scala.inline
        def setNumTags(value: String): Self = StObject.set(x, "numTags", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNumTagsUndefined: Self = StObject.set(x, "numTags", js.undefined)
        
        @scala.inline
        def setNumTriggers(value: String): Self = StObject.set(x, "numTriggers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNumTriggersUndefined: Self = StObject.set(x, "numTriggers", js.undefined)
        
        @scala.inline
        def setNumVariables(value: String): Self = StObject.set(x, "numVariables", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNumVariablesUndefined: Self = StObject.set(x, "numVariables", js.undefined)
        
        @scala.inline
        def setNumZones(value: String): Self = StObject.set(x, "numZones", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNumZonesUndefined: Self = StObject.set(x, "numZones", js.undefined)
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      }
    }
    
    trait CreateBuiltInVariableResponse extends StObject {
      
      var builtInVariable: js.UndefOr[js.Array[BuiltInVariable]] = js.undefined
    }
    object CreateBuiltInVariableResponse {
      
      @scala.inline
      def apply(): CreateBuiltInVariableResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateBuiltInVariableResponse]
      }
      
      @scala.inline
      implicit class CreateBuiltInVariableResponseMutableBuilder[Self <: CreateBuiltInVariableResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBuiltInVariable(value: js.Array[BuiltInVariable]): Self = StObject.set(x, "builtInVariable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBuiltInVariableUndefined: Self = StObject.set(x, "builtInVariable", js.undefined)
        
        @scala.inline
        def setBuiltInVariableVarargs(value: BuiltInVariable*): Self = StObject.set(x, "builtInVariable", js.Array(value :_*))
      }
    }
    
    trait CreateContainerVersionRequestVersionOptions extends StObject {
      
      var name: js.UndefOr[String] = js.undefined
      
      var notes: js.UndefOr[String] = js.undefined
    }
    object CreateContainerVersionRequestVersionOptions {
      
      @scala.inline
      def apply(): CreateContainerVersionRequestVersionOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateContainerVersionRequestVersionOptions]
      }
      
      @scala.inline
      implicit class CreateContainerVersionRequestVersionOptionsMutableBuilder[Self <: CreateContainerVersionRequestVersionOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
      }
    }
    
    trait CreateContainerVersionResponse extends StObject {
      
      var compilerError: js.UndefOr[Boolean] = js.undefined
      
      var containerVersion: js.UndefOr[ContainerVersion] = js.undefined
      
      var newWorkspacePath: js.UndefOr[String] = js.undefined
      
      var syncStatus: js.UndefOr[SyncStatus] = js.undefined
    }
    object CreateContainerVersionResponse {
      
      @scala.inline
      def apply(): CreateContainerVersionResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateContainerVersionResponse]
      }
      
      @scala.inline
      implicit class CreateContainerVersionResponseMutableBuilder[Self <: CreateContainerVersionResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCompilerError(value: Boolean): Self = StObject.set(x, "compilerError", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCompilerErrorUndefined: Self = StObject.set(x, "compilerError", js.undefined)
        
        @scala.inline
        def setContainerVersion(value: ContainerVersion): Self = StObject.set(x, "containerVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainerVersionUndefined: Self = StObject.set(x, "containerVersion", js.undefined)
        
        @scala.inline
        def setNewWorkspacePath(value: String): Self = StObject.set(x, "newWorkspacePath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNewWorkspacePathUndefined: Self = StObject.set(x, "newWorkspacePath", js.undefined)
        
        @scala.inline
        def setSyncStatus(value: SyncStatus): Self = StObject.set(x, "syncStatus", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSyncStatusUndefined: Self = StObject.set(x, "syncStatus", js.undefined)
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
      
      @scala.inline
      def apply(): CustomTemplate = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CustomTemplate]
      }
      
      @scala.inline
      implicit class CustomTemplateMutableBuilder[Self <: CustomTemplate] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
        
        @scala.inline
        def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
        
        @scala.inline
        def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        @scala.inline
        def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
        
        @scala.inline
        def setTemplateData(value: String): Self = StObject.set(x, "templateData", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTemplateDataUndefined: Self = StObject.set(x, "templateData", js.undefined)
        
        @scala.inline
        def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
        
        @scala.inline
        def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
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
      
      @scala.inline
      def apply(): Entity = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Entity]
      }
      
      @scala.inline
      implicit class EntityMutableBuilder[Self <: Entity] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChangeStatus(value: String): Self = StObject.set(x, "changeStatus", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChangeStatusUndefined: Self = StObject.set(x, "changeStatus", js.undefined)
        
        @scala.inline
        def setFolder(value: Folder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
        
        @scala.inline
        def setTag(value: Tag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
        
        @scala.inline
        def setTrigger(value: Trigger): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
        
        @scala.inline
        def setVariable(value: Variable): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
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
      
      @scala.inline
      def apply(): Environment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Environment]
      }
      
      @scala.inline
      implicit class EnvironmentMutableBuilder[Self <: Environment] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
        
        @scala.inline
        def setAuthorizationCode(value: String): Self = StObject.set(x, "authorizationCode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthorizationCodeUndefined: Self = StObject.set(x, "authorizationCode", js.undefined)
        
        @scala.inline
        def setAuthorizationTimestamp(value: Timestamp): Self = StObject.set(x, "authorizationTimestamp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthorizationTimestampUndefined: Self = StObject.set(x, "authorizationTimestamp", js.undefined)
        
        @scala.inline
        def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
        
        @scala.inline
        def setContainerVersionId(value: String): Self = StObject.set(x, "containerVersionId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainerVersionIdUndefined: Self = StObject.set(x, "containerVersionId", js.undefined)
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        @scala.inline
        def setEnableDebug(value: Boolean): Self = StObject.set(x, "enableDebug", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnableDebugUndefined: Self = StObject.set(x, "enableDebug", js.undefined)
        
        @scala.inline
        def setEnvironmentId(value: String): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnvironmentIdUndefined: Self = StObject.set(x, "environmentId", js.undefined)
        
        @scala.inline
        def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        @scala.inline
        def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
        
        @scala.inline
        def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
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
      
      @scala.inline
      def apply(): Folder = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Folder]
      }
      
      @scala.inline
      implicit class FolderMutableBuilder[Self <: Folder] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
        
        @scala.inline
        def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
        
        @scala.inline
        def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
        
        @scala.inline
        def setFolderId(value: String): Self = StObject.set(x, "folderId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFolderIdUndefined: Self = StObject.set(x, "folderId", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        @scala.inline
        def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
        
        @scala.inline
        def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
      }
    }
    
    trait FolderEntities extends StObject {
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var tag: js.UndefOr[js.Array[Tag]] = js.undefined
      
      var trigger: js.UndefOr[js.Array[Trigger]] = js.undefined
      
      var variable: js.UndefOr[js.Array[Variable]] = js.undefined
    }
    object FolderEntities {
      
      @scala.inline
      def apply(): FolderEntities = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FolderEntities]
      }
      
      @scala.inline
      implicit class FolderEntitiesMutableBuilder[Self <: FolderEntities] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        @scala.inline
        def setTag(value: js.Array[Tag]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
        
        @scala.inline
        def setTagVarargs(value: Tag*): Self = StObject.set(x, "tag", js.Array(value :_*))
        
        @scala.inline
        def setTrigger(value: js.Array[Trigger]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
        
        @scala.inline
        def setTriggerVarargs(value: Trigger*): Self = StObject.set(x, "trigger", js.Array(value :_*))
        
        @scala.inline
        def setVariable(value: js.Array[Variable]): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
        
        @scala.inline
        def setVariableVarargs(value: Variable*): Self = StObject.set(x, "variable", js.Array(value :_*))
      }
    }
    
    trait GetWorkspaceStatusResponse extends StObject {
      
      var mergeConflict: js.UndefOr[js.Array[MergeConflict]] = js.undefined
      
      var workspaceChange: js.UndefOr[js.Array[Entity]] = js.undefined
    }
    object GetWorkspaceStatusResponse {
      
      @scala.inline
      def apply(): GetWorkspaceStatusResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GetWorkspaceStatusResponse]
      }
      
      @scala.inline
      implicit class GetWorkspaceStatusResponseMutableBuilder[Self <: GetWorkspaceStatusResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMergeConflict(value: js.Array[MergeConflict]): Self = StObject.set(x, "mergeConflict", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMergeConflictUndefined: Self = StObject.set(x, "mergeConflict", js.undefined)
        
        @scala.inline
        def setMergeConflictVarargs(value: MergeConflict*): Self = StObject.set(x, "mergeConflict", js.Array(value :_*))
        
        @scala.inline
        def setWorkspaceChange(value: js.Array[Entity]): Self = StObject.set(x, "workspaceChange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWorkspaceChangeUndefined: Self = StObject.set(x, "workspaceChange", js.undefined)
        
        @scala.inline
        def setWorkspaceChangeVarargs(value: Entity*): Self = StObject.set(x, "workspaceChange", js.Array(value :_*))
      }
    }
    
    trait ListAccountsResponse extends StObject {
      
      var account: js.UndefOr[js.Array[Account]] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object ListAccountsResponse {
      
      @scala.inline
      def apply(): ListAccountsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListAccountsResponse]
      }
      
      @scala.inline
      implicit class ListAccountsResponseMutableBuilder[Self <: ListAccountsResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccount(value: js.Array[Account]): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
        
        @scala.inline
        def setAccountVarargs(value: Account*): Self = StObject.set(x, "account", js.Array(value :_*))
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait ListContainerVersionsResponse extends StObject {
      
      var containerVersionHeader: js.UndefOr[js.Array[ContainerVersionHeader]] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object ListContainerVersionsResponse {
      
      @scala.inline
      def apply(): ListContainerVersionsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListContainerVersionsResponse]
      }
      
      @scala.inline
      implicit class ListContainerVersionsResponseMutableBuilder[Self <: ListContainerVersionsResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContainerVersionHeader(value: js.Array[ContainerVersionHeader]): Self = StObject.set(x, "containerVersionHeader", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainerVersionHeaderUndefined: Self = StObject.set(x, "containerVersionHeader", js.undefined)
        
        @scala.inline
        def setContainerVersionHeaderVarargs(value: ContainerVersionHeader*): Self = StObject.set(x, "containerVersionHeader", js.Array(value :_*))
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait ListContainersResponse extends StObject {
      
      var container: js.UndefOr[js.Array[Container]] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object ListContainersResponse {
      
      @scala.inline
      def apply(): ListContainersResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListContainersResponse]
      }
      
      @scala.inline
      implicit class ListContainersResponseMutableBuilder[Self <: ListContainersResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContainer(value: js.Array[Container]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
        
        @scala.inline
        def setContainerVarargs(value: Container*): Self = StObject.set(x, "container", js.Array(value :_*))
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait ListEnabledBuiltInVariablesResponse extends StObject {
      
      var builtInVariable: js.UndefOr[js.Array[BuiltInVariable]] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object ListEnabledBuiltInVariablesResponse {
      
      @scala.inline
      def apply(): ListEnabledBuiltInVariablesResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListEnabledBuiltInVariablesResponse]
      }
      
      @scala.inline
      implicit class ListEnabledBuiltInVariablesResponseMutableBuilder[Self <: ListEnabledBuiltInVariablesResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBuiltInVariable(value: js.Array[BuiltInVariable]): Self = StObject.set(x, "builtInVariable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBuiltInVariableUndefined: Self = StObject.set(x, "builtInVariable", js.undefined)
        
        @scala.inline
        def setBuiltInVariableVarargs(value: BuiltInVariable*): Self = StObject.set(x, "builtInVariable", js.Array(value :_*))
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait ListEnvironmentsResponse extends StObject {
      
      var environment: js.UndefOr[js.Array[Environment]] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object ListEnvironmentsResponse {
      
      @scala.inline
      def apply(): ListEnvironmentsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListEnvironmentsResponse]
      }
      
      @scala.inline
      implicit class ListEnvironmentsResponseMutableBuilder[Self <: ListEnvironmentsResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEnvironment(value: js.Array[Environment]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
        
        @scala.inline
        def setEnvironmentVarargs(value: Environment*): Self = StObject.set(x, "environment", js.Array(value :_*))
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait ListFoldersResponse extends StObject {
      
      var folder: js.UndefOr[js.Array[Folder]] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object ListFoldersResponse {
      
      @scala.inline
      def apply(): ListFoldersResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListFoldersResponse]
      }
      
      @scala.inline
      implicit class ListFoldersResponseMutableBuilder[Self <: ListFoldersResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFolder(value: js.Array[Folder]): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
        
        @scala.inline
        def setFolderVarargs(value: Folder*): Self = StObject.set(x, "folder", js.Array(value :_*))
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait ListTagsResponse extends StObject {
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var tag: js.UndefOr[js.Array[Tag]] = js.undefined
    }
    object ListTagsResponse {
      
      @scala.inline
      def apply(): ListTagsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListTagsResponse]
      }
      
      @scala.inline
      implicit class ListTagsResponseMutableBuilder[Self <: ListTagsResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        @scala.inline
        def setTag(value: js.Array[Tag]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
        
        @scala.inline
        def setTagVarargs(value: Tag*): Self = StObject.set(x, "tag", js.Array(value :_*))
      }
    }
    
    trait ListTriggersResponse extends StObject {
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var trigger: js.UndefOr[js.Array[Trigger]] = js.undefined
    }
    object ListTriggersResponse {
      
      @scala.inline
      def apply(): ListTriggersResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListTriggersResponse]
      }
      
      @scala.inline
      implicit class ListTriggersResponseMutableBuilder[Self <: ListTriggersResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        @scala.inline
        def setTrigger(value: js.Array[Trigger]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
        
        @scala.inline
        def setTriggerVarargs(value: Trigger*): Self = StObject.set(x, "trigger", js.Array(value :_*))
      }
    }
    
    trait ListUserPermissionsResponse extends StObject {
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var userPermission: js.UndefOr[js.Array[UserPermission]] = js.undefined
    }
    object ListUserPermissionsResponse {
      
      @scala.inline
      def apply(): ListUserPermissionsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListUserPermissionsResponse]
      }
      
      @scala.inline
      implicit class ListUserPermissionsResponseMutableBuilder[Self <: ListUserPermissionsResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        @scala.inline
        def setUserPermission(value: js.Array[UserPermission]): Self = StObject.set(x, "userPermission", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserPermissionUndefined: Self = StObject.set(x, "userPermission", js.undefined)
        
        @scala.inline
        def setUserPermissionVarargs(value: UserPermission*): Self = StObject.set(x, "userPermission", js.Array(value :_*))
      }
    }
    
    trait ListVariablesResponse extends StObject {
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var variable: js.UndefOr[js.Array[Variable]] = js.undefined
    }
    object ListVariablesResponse {
      
      @scala.inline
      def apply(): ListVariablesResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListVariablesResponse]
      }
      
      @scala.inline
      implicit class ListVariablesResponseMutableBuilder[Self <: ListVariablesResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        @scala.inline
        def setVariable(value: js.Array[Variable]): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
        
        @scala.inline
        def setVariableVarargs(value: Variable*): Self = StObject.set(x, "variable", js.Array(value :_*))
      }
    }
    
    trait ListWorkspacesResponse extends StObject {
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var workspace: js.UndefOr[js.Array[Workspace]] = js.undefined
    }
    object ListWorkspacesResponse {
      
      @scala.inline
      def apply(): ListWorkspacesResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListWorkspacesResponse]
      }
      
      @scala.inline
      implicit class ListWorkspacesResponseMutableBuilder[Self <: ListWorkspacesResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        @scala.inline
        def setWorkspace(value: js.Array[Workspace]): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
        
        @scala.inline
        def setWorkspaceVarargs(value: Workspace*): Self = StObject.set(x, "workspace", js.Array(value :_*))
      }
    }
    
    trait ListZonesResponse extends StObject {
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var zone: js.UndefOr[js.Array[Zone]] = js.undefined
    }
    object ListZonesResponse {
      
      @scala.inline
      def apply(): ListZonesResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListZonesResponse]
      }
      
      @scala.inline
      implicit class ListZonesResponseMutableBuilder[Self <: ListZonesResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        @scala.inline
        def setZone(value: js.Array[Zone]): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
        
        @scala.inline
        def setZoneVarargs(value: Zone*): Self = StObject.set(x, "zone", js.Array(value :_*))
      }
    }
    
    trait MergeConflict extends StObject {
      
      var entityInBaseVersion: js.UndefOr[Entity] = js.undefined
      
      var entityInWorkspace: js.UndefOr[Entity] = js.undefined
    }
    object MergeConflict {
      
      @scala.inline
      def apply(): MergeConflict = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MergeConflict]
      }
      
      @scala.inline
      implicit class MergeConflictMutableBuilder[Self <: MergeConflict] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEntityInBaseVersion(value: Entity): Self = StObject.set(x, "entityInBaseVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEntityInBaseVersionUndefined: Self = StObject.set(x, "entityInBaseVersion", js.undefined)
        
        @scala.inline
        def setEntityInWorkspace(value: Entity): Self = StObject.set(x, "entityInWorkspace", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEntityInWorkspaceUndefined: Self = StObject.set(x, "entityInWorkspace", js.undefined)
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
      
      @scala.inline
      def apply(): Parameter = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Parameter]
      }
      
      @scala.inline
      implicit class ParameterMutableBuilder[Self <: Parameter] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        @scala.inline
        def setList(value: js.Array[Parameter]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setListUndefined: Self = StObject.set(x, "list", js.undefined)
        
        @scala.inline
        def setListVarargs(value: Parameter*): Self = StObject.set(x, "list", js.Array(value :_*))
        
        @scala.inline
        def setMap(value: js.Array[Parameter]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
        
        @scala.inline
        def setMapVarargs(value: Parameter*): Self = StObject.set(x, "map", js.Array(value :_*))
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait PublishContainerVersionResponse extends StObject {
      
      var compilerError: js.UndefOr[Boolean] = js.undefined
      
      var containerVersion: js.UndefOr[ContainerVersion] = js.undefined
    }
    object PublishContainerVersionResponse {
      
      @scala.inline
      def apply(): PublishContainerVersionResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PublishContainerVersionResponse]
      }
      
      @scala.inline
      implicit class PublishContainerVersionResponseMutableBuilder[Self <: PublishContainerVersionResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCompilerError(value: Boolean): Self = StObject.set(x, "compilerError", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCompilerErrorUndefined: Self = StObject.set(x, "compilerError", js.undefined)
        
        @scala.inline
        def setContainerVersion(value: ContainerVersion): Self = StObject.set(x, "containerVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainerVersionUndefined: Self = StObject.set(x, "containerVersion", js.undefined)
      }
    }
    
    trait QuickPreviewResponse extends StObject {
      
      var compilerError: js.UndefOr[Boolean] = js.undefined
      
      var containerVersion: js.UndefOr[ContainerVersion] = js.undefined
      
      var syncStatus: js.UndefOr[SyncStatus] = js.undefined
    }
    object QuickPreviewResponse {
      
      @scala.inline
      def apply(): QuickPreviewResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[QuickPreviewResponse]
      }
      
      @scala.inline
      implicit class QuickPreviewResponseMutableBuilder[Self <: QuickPreviewResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCompilerError(value: Boolean): Self = StObject.set(x, "compilerError", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCompilerErrorUndefined: Self = StObject.set(x, "compilerError", js.undefined)
        
        @scala.inline
        def setContainerVersion(value: ContainerVersion): Self = StObject.set(x, "containerVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainerVersionUndefined: Self = StObject.set(x, "containerVersion", js.undefined)
        
        @scala.inline
        def setSyncStatus(value: SyncStatus): Self = StObject.set(x, "syncStatus", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSyncStatusUndefined: Self = StObject.set(x, "syncStatus", js.undefined)
      }
    }
    
    trait RevertBuiltInVariableResponse extends StObject {
      
      var enabled: js.UndefOr[Boolean] = js.undefined
    }
    object RevertBuiltInVariableResponse {
      
      @scala.inline
      def apply(): RevertBuiltInVariableResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RevertBuiltInVariableResponse]
      }
      
      @scala.inline
      implicit class RevertBuiltInVariableResponseMutableBuilder[Self <: RevertBuiltInVariableResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      }
    }
    
    trait RevertFolderResponse extends StObject {
      
      var folder: js.UndefOr[Folder] = js.undefined
    }
    object RevertFolderResponse {
      
      @scala.inline
      def apply(): RevertFolderResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RevertFolderResponse]
      }
      
      @scala.inline
      implicit class RevertFolderResponseMutableBuilder[Self <: RevertFolderResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFolder(value: Folder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
      }
    }
    
    trait RevertTagResponse extends StObject {
      
      var tag: js.UndefOr[Tag] = js.undefined
    }
    object RevertTagResponse {
      
      @scala.inline
      def apply(): RevertTagResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RevertTagResponse]
      }
      
      @scala.inline
      implicit class RevertTagResponseMutableBuilder[Self <: RevertTagResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setTag(value: Tag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      }
    }
    
    trait RevertTriggerResponse extends StObject {
      
      var trigger: js.UndefOr[Trigger] = js.undefined
    }
    object RevertTriggerResponse {
      
      @scala.inline
      def apply(): RevertTriggerResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RevertTriggerResponse]
      }
      
      @scala.inline
      implicit class RevertTriggerResponseMutableBuilder[Self <: RevertTriggerResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setTrigger(value: Trigger): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      }
    }
    
    trait RevertVariableResponse extends StObject {
      
      var variable: js.UndefOr[Variable] = js.undefined
    }
    object RevertVariableResponse {
      
      @scala.inline
      def apply(): RevertVariableResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RevertVariableResponse]
      }
      
      @scala.inline
      implicit class RevertVariableResponseMutableBuilder[Self <: RevertVariableResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setVariable(value: Variable): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
      }
    }
    
    trait RevertZoneResponse extends StObject {
      
      var zone: js.UndefOr[Zone] = js.undefined
    }
    object RevertZoneResponse {
      
      @scala.inline
      def apply(): RevertZoneResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RevertZoneResponse]
      }
      
      @scala.inline
      implicit class RevertZoneResponseMutableBuilder[Self <: RevertZoneResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setZone(value: Zone): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
      }
    }
    
    trait SetupTag extends StObject {
      
      var stopOnSetupFailure: js.UndefOr[Boolean] = js.undefined
      
      var tagName: js.UndefOr[String] = js.undefined
    }
    object SetupTag {
      
      @scala.inline
      def apply(): SetupTag = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SetupTag]
      }
      
      @scala.inline
      implicit class SetupTagMutableBuilder[Self <: SetupTag] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setStopOnSetupFailure(value: Boolean): Self = StObject.set(x, "stopOnSetupFailure", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStopOnSetupFailureUndefined: Self = StObject.set(x, "stopOnSetupFailure", js.undefined)
        
        @scala.inline
        def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      }
    }
    
    trait SyncStatus extends StObject {
      
      var mergeConflict: js.UndefOr[Boolean] = js.undefined
      
      var syncError: js.UndefOr[Boolean] = js.undefined
    }
    object SyncStatus {
      
      @scala.inline
      def apply(): SyncStatus = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SyncStatus]
      }
      
      @scala.inline
      implicit class SyncStatusMutableBuilder[Self <: SyncStatus] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMergeConflict(value: Boolean): Self = StObject.set(x, "mergeConflict", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMergeConflictUndefined: Self = StObject.set(x, "mergeConflict", js.undefined)
        
        @scala.inline
        def setSyncError(value: Boolean): Self = StObject.set(x, "syncError", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSyncErrorUndefined: Self = StObject.set(x, "syncError", js.undefined)
      }
    }
    
    trait SyncWorkspaceResponse extends StObject {
      
      var mergeConflict: js.UndefOr[js.Array[MergeConflict]] = js.undefined
      
      var syncStatus: js.UndefOr[SyncStatus] = js.undefined
    }
    object SyncWorkspaceResponse {
      
      @scala.inline
      def apply(): SyncWorkspaceResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SyncWorkspaceResponse]
      }
      
      @scala.inline
      implicit class SyncWorkspaceResponseMutableBuilder[Self <: SyncWorkspaceResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMergeConflict(value: js.Array[MergeConflict]): Self = StObject.set(x, "mergeConflict", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMergeConflictUndefined: Self = StObject.set(x, "mergeConflict", js.undefined)
        
        @scala.inline
        def setMergeConflictVarargs(value: MergeConflict*): Self = StObject.set(x, "mergeConflict", js.Array(value :_*))
        
        @scala.inline
        def setSyncStatus(value: SyncStatus): Self = StObject.set(x, "syncStatus", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSyncStatusUndefined: Self = StObject.set(x, "syncStatus", js.undefined)
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
      
      @scala.inline
      def apply(): Tag = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Tag]
      }
      
      @scala.inline
      implicit class TagMutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
        
        @scala.inline
        def setBlockingRuleId(value: js.Array[String]): Self = StObject.set(x, "blockingRuleId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBlockingRuleIdUndefined: Self = StObject.set(x, "blockingRuleId", js.undefined)
        
        @scala.inline
        def setBlockingRuleIdVarargs(value: String*): Self = StObject.set(x, "blockingRuleId", js.Array(value :_*))
        
        @scala.inline
        def setBlockingTriggerId(value: js.Array[String]): Self = StObject.set(x, "blockingTriggerId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBlockingTriggerIdUndefined: Self = StObject.set(x, "blockingTriggerId", js.undefined)
        
        @scala.inline
        def setBlockingTriggerIdVarargs(value: String*): Self = StObject.set(x, "blockingTriggerId", js.Array(value :_*))
        
        @scala.inline
        def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
        
        @scala.inline
        def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
        
        @scala.inline
        def setFiringRuleId(value: js.Array[String]): Self = StObject.set(x, "firingRuleId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFiringRuleIdUndefined: Self = StObject.set(x, "firingRuleId", js.undefined)
        
        @scala.inline
        def setFiringRuleIdVarargs(value: String*): Self = StObject.set(x, "firingRuleId", js.Array(value :_*))
        
        @scala.inline
        def setFiringTriggerId(value: js.Array[String]): Self = StObject.set(x, "firingTriggerId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFiringTriggerIdUndefined: Self = StObject.set(x, "firingTriggerId", js.undefined)
        
        @scala.inline
        def setFiringTriggerIdVarargs(value: String*): Self = StObject.set(x, "firingTriggerId", js.Array(value :_*))
        
        @scala.inline
        def setLiveOnly(value: Boolean): Self = StObject.set(x, "liveOnly", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLiveOnlyUndefined: Self = StObject.set(x, "liveOnly", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
        
        @scala.inline
        def setParameter(value: js.Array[Parameter]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
        
        @scala.inline
        def setParameterVarargs(value: Parameter*): Self = StObject.set(x, "parameter", js.Array(value :_*))
        
        @scala.inline
        def setParentFolderId(value: String): Self = StObject.set(x, "parentFolderId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParentFolderIdUndefined: Self = StObject.set(x, "parentFolderId", js.undefined)
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        @scala.inline
        def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
        
        @scala.inline
        def setPriority(value: Parameter): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
        
        @scala.inline
        def setScheduleEndMs(value: String): Self = StObject.set(x, "scheduleEndMs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScheduleEndMsUndefined: Self = StObject.set(x, "scheduleEndMs", js.undefined)
        
        @scala.inline
        def setScheduleStartMs(value: String): Self = StObject.set(x, "scheduleStartMs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScheduleStartMsUndefined: Self = StObject.set(x, "scheduleStartMs", js.undefined)
        
        @scala.inline
        def setSetupTag(value: js.Array[SetupTag]): Self = StObject.set(x, "setupTag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSetupTagUndefined: Self = StObject.set(x, "setupTag", js.undefined)
        
        @scala.inline
        def setSetupTagVarargs(value: SetupTag*): Self = StObject.set(x, "setupTag", js.Array(value :_*))
        
        @scala.inline
        def setTagFiringOption(value: String): Self = StObject.set(x, "tagFiringOption", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagFiringOptionUndefined: Self = StObject.set(x, "tagFiringOption", js.undefined)
        
        @scala.inline
        def setTagId(value: String): Self = StObject.set(x, "tagId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagIdUndefined: Self = StObject.set(x, "tagId", js.undefined)
        
        @scala.inline
        def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
        
        @scala.inline
        def setTeardownTag(value: js.Array[TeardownTag]): Self = StObject.set(x, "teardownTag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTeardownTagUndefined: Self = StObject.set(x, "teardownTag", js.undefined)
        
        @scala.inline
        def setTeardownTagVarargs(value: TeardownTag*): Self = StObject.set(x, "teardownTag", js.Array(value :_*))
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        @scala.inline
        def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
      }
    }
    
    trait TeardownTag extends StObject {
      
      var stopTeardownOnFailure: js.UndefOr[Boolean] = js.undefined
      
      var tagName: js.UndefOr[String] = js.undefined
    }
    object TeardownTag {
      
      @scala.inline
      def apply(): TeardownTag = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TeardownTag]
      }
      
      @scala.inline
      implicit class TeardownTagMutableBuilder[Self <: TeardownTag] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setStopTeardownOnFailure(value: Boolean): Self = StObject.set(x, "stopTeardownOnFailure", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStopTeardownOnFailureUndefined: Self = StObject.set(x, "stopTeardownOnFailure", js.undefined)
        
        @scala.inline
        def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      }
    }
    
    trait Timestamp extends StObject {
      
      var nanos: js.UndefOr[Double] = js.undefined
      
      var seconds: js.UndefOr[String] = js.undefined
    }
    object Timestamp {
      
      @scala.inline
      def apply(): Timestamp = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Timestamp]
      }
      
      @scala.inline
      implicit class TimestampMutableBuilder[Self <: Timestamp] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNanosUndefined: Self = StObject.set(x, "nanos", js.undefined)
        
        @scala.inline
        def setSeconds(value: String): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
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
      
      @scala.inline
      def apply(): Trigger = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Trigger]
      }
      
      @scala.inline
      implicit class TriggerMutableBuilder[Self <: Trigger] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
        
        @scala.inline
        def setAutoEventFilter(value: js.Array[Condition]): Self = StObject.set(x, "autoEventFilter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoEventFilterUndefined: Self = StObject.set(x, "autoEventFilter", js.undefined)
        
        @scala.inline
        def setAutoEventFilterVarargs(value: Condition*): Self = StObject.set(x, "autoEventFilter", js.Array(value :_*))
        
        @scala.inline
        def setCheckValidation(value: Parameter): Self = StObject.set(x, "checkValidation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCheckValidationUndefined: Self = StObject.set(x, "checkValidation", js.undefined)
        
        @scala.inline
        def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
        
        @scala.inline
        def setContinuousTimeMinMilliseconds(value: Parameter): Self = StObject.set(x, "continuousTimeMinMilliseconds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContinuousTimeMinMillisecondsUndefined: Self = StObject.set(x, "continuousTimeMinMilliseconds", js.undefined)
        
        @scala.inline
        def setCustomEventFilter(value: js.Array[Condition]): Self = StObject.set(x, "customEventFilter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomEventFilterUndefined: Self = StObject.set(x, "customEventFilter", js.undefined)
        
        @scala.inline
        def setCustomEventFilterVarargs(value: Condition*): Self = StObject.set(x, "customEventFilter", js.Array(value :_*))
        
        @scala.inline
        def setEventName(value: Parameter): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
        
        @scala.inline
        def setFilter(value: js.Array[Condition]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
        
        @scala.inline
        def setFilterVarargs(value: Condition*): Self = StObject.set(x, "filter", js.Array(value :_*))
        
        @scala.inline
        def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
        
        @scala.inline
        def setHorizontalScrollPercentageList(value: Parameter): Self = StObject.set(x, "horizontalScrollPercentageList", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHorizontalScrollPercentageListUndefined: Self = StObject.set(x, "horizontalScrollPercentageList", js.undefined)
        
        @scala.inline
        def setInterval(value: Parameter): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIntervalSeconds(value: Parameter): Self = StObject.set(x, "intervalSeconds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIntervalSecondsUndefined: Self = StObject.set(x, "intervalSeconds", js.undefined)
        
        @scala.inline
        def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
        
        @scala.inline
        def setLimit(value: Parameter): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
        
        @scala.inline
        def setMaxTimerLengthSeconds(value: Parameter): Self = StObject.set(x, "maxTimerLengthSeconds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxTimerLengthSecondsUndefined: Self = StObject.set(x, "maxTimerLengthSeconds", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
        
        @scala.inline
        def setParameter(value: js.Array[Parameter]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
        
        @scala.inline
        def setParameterVarargs(value: Parameter*): Self = StObject.set(x, "parameter", js.Array(value :_*))
        
        @scala.inline
        def setParentFolderId(value: String): Self = StObject.set(x, "parentFolderId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParentFolderIdUndefined: Self = StObject.set(x, "parentFolderId", js.undefined)
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        @scala.inline
        def setSelector(value: Parameter): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
        
        @scala.inline
        def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
        
        @scala.inline
        def setTotalTimeMinMilliseconds(value: Parameter): Self = StObject.set(x, "totalTimeMinMilliseconds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTotalTimeMinMillisecondsUndefined: Self = StObject.set(x, "totalTimeMinMilliseconds", js.undefined)
        
        @scala.inline
        def setTriggerId(value: String): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTriggerIdUndefined: Self = StObject.set(x, "triggerId", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        @scala.inline
        def setUniqueTriggerId(value: Parameter): Self = StObject.set(x, "uniqueTriggerId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUniqueTriggerIdUndefined: Self = StObject.set(x, "uniqueTriggerId", js.undefined)
        
        @scala.inline
        def setVerticalScrollPercentageList(value: Parameter): Self = StObject.set(x, "verticalScrollPercentageList", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerticalScrollPercentageListUndefined: Self = StObject.set(x, "verticalScrollPercentageList", js.undefined)
        
        @scala.inline
        def setVisibilitySelector(value: Parameter): Self = StObject.set(x, "visibilitySelector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVisibilitySelectorUndefined: Self = StObject.set(x, "visibilitySelector", js.undefined)
        
        @scala.inline
        def setVisiblePercentageMax(value: Parameter): Self = StObject.set(x, "visiblePercentageMax", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVisiblePercentageMaxUndefined: Self = StObject.set(x, "visiblePercentageMax", js.undefined)
        
        @scala.inline
        def setVisiblePercentageMin(value: Parameter): Self = StObject.set(x, "visiblePercentageMin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVisiblePercentageMinUndefined: Self = StObject.set(x, "visiblePercentageMin", js.undefined)
        
        @scala.inline
        def setWaitForTags(value: Parameter): Self = StObject.set(x, "waitForTags", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWaitForTagsTimeout(value: Parameter): Self = StObject.set(x, "waitForTagsTimeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWaitForTagsTimeoutUndefined: Self = StObject.set(x, "waitForTagsTimeout", js.undefined)
        
        @scala.inline
        def setWaitForTagsUndefined: Self = StObject.set(x, "waitForTags", js.undefined)
        
        @scala.inline
        def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
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
      
      @scala.inline
      def apply(): UserPermission = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UserPermission]
      }
      
      @scala.inline
      implicit class UserPermissionMutableBuilder[Self <: UserPermission] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccountAccess(value: AccountAccess): Self = StObject.set(x, "accountAccess", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccountAccessUndefined: Self = StObject.set(x, "accountAccess", js.undefined)
        
        @scala.inline
        def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
        
        @scala.inline
        def setContainerAccess(value: js.Array[ContainerAccess]): Self = StObject.set(x, "containerAccess", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainerAccessUndefined: Self = StObject.set(x, "containerAccess", js.undefined)
        
        @scala.inline
        def setContainerAccessVarargs(value: ContainerAccess*): Self = StObject.set(x, "containerAccess", js.Array(value :_*))
        
        @scala.inline
        def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
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
      
      @scala.inline
      def apply(): Variable = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Variable]
      }
      
      @scala.inline
      implicit class VariableMutableBuilder[Self <: Variable] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
        
        @scala.inline
        def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
        
        @scala.inline
        def setDisablingTriggerId(value: js.Array[String]): Self = StObject.set(x, "disablingTriggerId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisablingTriggerIdUndefined: Self = StObject.set(x, "disablingTriggerId", js.undefined)
        
        @scala.inline
        def setDisablingTriggerIdVarargs(value: String*): Self = StObject.set(x, "disablingTriggerId", js.Array(value :_*))
        
        @scala.inline
        def setEnablingTriggerId(value: js.Array[String]): Self = StObject.set(x, "enablingTriggerId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnablingTriggerIdUndefined: Self = StObject.set(x, "enablingTriggerId", js.undefined)
        
        @scala.inline
        def setEnablingTriggerIdVarargs(value: String*): Self = StObject.set(x, "enablingTriggerId", js.Array(value :_*))
        
        @scala.inline
        def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
        
        @scala.inline
        def setFormatValue(value: VariableFormatValue): Self = StObject.set(x, "formatValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormatValueUndefined: Self = StObject.set(x, "formatValue", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
        
        @scala.inline
        def setParameter(value: js.Array[Parameter]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
        
        @scala.inline
        def setParameterVarargs(value: Parameter*): Self = StObject.set(x, "parameter", js.Array(value :_*))
        
        @scala.inline
        def setParentFolderId(value: String): Self = StObject.set(x, "parentFolderId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParentFolderIdUndefined: Self = StObject.set(x, "parentFolderId", js.undefined)
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        @scala.inline
        def setScheduleEndMs(value: String): Self = StObject.set(x, "scheduleEndMs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScheduleEndMsUndefined: Self = StObject.set(x, "scheduleEndMs", js.undefined)
        
        @scala.inline
        def setScheduleStartMs(value: String): Self = StObject.set(x, "scheduleStartMs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScheduleStartMsUndefined: Self = StObject.set(x, "scheduleStartMs", js.undefined)
        
        @scala.inline
        def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        @scala.inline
        def setVariableId(value: String): Self = StObject.set(x, "variableId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVariableIdUndefined: Self = StObject.set(x, "variableId", js.undefined)
        
        @scala.inline
        def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
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
      
      @scala.inline
      def apply(): VariableFormatValue = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VariableFormatValue]
      }
      
      @scala.inline
      implicit class VariableFormatValueMutableBuilder[Self <: VariableFormatValue] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCaseConversionType(value: String): Self = StObject.set(x, "caseConversionType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCaseConversionTypeUndefined: Self = StObject.set(x, "caseConversionType", js.undefined)
        
        @scala.inline
        def setConvertFalseToValue(value: Parameter): Self = StObject.set(x, "convertFalseToValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConvertFalseToValueUndefined: Self = StObject.set(x, "convertFalseToValue", js.undefined)
        
        @scala.inline
        def setConvertNullToValue(value: Parameter): Self = StObject.set(x, "convertNullToValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConvertNullToValueUndefined: Self = StObject.set(x, "convertNullToValue", js.undefined)
        
        @scala.inline
        def setConvertTrueToValue(value: Parameter): Self = StObject.set(x, "convertTrueToValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConvertTrueToValueUndefined: Self = StObject.set(x, "convertTrueToValue", js.undefined)
        
        @scala.inline
        def setConvertUndefinedToValue(value: Parameter): Self = StObject.set(x, "convertUndefinedToValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConvertUndefinedToValueUndefined: Self = StObject.set(x, "convertUndefinedToValue", js.undefined)
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
      
      @scala.inline
      def apply(): Workspace = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Workspace]
      }
      
      @scala.inline
      implicit class WorkspaceMutableBuilder[Self <: Workspace] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
        
        @scala.inline
        def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        @scala.inline
        def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        @scala.inline
        def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
        
        @scala.inline
        def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
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
      
      @scala.inline
      def apply(): Zone = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Zone]
      }
      
      @scala.inline
      implicit class ZoneMutableBuilder[Self <: Zone] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
        
        @scala.inline
        def setBoundary(value: ZoneBoundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
        
        @scala.inline
        def setChildContainer(value: js.Array[ZoneChildContainer]): Self = StObject.set(x, "childContainer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildContainerUndefined: Self = StObject.set(x, "childContainer", js.undefined)
        
        @scala.inline
        def setChildContainerVarargs(value: ZoneChildContainer*): Self = StObject.set(x, "childContainer", js.Array(value :_*))
        
        @scala.inline
        def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
        
        @scala.inline
        def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        @scala.inline
        def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
        
        @scala.inline
        def setTypeRestriction(value: ZoneTypeRestriction): Self = StObject.set(x, "typeRestriction", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeRestrictionUndefined: Self = StObject.set(x, "typeRestriction", js.undefined)
        
        @scala.inline
        def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
        
        @scala.inline
        def setZoneId(value: String): Self = StObject.set(x, "zoneId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZoneIdUndefined: Self = StObject.set(x, "zoneId", js.undefined)
      }
    }
    
    trait ZoneBoundary extends StObject {
      
      var condition: js.UndefOr[js.Array[Condition]] = js.undefined
      
      var customEvaluationTriggerId: js.UndefOr[js.Array[String]] = js.undefined
    }
    object ZoneBoundary {
      
      @scala.inline
      def apply(): ZoneBoundary = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ZoneBoundary]
      }
      
      @scala.inline
      implicit class ZoneBoundaryMutableBuilder[Self <: ZoneBoundary] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCondition(value: js.Array[Condition]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
        
        @scala.inline
        def setConditionVarargs(value: Condition*): Self = StObject.set(x, "condition", js.Array(value :_*))
        
        @scala.inline
        def setCustomEvaluationTriggerId(value: js.Array[String]): Self = StObject.set(x, "customEvaluationTriggerId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomEvaluationTriggerIdUndefined: Self = StObject.set(x, "customEvaluationTriggerId", js.undefined)
        
        @scala.inline
        def setCustomEvaluationTriggerIdVarargs(value: String*): Self = StObject.set(x, "customEvaluationTriggerId", js.Array(value :_*))
      }
    }
    
    trait ZoneChildContainer extends StObject {
      
      var nickname: js.UndefOr[String] = js.undefined
      
      var publicId: js.UndefOr[String] = js.undefined
    }
    object ZoneChildContainer {
      
      @scala.inline
      def apply(): ZoneChildContainer = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ZoneChildContainer]
      }
      
      @scala.inline
      implicit class ZoneChildContainerMutableBuilder[Self <: ZoneChildContainer] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
        
        @scala.inline
        def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPublicIdUndefined: Self = StObject.set(x, "publicId", js.undefined)
      }
    }
    
    trait ZoneTypeRestriction extends StObject {
      
      var enable: js.UndefOr[Boolean] = js.undefined
      
      var whitelistedTypeId: js.UndefOr[js.Array[String]] = js.undefined
    }
    object ZoneTypeRestriction {
      
      @scala.inline
      def apply(): ZoneTypeRestriction = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ZoneTypeRestriction]
      }
      
      @scala.inline
      implicit class ZoneTypeRestrictionMutableBuilder[Self <: ZoneTypeRestriction] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
        
        @scala.inline
        def setWhitelistedTypeId(value: js.Array[String]): Self = StObject.set(x, "whitelistedTypeId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhitelistedTypeIdUndefined: Self = StObject.set(x, "whitelistedTypeId", js.undefined)
        
        @scala.inline
        def setWhitelistedTypeIdVarargs(value: String*): Self = StObject.set(x, "whitelistedTypeId", js.Array(value :_*))
      }
    }
  }
  
  @scala.inline
  implicit class TagManagerMutableBuilder[Self <: TagManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccounts(value: AccountsCollection): Self = StObject.set(x, "Accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountsUndefined: Self = StObject.set(x, "Accounts", js.undefined)
    
    @scala.inline
    def setNewAccount(value: () => Account): Self = StObject.set(x, "newAccount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAccountAccess(value: () => AccountAccess): Self = StObject.set(x, "newAccountAccess", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewBuiltInVariable(value: () => BuiltInVariable): Self = StObject.set(x, "newBuiltInVariable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCondition(value: () => Condition): Self = StObject.set(x, "newCondition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewContainer(value: () => Container): Self = StObject.set(x, "newContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewContainerAccess(value: () => ContainerAccess): Self = StObject.set(x, "newContainerAccess", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewContainerVersion(value: () => ContainerVersion): Self = StObject.set(x, "newContainerVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCreateContainerVersionRequestVersionOptions(value: () => CreateContainerVersionRequestVersionOptions): Self = StObject.set(x, "newCreateContainerVersionRequestVersionOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCustomTemplate(value: () => CustomTemplate): Self = StObject.set(x, "newCustomTemplate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEntity(value: () => Entity): Self = StObject.set(x, "newEntity", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEnvironment(value: () => Environment): Self = StObject.set(x, "newEnvironment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewFolder(value: () => Folder): Self = StObject.set(x, "newFolder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewParameter(value: () => Parameter): Self = StObject.set(x, "newParameter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSetupTag(value: () => SetupTag): Self = StObject.set(x, "newSetupTag", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTag(value: () => Tag): Self = StObject.set(x, "newTag", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTeardownTag(value: () => TeardownTag): Self = StObject.set(x, "newTeardownTag", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTimestamp(value: () => Timestamp): Self = StObject.set(x, "newTimestamp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTrigger(value: () => Trigger): Self = StObject.set(x, "newTrigger", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUserPermission(value: () => UserPermission): Self = StObject.set(x, "newUserPermission", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewVariable(value: () => Variable): Self = StObject.set(x, "newVariable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewVariableFormatValue(value: () => VariableFormatValue): Self = StObject.set(x, "newVariableFormatValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewWorkspace(value: () => Workspace): Self = StObject.set(x, "newWorkspace", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewZone(value: () => Zone): Self = StObject.set(x, "newZone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewZoneBoundary(value: () => ZoneBoundary): Self = StObject.set(x, "newZoneBoundary", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewZoneChildContainer(value: () => ZoneChildContainer): Self = StObject.set(x, "newZoneChildContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewZoneTypeRestriction(value: () => ZoneTypeRestriction): Self = StObject.set(x, "newZoneTypeRestriction", js.Any.fromFunction0(value))
  }
}
