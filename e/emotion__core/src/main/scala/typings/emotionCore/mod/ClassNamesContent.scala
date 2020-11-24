package typings.emotionCore.mod

import typings.emotionSerialize.mod.Interpolation
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassNamesContent[Theme] extends js.Object {
  
  def css(args: Interpolation[js.UndefOr[scala.Nothing]]*): String = js.native
  def css(template: TemplateStringsArray, args: Interpolation[js.UndefOr[scala.Nothing]]*): String = js.native
  
  def cx(args: ClassNamesArg*): String = js.native
  
  var theme: Theme = js.native
}
