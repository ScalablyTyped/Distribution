package typings.filepond.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Status extends StObject
@JSImport("filepond", "Status")
@js.native
object Status extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Status & Double] = js.native
  
  @js.native
  sealed trait BUSY
    extends StObject
       with Status
  /* 3 */ val BUSY: typings.filepond.mod.Status.BUSY & Double = js.native
  
  @js.native
  sealed trait EMPTY
    extends StObject
       with Status
  /* 0 */ val EMPTY: typings.filepond.mod.Status.EMPTY & Double = js.native
  
  @js.native
  sealed trait ERROR
    extends StObject
       with Status
  /* 2 */ val ERROR: typings.filepond.mod.Status.ERROR & Double = js.native
  
  @js.native
  sealed trait IDLE
    extends StObject
       with Status
  /* 1 */ val IDLE: typings.filepond.mod.Status.IDLE & Double = js.native
  
  @js.native
  sealed trait READY
    extends StObject
       with Status
  /* 4 */ val READY: typings.filepond.mod.Status.READY & Double = js.native
}
