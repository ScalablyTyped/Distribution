package typings.fabric.mod.fabric

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def copiedText: java.lang.String = typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].selectDynamic("copiedText").asInstanceOf[java.lang.String]

inline def copiedTextStyle: js.Array[js.Any] = typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].selectDynamic("copiedTextStyle").asInstanceOf[js.Array[js.Any]]
inline def copiedTextStyle_=(x: js.Array[js.Any]): scala.Unit = typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].updateDynamic("copiedTextStyle")(x.asInstanceOf[js.Any])

inline def copiedText_=(x: java.lang.String): scala.Unit = typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].updateDynamic("copiedText")(x.asInstanceOf[js.Any])

inline def createCanvasForNode(width: scala.Double, height: scala.Double): typings.fabric.fabricImplMod.Canvas = (typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].applyDynamic("createCanvasForNode")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.fabric.fabricImplMod.Canvas]

inline def createSVGFontFacesMarkup(objects: js.Array[typings.fabric.fabricImplMod.Object]): java.lang.String = typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].applyDynamic("createSVGFontFacesMarkup")(objects.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

inline def createSVGRefElementsMarkup(canvas: typings.fabric.fabricImplMod.StaticCanvas): java.lang.String = typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].applyDynamic("createSVGRefElementsMarkup")(canvas.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

inline def filterBackend: js.UndefOr[typings.fabric.fabricImplMod.FilterBackend_] = typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].selectDynamic("filterBackend").asInstanceOf[js.UndefOr[typings.fabric.fabricImplMod.FilterBackend_]]
inline def filterBackend_=(x: js.UndefOr[typings.fabric.fabricImplMod.FilterBackend_]): scala.Unit = typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].updateDynamic("filterBackend")(x.asInstanceOf[js.Any])

inline def getCSSRules(doc: typings.std.SVGElement): js.Any = typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].applyDynamic("getCSSRules")(doc.asInstanceOf[js.Any]).asInstanceOf[js.Any]

inline def getGradientDefs(doc: typings.std.SVGElement): org.scalablytyped.runtime.StringDictionary[js.Any] = typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].applyDynamic("getGradientDefs")(doc.asInstanceOf[js.Any]).asInstanceOf[org.scalablytyped.runtime.StringDictionary[js.Any]]

inline def iMatrix: js.Array[scala.Double] = typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].selectDynamic("iMatrix").asInstanceOf[js.Array[scala.Double]]

inline def isLikelyNode: scala.Boolean = typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].selectDynamic("isLikelyNode").asInstanceOf[scala.Boolean]

inline def isTouchSupported: scala.Boolean = typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].selectDynamic("isTouchSupported").asInstanceOf[scala.Boolean]

inline def loadSVGFromString(
  string: java.lang.String,
  callback: js.Function2[
  /* results */ js.Array[typings.fabric.fabricImplMod.Object], 
  /* options */ js.Any, 
  scala.Unit
]
): scala.Unit = (typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].applyDynamic("loadSVGFromString")(string.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def loadSVGFromString(
  string: java.lang.String,
  callback: js.Function2[
  /* results */ js.Array[typings.fabric.fabricImplMod.Object], 
  /* options */ js.Any, 
  scala.Unit
],
  reviver: js.Function
): scala.Unit = (typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].applyDynamic("loadSVGFromString")(string.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def loadSVGFromURL(
  url: java.lang.String,
  callback: js.Function2[
  /* results */ js.Array[typings.fabric.fabricImplMod.Object], 
  /* options */ js.Any, 
  scala.Unit
]
): scala.Unit = (typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].applyDynamic("loadSVGFromURL")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def loadSVGFromURL(
  url: java.lang.String,
  callback: js.Function2[
  /* results */ js.Array[typings.fabric.fabricImplMod.Object], 
  /* options */ js.Any, 
  scala.Unit
],
  reviver: js.Function
): scala.Unit = (typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].applyDynamic("loadSVGFromURL")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def loadSVGFromURL(
  url: java.lang.String,
  callback: js.Function2[
  /* results */ js.Array[typings.fabric.fabricImplMod.Object], 
  /* options */ js.Any, 
  scala.Unit
],
  reviver: js.Function,
  options: typings.fabric.anon.CrossOrigin
): scala.Unit = (typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].applyDynamic("loadSVGFromURL")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def loadSVGFromURL(
  url: java.lang.String,
  callback: js.Function2[
  /* results */ js.Array[typings.fabric.fabricImplMod.Object], 
  /* options */ js.Any, 
  scala.Unit
],
  reviver: scala.Unit,
  options: typings.fabric.anon.CrossOrigin
): scala.Unit = (typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].applyDynamic("loadSVGFromURL")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def log(values: js.Any*): scala.Unit = typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].applyDynamic("log")(values.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def parseAttributes(element: typings.std.HTMLElement, attributes: js.Array[java.lang.String]): org.scalablytyped.runtime.StringDictionary[java.lang.String] = (typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].applyDynamic("parseAttributes")(element.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[org.scalablytyped.runtime.StringDictionary[java.lang.String]]
inline def parseAttributes(element: typings.std.HTMLElement, attributes: js.Array[java.lang.String], svgUid: java.lang.String): org.scalablytyped.runtime.StringDictionary[java.lang.String] = (typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].applyDynamic("parseAttributes")(element.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], svgUid.asInstanceOf[js.Any])).asInstanceOf[org.scalablytyped.runtime.StringDictionary[java.lang.String]]

inline def parseElements(elements: js.Array[typings.std.SVGElement], callback: js.Function): scala.Unit = (typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].applyDynamic("parseElements")(elements.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def parseElements(elements: js.Array[js.Any | typings.std.SVGElement], callback: js.Function, options: js.Any): scala.Unit = (typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].applyDynamic("parseElements")(elements.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def parseElements(
  elements: js.Array[js.Any | typings.std.SVGElement],
  callback: js.Function,
  options: js.Any,
  reviver: js.Function
): scala.Unit = (typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].applyDynamic("parseElements")(elements.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def parseElements(
  elements: js.Array[typings.std.SVGElement],
  callback: js.Function,
  options: scala.Unit,
  reviver: js.Function
): scala.Unit = (typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].applyDynamic("parseElements")(elements.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def parseFontDeclaration(value: java.lang.String, oStyle: js.Any): scala.Unit = (typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].applyDynamic("parseFontDeclaration")(value.asInstanceOf[js.Any], oStyle.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def parsePointsAttribute(points: java.lang.String): js.Array[js.Any] = typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].applyDynamic("parsePointsAttribute")(points.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]

inline def parseSVGDocument(
  doc: typings.std.SVGElement,
  callback: js.Function2[
  /* results */ js.Array[typings.fabric.fabricImplMod.Object], 
  /* options */ js.Any, 
  scala.Unit
]
): scala.Unit = (typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].applyDynamic("parseSVGDocument")(doc.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def parseSVGDocument(
  doc: typings.std.SVGElement,
  callback: js.Function2[
  /* results */ js.Array[typings.fabric.fabricImplMod.Object], 
  /* options */ js.Any, 
  scala.Unit
],
  reviver: js.Function
): scala.Unit = (typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].applyDynamic("parseSVGDocument")(doc.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def parseStyleAttribute(element: typings.std.SVGElement): js.Any = typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].applyDynamic("parseStyleAttribute")(element.asInstanceOf[js.Any]).asInstanceOf[js.Any]

inline def parseTransformAttribute(attributeValue: java.lang.String): js.Array[scala.Double] = typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].applyDynamic("parseTransformAttribute")(attributeValue.asInstanceOf[js.Any]).asInstanceOf[js.Array[scala.Double]]

inline def textureSize: scala.Double = typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].selectDynamic("textureSize").asInstanceOf[scala.Double]
inline def textureSize_=(x: scala.Double): scala.Unit = typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].updateDynamic("textureSize")(x.asInstanceOf[js.Any])

inline def util: typings.fabric.fabricImplMod.IUtil = typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].selectDynamic("util").asInstanceOf[typings.fabric.fabricImplMod.IUtil]

inline def version: java.lang.String = typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]

inline def warn(values: js.Any*): scala.Unit = typings.fabric.mod.fabric.^.asInstanceOf[js.Dynamic].applyDynamic("warn")(values.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
