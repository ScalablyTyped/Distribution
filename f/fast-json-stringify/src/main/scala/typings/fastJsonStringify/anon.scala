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
    
    @scala.inline
    def apply(): AllOf = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllOf]
    }
    
    @scala.inline
    implicit class AllOfMutableBuilder[Self <: AllOf] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllOf(
        value: js.Array[
              /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias fast-json-stringify.fast-json-stringify.ObjectProperties */ js.Object
            ]
      ): Self = StObject.set(x, "allOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllOfUndefined: Self = StObject.set(x, "allOf", js.undefined)
      
      @scala.inline
      def setAllOfVarargs(
        value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias fast-json-stringify.fast-json-stringify.ObjectProperties */ js.Object)*
      ): Self = StObject.set(x, "allOf", js.Array(value :_*))
      
      @scala.inline
      def setAnyOf(
        value: js.Array[
              /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias fast-json-stringify.fast-json-stringify.ObjectProperties */ js.Object
            ]
      ): Self = StObject.set(x, "anyOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnyOfUndefined: Self = StObject.set(x, "anyOf", js.undefined)
      
      @scala.inline
      def setAnyOfVarargs(
        value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias fast-json-stringify.fast-json-stringify.ObjectProperties */ js.Object)*
      ): Self = StObject.set(x, "anyOf", js.Array(value :_*))
      
      @scala.inline
      def setElse(
        value: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias fast-json-stringify.fast-json-stringify.ObjectProperties */ js.Object
      ): Self = StObject.set(x, "else", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElseUndefined: Self = StObject.set(x, "else", js.undefined)
      
      @scala.inline
      def setIf(
        value: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias fast-json-stringify.fast-json-stringify.ObjectProperties */ js.Object
      ): Self = StObject.set(x, "if", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIfUndefined: Self = StObject.set(x, "if", js.undefined)
      
      @scala.inline
      def setThen(
        value: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias fast-json-stringify.fast-json-stringify.ObjectProperties */ js.Object
      ): Self = StObject.set(x, "then", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThenUndefined: Self = StObject.set(x, "then", js.undefined)
    }
  }
}
