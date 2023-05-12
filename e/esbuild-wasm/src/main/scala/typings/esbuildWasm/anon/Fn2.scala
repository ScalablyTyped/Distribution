package typings.esbuildWasm.anon

import typings.esbuildWasm.mod.BuildContext
import typings.esbuildWasm.mod.BuildOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn2 extends StObject {
  
  def apply(options: BuildOptions): js.Promise[BuildContext[BuildOptions]] = js.native
  def apply[T /* <: BuildOptions */](options: T): js.Promise[BuildContext[T]] = js.native
}
