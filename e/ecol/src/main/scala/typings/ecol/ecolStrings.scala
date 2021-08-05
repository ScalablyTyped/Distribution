package typings.ecol

import typings.ecol.collectionEventMod.CollectionEvent.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecolStrings {
  
  @js.native
  sealed trait erase
    extends StObject
       with Type
  inline def erase: erase = "erase".asInstanceOf[erase]
  
  @js.native
  sealed trait insert
    extends StObject
       with Type
  inline def insert: insert = "insert".asInstanceOf[insert]
  
  @js.native
  sealed trait refresh
    extends StObject
       with Type
  inline def refresh: refresh = "refresh".asInstanceOf[refresh]
}
