package typings.elasticlunrjs

import typings.elasticlunrjs.mod.Bool
import typings.elasticlunrjs.mod.EventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elasticlunrjsStrings {
  
  @js.native
  sealed trait AND
    extends StObject
       with Bool
  inline def AND: AND = "AND".asInstanceOf[AND]
  
  @js.native
  sealed trait FieldSearchConfig extends StObject
  inline def FieldSearchConfig: FieldSearchConfig = "FieldSearchConfig".asInstanceOf[FieldSearchConfig]
  
  @js.native
  sealed trait Index extends StObject
  inline def Index: Index = "Index".asInstanceOf[Index]
  
  @js.native
  sealed trait OR
    extends StObject
       with Bool
  inline def OR: OR = "OR".asInstanceOf[OR]
  
  @js.native
  sealed trait SerialisedDocumentStore extends StObject
  inline def SerialisedDocumentStore: SerialisedDocumentStore = "SerialisedDocumentStore".asInstanceOf[SerialisedDocumentStore]
  
  @js.native
  sealed trait SerialisedIndexData extends StObject
  inline def SerialisedIndexData: SerialisedIndexData = "SerialisedIndexData".asInstanceOf[SerialisedIndexData]
  
  @js.native
  sealed trait add
    extends StObject
       with EventType
  inline def add: add = "add".asInstanceOf[add]
  
  @js.native
  sealed trait remove
    extends StObject
       with EventType
  inline def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait update
    extends StObject
       with EventType
  inline def update: update = "update".asInstanceOf[update]
}
