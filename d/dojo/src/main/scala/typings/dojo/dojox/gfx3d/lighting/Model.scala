package typings.dojo.dojox.gfx3d.lighting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx3d/lighting.Model.html
  *
  *
  * @param incident
  * @param lights
  * @param ambient
  * @param specular
  */
@JSGlobal("dojox.gfx3d.lighting.Model")
@js.native
class Model protected () extends js.Object {
  def this(incident: js.Any, lights: js.Any, ambient: js.Any, specular: js.Any) = this()
  /**
    *
    * @param normal
    * @param finish
    * @param pigment
    */
  def constant(normal: js.Any, finish: js.Any, pigment: js.Any): js.Any = js.native
  /**
    *
    * @param normal
    * @param finish
    * @param pigment
    */
  def matte(normal: js.Any, finish: js.Any, pigment: js.Any): js.Any = js.native
  /**
    *
    * @param normal
    * @param finish
    * @param pigment
    */
  def metal(normal: js.Any, finish: js.Any, pigment: js.Any): js.Any = js.native
  /**
    *
    * @param normal
    * @param finish
    * @param pigment
    */
  def npr(normal: js.Any, finish: js.Any, pigment: js.Any): js.Any = js.native
  /**
    *
    * @param normal
    * @param finish
    * @param pigment
    */
  def plastic(normal: js.Any, finish: js.Any, pigment: js.Any): js.Any = js.native
}

