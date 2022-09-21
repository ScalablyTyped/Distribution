package typings.expoXcpretty

import typings.expoXcpretty.anon.Checked
import typings.expoXcpretty.anon.Source
import typings.expoXcpretty.anon.Version
import typings.expoXcpretty.parsePodfileLockMod.PodfileLock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getFirstExternalSourceForPodMod {
  
  @JSImport("@expo/xcpretty/build/utils/getFirstExternalSourceForPod", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDependentPods(podfileLock: PodfileLock, hasNameVersion: Version): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDependentPods")(podfileLock.asInstanceOf[js.Any], hasNameVersion.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def getFirstExternalSourceForPod(podfileLock: PodfileLock, hasNameChecked: Checked): Source | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstExternalSourceForPod")(podfileLock.asInstanceOf[js.Any], hasNameChecked.asInstanceOf[js.Any])).asInstanceOf[Source | Null]
}
