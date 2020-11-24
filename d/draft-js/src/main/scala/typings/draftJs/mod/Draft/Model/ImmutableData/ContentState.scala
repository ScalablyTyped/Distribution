package typings.draftJs.mod.Draft.Model.ImmutableData

import org.scalablytyped.runtime.StringDictionary
import typings.draftJs.mod.Draft.Model.Constants.DraftEntityMutability
import typings.draftJs.mod.Draft.Model.Constants.DraftEntityType
import typings.draftJs.mod.Draft.Model.Entity.DraftEntityInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof any ]: / * import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T * / any} */ @js.native
trait ContentState extends js.Object {
  
  def addEntity(instance: DraftEntityInstance): ContentState = js.native
  
  def createEntity(`type`: DraftEntityType, mutability: DraftEntityMutability): ContentState = js.native
  def createEntity(`type`: DraftEntityType, mutability: DraftEntityMutability, data: js.Object): ContentState = js.native
  
  def getBlockAfter(key: String): ContentBlock = js.native
  
  def getBlockBefore(key: String): ContentBlock = js.native
  
  def getBlockForKey(key: String): ContentBlock = js.native
  
  def getBlockMap(): BlockMap = js.native
  
  def getBlocksAsArray(): js.Array[ContentBlock] = js.native
  
  def getEntity(key: String): js.Any = js.native
  
  def getEntityMap(): js.Any = js.native
  
  def getFirstBlock(): ContentBlock = js.native
  
  def getKeyAfter(key: String): String = js.native
  
  def getKeyBefore(key: String): String = js.native
  
  def getLastBlock(): ContentBlock = js.native
  
  def getLastCreatedEntityKey(): String = js.native
  
  def getPlainText(): String = js.native
  def getPlainText(delimiter: String): String = js.native
  
  def getSelectionAfter(): SelectionState = js.native
  
  def getSelectionBefore(): SelectionState = js.native
  
  def hasText(): Boolean = js.native
  
  def mergeEntityData(key: String, toMerge: StringDictionary[js.Any]): ContentState = js.native
  
  def replaceEntityData(key: String, toMerge: StringDictionary[js.Any]): ContentState = js.native
}
