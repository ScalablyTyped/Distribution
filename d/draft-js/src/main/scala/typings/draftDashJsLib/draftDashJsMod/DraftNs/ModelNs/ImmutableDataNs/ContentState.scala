package typings
package draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 1 members from Set(std.Record) */ @js.native
trait ContentState extends js.Object {
  def addEntity(instance: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.EntityNs.DraftEntityInstance): ContentState = js.native
  def createEntity(
    `type`: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftEntityType,
    mutability: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftEntityMutability
  ): ContentState = js.native
  def createEntity(
    `type`: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftEntityType,
    mutability: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftEntityMutability,
    data: js.Object
  ): ContentState = js.native
  def getBlockAfter(key: java.lang.String): ContentBlock = js.native
  def getBlockBefore(key: java.lang.String): ContentBlock = js.native
  def getBlockForKey(key: java.lang.String): ContentBlock = js.native
  def getBlockMap(): BlockMap = js.native
  def getBlocksAsArray(): js.Array[ContentBlock] = js.native
  def getEntity(key: java.lang.String): js.Any = js.native
  def getFirstBlock(): ContentBlock = js.native
  def getKeyAfter(key: java.lang.String): java.lang.String = js.native
  def getKeyBefore(key: java.lang.String): java.lang.String = js.native
  def getLastBlock(): ContentBlock = js.native
  def getLastCreatedEntityKey(): java.lang.String = js.native
  def getPlainText(): java.lang.String = js.native
  def getPlainText(delimiter: java.lang.String): java.lang.String = js.native
  def getSelectionAfter(): SelectionState = js.native
  def getSelectionBefore(): SelectionState = js.native
  def hasText(): scala.Boolean = js.native
  def mergeEntityData(key: java.lang.String, toMerge: ScalablyTyped.runtime.StringDictionary[js.Any]): ContentState = js.native
  def replaceEntityData(key: java.lang.String, toMerge: ScalablyTyped.runtime.StringDictionary[js.Any]): ContentState = js.native
}

