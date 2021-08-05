package typings.formatjsIntl

import typings.formatjsIntl.srcTypesMod.IntlCache
import typings.formatjsIntl.srcTypesMod.IntlShape
import typings.formatjsIntl.srcTypesMod.OptionalIntlConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCreateIntlMod {
  
  @JSImport("@formatjs/intl/src/create-intl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createIntl[T](config: OptionalIntlConfig[T]): IntlShape[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createIntl")(config.asInstanceOf[js.Any]).asInstanceOf[IntlShape[T]]
  inline def createIntl[T](config: OptionalIntlConfig[T], cache: IntlCache): IntlShape[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createIntl")(config.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[IntlShape[T]]
  
  type CreateIntlFn[T, C /* <: OptionalIntlConfig[T] */, S /* <: IntlShape[T] */] = js.Function2[/* config */ C, /* cache */ js.UndefOr[IntlCache], S]
}
