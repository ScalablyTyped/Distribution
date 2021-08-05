package typings.firebaseInstallations

import typings.std.Headers
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compareHeadersMod {
  
  @JSImport("@firebase/installations/dist/src/testing/compare-headers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compareHeaders(expectedHeaders: HeadersWithEntries, actualHeaders: HeadersWithEntries): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compareHeaders")(expectedHeaders.asInstanceOf[js.Any], actualHeaders.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait HeadersWithEntries
    extends StObject
       with Headers {
    
    @JSName("entries")
    var entries_FHeadersWithEntries: js.UndefOr[js.Function0[Iterable[js.Tuple2[String, String]]]] = js.native
  }
}
