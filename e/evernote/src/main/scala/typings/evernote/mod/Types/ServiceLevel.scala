package typings.evernote.mod.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ServiceLevel extends StObject
@JSImport("evernote", "Types.ServiceLevel")
@js.native
object ServiceLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ServiceLevel & Double] = js.native
  
  @js.native
  sealed trait BASIC
    extends StObject
       with ServiceLevel
  /* 1 */ val BASIC: typings.evernote.mod.Types.ServiceLevel.BASIC & Double = js.native
  
  @js.native
  sealed trait PLUS
    extends StObject
       with ServiceLevel
  /* 2 */ val PLUS: typings.evernote.mod.Types.ServiceLevel.PLUS & Double = js.native
  
  @js.native
  sealed trait PREMIUM
    extends StObject
       with ServiceLevel
  /* 3 */ val PREMIUM: typings.evernote.mod.Types.ServiceLevel.PREMIUM & Double = js.native
}
