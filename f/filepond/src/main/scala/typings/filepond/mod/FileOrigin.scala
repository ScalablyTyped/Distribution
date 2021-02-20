package typings.filepond.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileOrigin extends StObject
@JSImport("filepond", "FileOrigin")
@js.native
object FileOrigin extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileOrigin with Double] = js.native
  
  @js.native
  sealed trait INPUT extends FileOrigin
  /* 1 */ val INPUT: typings.filepond.mod.FileOrigin.INPUT with Double = js.native
  
  @js.native
  sealed trait LIMBO extends FileOrigin
  /* 2 */ val LIMBO: typings.filepond.mod.FileOrigin.LIMBO with Double = js.native
  
  @js.native
  sealed trait LOCAL extends FileOrigin
  /* 3 */ val LOCAL: typings.filepond.mod.FileOrigin.LOCAL with Double = js.native
}
