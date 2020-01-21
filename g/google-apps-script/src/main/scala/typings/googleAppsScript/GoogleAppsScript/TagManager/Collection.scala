package typings.googleAppsScript.GoogleAppsScript.TagManager

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
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.Account
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.Container
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.ContainerVersion
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.ContainerVersionHeader
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.CreateBuiltInVariableResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.CreateContainerVersionRequestVersionOptions
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.CreateContainerVersionResponse
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
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.PublishContainerVersionResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.QuickPreviewResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.RevertBuiltInVariableResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.RevertFolderResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.RevertTagResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.RevertTriggerResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.RevertVariableResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.RevertZoneResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.SyncWorkspaceResponse
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.Tag
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.Trigger
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.UserPermission
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.Variable
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.Workspace
import typings.googleAppsScript.GoogleAppsScript.TagManager.Schema.Zone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GoogleAppsScript.TagManager.Collection")
@js.native
object Collection extends js.Object {
  @js.native
  trait AccountsCollection extends js.Object {
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
  
  @js.native
  object Accounts extends js.Object {
    @js.native
    trait ContainersCollection extends js.Object {
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
    trait UserPermissionsCollection extends js.Object {
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
    
    @js.native
    object Containers extends js.Object {
      @js.native
      trait EnvironmentsCollection extends js.Object {
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
      trait VersionHeadersCollection extends js.Object {
        // Gets the latest container version header
        def latest(parent: String): ContainerVersionHeader = js.native
        // Lists all Container Versions of a GTM Container.
        def list(parent: String): ListContainerVersionsResponse = js.native
        // Lists all Container Versions of a GTM Container.
        def list(parent: String, optionalArgs: js.Object): ListContainerVersionsResponse = js.native
      }
      
      @js.native
      trait VersionsCollection extends js.Object {
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
      
      @js.native
      trait WorkspacesCollection extends js.Object {
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
      
      @js.native
      object Workspaces extends js.Object {
        @js.native
        trait BuiltInVariablesCollection extends js.Object {
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
        trait FoldersCollection extends js.Object {
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
        trait TagsCollection extends js.Object {
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
        trait TriggersCollection extends js.Object {
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
        trait VariablesCollection extends js.Object {
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
        trait ZonesCollection extends js.Object {
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
      
    }
    
  }
  
}

