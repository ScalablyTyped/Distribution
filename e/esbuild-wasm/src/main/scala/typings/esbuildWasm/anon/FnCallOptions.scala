package typings.esbuildWasm.anon

import typings.esbuildWasm.libBrowserMod.BuildOptions
import typings.esbuildWasm.libBrowserMod.BuildResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallOptions extends StObject {
  
  def apply(options: BuildOptions): js.Promise[BuildResult[BuildOptions]] = js.native
  def apply[SpecificOptions /* <: BuildOptions */](options: SpecificOptions): js.Promise[BuildResult[SpecificOptions]] = js.native
}
