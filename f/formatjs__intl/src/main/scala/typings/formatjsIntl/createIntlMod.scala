package typings.formatjsIntl

import typings.formatjsIntl.typesMod.IntlCache
import typings.formatjsIntl.typesMod.IntlShape
import typings.formatjsIntl.typesMod.OptionalIntlConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createIntlMod {
  
  @JSImport("@formatjs/intl/lib/src/create-intl", "createIntl")
  @js.native
  def createIntl[T](config: OptionalIntlConfig[T]): IntlShape[T] = js.native
  @JSImport("@formatjs/intl/lib/src/create-intl", "createIntl")
  @js.native
  def createIntl[T](config: OptionalIntlConfig[T], cache: IntlCache): IntlShape[T] = js.native
  
  type CreateIntlFn[T, C /* <: OptionalIntlConfig[T] */, S /* <: IntlShape[T] */] = js.Function2[/* config */ C, /* cache */ js.UndefOr[IntlCache], S]
}
