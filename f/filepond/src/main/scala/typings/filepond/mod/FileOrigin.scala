package typings.filepond.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileOrigin extends js.Object
@JSImport("filepond", "FileOrigin")
@js.native
object FileOrigin extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileOrigin with Double] = js.native
  
  @js.native
  sealed trait INPUT extends FileOrigin
  /* 1 */ @js.native
  object INPUT extends TopLevel[INPUT with Double]
  
  @js.native
  sealed trait LIMBO extends FileOrigin
  /* 2 */ @js.native
  object LIMBO extends TopLevel[LIMBO with Double]
  
  @js.native
  sealed trait LOCAL extends FileOrigin
  /* 3 */ @js.native
  object LOCAL extends TopLevel[LOCAL with Double]
}
