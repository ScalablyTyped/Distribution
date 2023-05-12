package typings.esbuildWasm.mod

import typings.esbuildWasm.esbuildWasmBooleans.`false`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformResult[SpecificOptions /* <: TransformOptions */] extends StObject {
  
  var code: String
  
  /** Only when "legalComments" is "external" */
  var legalComments: String | (/* import warning: importer.ImportType#apply Failed type conversion: SpecificOptions['legalComments'] extends 'external' ? never : undefined */ js.Any)
  
  /** Only when "mangleCache" is present */
  var mangleCache: (Record[String, String | `false`]) | (/* import warning: importer.ImportType#apply Failed type conversion: SpecificOptions['mangleCache'] extends std.Object ? never : undefined */ js.Any)
  
  var map: String
  
  var warnings: js.Array[Message]
}
object TransformResult {
  
  inline def apply[SpecificOptions /* <: TransformOptions */](
    code: String,
    legalComments: String | (/* import warning: importer.ImportType#apply Failed type conversion: SpecificOptions['legalComments'] extends 'external' ? never : undefined */ js.Any),
    mangleCache: (Record[String, String | `false`]) | (/* import warning: importer.ImportType#apply Failed type conversion: SpecificOptions['mangleCache'] extends std.Object ? never : undefined */ js.Any),
    map: String,
    warnings: js.Array[Message]
  ): TransformResult[SpecificOptions] = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], legalComments = legalComments.asInstanceOf[js.Any], mangleCache = mangleCache.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformResult[SpecificOptions]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformResult[?], SpecificOptions /* <: TransformOptions */] (val x: Self & TransformResult[SpecificOptions]) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setLegalComments(
      value: String | (/* import warning: importer.ImportType#apply Failed type conversion: SpecificOptions['legalComments'] extends 'external' ? never : undefined */ js.Any)
    ): Self = StObject.set(x, "legalComments", value.asInstanceOf[js.Any])
    
    inline def setMangleCache(
      value: (Record[String, String | `false`]) | (/* import warning: importer.ImportType#apply Failed type conversion: SpecificOptions['mangleCache'] extends std.Object ? never : undefined */ js.Any)
    ): Self = StObject.set(x, "mangleCache", value.asInstanceOf[js.Any])
    
    inline def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setWarnings(value: js.Array[Message]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsVarargs(value: Message*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
