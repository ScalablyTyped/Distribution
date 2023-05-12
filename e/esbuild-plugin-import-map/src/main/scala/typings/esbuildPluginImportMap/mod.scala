package typings.esbuildPluginImportMap

import typings.esbuildPluginImportMap.anon.Name
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("esbuild-plugin-import-map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  
  inline def load(importMaps: js.Array[ImportMap]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(importMaps.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def load(importMaps: ImportMap): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(importMaps.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def plugin(): Name = ^.asInstanceOf[js.Dynamic].applyDynamic("plugin")().asInstanceOf[Name]
  
  type ImportMap = String | ImportsMapping
  
  trait ImportsMapping extends StObject {
    
    var imports: Record[String, String]
  }
  object ImportsMapping {
    
    inline def apply(imports: Record[String, String]): ImportsMapping = {
      val __obj = js.Dynamic.literal(imports = imports.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImportsMapping]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImportsMapping] (val x: Self) extends AnyVal {
      
      inline def setImports(value: Record[String, String]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    }
  }
}
