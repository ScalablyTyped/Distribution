package typings.egjsAxes

import org.scalablytyped.runtime.StringDictionary
import typings.egjsAxes.panInputMod.PanInputOption
import typings.egjsAxes.pinchInputMod.PinchInputOption
import typings.egjsAxes.typesMod.ObjectInterface
import typings.std.HTMLElement
import typings.std.NodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@egjs/axes/declaration/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def _empty(param: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("$")(param.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def _empty(param: Any, multi: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("$")(param.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def cancelAnimationFrame(key: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelAnimationFrame")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def equal(target: ObjectInterface[Any], base: ObjectInterface[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(target.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def every[T](obj: ObjectInterface[T], callback: js.Function2[/* value */ T, /* key */ String, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def filter[T](obj: ObjectInterface[T], callback: js.Function2[/* value */ T, /* key */ String, Boolean]): ObjectInterface[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ObjectInterface[T]]
  
  inline def getAngle(posX: Double, posY: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getAngle")(posX.asInstanceOf[js.Any], posY.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getDecimalPlace(`val`: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDecimalPlace")(`val`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getDirection(useHorizontal: Boolean, useVertical: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDirection")(useHorizontal.asInstanceOf[js.Any], useVertical.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getRoundFunc(v: Double): js.Function1[/* n */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRoundFunc")(v.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* n */ Double, Double]]
  
  inline def inversePow(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("inversePow")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isCssPropsFromAxes(originalCssProps: StringDictionary[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCssPropsFromAxes")(originalCssProps.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def map[T, U](obj: ObjectInterface[T], callback: js.Function2[/* value */ T, /* key */ String, U]): ObjectInterface[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ObjectInterface[U]]
  
  inline def requestAnimationFrame(fp: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAnimationFrame")(fp.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def revertCssProps(element: HTMLElement, originalCssProps: StringDictionary[String]): StringDictionary[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("revertCssProps")(element.asInstanceOf[js.Any], originalCssProps.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String]]
  
  inline def roundNumber(num: Double, roundUnit: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("roundNumber")(num.asInstanceOf[js.Any], roundUnit.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def roundNumbers(num: ObjectInterface[Double], roundUnit: Double): ObjectInterface[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("roundNumbers")(num.asInstanceOf[js.Any], roundUnit.asInstanceOf[js.Any])).asInstanceOf[ObjectInterface[Double]]
  inline def roundNumbers(num: ObjectInterface[Double], roundUnit: ObjectInterface[Double]): ObjectInterface[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("roundNumbers")(num.asInstanceOf[js.Any], roundUnit.asInstanceOf[js.Any])).asInstanceOf[ObjectInterface[Double]]
  
  inline def setCssProps(element: HTMLElement, option: PanInputOption, direction: Double): StringDictionary[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("setCssProps")(element.asInstanceOf[js.Any], option.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String]]
  inline def setCssProps(element: HTMLElement, option: PinchInputOption, direction: Double): StringDictionary[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("setCssProps")(element.asInstanceOf[js.Any], option.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String]]
  
  inline def toArray(nodes: NodeList): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
  
  inline def useDirection(checkType: Double, direction: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useDirection")(checkType.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def useDirection(checkType: Double, direction: Double, userDirection: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useDirection")(checkType.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], userDirection.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
