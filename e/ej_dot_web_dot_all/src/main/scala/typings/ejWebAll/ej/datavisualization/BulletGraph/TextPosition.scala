package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextPosition extends js.Object

@JSGlobal("ej.datavisualization.BulletGraph.TextPosition")
@js.native
object TextPosition extends js.Object {
  //string
  @js.native
  sealed trait Bottom extends TextPosition
  
  //string
  @js.native
  sealed trait Float extends TextPosition
  
  //string
  @js.native
  sealed trait Left extends TextPosition
  
  //string
  @js.native
  sealed trait Right extends TextPosition
  
  //string
  @js.native
  sealed trait Top extends TextPosition
  
}

