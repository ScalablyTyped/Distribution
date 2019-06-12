package typings
package atEmotionStylisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atEmotionStylisMod {
  type Plugable = js.UndefOr[scala.Null | scala.Boolean | Plugin | ArrayPlugable]
  type Plugin = js.ThisFunction9[
    /* this */ Stylis, 
    /* context */ Context, 
    /* content */ js.Any, 
    /* selector */ js.Array[java.lang.String], 
    /* parent */ js.Array[java.lang.String], 
    /* line */ scala.Double, 
    /* column */ scala.Double, 
    /* length */ scala.Double, 
    /* at */ scala.Double, 
    /* depth */ scala.Double, 
    js.Any
  ]
  type Prefix = scala.Boolean | (js.Function3[
    /* key */ java.lang.String, 
    /* value */ java.lang.String, 
    /* context */ PrefixContext, 
    scala.Boolean
  ])
  type StylisSet = js.Function1[
    /* options */ Options, 
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @emotion/stylis.@emotion/stylis.StylisSet */ js.Object
  ]
  type StylisUse = js.Function1[
    /* plugin */ js.UndefOr[Plugable], 
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @emotion/stylis.@emotion/stylis.StylisUse */ js.Object
  ]
}
