package typings
package enhancedDashResolveLib.libUnsafeCachePluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enhanced-resolve/lib/UnsafeCachePlugin", JSImport.Namespace)
@js.native
class namespaced protected () extends UnsafeCachePlugin {
  def this(source: java.lang.String, filterPredicate: js.Function1[
      /* request */ enhancedDashResolveLib.libCommonDashTypesMod.ResolverRequest, 
      scala.Boolean
    ], cache: enhancedDashResolveLib.libConcordMod.Dictionary[_], target: java.lang.String) = this()
  /* CompleteClass */
  override var cache: enhancedDashResolveLib.libConcordMod.Dictionary[_] = js.native
  /* CompleteClass */
  override var source: java.lang.String = js.native
  /* CompleteClass */
  override var target: java.lang.String = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(resolver: enhancedDashResolveLib.libResolverMod.namespaced): scala.Unit = js.native
  /* CompleteClass */
  override def filterPredicate(request: enhancedDashResolveLib.libCommonDashTypesMod.ResolverRequest): scala.Boolean = js.native
}

