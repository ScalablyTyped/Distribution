package typings.enhancedResolve.mod

import typings.enhancedResolve.enhancedResolveBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolveFunctionAsync extends StObject {
  
  def apply(
    context: js.Object,
    path: String,
    request: String,
    callback: js.Function3[
      /* err */ Null | ErrorWithDetail, 
      /* res */ js.UndefOr[String | `false`], 
      /* req */ js.UndefOr[ResolveRequest], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    context: js.Object,
    path: String,
    request: String,
    resolveContext: ResolveContext,
    callback: js.Function3[
      /* err */ Null | ErrorWithDetail, 
      /* res */ js.UndefOr[String | `false`], 
      /* req */ js.UndefOr[ResolveRequest], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    path: String,
    request: String,
    callback: js.Function3[
      /* err */ Null | ErrorWithDetail, 
      /* res */ js.UndefOr[String | `false`], 
      /* req */ js.UndefOr[ResolveRequest], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    path: String,
    request: String,
    resolveContext: ResolveContext,
    callback: js.Function3[
      /* err */ Null | ErrorWithDetail, 
      /* res */ js.UndefOr[String | `false`], 
      /* req */ js.UndefOr[ResolveRequest], 
      Unit
    ]
  ): Unit = js.native
}
