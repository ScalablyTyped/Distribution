package typings.filepond.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileOrigin extends StObject
@JSImport("filepond", "FileOrigin")
@js.native
object FileOrigin extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileOrigin & Double] = js.native
  
  @js.native
  sealed trait INPUT
    extends StObject
       with FileOrigin
  /* 1 */ val INPUT: typings.filepond.mod.FileOrigin.INPUT & Double = js.native
  
  @js.native
  sealed trait LIMBO
    extends StObject
       with FileOrigin
  /* 2 */ val LIMBO: typings.filepond.mod.FileOrigin.LIMBO & Double = js.native
  
  @js.native
  sealed trait LOCAL
    extends StObject
       with FileOrigin
  /* 3 */ val LOCAL: typings.filepond.mod.FileOrigin.LOCAL & Double = js.native
}
