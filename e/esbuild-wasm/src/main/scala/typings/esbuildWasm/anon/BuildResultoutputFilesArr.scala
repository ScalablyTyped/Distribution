package typings.esbuildWasm.anon

import typings.esbuildWasm.browserMod.BuildInvalidate
import typings.esbuildWasm.browserMod.Message
import typings.esbuildWasm.browserMod.Metafile
import typings.esbuildWasm.browserMod.OutputFile
import typings.esbuildWasm.esbuildWasmBooleans.`false`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined esbuild-wasm.esbuild-wasm/lib/browser.BuildResult & {  outputFiles :std.Array<esbuild-wasm.esbuild-wasm/lib/browser.OutputFile>} */
trait BuildResultoutputFilesArr extends StObject {
  
  var errors: js.Array[Message]
  
  /** Only when "mangleCache" is present */
  var mangleCache: js.UndefOr[Record[String, String | `false`]] = js.undefined
  
  /** Only when "metafile: true" */
  var metafile: js.UndefOr[Metafile] = js.undefined
  
  /** Only when "write: false" */
  var outputFiles: js.UndefOr[js.Array[OutputFile]] & js.Array[OutputFile]
  
  /** Only when "incremental: true" */
  var rebuild: js.UndefOr[BuildInvalidate] = js.undefined
  
  /** Only when "watch: true" */
  var stop: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var warnings: js.Array[Message]
}
object BuildResultoutputFilesArr {
  
  inline def apply(
    errors: js.Array[Message],
    outputFiles: js.UndefOr[js.Array[OutputFile]] & js.Array[OutputFile],
    warnings: js.Array[Message]
  ): BuildResultoutputFilesArr = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], outputFiles = outputFiles.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildResultoutputFilesArr]
  }
  
  extension [Self <: BuildResultoutputFilesArr](x: Self) {
    
    inline def setErrors(value: js.Array[Message]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: Message*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setMangleCache(value: Record[String, String | `false`]): Self = StObject.set(x, "mangleCache", value.asInstanceOf[js.Any])
    
    inline def setMangleCacheUndefined: Self = StObject.set(x, "mangleCache", js.undefined)
    
    inline def setMetafile(value: Metafile): Self = StObject.set(x, "metafile", value.asInstanceOf[js.Any])
    
    inline def setMetafileUndefined: Self = StObject.set(x, "metafile", js.undefined)
    
    inline def setOutputFiles(value: js.UndefOr[js.Array[OutputFile]] & js.Array[OutputFile]): Self = StObject.set(x, "outputFiles", value.asInstanceOf[js.Any])
    
    inline def setRebuild(value: BuildInvalidate): Self = StObject.set(x, "rebuild", value.asInstanceOf[js.Any])
    
    inline def setRebuildUndefined: Self = StObject.set(x, "rebuild", js.undefined)
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    
    inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    
    inline def setWarnings(value: js.Array[Message]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsVarargs(value: Message*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
