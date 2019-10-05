package typings.ecol

import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ecolStrings {
  @js.native
  sealed trait erase extends Type
  
  @js.native
  sealed trait insert extends Type
  
  @js.native
  sealed trait refresh extends Type
  
  @scala.inline
  def erase: erase = "erase".asInstanceOf[erase]
  @scala.inline
  def insert: insert = "insert".asInstanceOf[insert]
  @scala.inline
  def refresh: refresh = "refresh".asInstanceOf[refresh]
}

