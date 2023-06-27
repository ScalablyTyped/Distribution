package typings.floatingUiCore

import typings.floatingUiCore.anon.PartialmainAxisnumbercros
import typings.floatingUiCore.srcTypesMod.Coords
import typings.floatingUiCore.srcTypesMod.Derivable
import typings.floatingUiCore.srcTypesMod.Middleware
import typings.floatingUiCore.srcTypesMod.MiddlewareState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMiddlewareOffsetMod {
  
  @JSImport("@floating-ui/core/src/middleware/offset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertValueToCoords(state: MiddlewareState, options: OffsetOptions): js.Promise[Coords] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertValueToCoords")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Coords]]
  
  inline def offset(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")().asInstanceOf[Middleware]
  inline def offset(options: OffsetOptions): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  type OffsetOptions = OffsetValue | Derivable[OffsetValue]
  
  type OffsetValue = Double | PartialmainAxisnumbercros
}
