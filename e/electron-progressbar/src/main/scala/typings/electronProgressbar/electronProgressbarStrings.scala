package typings.electronProgressbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object electronProgressbarStrings {
  
  @scala.inline
  def aborted: aborted = "aborted".asInstanceOf[aborted]
  
  @scala.inline
  def completed: completed = "completed".asInstanceOf[completed]
  
  @scala.inline
  def progress: progress = "progress".asInstanceOf[progress]
  
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  
  @js.native
  sealed trait aborted extends js.Object
  
  @js.native
  sealed trait completed extends js.Object
  
  @js.native
  sealed trait progress extends js.Object
  
  @js.native
  sealed trait ready extends js.Object
}
