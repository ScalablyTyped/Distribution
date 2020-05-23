package typings.favicoJs

import org.scalablytyped.runtime.TopLevel
import typings.favicoJs.favicojs.FavicoJsOptions
import typings.favicoJs.favicojs.FavicoJsStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class Favico ()
    extends typings.favicoJs.favicojs.Favico {
    def this(opt: FavicoJsOptions) = this()
  }
  
  @js.native
  object Favico extends TopLevel[FavicoJsStatic]
  
}

