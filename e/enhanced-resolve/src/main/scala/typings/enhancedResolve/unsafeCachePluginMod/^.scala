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
  /* CompleteClass */
  override var cache: Dictionary[_] = js.native
  /* CompleteClass */
  override var source: String = js.native
  /* CompleteClass */
  override var target: String = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit = js.native
  /* CompleteClass */
  override def filterPredicate(request: ResolverRequest): Boolean = js.native
}

