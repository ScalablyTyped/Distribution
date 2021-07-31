package typings.edmondsBlossom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(edges: js.Array[js.Array[Double]]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].apply(edges.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  @scala.inline
  def apply(edges: js.Array[js.Array[Double]], maxCardinality: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].apply(edges.asInstanceOf[js.Any], maxCardinality.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @JSImport("edmonds-blossom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
