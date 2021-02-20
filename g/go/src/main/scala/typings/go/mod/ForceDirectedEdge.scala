package typings.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This holds ForceDirectedLayout-specific information about Links.*/
@JSImport("go", "ForceDirectedEdge")
@js.native
/**
  * This constructs an edge that does not know about any Link.
  */
class ForceDirectedEdge () extends LayoutEdge {
  
  /**Gets or sets the length of this edge.*/
  var length: Double = js.native
  
  /**Gets or sets this edge's stiffness or resistence to compression or stretching.*/
  var stiffness: Double = js.native
}
