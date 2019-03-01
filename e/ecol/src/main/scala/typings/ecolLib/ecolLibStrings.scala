package typings
package ecolLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ecolLibStrings {
  @js.native
  sealed trait erase
    extends ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type
  
  @js.native
  sealed trait insert
    extends ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type
  
  @js.native
  sealed trait refresh
    extends ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type
  
  @scala.inline
  def erase: erase = "erase".asInstanceOf[erase]
  @scala.inline
  def insert: insert = "insert".asInstanceOf[insert]
  @scala.inline
  def refresh: refresh = "refresh".asInstanceOf[refresh]
}

