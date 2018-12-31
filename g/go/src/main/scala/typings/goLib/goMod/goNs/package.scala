package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object goNs {
  /** A string in place of a Brush object is treated as a Solid Brush of that color. */
  type BrushLike = Brush | java.lang.String
  /** This holds CircularLayout-specific information about Links.*/
  type CircularEdge = LayoutEdge
  type CircularNetwork = LayoutNetwork
  /** A constructor */
  type Constructor = org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, js.Object]
  type ForceDirectedNetwork = LayoutNetwork
  /** A Key is the type of the unique identifier managed by Models for each node data object. */
  type Key = java.lang.String | scala.Double
  type LayeredDigraphNetwork = LayoutNetwork
  /** A number in place of a Margin object is treated as a uniform Margin with that thickness */
  type MarginLike = Margin | scala.Double
  /**
    * Palette extends the Diagram class to allow objects to be dragged and placed onto other Diagrams.
    * Its Diagram.layout is a GridLayout.
    * The Palette is Diagram.isReadOnly but to support drag-and-drop its Diagram.allowDragOut is true.
    */
  type Palette = Diagram
  /** Either name a property or get the value of a property from an object. */
  type PropertyAccessor = java.lang.String | (js.Function2[/* data */ js.Any, /* newval */ js.Any, js.Any])
  type TreeNetwork = LayoutNetwork
}
