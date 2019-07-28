package typings.atEmotionStylis.atEmotionStylisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stylis extends StylisConstructor {
  @JSName("set")
  var set_Original: StylisSet = js.native
  @JSName("use")
  var use_Original: StylisUse = js.native
  def apply(selector: String, properties: String): js.Any = js.native
  def set(options: Options): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @emotion/stylis.@emotion/stylis.StylisSet */ js.Object = js.native
  def use(): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @emotion/stylis.@emotion/stylis.StylisUse */ js.Object = js.native
  def use(plugin: Plugable): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @emotion/stylis.@emotion/stylis.StylisUse */ js.Object = js.native
}

