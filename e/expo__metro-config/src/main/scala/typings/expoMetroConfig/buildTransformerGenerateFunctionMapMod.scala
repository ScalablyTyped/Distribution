package typings.expoMetroConfig

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTransformerGenerateFunctionMapMod {
  
  @JSImport("@expo/metro-config/build/transformer/generateFunctionMap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateFunctionMap(
    projectRoot: String,
    ast: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof generateFunctionMapType * / any>[0] */ js.Any,
    context: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof generateFunctionMapType * / any>[1] */ js.Any
  ): (ReturnType[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof generateFunctionMapType */ Any
  ]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("generateFunctionMap")(projectRoot.asInstanceOf[js.Any], ast.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[(ReturnType[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof generateFunctionMapType */ Any
  ]) | Null]
}
