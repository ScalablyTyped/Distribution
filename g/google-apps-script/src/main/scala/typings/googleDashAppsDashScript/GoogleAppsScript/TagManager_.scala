package typings.googleDashAppsDashScript.GoogleAppsScript

import typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Collection.AccountsCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema.Account
import typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema.AccountAccess
import typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema.BuiltInVariable
import typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema.Condition
import typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema.Container
import typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema.ContainerAccess
import typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema.ContainerVersion
import typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema.CreateContainerVersionRequestVersionOptions
import typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema.CustomTemplate
import typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema.Entity
import typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema.Environment
import typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema.Folder
import typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema.Parameter
import typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema.SetupTag
import typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema.Tag
import typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema.TeardownTag
import typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema.Timestamp
import typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema.Trigger
import typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema.UserPermission
import typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema.Variable
import typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema.VariableFormatValue
import typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema.Workspace
import typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema.Zone
import typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema.ZoneBoundary
import typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema.ZoneChildContainer
import typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema.ZoneTypeRestriction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("TagManager")
trait TagManager_ extends js.Object {
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

object TagManager_ {
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
  ): TagManager_ = {
    val __obj = js.Dynamic.literal(newAccount = js.Any.fromFunction0(newAccount), newAccountAccess = js.Any.fromFunction0(newAccountAccess), newBuiltInVariable = js.Any.fromFunction0(newBuiltInVariable), newCondition = js.Any.fromFunction0(newCondition), newContainer = js.Any.fromFunction0(newContainer), newContainerAccess = js.Any.fromFunction0(newContainerAccess), newContainerVersion = js.Any.fromFunction0(newContainerVersion), newCreateContainerVersionRequestVersionOptions = js.Any.fromFunction0(newCreateContainerVersionRequestVersionOptions), newCustomTemplate = js.Any.fromFunction0(newCustomTemplate), newEntity = js.Any.fromFunction0(newEntity), newEnvironment = js.Any.fromFunction0(newEnvironment), newFolder = js.Any.fromFunction0(newFolder), newParameter = js.Any.fromFunction0(newParameter), newSetupTag = js.Any.fromFunction0(newSetupTag), newTag = js.Any.fromFunction0(newTag), newTeardownTag = js.Any.fromFunction0(newTeardownTag), newTimestamp = js.Any.fromFunction0(newTimestamp), newTrigger = js.Any.fromFunction0(newTrigger), newUserPermission = js.Any.fromFunction0(newUserPermission), newVariable = js.Any.fromFunction0(newVariable), newVariableFormatValue = js.Any.fromFunction0(newVariableFormatValue), newWorkspace = js.Any.fromFunction0(newWorkspace), newZone = js.Any.fromFunction0(newZone), newZoneBoundary = js.Any.fromFunction0(newZoneBoundary), newZoneChildContainer = js.Any.fromFunction0(newZoneChildContainer), newZoneTypeRestriction = js.Any.fromFunction0(newZoneTypeRestriction))
    if (Accounts != null) __obj.updateDynamic("Accounts")(Accounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagManager_]
  }
}

