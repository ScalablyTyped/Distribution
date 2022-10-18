package typings.fluentSequence

import typings.fluentBundle.mod.FluentBundle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmMapSyncMod {
  
  @JSImport("@fluent/sequence/esm/map_sync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mapBundleSync(bundles: js.Iterable[FluentBundle], ids: String): FluentBundle | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("mapBundleSync")(bundles.asInstanceOf[js.Any], ids.asInstanceOf[js.Any])).asInstanceOf[FluentBundle | Null]
  inline def mapBundleSync(bundles: js.Iterable[FluentBundle], ids: js.Array[String]): js.Array[FluentBundle | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapBundleSync")(bundles.asInstanceOf[js.Any], ids.asInstanceOf[js.Any])).asInstanceOf[js.Array[FluentBundle | Null]]
}
