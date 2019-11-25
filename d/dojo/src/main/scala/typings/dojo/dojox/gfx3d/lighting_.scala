package typings.dojo.dojox.gfx3d

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx3d/lighting.html
  *
  *
  */
@JSName("lighting")
trait lighting_ extends js.Object {
  /**
    *
    */
  var finish: js.Object
  /**
    *
    */
  def Model(): Unit
  /**
    *
    * @param a
    * @param b
    */
  def add(a: js.Any, b: js.Any): js.Object
  /**
    *
    * @param a
    * @param b
    */
  def addColor(a: js.Any, b: js.Any): js.Object
  /**
    *
    */
  def black(): js.Object
  /**
    *
    * @param c1
    * @param c2
    */
  def diff2Color(c1: js.Any, c2: js.Any): Double
  /**
    *
    * @param normal
    * @param lights
    */
  def diffuse(normal: js.Any, lights: js.Any): js.Any
  /**
    *
    * @param a
    * @param b
    */
  def dot(a: js.Any, b: js.Any): Double
  /**
    *
    * @param n
    * @param i
    */
  def faceforward(n: js.Any, i: js.Any): js.Any
  /**
    *
    * @param c
    */
  def fromStdColor(c: js.Any): js.Any
  /**
    *
    * @param v
    */
  def length(v: js.Any): js.Any
  /**
    *
    * @param c
    */
  def length2Color(c: js.Any): Double
  /**
    *
    * @param c1
    * @param c2
    * @param s
    */
  def mixColor(c1: js.Any, c2: js.Any, s: js.Any): js.Any
  /**
    *
    * @param a
    * @param b
    */
  def multiplyColor(a: js.Any, b: js.Any): js.Object
  /**
    *
    * @param v
    */
  def normalize(v: js.Any): js.Any
  /**
    *
    * @param normal
    * @param v
    * @param size
    * @param lights
    */
  def phong(normal: js.Any, v: js.Any, size: js.Any, lights: js.Any): js.Any
  /**
    *
    * @param i
    * @param n
    */
  def reflect(i: js.Any, n: js.Any): js.Any
  /**
    *
    * @param v
    */
  def saturate(v: js.Any): js.Any
  /**
    *
    * @param c
    */
  def saturateColor(c: js.Any): js.Object
  /**
    *
    * @param s
    * @param v
    */
  def scale(s: js.Any, v: js.Any): js.Object
  /**
    *
    * @param s
    * @param c
    */
  def scaleColor(s: js.Any, c: js.Any): js.Object
  /**
    *
    * @param normal
    * @param v
    * @param roughness
    * @param lights
    */
  def specular(normal: js.Any, v: js.Any, roughness: js.Any, lights: js.Any): js.Any
  /**
    *
    * @param c
    */
  def toStdColor(c: js.Any): js.Object
  /**
    *
    */
  def white(): js.Object
}

object lighting_ {
  @scala.inline
  def apply(
    Model: () => Unit,
    add: (js.Any, js.Any) => js.Object,
    addColor: (js.Any, js.Any) => js.Object,
    black: () => js.Object,
    diff2Color: (js.Any, js.Any) => Double,
    diffuse: (js.Any, js.Any) => js.Any,
    dot: (js.Any, js.Any) => Double,
    faceforward: (js.Any, js.Any) => js.Any,
    finish: js.Object,
    fromStdColor: js.Any => js.Any,
    length: js.Any => js.Any,
    length2Color: js.Any => Double,
    mixColor: (js.Any, js.Any, js.Any) => js.Any,
    multiplyColor: (js.Any, js.Any) => js.Object,
    normalize: js.Any => js.Any,
    phong: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    reflect: (js.Any, js.Any) => js.Any,
    saturate: js.Any => js.Any,
    saturateColor: js.Any => js.Object,
    scale: (js.Any, js.Any) => js.Object,
    scaleColor: (js.Any, js.Any) => js.Object,
    specular: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    toStdColor: js.Any => js.Object,
    white: () => js.Object
  ): lighting_ = {
    val __obj = js.Dynamic.literal(Model = js.Any.fromFunction0(Model), add = js.Any.fromFunction2(add), addColor = js.Any.fromFunction2(addColor), black = js.Any.fromFunction0(black), diff2Color = js.Any.fromFunction2(diff2Color), diffuse = js.Any.fromFunction2(diffuse), dot = js.Any.fromFunction2(dot), faceforward = js.Any.fromFunction2(faceforward), finish = finish.asInstanceOf[js.Any], fromStdColor = js.Any.fromFunction1(fromStdColor), length = js.Any.fromFunction1(length), length2Color = js.Any.fromFunction1(length2Color), mixColor = js.Any.fromFunction3(mixColor), multiplyColor = js.Any.fromFunction2(multiplyColor), normalize = js.Any.fromFunction1(normalize), phong = js.Any.fromFunction4(phong), reflect = js.Any.fromFunction2(reflect), saturate = js.Any.fromFunction1(saturate), saturateColor = js.Any.fromFunction1(saturateColor), scale = js.Any.fromFunction2(scale), scaleColor = js.Any.fromFunction2(scaleColor), specular = js.Any.fromFunction4(specular), toStdColor = js.Any.fromFunction1(toStdColor), white = js.Any.fromFunction0(white))
  
    __obj.asInstanceOf[lighting_]
  }
}

