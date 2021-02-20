package typings.elasticlunr

import typings.elasticlunr.mod.Bool
import typings.elasticlunr.mod.EventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elasticlunrStrings {
  
  @js.native
  sealed trait AND extends Bool
  @scala.inline
  def AND: AND = "AND".asInstanceOf[AND]
  
  @js.native
  sealed trait FieldSearchConfig extends StObject
  @scala.inline
  def FieldSearchConfig: FieldSearchConfig = "FieldSearchConfig".asInstanceOf[FieldSearchConfig]
  
  @js.native
  sealed trait Index extends StObject
  @scala.inline
  def Index: Index = "Index".asInstanceOf[Index]
  
  @js.native
  sealed trait OR extends Bool
  @scala.inline
  def OR: OR = "OR".asInstanceOf[OR]
  
  @js.native
  sealed trait SerialisedDocumentStore extends StObject
  @scala.inline
  def SerialisedDocumentStore: SerialisedDocumentStore = "SerialisedDocumentStore".asInstanceOf[SerialisedDocumentStore]
  
  @js.native
  sealed trait SerialisedIndexData extends StObject
  @scala.inline
  def SerialisedIndexData: SerialisedIndexData = "SerialisedIndexData".asInstanceOf[SerialisedIndexData]
  
  @js.native
  sealed trait add extends EventType
  @scala.inline
  def add: add = "add".asInstanceOf[add]
  
  @js.native
  sealed trait remove extends EventType
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait update extends EventType
  @scala.inline
  def update: update = "update".asInstanceOf[update]
}
