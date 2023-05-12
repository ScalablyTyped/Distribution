package typings.esmUtils

import typings.esmUtils.anon.Dirname
import typings.std.ImportMeta
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("esm-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(sourceModule: String): Dirname = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(sourceModule.asInstanceOf[js.Any]).asInstanceOf[Dirname]
  inline def default(sourceModule: ImportMeta): Dirname = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(sourceModule.asInstanceOf[js.Any]).asInstanceOf[Dirname]
  inline def default(sourceModule: URL): Dirname = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(sourceModule.asInstanceOf[js.Any]).asInstanceOf[Dirname]
  
  trait ImportModuleOptions extends StObject {
    
    val traceSyntaxError: js.UndefOr[Boolean] = js.undefined
  }
  object ImportModuleOptions {
    
    inline def apply(): ImportModuleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImportModuleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImportModuleOptions] (val x: Self) extends AnyVal {
      
      inline def setTraceSyntaxError(value: Boolean): Self = StObject.set(x, "traceSyntaxError", value.asInstanceOf[js.Any])
      
      inline def setTraceSyntaxErrorUndefined: Self = StObject.set(x, "traceSyntaxError", js.undefined)
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JsonValue = string | number | boolean | null | {[ Key in string ]:? esm-utils.esm-utils.JsonValue} | std.Array<esm-utils.esm-utils.JsonValue>
  }}}
  to avoid circular code involving: 
  - esm-utils.esm-utils.JsonValue
  */
  type JsonValue = String | Double | Boolean | Null | (/* import warning: importer.ImportType#apply Failed type conversion: {[ Key in string ]:? any} */ js.Any) | js.Array[Any]
  
  type importModule = js.Function2[
    /* file */ String | URL, 
    /* options */ js.UndefOr[ImportModuleOptions], 
    js.Promise[Any]
  ]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type readJson = (file : string | std.URL): std.Promise<esm-utils.esm-utils.JsonValue>
  }}}
  to avoid circular code involving: 
  - esm-utils.esm-utils.JsonValue
  - esm-utils.esm-utils.readJson
  */
  @js.native
  trait readJson extends StObject {
    
    def apply(file: String): js.Promise[JsonValue] = js.native
    def apply(file: URL): js.Promise[JsonValue] = js.native
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type readJsonSync = (file : string | std.URL): esm-utils.esm-utils.JsonValue
  }}}
  to avoid circular code involving: 
  - esm-utils.esm-utils.JsonValue
  - esm-utils.esm-utils.readJsonSync
  */
  @js.native
  trait readJsonSync extends StObject {
    
    def apply(file: String): JsonValue = js.native
    def apply(file: URL): JsonValue = js.native
  }
}
