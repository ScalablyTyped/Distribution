package typings.exprDashEval

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object exprDashEvalMod {
  type Value = Double | String | (js.Function1[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias expr-eval.expr-eval.Value */ /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias expr-eval.expr-eval.Value */ /* repeated */ js.Object, 
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias expr-eval.expr-eval.Value */ js.Object
  ]) | (StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias expr-eval.expr-eval.Value */ js.Object
  ])
  type Values = StringDictionary[Value]
}
