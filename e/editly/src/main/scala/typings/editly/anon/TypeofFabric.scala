package typings.editly.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.fabric.anon.CrossOrigin
import typings.fabric.fabricImplMod.Canvas
import typings.fabric.fabricImplMod.FilterBackend_
import typings.fabric.fabricImplMod.IUtil
import typings.fabric.fabricImplMod.Object
import typings.fabric.fabricImplMod.StaticCanvas
import typings.std.HTMLElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFabric extends StObject {
  
  var ActiveSelection: TypeofActiveSelection = js.native
  
  var BaseBrush: Instantiable0[typings.fabric.mod.fabric.BaseBrush] = js.native
  
  var Canvas: TypeofCanvas = js.native
  
  var Canvas2dFilterBackend: Instantiable0[typings.fabric.mod.fabric.Canvas2dFilterBackend] = js.native
  
  var Circle: TypeofCircle = js.native
  
  var CircleBrush: Instantiable0[typings.fabric.mod.fabric.CircleBrush] = js.native
  
  var Color: TypeofColor = js.native
  
  var Control: Instantiable0[typings.fabric.mod.fabric.Control] = js.native
  
  var Ellipse: TypeofEllipse = js.native
  
  var Gradient: TypeofGradient = js.native
  
  var Group: TypeofGroup = js.native
  
  var IText: TypeofIText = js.native
  
  var Image: TypeofImage = js.native
  
  var Intersection: TypeofIntersection = js.native
  
  var Line: TypeofLine = js.native
  
  var Object: TypeofObject = js.native
  
  var Path: TypeofPath = js.native
  
  var Pattern: Instantiable0[typings.fabric.mod.fabric.Pattern] = js.native
  
  var PatternBrush: Instantiable1[/* canvas */ Canvas, typings.fabric.mod.fabric.PatternBrush] = js.native
  
  var PencilBrush: Instantiable1[/* canvas */ Canvas, typings.fabric.mod.fabric.PencilBrush] = js.native
  
  var Point: Instantiable2[/* x */ Double, /* y */ Double, typings.fabric.mod.fabric.Point] = js.native
  
  var Polygon: TypeofPolygon = js.native
  
  var Polyline: TypeofPolyline = js.native
  
  var Rect: TypeofRect = js.native
  
  var Shadow: TypeofShadow = js.native
  
  var SprayBrush: Instantiable0[typings.fabric.mod.fabric.SprayBrush] = js.native
  
  var StaticCanvas: TypeofStaticCanvas = js.native
  
  var Text: TypeofText = js.native
  
  var Textbox: TypeofTextbox = js.native
  
  var Triangle: TypeofTriangle = js.native
  
  var WebglFilterBackend: Instantiable0[typings.fabric.mod.fabric.WebglFilterBackend] = js.native
  
  val charWidthsCache: Any = js.native
  
  var copiedText: String = js.native
  
  var copiedTextStyle: js.Array[Any] = js.native
  
  def createCanvasForNode(width: Double, height: Double): Canvas = js.native
  
  def createSVGFontFacesMarkup(objects: js.Array[Object]): String = js.native
  
  def createSVGRefElementsMarkup(canvas: StaticCanvas): String = js.native
  
  var filterBackend: js.UndefOr[FilterBackend_] = js.native
  
  def getCSSRules(doc: SVGElement): Any = js.native
  
  def getGradientDefs(doc: SVGElement): StringDictionary[Any] = js.native
  
  val iMatrix: js.Array[Double] = js.native
  
  val isLikelyNode: Boolean = js.native
  
  val isTouchSupported: Boolean = js.native
  
  def loadSVGFromString(string: String, callback: js.Function2[/* results */ js.Array[Object], /* options */ Any, Unit]): Unit = js.native
  def loadSVGFromString(
    string: String,
    callback: js.Function2[/* results */ js.Array[Object], /* options */ Any, Unit],
    reviver: js.Function
  ): Unit = js.native
  
  def loadSVGFromURL(url: String, callback: js.Function2[/* results */ js.Array[Object], /* options */ Any, Unit]): Unit = js.native
  def loadSVGFromURL(
    url: String,
    callback: js.Function2[/* results */ js.Array[Object], /* options */ Any, Unit],
    reviver: js.Function
  ): Unit = js.native
  def loadSVGFromURL(
    url: String,
    callback: js.Function2[/* results */ js.Array[Object], /* options */ Any, Unit],
    reviver: js.Function,
    options: CrossOrigin
  ): Unit = js.native
  def loadSVGFromURL(
    url: String,
    callback: js.Function2[/* results */ js.Array[Object], /* options */ Any, Unit],
    reviver: Unit,
    options: CrossOrigin
  ): Unit = js.native
  
  def log(values: Any*): Unit = js.native
  
  def parseAttributes(element: HTMLElement, attributes: js.Array[String]): StringDictionary[String] = js.native
  def parseAttributes(element: HTMLElement, attributes: js.Array[String], svgUid: String): StringDictionary[String] = js.native
  
  def parseElements(elements: js.Array[SVGElement], callback: js.Function): Unit = js.native
  def parseElements(elements: js.Array[Any | SVGElement], callback: js.Function, options: Any): Unit = js.native
  def parseElements(elements: js.Array[Any | SVGElement], callback: js.Function, options: Any, reviver: js.Function): Unit = js.native
  def parseElements(elements: js.Array[SVGElement], callback: js.Function, options: Unit, reviver: js.Function): Unit = js.native
  
  def parseFontDeclaration(value: String, oStyle: Any): Unit = js.native
  
  def parsePointsAttribute(points: String): js.Array[Any] = js.native
  
  def parseSVGDocument(doc: SVGElement, callback: js.Function2[/* results */ js.Array[Object], /* options */ Any, Unit]): Unit = js.native
  def parseSVGDocument(
    doc: SVGElement,
    callback: js.Function2[/* results */ js.Array[Object], /* options */ Any, Unit],
    reviver: js.Function
  ): Unit = js.native
  
  def parseStyleAttribute(element: SVGElement): Any = js.native
  
  def parseTransformAttribute(attributeValue: String): js.Array[Double] = js.native
  
  var textureSize: Double = js.native
  
  val util: IUtil = js.native
  
  val version: String = js.native
  
  def warn(values: Any*): Unit = js.native
}
