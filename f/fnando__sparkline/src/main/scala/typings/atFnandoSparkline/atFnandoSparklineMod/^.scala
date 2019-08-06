package typings.atFnandoSparkline.atFnandoSparklineMod

import typings.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@fnando/sparkline", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default[TEntry /* <: SparklineNativeEntry */](svg: SVGSVGElement, entries: js.Array[TEntry]): String = js.native
  def default[TEntry /* <: SparklineNativeEntry */](svg: SVGSVGElement, entries: js.Array[TEntry], options: SparklineNativeOptions[TEntry]): String = js.native
  def default[TEntry](svg: SVGSVGElement, entries: js.Array[TEntry], options: SparklineNonNativeOptions[TEntry]): String = js.native
  def sparkline[TEntry /* <: SparklineNativeEntry */](svg: SVGSVGElement, entries: js.Array[TEntry]): String = js.native
  def sparkline[TEntry /* <: SparklineNativeEntry */](svg: SVGSVGElement, entries: js.Array[TEntry], options: SparklineNativeOptions[TEntry]): String = js.native
  def sparkline[TEntry](svg: SVGSVGElement, entries: js.Array[TEntry], options: SparklineNonNativeOptions[TEntry]): String = js.native
}

