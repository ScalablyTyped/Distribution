package typings.atEmotionStylis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atEmotionStylisMod {
  type Plugable = js.UndefOr[Null | Boolean | Plugin | ArrayPlugable]
  type Plugin = js.ThisFunction9[
    /* this */ Stylis, 
    /* context */ Context, 
    /* content */ js.Any, 
    /* selector */ js.Array[String], 
    /* parent */ js.Array[String], 
    /* line */ Double, 
    /* column */ Double, 
    /* length */ Double, 
    /* at */ Double, 
    /* depth */ Double, 
    js.Any
  ]
  type Prefix = Boolean | (js.Function3[/* key */ String, /* value */ String, /* context */ PrefixContext, Boolean])
  type StylisSet = js.Function1[
    /* options */ Options, 
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @emotion/stylis.@emotion/stylis.StylisSet */ js.Object
  ]
  type StylisUse = js.Function1[
    /* plugin */ js.UndefOr[Plugable], 
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @emotion/stylis.@emotion/stylis.StylisUse */ js.Object
  ]
}
