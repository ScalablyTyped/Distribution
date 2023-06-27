package typings.esbuildWasm.libBrowserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildContext[ProvidedOptions /* <: BuildOptions */] extends StObject {
  
  def cancel(): js.Promise[Unit] = js.native
  
  def dispose(): js.Promise[Unit] = js.native
  
  /** Documentation: https://esbuild.github.io/api/#rebuild */
  def rebuild(): js.Promise[BuildResult[ProvidedOptions]] = js.native
  
  /** Documentation: https://esbuild.github.io/api/#serve */
  def serve(): js.Promise[ServeResult] = js.native
  def serve(options: ServeOptions): js.Promise[ServeResult] = js.native
  
  /** Documentation: https://esbuild.github.io/api/#watch */
  def watch(): js.Promise[Unit] = js.native
  def watch(options: WatchOptions): js.Promise[Unit] = js.native
}
