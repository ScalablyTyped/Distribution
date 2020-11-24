package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FilterType_ extends js.Object
@JSGlobal("ej.FilterType")
@js.native
object FilterType_ extends js.Object {
  
  //filter the data wherever contains search key
  @js.native
  sealed trait Contains extends FilterType_
  
  //filter the data based on search key present at start position
  @js.native
  sealed trait StartsWith extends FilterType_
}
