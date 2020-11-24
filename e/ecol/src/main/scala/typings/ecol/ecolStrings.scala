package typings.ecol

import typings.ecol.collectionEventMod.CollectionEvent.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecolStrings {
  
  @scala.inline
  def erase: erase = "erase".asInstanceOf[erase]
  
  @scala.inline
  def insert: insert = "insert".asInstanceOf[insert]
  
  @scala.inline
  def refresh: refresh = "refresh".asInstanceOf[refresh]
  
  @js.native
  sealed trait erase extends Type
  
  @js.native
  sealed trait insert extends Type
  
  @js.native
  sealed trait refresh extends Type
}
