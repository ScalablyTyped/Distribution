package typings.estree.ESTree

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnionTypeAnnotation
  extends StObject
     with Node {
  
  var types: js.Array[FlowTypeAnnotation] = js.native
}
