package typings.filepond.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Status extends js.Object
@JSImport("filepond", "Status")
@js.native
object Status extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Status with Double] = js.native
  
  @js.native
  sealed trait BUSY extends Status
  /* 3 */ @js.native
  object BUSY extends TopLevel[BUSY with Double]
  
  @js.native
  sealed trait EMPTY extends Status
  /* 0 */ @js.native
  object EMPTY extends TopLevel[EMPTY with Double]
  
  @js.native
  sealed trait ERROR extends Status
  /* 2 */ @js.native
  object ERROR extends TopLevel[ERROR with Double]
  
  @js.native
  sealed trait IDLE extends Status
  /* 1 */ @js.native
  object IDLE extends TopLevel[IDLE with Double]
  
  @js.native
  sealed trait READY extends Status
  /* 4 */ @js.native
  object READY extends TopLevel[READY with Double]
}
