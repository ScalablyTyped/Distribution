package typings.floatingUiCore

import typings.floatingUiCore.anon.AlignmentAxis
import typings.floatingUiCore.srcTypesMod.Coords
import typings.floatingUiCore.srcTypesMod.Middleware
import typings.floatingUiCore.srcTypesMod.MiddlewareState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMiddlewareOffsetMod {
  
  @JSImport("@floating-ui/core/src/middleware/offset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertValueToCoords(state: MiddlewareState, value: Options): js.Promise[Coords] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertValueToCoords")(state.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Coords]]
  
  inline def offset(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")().asInstanceOf[Middleware]
  inline def offset(value: Options): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")(value.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  type OffsetFunction = js.Function1[/* state */ MiddlewareState, OffsetValue]
  
  type OffsetValue = Double | AlignmentAxis
  
  type Options = OffsetValue | OffsetFunction
}
