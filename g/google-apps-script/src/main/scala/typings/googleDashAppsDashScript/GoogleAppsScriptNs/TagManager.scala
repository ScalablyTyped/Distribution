package typings.googleDashAppsDashScript.GoogleAppsScriptNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Account
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.AccountAccess
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.BuiltInVariable
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Condition
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Container
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ContainerAccess
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ContainerVersion
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.CreateContainerVersionRequestVersionOptions
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.CustomTemplate
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Entity
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Environment
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Folder
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Parameter
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.SetupTag
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Tag
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.TeardownTag
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Timestamp
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Trigger
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.UserPermission
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Variable
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.VariableFormatValue
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Workspace
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Zone
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ZoneBoundary
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ZoneChildContainer
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ZoneTypeRestriction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagManager extends js.Object {
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
    newZoneTypeRestriction: () => ZoneTypeRestriction,
    Accounts: AccountsCollection = null
  ): TagManager = {
    val __obj = js.Dynamic.literal(newAccount = js.Any.fromFunction0(newAccount), newAccountAccess = js.Any.fromFunction0(newAccountAccess), newBuiltInVariable = js.Any.fromFunction0(newBuiltInVariable), newCondition = js.Any.fromFunction0(newCondition), newContainer = js.Any.fromFunction0(newContainer), newContainerAccess = js.Any.fromFunction0(newContainerAccess), newContainerVersion = js.Any.fromFunction0(newContainerVersion), newCreateContainerVersionRequestVersionOptions = js.Any.fromFunction0(newCreateContainerVersionRequestVersionOptions), newCustomTemplate = js.Any.fromFunction0(newCustomTemplate), newEntity = js.Any.fromFunction0(newEntity), newEnvironment = js.Any.fromFunction0(newEnvironment), newFolder = js.Any.fromFunction0(newFolder), newParameter = js.Any.fromFunction0(newParameter), newSetupTag = js.Any.fromFunction0(newSetupTag), newTag = js.Any.fromFunction0(newTag), newTeardownTag = js.Any.fromFunction0(newTeardownTag), newTimestamp = js.Any.fromFunction0(newTimestamp), newTrigger = js.Any.fromFunction0(newTrigger), newUserPermission = js.Any.fromFunction0(newUserPermission), newVariable = js.Any.fromFunction0(newVariable), newVariableFormatValue = js.Any.fromFunction0(newVariableFormatValue), newWorkspace = js.Any.fromFunction0(newWorkspace), newZone = js.Any.fromFunction0(newZone), newZoneBoundary = js.Any.fromFunction0(newZoneBoundary), newZoneChildContainer = js.Any.fromFunction0(newZoneChildContainer), newZoneTypeRestriction = js.Any.fromFunction0(newZoneTypeRestriction))
    if (Accounts != null) __obj.updateDynamic("Accounts")(Accounts)
    __obj.asInstanceOf[TagManager]
  }
}

