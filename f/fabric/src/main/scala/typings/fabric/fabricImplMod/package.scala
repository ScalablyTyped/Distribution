package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StringDictionary
import typings.fabric.anon.CrossOrigin
import typings.fabric.anon.Offset
import typings.fabric.fabricImplMod.^
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def copiedText: String = ^.asInstanceOf[js.Dynamic].selectDynamic("copiedText").asInstanceOf[String]

inline def copiedTextStyle: js.Array[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("copiedTextStyle").asInstanceOf[js.Array[Any]]
inline def copiedTextStyle_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("copiedTextStyle")(x.asInstanceOf[js.Any])

inline def copiedText_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("copiedText")(x.asInstanceOf[js.Any])

inline def createCanvasForNode(width: Double, height: Double): Canvas = (^.asInstanceOf[js.Dynamic].applyDynamic("createCanvasForNode")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Canvas]

inline def createSVGFontFacesMarkup(objects: js.Array[Object]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createSVGFontFacesMarkup")(objects.asInstanceOf[js.Any]).asInstanceOf[String]

inline def createSVGRefElementsMarkup(canvas: StaticCanvas): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createSVGRefElementsMarkup")(canvas.asInstanceOf[js.Any]).asInstanceOf[String]

inline def filterBackend: js.UndefOr[FilterBackend_] = ^.asInstanceOf[js.Dynamic].selectDynamic("filterBackend").asInstanceOf[js.UndefOr[FilterBackend_]]
inline def filterBackend_=(x: js.UndefOr[FilterBackend_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filterBackend")(x.asInstanceOf[js.Any])

inline def getCSSRules(doc: SVGElement): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCSSRules")(doc.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def getGradientDefs(doc: SVGElement): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGradientDefs")(doc.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]

inline def iMatrix: js.Array[Double] = ^.asInstanceOf[js.Dynamic].selectDynamic("iMatrix").asInstanceOf[js.Array[Double]]

inline def isLikelyNode: Boolean = ^.asInstanceOf[js.Dynamic].selectDynamic("isLikelyNode").asInstanceOf[Boolean]

inline def isTouchSupported: Boolean = ^.asInstanceOf[js.Dynamic].selectDynamic("isTouchSupported").asInstanceOf[Boolean]

inline def loadSVGFromString(string: String, callback: js.Function2[/* results */ js.Array[Object], /* options */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSVGFromString")(string.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def loadSVGFromString(
  string: String,
  callback: js.Function2[/* results */ js.Array[Object], /* options */ Any, Unit],
  reviver: js.Function
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSVGFromString")(string.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def loadSVGFromURL(url: String, callback: js.Function2[/* results */ js.Array[Object], /* options */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSVGFromURL")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def loadSVGFromURL(
  url: String,
  callback: js.Function2[/* results */ js.Array[Object], /* options */ Any, Unit],
  reviver: js.Function
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSVGFromURL")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def loadSVGFromURL(
  url: String,
  callback: js.Function2[/* results */ js.Array[Object], /* options */ Any, Unit],
  reviver: js.Function,
  options: CrossOrigin
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSVGFromURL")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def loadSVGFromURL(
  url: String,
  callback: js.Function2[/* results */ js.Array[Object], /* options */ Any, Unit],
  reviver: Unit,
  options: CrossOrigin
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSVGFromURL")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def log(values: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]

inline def parseAttributes(element: HTMLElement, attributes: js.Array[String]): StringDictionary[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAttributes")(element.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String]]
inline def parseAttributes(element: HTMLElement, attributes: js.Array[String], svgUid: String): StringDictionary[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAttributes")(element.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], svgUid.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String]]

inline def parseElements(elements: js.Array[SVGElement], callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseElements")(elements.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def parseElements(elements: js.Array[Any | SVGElement], callback: js.Function, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseElements")(elements.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def parseElements(elements: js.Array[Any | SVGElement], callback: js.Function, options: Any, reviver: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseElements")(elements.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def parseElements(elements: js.Array[SVGElement], callback: js.Function, options: Unit, reviver: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseElements")(elements.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def parseFontDeclaration(value: String, oStyle: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFontDeclaration")(value.asInstanceOf[js.Any], oStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def parsePointsAttribute(points: String): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePointsAttribute")(points.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]

inline def parseSVGDocument(doc: SVGElement, callback: js.Function2[/* results */ js.Array[Object], /* options */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSVGDocument")(doc.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def parseSVGDocument(
  doc: SVGElement,
  callback: js.Function2[/* results */ js.Array[Object], /* options */ Any, Unit],
  reviver: js.Function
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSVGDocument")(doc.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def parseStyleAttribute(element: SVGElement): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseStyleAttribute")(element.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def parseTransformAttribute(attributeValue: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTransformAttribute")(attributeValue.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]

inline def textureSize: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("textureSize").asInstanceOf[Double]
inline def textureSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textureSize")(x.asInstanceOf[js.Any])

inline def util: IUtil = ^.asInstanceOf[js.Dynamic].selectDynamic("util").asInstanceOf[IUtil]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

inline def warn(values: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]

type ControlMouseEventHandler = js.Function4[
/* eventData */ MouseEvent, 
/* transformData */ Transform, 
/* x */ Double, 
/* y */ Double, 
Boolean]

type IGradientOptionsColorStops = js.Array[Offset]

type ITriangleOptions = IObjectOptions

type IUtilAminEaseFunction = js.Function4[/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double, Double]

type Resources = StringDictionary[HTMLCanvasElement]
