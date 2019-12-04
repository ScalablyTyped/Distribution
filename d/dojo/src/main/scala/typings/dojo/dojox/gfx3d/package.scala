package typings.dojo.dojox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gfx3d {
  import typings.dojo.dojox.gfx3d.lighting.Model

  type _base = _base_
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx3d/gradient.html
    *
    * calculate a cylindrical gradient
    *
    * @param model color model
    * @param material defines visual properties
    * @param center center of the cylinder's bottom
    * @param radius radius of the cylinder
    * @param from from position in radians
    * @param to from position in radians
    * @param matrix the cumulative transformation matrix
    */
  type gradient = js.Function7[
    /* model */ Model, 
    /* material */ js.Object, 
    /* center */ js.Object, 
    /* radius */ Double, 
    /* from */ Double, 
    /* to */ Double, 
    /* matrix */ js.Object, 
    Unit
  ]
  type lighting = lighting_
  type scheduler = scheduler_
}
