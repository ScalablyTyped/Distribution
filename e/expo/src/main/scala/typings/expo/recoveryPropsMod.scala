package typings.expo

import typings.expo.withExpoRootTypesMod.InitialProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recoveryPropsMod {
  
  @JSImport("expo/build/launch/RecoveryProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attachRecoveredProps[P /* <: InitialProps */](props: P): P = ^.asInstanceOf[js.Dynamic].applyDynamic("attachRecoveredProps")(props.asInstanceOf[js.Any]).asInstanceOf[P]
}
