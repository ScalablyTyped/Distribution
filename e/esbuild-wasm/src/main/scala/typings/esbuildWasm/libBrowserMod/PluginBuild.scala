package typings.esbuildWasm.libBrowserMod

import typings.esbuildWasm.anon.AnalyzeMetafile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginBuild extends StObject {
  
  // This is a full copy of the esbuild library in case you need it
  var esbuild: AnalyzeMetafile = js.native
  
  var initialOptions: BuildOptions = js.native
  
  def onEnd(callback: js.Function1[/* result */ BuildResult, Unit | js.Promise[Unit]]): Unit = js.native
  
  def onLoad(
    options: OnLoadOptions,
    callback: js.Function1[
      /* args */ OnLoadArgs, 
      js.UndefOr[OnLoadResult | Null | (js.Promise[js.UndefOr[OnLoadResult | Null]])]
    ]
  ): Unit = js.native
  
  def onResolve(
    options: OnResolveOptions,
    callback: js.Function1[
      /* args */ OnResolveArgs, 
      js.UndefOr[OnResolveResult | Null | (js.Promise[js.UndefOr[OnResolveResult | Null]])]
    ]
  ): Unit = js.native
  
  def onStart(callback: js.Function0[OnStartResult | Null | Unit | (js.Promise[OnStartResult | Null | Unit])]): Unit = js.native
  
  def resolve(path: String): js.Promise[ResolveResult] = js.native
  def resolve(path: String, options: ResolveOptions): js.Promise[ResolveResult] = js.native
}
