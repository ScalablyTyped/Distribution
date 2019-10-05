package typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData

import org.scalablytyped.runtime.StringDictionary
import typings.draftDashJs.draftDashJsMod.Draft.Model.Constants.DraftEntityMutability
import typings.draftDashJs.draftDashJsMod.Draft.Model.Constants.DraftEntityType
import typings.draftDashJs.draftDashJsMod.Draft.Model.Entity.DraftEntityInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof any ]: / * import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for T * / any} */ @js.native
trait ContentState extends js.Object {
  def addEntity(instance: DraftEntityInstance): typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentState = js.native
  def createEntity(`type`: DraftEntityType, mutability: DraftEntityMutability): typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentState = js.native
  def createEntity(`type`: DraftEntityType, mutability: DraftEntityMutability, data: js.Object): typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentState = js.native
  def getBlockAfter(key: String): typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentBlock = js.native
  def getBlockBefore(key: String): typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentBlock = js.native
  def getBlockForKey(key: String): typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentBlock = js.native
  def getBlockMap(): BlockMap = js.native
  def getBlocksAsArray(): js.Array[typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentBlock] = js.native
  def getEntity(key: String): js.Any = js.native
  def getEntityMap(): js.Any = js.native
  def getFirstBlock(): typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentBlock = js.native
  def getKeyAfter(key: String): String = js.native
  def getKeyBefore(key: String): String = js.native
  def getLastBlock(): typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentBlock = js.native
  def getLastCreatedEntityKey(): String = js.native
  def getPlainText(): String = js.native
  def getPlainText(delimiter: String): String = js.native
  def getSelectionAfter(): typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.SelectionState = js.native
  def getSelectionBefore(): typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.SelectionState = js.native
  def hasText(): Boolean = js.native
  def mergeEntityData(key: String, toMerge: StringDictionary[js.Any]): typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentState = js.native
  def replaceEntityData(key: String, toMerge: StringDictionary[js.Any]): typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentState = js.native
}

