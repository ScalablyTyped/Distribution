package typings.dojo.dojox.gfx3d.lighting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx3d/lighting.finish.html
  *
  *
  */
trait finish extends js.Object {
  /**
    *
    */
  var defaults: js.Object
  /**
    *
    */
  var dull: js.Object
  /**
    *
    */
  var glossy: js.Object
  /**
    *
    */
  var luminous: js.Object
  /**
    *
    */
  var metalA: js.Object
  /**
    *
    */
  var metalB: js.Object
  /**
    *
    */
  var metalC: js.Object
  /**
    *
    */
  var metalD: js.Object
  /**
    *
    */
  var metalE: js.Object
  /**
    *
    */
  var phong_dull: js.Object
  /**
    *
    */
  var phong_glossy: js.Object
  /**
    *
    */
  var phong_shiny: js.Object
  /**
    *
    */
  var shiny: js.Object
}

object finish {
  @scala.inline
  def apply(
    defaults: js.Object,
    dull: js.Object,
    glossy: js.Object,
    luminous: js.Object,
    metalA: js.Object,
    metalB: js.Object,
    metalC: js.Object,
    metalD: js.Object,
    metalE: js.Object,
    phong_dull: js.Object,
    phong_glossy: js.Object,
    phong_shiny: js.Object,
    shiny: js.Object
  ): finish = {
    val __obj = js.Dynamic.literal(defaults = defaults, dull = dull, glossy = glossy, luminous = luminous, metalA = metalA, metalB = metalB, metalC = metalC, metalD = metalD, metalE = metalE, phong_dull = phong_dull, phong_glossy = phong_glossy, phong_shiny = phong_shiny, shiny = shiny)
  
    __obj.asInstanceOf[finish]
  }
}

