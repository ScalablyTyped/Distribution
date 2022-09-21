package typings.floatingUiCore

import typings.floatingUiCore.anon.AlignmentAxis
import typings.floatingUiCore.typesMod.Coords
import typings.floatingUiCore.typesMod.Middleware
import typings.floatingUiCore.typesMod.MiddlewareArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object offsetMod {
  
  @JSImport("@floating-ui/core/src/middleware/offset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertValueToCoords(middlewareArguments: MiddlewareArguments, value: Options): js.Promise[Coords] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertValueToCoords")(middlewareArguments.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Coords]]
  
  inline def offset(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")().asInstanceOf[Middleware]
  inline def offset(value: Options): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")(value.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  type OffsetFunction = js.Function1[/* args */ MiddlewareArguments, OffsetValue]
  
  type OffsetValue = Double | AlignmentAxis
  
  type Options = OffsetValue | OffsetFunction
}
