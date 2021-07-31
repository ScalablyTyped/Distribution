package typings.entriaRelayExperimental

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.relayRuntime.relayStoreTypesMod.Environment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayEnvironmentProviderMod {
  
  @JSImport("@entria/relay-experimental/lib/RelayEnvironmentProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def RelayEnvironmentProvider(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("RelayEnvironmentProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    var children: ReactNode
    
    var environment: Environment
  }
  object Props {
    
    @scala.inline
    def apply(environment: Environment): Props = {
      val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    }
  }
}
