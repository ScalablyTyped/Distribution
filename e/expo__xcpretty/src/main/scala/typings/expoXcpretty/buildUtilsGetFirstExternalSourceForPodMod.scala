package typings.expoXcpretty

import typings.expoXcpretty.anon.Checked
import typings.expoXcpretty.anon.Source
import typings.expoXcpretty.anon.Version
import typings.expoXcpretty.buildUtilsParsePodfileLockMod.PodfileLock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsGetFirstExternalSourceForPodMod {
  
  @JSImport("@expo/xcpretty/build/utils/getFirstExternalSourceForPod", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDependentPods(podfileLock: PodfileLock, param1: Version): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDependentPods")(podfileLock.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def getFirstExternalSourceForPod(podfileLock: PodfileLock, param1: Checked): Source | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstExternalSourceForPod")(podfileLock.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Source | Null]
}
