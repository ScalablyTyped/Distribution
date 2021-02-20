package typings.expo

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appLoadingNativeWrapperMod {
  
  @JSImport("expo/build/launch/AppLoadingNativeWrapper", JSImport.Default)
  @js.native
  class default protected () extends AppLoading {
    def this(props: Props) = this()
  }
  
  @js.native
  trait AppLoading
    extends Component[Props, js.Object, js.Any] {
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MAppLoading(): Unit = js.native
  }
  
  @js.native
  trait Props extends StObject {
    
    var autoHideSplash: js.UndefOr[Boolean] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoHideSplash(value: Boolean): Self = StObject.set(x, "autoHideSplash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHideSplashUndefined: Self = StObject.set(x, "autoHideSplash", js.undefined)
    }
  }
}
