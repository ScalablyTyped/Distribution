package typings.filepond.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileStatus extends StObject
@JSImport("filepond", "FileStatus")
@js.native
object FileStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileStatus & Double] = js.native
  
  @js.native
  sealed trait IDLE
    extends StObject
       with FileStatus
  /* 2 */ val IDLE: typings.filepond.mod.FileStatus.IDLE & Double = js.native
  
  @js.native
  sealed trait INIT
    extends StObject
       with FileStatus
  /* 1 */ val INIT: typings.filepond.mod.FileStatus.INIT & Double = js.native
  
  @js.native
  sealed trait LOADING
    extends StObject
       with FileStatus
  /* 7 */ val LOADING: typings.filepond.mod.FileStatus.LOADING & Double = js.native
  
  @js.native
  sealed trait LOAD_ERROR
    extends StObject
       with FileStatus
  /* 8 */ val LOAD_ERROR: typings.filepond.mod.FileStatus.LOAD_ERROR & Double = js.native
  
  @js.native
  sealed trait PROCESSING
    extends StObject
       with FileStatus
  /* 3 */ val PROCESSING: typings.filepond.mod.FileStatus.PROCESSING & Double = js.native
  
  @js.native
  sealed trait PROCESSING_COMPLETE
    extends StObject
       with FileStatus
  /* 5 */ val PROCESSING_COMPLETE: typings.filepond.mod.FileStatus.PROCESSING_COMPLETE & Double = js.native
  
  @js.native
  sealed trait PROCESSING_ERROR
    extends StObject
       with FileStatus
  /* 6 */ val PROCESSING_ERROR: typings.filepond.mod.FileStatus.PROCESSING_ERROR & Double = js.native
  
  @js.native
  sealed trait PROCESSING_QUEUED
    extends StObject
       with FileStatus
  /* 9 */ val PROCESSING_QUEUED: typings.filepond.mod.FileStatus.PROCESSING_QUEUED & Double = js.native
  
  @js.native
  sealed trait PROCESSING_REVERT_ERROR
    extends StObject
       with FileStatus
  /* 10 */ val PROCESSING_REVERT_ERROR: typings.filepond.mod.FileStatus.PROCESSING_REVERT_ERROR & Double = js.native
}
