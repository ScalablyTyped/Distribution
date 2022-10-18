package typings.elasticlunr

import typings.elasticlunr.mod.Bool
import typings.elasticlunr.mod.EventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elasticlunrStrings {
  
  @js.native
  sealed trait AND
    extends StObject
       with Bool
  inline def AND: AND = "AND".asInstanceOf[AND]
  
  @js.native
  sealed trait OR
    extends StObject
       with Bool
  inline def OR: OR = "OR".asInstanceOf[OR]
  
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
