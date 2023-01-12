package typings.esbuildWasm.mod

import typings.std.WebAssembly.Module
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitializeOptions extends StObject {
  
  /**
    * The result of calling "new WebAssembly.Module(buffer)" where "buffer"
    * is a typed array or ArrayBuffer containing the binary code of the
    * "esbuild.wasm" file.
    *
    * You can use this as an alternative to "wasmURL" for environments where it's
    * not possible to download the WebAssembly module.
    */
  var wasmModule: js.UndefOr[Module] = js.undefined
  
  /**
    * The URL of the "esbuild.wasm" file. This must be provided when running
    * esbuild in the browser.
    */
  var wasmURL: js.UndefOr[String] = js.undefined
  
  /**
    * By default esbuild runs the WebAssembly-based browser API in a web worker
    * to avoid blocking the UI thread. This can be disabled by setting "worker"
    * to false.
    */
  var worker: js.UndefOr[Boolean] = js.undefined
}
object InitializeOptions {
  
  inline def apply(): InitializeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitializeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InitializeOptions] (val x: Self) extends AnyVal {
    
    inline def setWasmModule(value: Module): Self = StObject.set(x, "wasmModule", value.asInstanceOf[js.Any])
    
    inline def setWasmModuleUndefined: Self = StObject.set(x, "wasmModule", js.undefined)
    
    inline def setWasmURL(value: String): Self = StObject.set(x, "wasmURL", value.asInstanceOf[js.Any])
    
    inline def setWasmURLUndefined: Self = StObject.set(x, "wasmURL", js.undefined)
    
    inline def setWorker(value: Boolean): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
    
    inline def setWorkerUndefined: Self = StObject.set(x, "worker", js.undefined)
  }
}
