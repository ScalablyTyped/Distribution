package typings.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AlignType extends js.Object
@JSGlobal("ej.Ribbon.AlignType")
@js.native
object AlignType extends js.Object {
  
  ///To align group content's in columns
  @js.native
  sealed trait Columns extends AlignType
  
  ///To align the group content's in row
  @js.native
  sealed trait Rows extends AlignType
}
