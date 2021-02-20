package typings.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This holds CircularLayout-specific information about Nodes.*/
@JSImport("go", "CircularVertex")
@js.native
/**
  * This constructs a vertex that does not know about any Node.
  */
class CircularVertex () extends LayoutVertex {
  
  /**Gets or sets the value used as the vertex's angle.*/
  var actualAngle: Double = js.native
  
  /**Gets or sets the value used as the vertex's diameter.*/
  var diameter: Double = js.native
}
