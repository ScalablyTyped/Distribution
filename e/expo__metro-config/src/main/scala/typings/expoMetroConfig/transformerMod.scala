package typings.expoMetroConfig

import typings.expoMetroConfig.anon.Folders
import typings.expoMetroConfig.anon.GetRuleType
import typings.expoMetroConfig.anon.NodeModulesPaths
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformerMod {
  
  @JSImport("@expo/metro-config/build/transformer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createExoticTransformer(hasNodeModulesPathsTranspileModules: NodeModulesPaths): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createExoticTransformer")(hasNodeModulesPathsTranspileModules.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def createModuleMatcher(hasFoldersModuleIds: Folders): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("createModuleMatcher")(hasFoldersModuleIds.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  inline def createMultiRuleTransformer(hasGetRuleTypeRules: GetRuleType): /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BabelTransformer * / any['transform'] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createMultiRuleTransformer")(hasGetRuleTypeRules.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BabelTransformer * / any['transform'] */ js.Any]
  
  inline def getCacheKey(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCacheKey")().asInstanceOf[String]
  
  @JSImport("@expo/metro-config/build/transformer", "loaders")
  @js.native
  val loaders: Record[
    String, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BabelTransformerArgs */ /* args */ Any, 
      Any
    ]
  ] = js.native
}
