package typings.gifJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gifJsStrings {
  
  @scala.inline
  def abort: abort = "abort".asInstanceOf[abort]
  
  @scala.inline
  def finished: finished = "finished".asInstanceOf[finished]
  
  @scala.inline
  def progress: progress = "progress".asInstanceOf[progress]
  
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait abort extends js.Object
  
  @js.native
  sealed trait finished extends js.Object
  
  @js.native
  sealed trait progress extends js.Object
  
  @js.native
  sealed trait start extends js.Object
}
