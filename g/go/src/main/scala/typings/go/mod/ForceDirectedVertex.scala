package typings.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This holds ForceDirectedLayout-specific information about Nodes.*/
@JSImport("go", "ForceDirectedVertex")
@js.native
/**
  * This constructs a vertex that does not know about any Node.
  */
open class ForceDirectedVertex () extends LayoutVertex {
  
  /**Gets or sets the electrical charge for this vertex.*/
  var charge: Double = js.native
  
  /**Gets or sets the cumulative force on the vertex in the X direction.*/
  var forceX: Double = js.native
  
  /**Gets or sets the cumulative force on the vertex in the Y direction.*/
  var forceY: Double = js.native
  
  /**Gets or sets whether the vertex may be moved by any forces.*/
  var isFixed: Boolean = js.native
  
  /**Gets or sets the gravitational mass for this vertex.*/
  var mass: Double = js.native
}
