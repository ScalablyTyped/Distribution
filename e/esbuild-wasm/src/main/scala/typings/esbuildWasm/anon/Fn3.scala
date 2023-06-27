package typings.esbuildWasm.anon

import typings.esbuildWasm.mod.BuildOptions
import typings.esbuildWasm.mod.BuildResult
import typings.esbuildWasm.mod.SameShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn3 extends StObject {
  
  def apply[T /* <: BuildOptions */](options: SameShape[BuildOptions, T]): js.Promise[BuildResult[T]] = js.native
}
