package typings.esmUtils

import typings.esmUtils.mod.ImportModuleOptions
import typings.esmUtils.mod.JsonValue
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Dirname extends StObject {
    
    val __dirname: String = js.native
    
    // Alias
    val __filename: String = js.native
    
    val dirname: String = js.native
    
    val filename: String = js.native
    
    def `import`(file: String): js.Promise[Any] = js.native
    def `import`(file: String, options: ImportModuleOptions): js.Promise[Any] = js.native
    def `import`(file: URL): js.Promise[Any] = js.native
    def `import`(file: URL, options: ImportModuleOptions): js.Promise[Any] = js.native
    
    def importModule(file: String): js.Promise[Any] = js.native
    def importModule(file: String, options: ImportModuleOptions): js.Promise[Any] = js.native
    def importModule(file: URL): js.Promise[Any] = js.native
    def importModule(file: URL, options: ImportModuleOptions): js.Promise[Any] = js.native
    
    def loadJson(file: String): js.Promise[JsonValue] = js.native
    def loadJson(file: URL): js.Promise[JsonValue] = js.native
    
    def loadJsonSync(file: String): JsonValue = js.native
    def loadJsonSync(file: URL): JsonValue = js.native
    
    def readJson(file: String): js.Promise[JsonValue] = js.native
    def readJson(file: URL): js.Promise[JsonValue] = js.native
    
    def readJsonSync(file: String): JsonValue = js.native
    def readJsonSync(file: URL): JsonValue = js.native
    
    val require: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeRequire */ Any = js.native
  }
}
