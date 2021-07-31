package typings.expoErrorRecovery

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object erroRecoveryStoreMod {
  
  @JSImport("expo-error-recovery/build/ErroRecoveryStore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getRecoveryPropsToSave(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getRecoveryPropsToSave")().asInstanceOf[String | Null]
  
  @scala.inline
  def setRecoveryPropsToSave(props: StringDictionary[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRecoveryPropsToSave")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
