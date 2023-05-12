package typings.esbuildWasm.anon

import typings.esbuildWasm.mod.BuildOptions
import typings.esbuildWasm.mod.BuildResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn3 extends StObject {
  
  def apply(options: BuildOptions): js.Promise[BuildResult[BuildOptions]] = js.native
  def apply[SpecificOptions /* <: BuildOptions */](options: SpecificOptions): js.Promise[BuildResult[SpecificOptions]] = js.native
}
