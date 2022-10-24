package typings.expoMetroConfig

import typings.expoMetroConfig.anon.GetRuleType
import typings.expoMetroConfig.expoMetroConfigStrings.app
import typings.expoMetroConfig.expoMetroConfigStrings.module
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTransformerCreateMultiRuleTransformerMod {
  
  @JSImport("@expo/metro-config/build/transformer/createMultiRuleTransformer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createMultiRuleTransformer(param0: GetRuleType): /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BabelTransformer * / any['transform'] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createMultiRuleTransformer")(param0.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BabelTransformer * / any['transform'] */ js.Any]
  
  @JSImport("@expo/metro-config/build/transformer/createMultiRuleTransformer", "loaders")
  @js.native
  val loaders: Record[
    String, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BabelTransformerArgs */ /* args */ Any, 
      Any
    ]
  ] = js.native
  
  trait Rule extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var test: (js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BabelTransformerArgs */ /* args */ Any, 
        Boolean
      ]) | js.RegExp
    
    var transform: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BabelTransformer * / any['transform'] */ js.Any
    
    var `type`: js.UndefOr[module | app] = js.undefined
    
    var warn: js.UndefOr[Boolean] = js.undefined
  }
  object Rule {
    
    inline def apply(
      test: (js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BabelTransformerArgs */ /* args */ Any, 
          Boolean
        ]) | js.RegExp,
      transform: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BabelTransformer * / any['transform'] */ js.Any
    ): Rule = {
      val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rule]
    }
    
    extension [Self <: Rule](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTest(
        value: (js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BabelTransformerArgs */ /* args */ Any, 
              Boolean
            ]) | js.RegExp
      ): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestFunction1(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BabelTransformerArgs */ /* args */ Any => Boolean
      ): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
      
      inline def setTransform(
        value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BabelTransformer * / any['transform'] */ js.Any
      ): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setType(value: module | app): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWarn(value: Boolean): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      
      inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
  }
}
