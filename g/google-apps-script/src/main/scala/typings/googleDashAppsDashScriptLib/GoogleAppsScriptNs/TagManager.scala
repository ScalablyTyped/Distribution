package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagManager extends js.Object {
  var Accounts: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsCollection
  ] = js.undefined
  // Create a new instance of Account
  def newAccount(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Account
  // Create a new instance of AccountAccess
  def newAccountAccess(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.AccountAccess
  // Create a new instance of BuiltInVariable
  def newBuiltInVariable(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.BuiltInVariable
  // Create a new instance of Condition
  def newCondition(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Condition
  // Create a new instance of Container
  def newContainer(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Container
  // Create a new instance of ContainerAccess
  def newContainerAccess(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ContainerAccess
  // Create a new instance of ContainerVersion
  def newContainerVersion(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ContainerVersion
  // Create a new instance of CreateContainerVersionRequestVersionOptions
  def newCreateContainerVersionRequestVersionOptions(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.CreateContainerVersionRequestVersionOptions
  // Create a new instance of CustomTemplate
  def newCustomTemplate(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.CustomTemplate
  // Create a new instance of Entity
  def newEntity(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Entity
  // Create a new instance of Environment
  def newEnvironment(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Environment
  // Create a new instance of Folder
  def newFolder(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Folder
  // Create a new instance of Parameter
  def newParameter(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Parameter
  // Create a new instance of SetupTag
  def newSetupTag(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.SetupTag
  // Create a new instance of Tag
  def newTag(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Tag
  // Create a new instance of TeardownTag
  def newTeardownTag(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.TeardownTag
  // Create a new instance of Timestamp
  def newTimestamp(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Timestamp
  // Create a new instance of Trigger
  def newTrigger(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Trigger
  // Create a new instance of UserPermission
  def newUserPermission(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.UserPermission
  // Create a new instance of Variable
  def newVariable(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Variable
  // Create a new instance of VariableFormatValue
  def newVariableFormatValue(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.VariableFormatValue
  // Create a new instance of Workspace
  def newWorkspace(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Workspace
  // Create a new instance of Zone
  def newZone(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Zone
  // Create a new instance of ZoneBoundary
  def newZoneBoundary(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ZoneBoundary
  // Create a new instance of ZoneChildContainer
  def newZoneChildContainer(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ZoneChildContainer
  // Create a new instance of ZoneTypeRestriction
  def newZoneTypeRestriction(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ZoneTypeRestriction
}

object TagManager {
  @scala.inline
  def apply(
    newAccount: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Account,
    newAccountAccess: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.AccountAccess,
    newBuiltInVariable: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.BuiltInVariable,
    newCondition: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Condition,
    newContainer: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Container,
    newContainerAccess: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ContainerAccess,
    newContainerVersion: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ContainerVersion,
    newCreateContainerVersionRequestVersionOptions: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.CreateContainerVersionRequestVersionOptions,
    newCustomTemplate: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.CustomTemplate,
    newEntity: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Entity,
    newEnvironment: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Environment,
    newFolder: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Folder,
    newParameter: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Parameter,
    newSetupTag: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.SetupTag,
    newTag: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Tag,
    newTeardownTag: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.TeardownTag,
    newTimestamp: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Timestamp,
    newTrigger: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Trigger,
    newUserPermission: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.UserPermission,
    newVariable: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Variable,
    newVariableFormatValue: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.VariableFormatValue,
    newWorkspace: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Workspace,
    newZone: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Zone,
    newZoneBoundary: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ZoneBoundary,
    newZoneChildContainer: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ZoneChildContainer,
    newZoneTypeRestriction: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ZoneTypeRestriction,
    Accounts: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsCollection = null
  ): TagManager = {
    val __obj = js.Dynamic.literal(newAccount = js.Any.fromFunction0(newAccount), newAccountAccess = js.Any.fromFunction0(newAccountAccess), newBuiltInVariable = js.Any.fromFunction0(newBuiltInVariable), newCondition = js.Any.fromFunction0(newCondition), newContainer = js.Any.fromFunction0(newContainer), newContainerAccess = js.Any.fromFunction0(newContainerAccess), newContainerVersion = js.Any.fromFunction0(newContainerVersion), newCreateContainerVersionRequestVersionOptions = js.Any.fromFunction0(newCreateContainerVersionRequestVersionOptions), newCustomTemplate = js.Any.fromFunction0(newCustomTemplate), newEntity = js.Any.fromFunction0(newEntity), newEnvironment = js.Any.fromFunction0(newEnvironment), newFolder = js.Any.fromFunction0(newFolder), newParameter = js.Any.fromFunction0(newParameter), newSetupTag = js.Any.fromFunction0(newSetupTag), newTag = js.Any.fromFunction0(newTag), newTeardownTag = js.Any.fromFunction0(newTeardownTag), newTimestamp = js.Any.fromFunction0(newTimestamp), newTrigger = js.Any.fromFunction0(newTrigger), newUserPermission = js.Any.fromFunction0(newUserPermission), newVariable = js.Any.fromFunction0(newVariable), newVariableFormatValue = js.Any.fromFunction0(newVariableFormatValue), newWorkspace = js.Any.fromFunction0(newWorkspace), newZone = js.Any.fromFunction0(newZone), newZoneBoundary = js.Any.fromFunction0(newZoneBoundary), newZoneChildContainer = js.Any.fromFunction0(newZoneChildContainer), newZoneTypeRestriction = js.Any.fromFunction0(newZoneTypeRestriction))
    if (Accounts != null) __obj.updateDynamic("Accounts")(Accounts)
    __obj.asInstanceOf[TagManager]
  }
}

