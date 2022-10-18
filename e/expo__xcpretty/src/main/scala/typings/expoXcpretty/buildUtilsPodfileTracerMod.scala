package typings.expoXcpretty

import typings.expoXcpretty.anon.IsRootTarget
import typings.expoXcpretty.anon.Pod
import typings.expoXcpretty.anon.Podfile
import typings.expoXcpretty.anon.Target
import typings.expoXcpretty.anon.XcodeProject
import typings.expoXcpretty.buildUtilsParsePodfileLockMod.PodfileLock
import typings.expoXcpretty.expoXcprettyStrings._empty
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsPodfileTracerMod {
  
  @JSImport("@expo/xcpretty/build/utils/PodfileTracer", "PodfileTracer")
  @js.native
  open class PodfileTracer protected () extends StObject {
    def this(props: Podfile) = this()
    
    def getExternalSourceForPod(key: String): Pod | Null = js.native
    
    def getExternalSourceForPodWithoutCache(): Pod | Null = js.native
    def getExternalSourceForPodWithoutCache(pod: String): Pod | Null = js.native
    
    def getNodeModuleName(filePath: String): IsRootTarget | Null = js.native
    def getNodeModuleName(filePath: String, target: String): IsRootTarget | Null = js.native
    
    def getNodeModuleNameForTarget(key: String): IsRootTarget | Null = js.native
    
    def getNodeModuleNameForTargetWithoutCache(target: String): IsRootTarget | Null = js.native
    
    /** This can be a path like `/app/node_modules/expo-camera/ios` or `/app/node_modules/react-native-webrtc` depending on where the podspec is. */
    def getPackageJsonAnyFilePathInModule(props: Target): (Record[String, Any]) | Null = js.native
    
    def getPackageJsonAnyFilePathInModuleWithoutCache(filePath: String): (Record[String, Any]) | Null = js.native
    
    def isRootTarget(target: String): js.UndefOr[Boolean | _empty] = js.native
    
    /* private */ var memoizedGetPackageJsonAnyFilePathInModule: Any = js.native
    
    def podfile: PodfileLock = js.native
    
    var props: Podfile = js.native
  }
  /* static members */
  object PodfileTracer {
    
    @JSImport("@expo/xcpretty/build/utils/PodfileTracer", "PodfileTracer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(projectRoot: String): PodfileTracer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[PodfileTracer]
    inline def create(projectRoot: String, hasXcodeProject: XcodeProject): PodfileTracer = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(projectRoot.asInstanceOf[js.Any], hasXcodeProject.asInstanceOf[js.Any])).asInstanceOf[PodfileTracer]
  }
}
