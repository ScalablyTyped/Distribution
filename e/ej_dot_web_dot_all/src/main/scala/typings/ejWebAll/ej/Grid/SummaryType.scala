package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SummaryType extends js.Object
@JSGlobal("ej.Grid.SummaryType")
@js.native
object SummaryType extends js.Object {
  
  ///Summary type is average.
  @js.native
  sealed trait Average extends SummaryType
  
  ///Summary type is count.
  @js.native
  sealed trait Count extends SummaryType
  
  ///Summary type is custom.
  @js.native
  sealed trait Custom extends SummaryType
  
  ///Summary type is false count.
  @js.native
  sealed trait FalseCount extends SummaryType
  
  ///Summary type is maximum.
  @js.native
  sealed trait Maximum extends SummaryType
  
  ///Summary type is minimum.
  @js.native
  sealed trait Minimum extends SummaryType
  
  ///Summary type is sum.
  @js.native
  sealed trait Sum extends SummaryType
  
  ///Summary type is true count.
  @js.native
  sealed trait TrueCount extends SummaryType
}
