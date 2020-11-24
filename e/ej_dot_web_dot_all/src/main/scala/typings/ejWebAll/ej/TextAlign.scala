package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextAlign extends js.Object
@JSGlobal("ej.TextAlign")
@js.native
object TextAlign extends js.Object {
  
  //string
  @js.native
  sealed trait Center extends TextAlign
  
  //string
  @js.native
  sealed trait Justify extends TextAlign
  
  //string
  @js.native
  sealed trait Left extends TextAlign
  
  //string
  @js.native
  sealed trait Right extends TextAlign
}
