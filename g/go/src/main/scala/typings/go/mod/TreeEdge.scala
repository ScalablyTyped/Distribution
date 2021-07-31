package typings.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This holds TreeLayout-specific information about Links.*/
@JSImport("go", "TreeEdge")
@js.native
/**
  * This constructs an edge that does not know about any Link.
  */
class TreeEdge () extends LayoutEdge {
  
  /**Gets or sets a Point, relative to the parent node, that may be useful in routing this link.*/
  var relativePoint: Point = js.native
}
