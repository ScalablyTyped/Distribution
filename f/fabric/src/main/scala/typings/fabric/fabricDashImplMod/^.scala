package typings.fabric.fabricDashImplMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric/fabric-impl", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var filterBackend: js.UndefOr[FilterBackend] = js.native
  val isLikelyNode: Boolean = js.native
  val isTouchSupported: Boolean = js.native
  var textureSize: Double = js.native
  val util: IUtil = js.native
  val version: String = js.native
  def createCanvasForNode(width: Double, height: Double): Canvas = js.native
  def createSVGFontFacesMarkup(objects: js.Array[Object]): String = js.native
  def createSVGRefElementsMarkup(canvas: StaticCanvas): String = js.native
  def getCSSRules(doc: SVGElement): js.Any = js.native
  def getGradientDefs(doc: SVGElement): StringDictionary[js.Any] = js.native
  def loadSVGFromString(string: String, callback: js.Function2[/* results */ js.Array[Object], /* options */ js.Any, Unit]): Unit = js.native
  def loadSVGFromString(
    string: String,
    callback: js.Function2[/* results */ js.Array[Object], /* options */ js.Any, Unit],
    reviver: js.Function
  ): Unit = js.native
  def loadSVGFromURL(url: String, callback: js.Function2[/* results */ js.Array[Object], /* options */ js.Any, Unit]): Unit = js.native
  def loadSVGFromURL(
    url: String,
    callback: js.Function2[/* results */ js.Array[Object], /* options */ js.Any, Unit],
    reviver: js.Function
  ): Unit = js.native
  def log(values: js.Any*): Unit = js.native
  def parseAttributes(element: HTMLElement, attributes: js.Array[String]): StringDictionary[String] = js.native
  def parseAttributes(element: HTMLElement, attributes: js.Array[String], svgUid: String): StringDictionary[String] = js.native
  def parseElements(elements: js.Array[SVGElement], callback: js.Function): Unit = js.native
  def parseElements(elements: js.Array[_ | SVGElement], callback: js.Function, options: js.Any): Unit = js.native
  def parseElements(elements: js.Array[_ | SVGElement], callback: js.Function, options: js.Any, reviver: js.Function): Unit = js.native
  def parseFontDeclaration(value: String, oStyle: js.Any): Unit = js.native
  def parsePointsAttribute(points: String): js.Array[_] = js.native
  def parseSVGDocument(
    doc: SVGElement,
    callback: js.Function2[/* results */ js.Array[Object], /* options */ js.Any, Unit]
  ): Unit = js.native
  def parseSVGDocument(
    doc: SVGElement,
    callback: js.Function2[/* results */ js.Array[Object], /* options */ js.Any, Unit],
    reviver: js.Function
  ): Unit = js.native
  def parseStyleAttribute(element: SVGElement): js.Any = js.native
  def parseTransformAttribute(attributeValue: String): js.Array[Double] = js.native
  def warn(values: js.Any*): Unit = js.native
}

