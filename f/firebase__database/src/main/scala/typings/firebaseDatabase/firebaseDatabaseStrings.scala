package typings.firebaseDatabase

import typings.firebaseDatabase.eventMod.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseDatabaseStrings {
  
  @scala.inline
  def Spacechild_added: Spacechild_added = (" child_added").asInstanceOf[Spacechild_added]
  
  @scala.inline
  def Spacechild_changed: Spacechild_changed = (" child_changed").asInstanceOf[Spacechild_changed]
  
  @scala.inline
  def Spacechild_moved: Spacechild_moved = (" child_moved").asInstanceOf[Spacechild_moved]
  
  @scala.inline
  def Spacechild_removed: Spacechild_removed = (" child_removed").asInstanceOf[Spacechild_removed]
  
  @scala.inline
  def value: value = "value".asInstanceOf[value]
  
  @js.native
  sealed trait Spacechild_added extends EventType
  
  @js.native
  sealed trait Spacechild_changed extends EventType
  
  @js.native
  sealed trait Spacechild_moved extends EventType
  
  @js.native
  sealed trait Spacechild_removed extends EventType
  
  @js.native
  sealed trait value extends EventType
}
