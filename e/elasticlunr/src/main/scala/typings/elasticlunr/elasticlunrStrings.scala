package typings.elasticlunr

import typings.elasticlunr.elasticlunrMod.Bool
import typings.elasticlunr.elasticlunrMod.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object elasticlunrStrings {
  @js.native
  sealed trait AND extends Bool
  
  @js.native
  sealed trait FieldSearchConfig extends js.Object
  
  @js.native
  sealed trait Index extends js.Object
  
  @js.native
  sealed trait OR extends Bool
  
  @js.native
  sealed trait SerialisedDocumentStore extends js.Object
  
  @js.native
  sealed trait SerialisedIndexData extends js.Object
  
  @js.native
  sealed trait add extends EventType
  
  @js.native
  sealed trait remove extends EventType
  
  @js.native
  sealed trait update extends EventType
  
  @scala.inline
  def AND: AND = "AND".asInstanceOf[AND]
  @scala.inline
  def FieldSearchConfig: FieldSearchConfig = "FieldSearchConfig".asInstanceOf[FieldSearchConfig]
  @scala.inline
  def Index: Index = "Index".asInstanceOf[Index]
  @scala.inline
  def OR: OR = "OR".asInstanceOf[OR]
  @scala.inline
  def SerialisedDocumentStore: SerialisedDocumentStore = "SerialisedDocumentStore".asInstanceOf[SerialisedDocumentStore]
  @scala.inline
  def SerialisedIndexData: SerialisedIndexData = "SerialisedIndexData".asInstanceOf[SerialisedIndexData]
  @scala.inline
  def add: add = "add".asInstanceOf[add]
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  @scala.inline
  def update: update = "update".asInstanceOf[update]
}

