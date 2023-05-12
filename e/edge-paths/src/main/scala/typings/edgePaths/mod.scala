package typings.edgePaths

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("edge-paths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAnyEdgeLatest(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnyEdgeLatest")().asInstanceOf[String]
  
  inline def getAnyEdgeStable(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnyEdgeStable")().asInstanceOf[String]
  
  inline def getEdgeBetaPath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEdgeBetaPath")().asInstanceOf[String]
  
  inline def getEdgeCanaryPath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEdgeCanaryPath")().asInstanceOf[String]
  
  inline def getEdgeDevPath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEdgeDevPath")().asInstanceOf[String]
  
  inline def getEdgePath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEdgePath")().asInstanceOf[String]
}
