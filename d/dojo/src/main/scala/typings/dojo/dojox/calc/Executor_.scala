package typings.dojo.dojox.calc

import typings.dojo.dojox.charting.Chart2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/calc/_Executor.html
  *
  *
  */
trait Executor_ extends js.Object {
  /**
    *
    */
  def FuncGen(): Unit
  /**
    *
    */
  def Grapher(): Unit
  /**
    * Return a less exact approximation of r such that approx(r * (1 +- eps)) == approx(r)
    *
    * @param r
    */
  def approx(r: Double): Double
  /**
    * graph a chart with the given function.
    *
    * @param chart
    * @param functionToGraph Function with one numeric parameter (x or y typically)
    * @param params can contain the number of the graph in the chart it is (an integer), a boolean saying if the functionToGraph is a function of x (otherwise y)and the color, which is an object with a stroke with a color's name eg: color:{stroke:"black"}
    */
  def draw(chart: Chart2D, functionToGraph: js.Function, params: js.Object): js.Any
  /**
    * create the points with information about the graph.
    *
    * @param funcToGraph A function with one numeric parameter (x or y typically)
    * @param x x and y are Strings which always have the values of "x" or "y".  If y="x" and x="y" then it is creating points for the function as though it was a function of y
    * @param y x and y are Strings which always have the values of "x" or "y".  If y="x" and x="y" then it is creating points for the function as though it was a function of y
    * @param width pixel width of the chart
    * @param minX minX, maxX, minY, and maxY are all bounds of the chart.  If x="y" then maxY should be the maximum bound of x rather than y
    * @param maxX minX, maxX, minY, and maxY are all bounds of the chart.  If x="y" then maxY should be the maximum bound of x rather than y
    * @param minY minX, maxX, minY, and maxY are all bounds of the chart.  If x="y" then maxY should be the maximum bound of x rather than y
    * @param maxY minX, maxX, minY, and maxY are all bounds of the chart.  If x="y" then maxY should be the maximum bound of x rather than y
    */
  def generatePoints(
    funcToGraph: js.Function,
    x: String,
    y: String,
    width: Double,
    minX: Double,
    maxX: Double,
    minY: Double,
    maxY: Double
  ): js.Object
  /**
    *
    * @param base
    * @param exponent
    */
  def pow(base: js.Any, exponent: js.Any): js.Any
  /**
    *
    * @param number
    */
  def toFrac(number: js.Any): js.Any
}

object Executor_ {
  @scala.inline
  def apply(
    FuncGen: () => Unit,
    Grapher: () => Unit,
    approx: Double => Double,
    draw: (Chart2D, js.Function, js.Object) => js.Any,
    generatePoints: (js.Function, String, String, Double, Double, Double, Double, Double) => js.Object,
    pow: (js.Any, js.Any) => js.Any,
    toFrac: js.Any => js.Any
  ): Executor_ = {
    val __obj = js.Dynamic.literal(FuncGen = js.Any.fromFunction0(FuncGen), Grapher = js.Any.fromFunction0(Grapher), approx = js.Any.fromFunction1(approx), draw = js.Any.fromFunction3(draw), generatePoints = js.Any.fromFunction8(generatePoints), pow = js.Any.fromFunction2(pow), toFrac = js.Any.fromFunction1(toFrac))
    __obj.asInstanceOf[Executor_]
  }
}

