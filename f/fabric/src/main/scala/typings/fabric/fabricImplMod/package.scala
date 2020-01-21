package typings.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fabricImplMod {
  type IGradientOptionsColorStops = js.Array[typings.fabric.AnonColor]
  type ITriangleOptions = typings.fabric.fabricImplMod.IObjectOptions
  type IUtilAminEaseFunction = js.Function4[
    /* t */ scala.Double, 
    /* b */ scala.Double, 
    /* c */ scala.Double, 
    /* d */ scala.Double, 
    scala.Double
  ]
  type Resources = org.scalablytyped.runtime.StringDictionary[typings.std.HTMLCanvasElement]
}
