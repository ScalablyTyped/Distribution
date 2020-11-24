package typings.esebRequestState

import typings.esebRequestState.mod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esebRequestStateStrings {
  
  @scala.inline
  def FAILED: FAILED = "FAILED".asInstanceOf[FAILED]
  
  @scala.inline
  def IN_PROGRESS: IN_PROGRESS = "IN_PROGRESS".asInstanceOf[IN_PROGRESS]
  
  @scala.inline
  def NOT_REQUESTED: NOT_REQUESTED = "NOT_REQUESTED".asInstanceOf[NOT_REQUESTED]
  
  @scala.inline
  def SUCCEEDED: SUCCEEDED = "SUCCEEDED".asInstanceOf[SUCCEEDED]
  
  @js.native
  sealed trait FAILED extends State
  
  @js.native
  sealed trait IN_PROGRESS extends State
  
  @js.native
  sealed trait NOT_REQUESTED extends State
  
  @js.native
  sealed trait SUCCEEDED extends State
}
