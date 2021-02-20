package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ButtonSize extends StObject
@JSGlobal("ej.ButtonSize")
@js.native
object ButtonSize extends StObject {
  
  //Creates button with Built-in large size height, width specified
  @js.native
  sealed trait Large extends ButtonSize
  
  //Creates button with Built-in medium size height, width specified
  @js.native
  sealed trait Medium extends ButtonSize
  
  //Creates button with Built-in mini size height, width specified
  @js.native
  sealed trait Mini extends ButtonSize
  
  //Creates button with Built-in default size height, width specified
  @js.native
  sealed trait Normal extends ButtonSize
  
  //Creates button with Built-in small size height, width specified
  @js.native
  sealed trait Small extends ButtonSize
}
