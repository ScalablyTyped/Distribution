package typings.filepond.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileStatus extends StObject
@JSImport("filepond", "FileStatus")
@js.native
object FileStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileStatus with Double] = js.native
  
  @js.native
  sealed trait IDLE extends FileStatus
  /* 2 */ val IDLE: typings.filepond.mod.FileStatus.IDLE with Double = js.native
  
  @js.native
  sealed trait INIT extends FileStatus
  /* 1 */ val INIT: typings.filepond.mod.FileStatus.INIT with Double = js.native
  
  @js.native
  sealed trait LOADING extends FileStatus
  /* 7 */ val LOADING: typings.filepond.mod.FileStatus.LOADING with Double = js.native
  
  @js.native
  sealed trait LOAD_ERROR extends FileStatus
  /* 8 */ val LOAD_ERROR: typings.filepond.mod.FileStatus.LOAD_ERROR with Double = js.native
  
  @js.native
  sealed trait PROCESSING extends FileStatus
  /* 3 */ val PROCESSING: typings.filepond.mod.FileStatus.PROCESSING with Double = js.native
  
  @js.native
  sealed trait PROCESSING_COMPLETE extends FileStatus
  /* 5 */ val PROCESSING_COMPLETE: typings.filepond.mod.FileStatus.PROCESSING_COMPLETE with Double = js.native
  
  @js.native
  sealed trait PROCESSING_ERROR extends FileStatus
  /* 6 */ val PROCESSING_ERROR: typings.filepond.mod.FileStatus.PROCESSING_ERROR with Double = js.native
  
  @js.native
  sealed trait PROCESSING_QUEUED extends FileStatus
  /* 9 */ val PROCESSING_QUEUED: typings.filepond.mod.FileStatus.PROCESSING_QUEUED with Double = js.native
  
  @js.native
  sealed trait PROCESSING_REVERT_ERROR extends FileStatus
  /* 10 */ val PROCESSING_REVERT_ERROR: typings.filepond.mod.FileStatus.PROCESSING_REVERT_ERROR with Double = js.native
}
