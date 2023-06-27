package typings.esbuild.mod

import typings.esbuild.esbuildBooleans.`false`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildResult[ProvidedOptions /* <: BuildOptions */] extends StObject {
  
  var errors: js.Array[Message]
  
  /** Only when "mangleCache" is present */
  var mangleCache: (Record[String, String | `false`]) | (/* import warning: importer.ImportType#apply Failed type conversion: ProvidedOptions['mangleCache'] extends std.Object ? never : undefined */ js.Any)
  
  /** Only when "metafile: true" */
  var metafile: Metafile | (/* import warning: importer.ImportType#apply Failed type conversion: ProvidedOptions['metafile'] extends true ? never : undefined */ js.Any)
  
  /** Only when "write: false" */
  var outputFiles: js.Array[OutputFile] | (/* import warning: importer.ImportType#apply Failed type conversion: ProvidedOptions['write'] extends false ? never : undefined */ js.Any)
  
  var warnings: js.Array[Message]
}
object BuildResult {
  
  inline def apply[ProvidedOptions /* <: BuildOptions */](
    errors: js.Array[Message],
    mangleCache: (Record[String, String | `false`]) | (/* import warning: importer.ImportType#apply Failed type conversion: ProvidedOptions['mangleCache'] extends std.Object ? never : undefined */ js.Any),
    metafile: Metafile | (/* import warning: importer.ImportType#apply Failed type conversion: ProvidedOptions['metafile'] extends true ? never : undefined */ js.Any),
    outputFiles: js.Array[OutputFile] | (/* import warning: importer.ImportType#apply Failed type conversion: ProvidedOptions['write'] extends false ? never : undefined */ js.Any),
    warnings: js.Array[Message]
  ): BuildResult[ProvidedOptions] = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], mangleCache = mangleCache.asInstanceOf[js.Any], metafile = metafile.asInstanceOf[js.Any], outputFiles = outputFiles.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildResult[ProvidedOptions]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildResult[?], ProvidedOptions /* <: BuildOptions */] (val x: Self & BuildResult[ProvidedOptions]) extends AnyVal {
    
    inline def setErrors(value: js.Array[Message]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: Message*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setMangleCache(
      value: (Record[String, String | `false`]) | (/* import warning: importer.ImportType#apply Failed type conversion: ProvidedOptions['mangleCache'] extends std.Object ? never : undefined */ js.Any)
    ): Self = StObject.set(x, "mangleCache", value.asInstanceOf[js.Any])
    
    inline def setMetafile(
      value: Metafile | (/* import warning: importer.ImportType#apply Failed type conversion: ProvidedOptions['metafile'] extends true ? never : undefined */ js.Any)
    ): Self = StObject.set(x, "metafile", value.asInstanceOf[js.Any])
    
    inline def setOutputFiles(
      value: js.Array[OutputFile] | (/* import warning: importer.ImportType#apply Failed type conversion: ProvidedOptions['write'] extends false ? never : undefined */ js.Any)
    ): Self = StObject.set(x, "outputFiles", value.asInstanceOf[js.Any])
    
    inline def setOutputFilesVarargs(value: OutputFile*): Self = StObject.set(x, "outputFiles", js.Array(value*))
    
    inline def setWarnings(value: js.Array[Message]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsVarargs(value: Message*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
