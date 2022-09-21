package typings.expoXcpretty.anon

import typings.expoXcpretty.parsePodfileLockMod.PodfileLock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Podfile extends StObject {
  
  var podfile: PodfileLock
  
  var projectRoot: String
  
  var rootTargetName: js.UndefOr[String] = js.undefined
}
object Podfile {
  
  inline def apply(podfile: PodfileLock, projectRoot: String): Podfile = {
    val __obj = js.Dynamic.literal(podfile = podfile.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Podfile]
  }
  
  extension [Self <: Podfile](x: Self) {
    
    inline def setPodfile(value: PodfileLock): Self = StObject.set(x, "podfile", value.asInstanceOf[js.Any])
    
    inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
    
    inline def setRootTargetName(value: String): Self = StObject.set(x, "rootTargetName", value.asInstanceOf[js.Any])
    
    inline def setRootTargetNameUndefined: Self = StObject.set(x, "rootTargetName", js.undefined)
  }
}
