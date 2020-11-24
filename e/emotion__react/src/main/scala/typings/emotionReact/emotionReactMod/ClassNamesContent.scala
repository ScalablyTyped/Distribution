package typings.emotionReact.emotionReactMod

import typings.emotionSerialize.mod.CSSInterpolation
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassNamesContent extends js.Object {
  
  def css(args: CSSInterpolation*): String = js.native
  def css(template: TemplateStringsArray, args: CSSInterpolation*): String = js.native
  
  def cx(args: ClassNamesArg*): String = js.native
  
  var theme: Theme = js.native
}
