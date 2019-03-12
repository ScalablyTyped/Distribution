package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric/fabric-impl", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var filterBackend: FilterBackend = js.native
  val isLikelyNode: scala.Boolean = js.native
  val isTouchSupported: scala.Boolean = js.native
  val util: IUtil = js.native
  def createCanvasForNode(width: scala.Double, height: scala.Double): Canvas = js.native
  def createSVGFontFacesMarkup(objects: js.Array[Object]): java.lang.String = js.native
  def createSVGRefElementsMarkup(canvas: StaticCanvas): java.lang.String = js.native
  def getCSSRules(doc: stdLib.SVGElement): js.Any = js.native
  def getGradientDefs(doc: stdLib.SVGElement): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def loadSVGFromString(
    string: java.lang.String,
    callback: js.Function2[/* results */ js.Array[Object], /* options */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def loadSVGFromString(
    string: java.lang.String,
    callback: js.Function2[/* results */ js.Array[Object], /* options */ js.Any, scala.Unit],
    reviver: js.Function
  ): scala.Unit = js.native
  def loadSVGFromURL(
    url: java.lang.String,
    callback: js.Function2[/* results */ js.Array[Object], /* options */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def loadSVGFromURL(
    url: java.lang.String,
    callback: js.Function2[/* results */ js.Array[Object], /* options */ js.Any, scala.Unit],
    reviver: js.Function
  ): scala.Unit = js.native
  def log(values: js.Any*): scala.Unit = js.native
  def parseAttributes(element: stdLib.HTMLElement, attributes: js.Array[java.lang.String]): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def parseAttributes(element: stdLib.HTMLElement, attributes: js.Array[java.lang.String], svgUid: java.lang.String): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def parseElements(elements: js.Array[stdLib.SVGElement], callback: js.Function): scala.Unit = js.native
  def parseElements(elements: js.Array[_ | stdLib.SVGElement], callback: js.Function, options: js.Any): scala.Unit = js.native
  def parseElements(
    elements: js.Array[_ | stdLib.SVGElement],
    callback: js.Function,
    options: js.Any,
    reviver: js.Function
  ): scala.Unit = js.native
  def parseFontDeclaration(value: java.lang.String, oStyle: js.Any): scala.Unit = js.native
  def parsePointsAttribute(points: java.lang.String): js.Array[_] = js.native
  def parseSVGDocument(
    doc: stdLib.SVGElement,
    callback: js.Function2[/* results */ js.Array[Object], /* options */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def parseSVGDocument(
    doc: stdLib.SVGElement,
    callback: js.Function2[/* results */ js.Array[Object], /* options */ js.Any, scala.Unit],
    reviver: js.Function
  ): scala.Unit = js.native
  def parseStyleAttribute(element: stdLib.SVGElement): js.Any = js.native
  def parseTransformAttribute(attributeValue: java.lang.String): js.Array[scala.Double] = js.native
  def warn(values: js.Any*): scala.Unit = js.native
}

