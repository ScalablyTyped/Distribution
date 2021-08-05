package typings.gatsbyTelemetry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createFlushMod {
  
  @JSImport("gatsby-telemetry/lib/create-flush", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createFlush(isTrackingEnabled: Boolean): js.Function0[js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFlush")(isTrackingEnabled.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Promise[Unit]]]
}
