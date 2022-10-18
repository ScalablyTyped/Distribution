package typings.firebaseMessaging

import typings.std.Headers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcTestingCompareHeadersMod {
  
  @JSImport("@firebase/messaging/dist/esm/src/testing/compare-headers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compareHeaders(expectedHeaders: HeadersWithEntries, actualHeaders: HeadersWithEntries): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compareHeaders")(expectedHeaders.asInstanceOf[js.Any], actualHeaders.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait HeadersWithEntries
    extends StObject
       with Headers {
    
    @JSName("entries")
    var entries_FHeadersWithEntries: js.UndefOr[js.Function0[js.Iterable[js.Tuple2[String, String]]]] = js.native
  }
}
