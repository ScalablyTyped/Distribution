package typings.fastJsonStringify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AllOf extends StObject {
    
    var allOf: js.UndefOr[
        js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias fast-json-stringify.fast-json-stringify.ObjectProperties */ js.Object
        ]
      ] = js.undefined
    
    var anyOf: js.UndefOr[
        js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias fast-json-stringify.fast-json-stringify.ObjectProperties */ js.Object
        ]
      ] = js.undefined
    
    var `else`: js.UndefOr[
        /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias fast-json-stringify.fast-json-stringify.ObjectProperties */ js.Object
      ] = js.undefined
    
    var `if`: js.UndefOr[
        /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias fast-json-stringify.fast-json-stringify.ObjectProperties */ js.Object
      ] = js.undefined
    
    var `then`: js.UndefOr[
        /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias fast-json-stringify.fast-json-stringify.ObjectProperties */ js.Object
      ] = js.undefined
  }
  object AllOf {
    
    inline def apply(): AllOf = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllOf]
    }
    
    extension [Self <: AllOf](x: Self) {
      
      inline def setAllOf(
        value: js.Array[
              /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias fast-json-stringify.fast-json-stringify.ObjectProperties */ js.Object
            ]
      ): Self = StObject.set(x, "allOf", value.asInstanceOf[js.Any])
      
      inline def setAllOfUndefined: Self = StObject.set(x, "allOf", js.undefined)
      
      inline def setAllOfVarargs(
        value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias fast-json-stringify.fast-json-stringify.ObjectProperties */ js.Object)*
      ): Self = StObject.set(x, "allOf", js.Array(value :_*))
      
      inline def setAnyOf(
        value: js.Array[
              /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias fast-json-stringify.fast-json-stringify.ObjectProperties */ js.Object
            ]
      ): Self = StObject.set(x, "anyOf", value.asInstanceOf[js.Any])
      
      inline def setAnyOfUndefined: Self = StObject.set(x, "anyOf", js.undefined)
      
      inline def setAnyOfVarargs(
        value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias fast-json-stringify.fast-json-stringify.ObjectProperties */ js.Object)*
      ): Self = StObject.set(x, "anyOf", js.Array(value :_*))
      
      inline def setElse(
        value: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias fast-json-stringify.fast-json-stringify.ObjectProperties */ js.Object
      ): Self = StObject.set(x, "else", value.asInstanceOf[js.Any])
      
      inline def setElseUndefined: Self = StObject.set(x, "else", js.undefined)
      
      inline def setIf(
        value: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias fast-json-stringify.fast-json-stringify.ObjectProperties */ js.Object
      ): Self = StObject.set(x, "if", value.asInstanceOf[js.Any])
      
      inline def setIfUndefined: Self = StObject.set(x, "if", js.undefined)
      
      inline def setThen(
        value: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias fast-json-stringify.fast-json-stringify.ObjectProperties */ js.Object
      ): Self = StObject.set(x, "then", value.asInstanceOf[js.Any])
      
      inline def setThenUndefined: Self = StObject.set(x, "then", js.undefined)
    }
  }
}
