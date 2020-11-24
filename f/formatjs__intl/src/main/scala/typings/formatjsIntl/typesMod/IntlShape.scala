package typings.formatjsIntl.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntlShape[T]
  extends IntlConfig[T]
     with IntlFormatters[js.Any, js.Any] {
  
  var formatters: Formatters = js.native
}
