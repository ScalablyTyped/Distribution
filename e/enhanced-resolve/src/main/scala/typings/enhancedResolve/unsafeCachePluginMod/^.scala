package typings.enhancedResolve.unsafeCachePluginMod

import typings.enhancedResolve.commonTypesMod.ResolverRequest
import typings.enhancedResolve.concordMod.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enhanced-resolve/lib/UnsafeCachePlugin", JSImport.Namespace)
@js.native
class ^ protected () extends UnsafeCachePlugin {
  def this(
    source: String,
    filterPredicate: js.Function1[/* request */ ResolverRequest, Boolean],
    cache: Dictionary[_],
    target: String
  ) = this()
}

