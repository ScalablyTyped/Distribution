package typings.firebaseFirestore

import typings.firebaseFirestore.anon.After
import typings.firebaseFirestore.anon.Entries
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreRollupDotsharedMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/rollup.shared", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyPrebuilt(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("applyPrebuilt")().asInstanceOf[Any]
  inline def applyPrebuilt(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("applyPrebuilt")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def es2017Plugins(platform: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("es2017Plugins")(platform.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def es2017Plugins(platform: Any, mangled: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("es2017Plugins")(platform.asInstanceOf[js.Any], mangled.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def es2017PluginsCompat(platform: Any, pathTransformer: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("es2017PluginsCompat")(platform.asInstanceOf[js.Any], pathTransformer.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def es2017PluginsCompat(platform: Any, pathTransformer: Any, mangled: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("es2017PluginsCompat")(platform.asInstanceOf[js.Any], pathTransformer.asInstanceOf[js.Any], mangled.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def es2017ToEs5Plugins(): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("es2017ToEs5Plugins")().asInstanceOf[js.Array[Any]]
  inline def es2017ToEs5Plugins(mangled: Boolean): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("es2017ToEs5Plugins")(mangled.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def generateAliasConfig(platform: Any): Entries = ^.asInstanceOf[js.Dynamic].applyDynamic("generateAliasConfig")(platform.asInstanceOf[js.Any]).asInstanceOf[Entries]
  
  object manglePrivatePropertiesOptions {
    
    object mangle {
      
      object properties {
        
        @JSImport("@firebase/firestore/dist/packages/firestore/rollup.shared", "manglePrivatePropertiesOptions.mangle.properties.regex")
        @js.native
        val regex: js.RegExp = js.native
        
        @JSImport("@firebase/firestore/dist/packages/firestore/rollup.shared", "manglePrivatePropertiesOptions.mangle.properties.reserved_1")
        @js.native
        val reserved1: js.Array[String] = js.native
      }
      
      @JSImport("@firebase/firestore/dist/packages/firestore/rollup.shared", "manglePrivatePropertiesOptions.mangle.reserved")
      @js.native
      val reserved: js.Array[String] = js.native
    }
    
    object output {
      
      @JSImport("@firebase/firestore/dist/packages/firestore/rollup.shared", "manglePrivatePropertiesOptions.output.beautify")
      @js.native
      val beautify: Boolean = js.native
      
      @JSImport("@firebase/firestore/dist/packages/firestore/rollup.shared", "manglePrivatePropertiesOptions.output.comments")
      @js.native
      val comments: String = js.native
    }
  }
  
  inline def onwarn(warning: Any, defaultWarn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onwarn")(warning.asInstanceOf[js.Any], defaultWarn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeAssertAndPrefixInternalTransformer(service: Any): After = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAssertAndPrefixInternalTransformer")(service.asInstanceOf[js.Any]).asInstanceOf[After]
  
  inline def removeAssertTransformer(service: Any): After = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAssertTransformer")(service.asInstanceOf[js.Any]).asInstanceOf[After]
  
  inline def resolveBrowserExterns(id: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveBrowserExterns")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def resolveNodeExterns(id: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveNodeExterns")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
