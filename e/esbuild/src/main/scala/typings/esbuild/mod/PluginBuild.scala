package typings.esbuild.mod

import typings.esbuild.anon.AnalyzeMetafile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginBuild extends StObject {
  
  // This is a full copy of the esbuild library in case you need it
  var esbuild: AnalyzeMetafile = js.native
  
  /** Documentation: https://esbuild.github.io/plugins/#build-options */
  var initialOptions: BuildOptions = js.native
  
  /** Documentation: https://esbuild.github.io/plugins/#on-dispose */
  def onDispose(callback: js.Function0[Unit]): Unit = js.native
  
  /** Documentation: https://esbuild.github.io/plugins/#on-end */
  def onEnd(
    callback: js.Function1[
      /* result */ BuildResult[BuildOptions], 
      OnEndResult | Null | Unit | (js.Promise[OnEndResult | Null | Unit])
    ]
  ): Unit = js.native
  
  /** Documentation: https://esbuild.github.io/plugins/#on-load */
  def onLoad(
    options: OnLoadOptions,
    callback: js.Function1[
      /* args */ OnLoadArgs, 
      js.UndefOr[OnLoadResult | Null | (js.Promise[js.UndefOr[OnLoadResult | Null]])]
    ]
  ): Unit = js.native
  
  /** Documentation: https://esbuild.github.io/plugins/#on-resolve */
  def onResolve(
    options: OnResolveOptions,
    callback: js.Function1[
      /* args */ OnResolveArgs, 
      js.UndefOr[OnResolveResult | Null | (js.Promise[js.UndefOr[OnResolveResult | Null]])]
    ]
  ): Unit = js.native
  
  /** Documentation: https://esbuild.github.io/plugins/#on-start */
  def onStart(callback: js.Function0[OnStartResult | Null | Unit | (js.Promise[OnStartResult | Null | Unit])]): Unit = js.native
  
  /** Documentation: https://esbuild.github.io/plugins/#resolve */
  def resolve(path: String): js.Promise[ResolveResult] = js.native
  def resolve(path: String, options: ResolveOptions): js.Promise[ResolveResult] = js.native
}
