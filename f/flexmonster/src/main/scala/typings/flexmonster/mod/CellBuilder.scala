package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellBuilder extends StObject {
  
  def addClass(): Unit = js.native
  def addClass(value: String): Unit = js.native
  
  var attr: js.UndefOr[js.Object] = js.native
  
  var classes: js.UndefOr[js.Array[String]] = js.native
  
  var style: js.UndefOr[js.Object] = js.native
  
  var tag: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  def toHtml(): String = js.native
}
