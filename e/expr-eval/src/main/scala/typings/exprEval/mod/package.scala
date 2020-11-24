package typings.exprEval

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Value = scala.Double | java.lang.String | (js.Function1[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias expr-eval.expr-eval.Value */ /* repeated */ js.Object, 
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias expr-eval.expr-eval.Value */ js.Object
  ]) | (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias expr-eval.expr-eval.Value */ js.Object
  ])
  
  type Values = org.scalablytyped.runtime.StringDictionary[typings.exprEval.mod.Value]
}
