package typings.firebaseDatabaseTypes

import typings.firebaseDatabaseTypes.mod.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseDatabaseTypesStrings {
  
  @scala.inline
  def child_added: child_added = "child_added".asInstanceOf[child_added]
  
  @scala.inline
  def child_changed: child_changed = "child_changed".asInstanceOf[child_changed]
  
  @scala.inline
  def child_moved: child_moved = "child_moved".asInstanceOf[child_moved]
  
  @scala.inline
  def child_removed: child_removed = "child_removed".asInstanceOf[child_removed]
  
  @scala.inline
  def value: value = "value".asInstanceOf[value]
  
  @js.native
  sealed trait child_added extends EventType
  
  @js.native
  sealed trait child_changed extends EventType
  
  @js.native
  sealed trait child_moved extends EventType
  
  @js.native
  sealed trait child_removed extends EventType
  
  @js.native
  sealed trait value extends EventType
}
