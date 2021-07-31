package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def copiedText: java.lang.String = typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].selectDynamic("copiedText").asInstanceOf[java.lang.String]

@scala.inline
def copiedTextStyle: js.Array[js.Any] = typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].selectDynamic("copiedTextStyle").asInstanceOf[js.Array[js.Any]]
@scala.inline
def copiedTextStyle_=(x: js.Array[js.Any]): scala.Unit = typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].updateDynamic("copiedTextStyle")(x.asInstanceOf[js.Any])

@scala.inline
def copiedText_=(x: java.lang.String): scala.Unit = typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].updateDynamic("copiedText")(x.asInstanceOf[js.Any])

@scala.inline
def createCanvasForNode(width: scala.Double, height: scala.Double): typings.fabric.fabricImplMod.Canvas = (typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCanvasForNode")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.fabric.fabricImplMod.Canvas]

@scala.inline
def createSVGFontFacesMarkup(objects: js.Array[typings.fabric.fabricImplMod.Object]): java.lang.String = typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSVGFontFacesMarkup")(objects.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

@scala.inline
def createSVGRefElementsMarkup(canvas: typings.fabric.fabricImplMod.StaticCanvas): java.lang.String = typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSVGRefElementsMarkup")(canvas.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

@scala.inline
def filterBackend: js.UndefOr[typings.fabric.fabricImplMod.FilterBackend_] = typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].selectDynamic("filterBackend").asInstanceOf[js.UndefOr[typings.fabric.fabricImplMod.FilterBackend_]]
@scala.inline
def filterBackend_=(x: js.UndefOr[typings.fabric.fabricImplMod.FilterBackend_]): scala.Unit = typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].updateDynamic("filterBackend")(x.asInstanceOf[js.Any])

@scala.inline
def getCSSRules(doc: typings.std.SVGElement): js.Any = typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("getCSSRules")(doc.asInstanceOf[js.Any]).asInstanceOf[js.Any]

@scala.inline
def getGradientDefs(doc: typings.std.SVGElement): org.scalablytyped.runtime.StringDictionary[js.Any] = typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("getGradientDefs")(doc.asInstanceOf[js.Any]).asInstanceOf[org.scalablytyped.runtime.StringDictionary[js.Any]]

@scala.inline
def iMatrix: js.Array[scala.Double] = typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].selectDynamic("iMatrix").asInstanceOf[js.Array[scala.Double]]

@scala.inline
def isLikelyNode: scala.Boolean = typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].selectDynamic("isLikelyNode").asInstanceOf[scala.Boolean]

@scala.inline
def isTouchSupported: scala.Boolean = typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].selectDynamic("isTouchSupported").asInstanceOf[scala.Boolean]

@scala.inline
def loadSVGFromString(
  string: java.lang.String,
  callback: js.Function2[
  /* results */ js.Array[typings.fabric.fabricImplMod.Object], 
  /* options */ js.Any, 
  scala.Unit
]
): scala.Unit = (typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("loadSVGFromString")(string.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def loadSVGFromString(
  string: java.lang.String,
  callback: js.Function2[
  /* results */ js.Array[typings.fabric.fabricImplMod.Object], 
  /* options */ js.Any, 
  scala.Unit
],
  reviver: js.Function
): scala.Unit = (typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("loadSVGFromString")(string.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def loadSVGFromURL(
  url: java.lang.String,
  callback: js.Function2[
  /* results */ js.Array[typings.fabric.fabricImplMod.Object], 
  /* options */ js.Any, 
  scala.Unit
]
): scala.Unit = (typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("loadSVGFromURL")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def loadSVGFromURL(
  url: java.lang.String,
  callback: js.Function2[
  /* results */ js.Array[typings.fabric.fabricImplMod.Object], 
  /* options */ js.Any, 
  scala.Unit
],
  reviver: js.Function
): scala.Unit = (typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("loadSVGFromURL")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def loadSVGFromURL(
  url: java.lang.String,
  callback: js.Function2[
  /* results */ js.Array[typings.fabric.fabricImplMod.Object], 
  /* options */ js.Any, 
  scala.Unit
],
  reviver: js.Function,
  options: typings.fabric.anon.CrossOrigin
): scala.Unit = (typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("loadSVGFromURL")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def loadSVGFromURL(
  url: java.lang.String,
  callback: js.Function2[
  /* results */ js.Array[typings.fabric.fabricImplMod.Object], 
  /* options */ js.Any, 
  scala.Unit
],
  reviver: scala.Unit,
  options: typings.fabric.anon.CrossOrigin
): scala.Unit = (typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("loadSVGFromURL")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def log(values: js.Any*): scala.Unit = typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("log")(values.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def parseAttributes(element: typings.std.HTMLElement, attributes: js.Array[java.lang.String]): org.scalablytyped.runtime.StringDictionary[java.lang.String] = (typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseAttributes")(element.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[org.scalablytyped.runtime.StringDictionary[java.lang.String]]
@scala.inline
def parseAttributes(element: typings.std.HTMLElement, attributes: js.Array[java.lang.String], svgUid: java.lang.String): org.scalablytyped.runtime.StringDictionary[java.lang.String] = (typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseAttributes")(element.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], svgUid.asInstanceOf[js.Any])).asInstanceOf[org.scalablytyped.runtime.StringDictionary[java.lang.String]]

@scala.inline
def parseElements(elements: js.Array[typings.std.SVGElement], callback: js.Function): scala.Unit = (typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseElements")(elements.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def parseElements(elements: js.Array[js.Any | typings.std.SVGElement], callback: js.Function, options: js.Any): scala.Unit = (typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseElements")(elements.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def parseElements(
  elements: js.Array[js.Any | typings.std.SVGElement],
  callback: js.Function,
  options: js.Any,
  reviver: js.Function
): scala.Unit = (typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseElements")(elements.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def parseElements(
  elements: js.Array[typings.std.SVGElement],
  callback: js.Function,
  options: scala.Unit,
  reviver: js.Function
): scala.Unit = (typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseElements")(elements.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def parseFontDeclaration(value: java.lang.String, oStyle: js.Any): scala.Unit = (typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseFontDeclaration")(value.asInstanceOf[js.Any], oStyle.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def parsePointsAttribute(points: java.lang.String): js.Array[js.Any] = typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("parsePointsAttribute")(points.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]

@scala.inline
def parseSVGDocument(
  doc: typings.std.SVGElement,
  callback: js.Function2[
  /* results */ js.Array[typings.fabric.fabricImplMod.Object], 
  /* options */ js.Any, 
  scala.Unit
]
): scala.Unit = (typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseSVGDocument")(doc.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def parseSVGDocument(
  doc: typings.std.SVGElement,
  callback: js.Function2[
  /* results */ js.Array[typings.fabric.fabricImplMod.Object], 
  /* options */ js.Any, 
  scala.Unit
],
  reviver: js.Function
): scala.Unit = (typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseSVGDocument")(doc.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def parseStyleAttribute(element: typings.std.SVGElement): js.Any = typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseStyleAttribute")(element.asInstanceOf[js.Any]).asInstanceOf[js.Any]

@scala.inline
def parseTransformAttribute(attributeValue: java.lang.String): js.Array[scala.Double] = typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseTransformAttribute")(attributeValue.asInstanceOf[js.Any]).asInstanceOf[js.Array[scala.Double]]

@scala.inline
def textureSize: scala.Double = typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].selectDynamic("textureSize").asInstanceOf[scala.Double]
@scala.inline
def textureSize_=(x: scala.Double): scala.Unit = typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].updateDynamic("textureSize")(x.asInstanceOf[js.Any])

@scala.inline
def util: typings.fabric.fabricImplMod.IUtil = typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].selectDynamic("util").asInstanceOf[typings.fabric.fabricImplMod.IUtil]

@scala.inline
def version: java.lang.String = typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]

@scala.inline
def warn(values: js.Any*): scala.Unit = typings.fabric.fabricImplMod.^.asInstanceOf[js.Dynamic].applyDynamic("warn")(values.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

type IGradientOptionsColorStops = js.Array[typings.fabric.anon.Color]

type ITriangleOptions = typings.fabric.fabricImplMod.IObjectOptions

type IUtilAminEaseFunction = js.Function4[
/* t */ scala.Double, 
/* b */ scala.Double, 
/* c */ scala.Double, 
/* d */ scala.Double, 
scala.Double]

type Resources = org.scalablytyped.runtime.StringDictionary[typings.std.HTMLCanvasElement]
