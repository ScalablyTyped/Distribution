package typings.dojo.dojox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gfx3d {
  type base = typings.dojo.dojox.gfx3d.base_
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
    /* model */ typings.dojo.dojox.gfx3d.lighting.Model, 
    /* material */ js.Object, 
    /* center */ js.Object, 
    /* radius */ scala.Double, 
    /* from */ scala.Double, 
    /* to */ scala.Double, 
    /* matrix */ js.Object, 
    scala.Unit
  ]
  type lighting = typings.dojo.dojox.gfx3d.lighting_
  type scheduler = typings.dojo.dojox.gfx3d.scheduler_
}
