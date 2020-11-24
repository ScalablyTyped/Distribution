package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ResizeMode extends js.Object
@JSGlobal("ej.Grid.ResizeMode")
@js.native
object ResizeMode extends js.Object {
  
  ///New column Size will be adjusted using entire control
  @js.native
  sealed trait Control extends ResizeMode
  
  ///New column Size will be adjusted using next column.
  @js.native
  sealed trait NextColumn extends ResizeMode
  
  ///New column size will be adjusted by all other Columns
  @js.native
  sealed trait Normal extends ResizeMode
}
