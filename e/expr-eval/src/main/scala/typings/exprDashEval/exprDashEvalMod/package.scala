package typings.exprDashEval

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object exprDashEvalMod {
  import org.scalablytyped.runtime.StringDictionary

  type Value = Double | String | (js.Function1[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias expr-eval.expr-eval.Value */ /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias expr-eval.expr-eval.Value */ /* repeated */ js.Object, 
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias expr-eval.expr-eval.Value */ js.Object
  ]) | (StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias expr-eval.expr-eval.Value */ js.Object
  ])
  type Values = StringDictionary[Value]
}
