package typings.expo

import org.scalablytyped.runtime.StringDictionary
import typings.expo.anon.Dictkey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withExpoRootTypesMod {
  
  @js.native
  trait InitialProps
    extends /* key */ StringDictionary[js.Any] {
    
    var exp: Dictkey = js.native
    
    var shell: js.UndefOr[Boolean] = js.native
    
    var shellManifestUrl: js.UndefOr[String] = js.native
  }
  object InitialProps {
    
    @scala.inline
    def apply(exp: Dictkey): InitialProps = {
      val __obj = js.Dynamic.literal(exp = exp.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitialProps]
    }
    
    @scala.inline
    implicit class InitialPropsMutableBuilder[Self <: InitialProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExp(value: Dictkey): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShell(value: Boolean): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShellManifestUrl(value: String): Self = StObject.set(x, "shellManifestUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShellManifestUrlUndefined: Self = StObject.set(x, "shellManifestUrl", js.undefined)
      
      @scala.inline
      def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
    }
  }
}
