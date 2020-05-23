package typings.ejWebAll.ej.Sunburst

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstHighlightType extends js.Object

@JSGlobal("ej.Sunburst.SunburstHighlightType")
@js.native
object SunburstHighlightType extends js.Object {
  //string
  @js.native
  sealed trait Color extends SunburstHighlightType
  
  //string
  @js.native
  sealed trait Opacity extends SunburstHighlightType
  
}

