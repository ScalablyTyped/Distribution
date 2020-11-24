package typings.fnandoSparkline.mod

import typings.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fnando/sparkline", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply[TEntry /* <: SparklineNativeEntry */](svg: SVGSVGElement, entries: js.Array[TEntry]): String = js.native
  def apply[TEntry /* <: SparklineNativeEntry */](svg: SVGSVGElement, entries: js.Array[TEntry], options: SparklineNativeOptions[TEntry]): String = js.native
  def apply[TEntry](svg: SVGSVGElement, entries: js.Array[TEntry], options: SparklineNonNativeOptions[TEntry]): String = js.native
}
