package typings.gatsbyCoreUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cpuCoreCountMod {
  
  @JSImport("gatsby-core-utils/dist/cpu-core-count", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cpuCoreCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cpuCoreCount")().asInstanceOf[Double]
  inline def cpuCoreCount(ignoreEnvVar: Boolean): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cpuCoreCount")(ignoreEnvVar.asInstanceOf[js.Any]).asInstanceOf[Double]
}
