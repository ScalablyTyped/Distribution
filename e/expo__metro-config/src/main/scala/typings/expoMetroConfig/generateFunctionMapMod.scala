package typings.expoMetroConfig

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generateFunctionMapMod {
  
  @JSImport("@expo/metro-config/build/transformer/generateFunctionMap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateFunctionMap(
    projectRoot: String,
    ast: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(projectRoot : string, ast : std.Parameters<typeof generateFunctionMapType>[0], context : std.Parameters<typeof generateFunctionMapType>[1]): std.ReturnType<typeof generateFunctionMapType> | null>[0] */ js.Any,
    context: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(projectRoot : string, ast : std.Parameters<typeof generateFunctionMapType>[0], context : std.Parameters<typeof generateFunctionMapType>[1]): std.ReturnType<typeof generateFunctionMapType> | null>[1] */ js.Any
  ): (ReturnType[
    js.Function3[
      /* projectRoot */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<typeof generateFunctionMapType>[0] */ /* ast */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<typeof generateFunctionMapType>[1] */ /* context */ js.Any, 
      (ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof generateFunctionMapType */ js.Any
      ]) | Null
    ]
  ]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("generateFunctionMap")(projectRoot.asInstanceOf[js.Any], ast.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[(ReturnType[
    js.Function3[
      /* projectRoot */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<typeof generateFunctionMapType>[0] */ /* ast */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<typeof generateFunctionMapType>[1] */ /* context */ js.Any, 
      (ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof generateFunctionMapType */ js.Any
      ]) | Null
    ]
  ]) | Null]
}
