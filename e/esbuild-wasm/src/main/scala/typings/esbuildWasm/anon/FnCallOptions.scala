package typings.esbuildWasm.anon

import typings.esbuildWasm.libBrowserMod.BuildOptions
import typings.esbuildWasm.libBrowserMod.BuildResult
import typings.esbuildWasm.libBrowserMod.SameShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallOptions extends StObject {
  
  def apply[T /* <: BuildOptions */](options: SameShape[BuildOptions, T]): js.Promise[BuildResult[T]] = js.native
}
