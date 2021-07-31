package typings.esebRequestState

import typings.esebRequestState.mod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esebRequestStateStrings {
  
  @js.native
  sealed trait FAILED
    extends StObject
       with State
  @scala.inline
  def FAILED: FAILED = "FAILED".asInstanceOf[FAILED]
  
  @js.native
  sealed trait IN_PROGRESS
    extends StObject
       with State
  @scala.inline
  def IN_PROGRESS: IN_PROGRESS = "IN_PROGRESS".asInstanceOf[IN_PROGRESS]
  
  @js.native
  sealed trait NOT_REQUESTED
    extends StObject
       with State
  @scala.inline
  def NOT_REQUESTED: NOT_REQUESTED = "NOT_REQUESTED".asInstanceOf[NOT_REQUESTED]
  
  @js.native
  sealed trait SUCCEEDED
    extends StObject
       with State
  @scala.inline
  def SUCCEEDED: SUCCEEDED = "SUCCEEDED".asInstanceOf[SUCCEEDED]
}
