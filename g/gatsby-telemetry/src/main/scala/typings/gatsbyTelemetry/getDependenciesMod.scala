package typings.gatsbyTelemetry

import typings.gatsbyTelemetry.anon.Dependencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDependenciesMod {
  
  @JSImport("gatsby-telemetry/lib/get-dependencies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDependencies(): Dependencies = ^.asInstanceOf[js.Dynamic].applyDynamic("getDependencies")().asInstanceOf[Dependencies]
}
