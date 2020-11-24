package typings.filepond.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileStatus extends js.Object
@JSImport("filepond", "FileStatus")
@js.native
object FileStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileStatus with Double] = js.native
  
  @js.native
  sealed trait IDLE extends FileStatus
  /* 2 */ @js.native
  object IDLE extends TopLevel[IDLE with Double]
  
  @js.native
  sealed trait INIT extends FileStatus
  /* 1 */ @js.native
  object INIT extends TopLevel[INIT with Double]
  
  @js.native
  sealed trait LOADING extends FileStatus
  /* 7 */ @js.native
  object LOADING extends TopLevel[LOADING with Double]
  
  @js.native
  sealed trait LOAD_ERROR extends FileStatus
  /* 8 */ @js.native
  object LOAD_ERROR extends TopLevel[LOAD_ERROR with Double]
  
  @js.native
  sealed trait PROCESSING extends FileStatus
  /* 3 */ @js.native
  object PROCESSING extends TopLevel[PROCESSING with Double]
  
  @js.native
  sealed trait PROCESSING_COMPLETE extends FileStatus
  /* 5 */ @js.native
  object PROCESSING_COMPLETE extends TopLevel[PROCESSING_COMPLETE with Double]
  
  @js.native
  sealed trait PROCESSING_ERROR extends FileStatus
  /* 6 */ @js.native
  object PROCESSING_ERROR extends TopLevel[PROCESSING_ERROR with Double]
  
  @js.native
  sealed trait PROCESSING_QUEUED extends FileStatus
  /* 9 */ @js.native
  object PROCESSING_QUEUED extends TopLevel[PROCESSING_QUEUED with Double]
  
  @js.native
  sealed trait PROCESSING_REVERT_ERROR extends FileStatus
  /* 10 */ @js.native
  object PROCESSING_REVERT_ERROR extends TopLevel[PROCESSING_REVERT_ERROR with Double]
}
