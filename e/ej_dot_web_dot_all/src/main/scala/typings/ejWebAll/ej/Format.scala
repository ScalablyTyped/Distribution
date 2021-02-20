package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Format extends StObject
@JSGlobal("ej.Format")
@js.native
object Format extends StObject {
  
  //To render the TagCloud items in cloud format
  @js.native
  sealed trait Cloud extends Format
  
  //To render the TagCloud items in list format
  @js.native
  sealed trait List extends Format
}
