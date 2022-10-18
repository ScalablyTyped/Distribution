package typings.expo

import org.scalablytyped.runtime.StringDictionary
import typings.expo.anon.Dictkey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLaunchWithExpoRootDottypesMod {
  
  trait InitialProps
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var exp: Dictkey
    
    var shell: js.UndefOr[Boolean] = js.undefined
    
    var shellManifestUrl: js.UndefOr[String] = js.undefined
  }
  object InitialProps {
    
    inline def apply(exp: Dictkey): InitialProps = {
      val __obj = js.Dynamic.literal(exp = exp.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitialProps]
    }
    
    extension [Self <: InitialProps](x: Self) {
      
      inline def setExp(value: Dictkey): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      inline def setShell(value: Boolean): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      inline def setShellManifestUrl(value: String): Self = StObject.set(x, "shellManifestUrl", value.asInstanceOf[js.Any])
      
      inline def setShellManifestUrlUndefined: Self = StObject.set(x, "shellManifestUrl", js.undefined)
      
      inline def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
    }
  }
}
