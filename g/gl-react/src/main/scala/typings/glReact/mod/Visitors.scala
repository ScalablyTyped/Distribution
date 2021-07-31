package typings.glReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Visitors {
  
  @JSImport("gl-react", "Visitors")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def add(visitor: Visitor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(visitor.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def get(): js.Array[Visitor] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Array[Visitor]]
  
  @scala.inline
  def remove(visitor: Visitor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(visitor.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
