package typings.glReact.mod

import typings.glReact.anon.Obj
import typings.glReact.anon.Ratio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Uniform {
  
  @JSImport("gl-react", "Uniform")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gl-react", "Uniform.Backbuffer")
  @js.native
  val Backbuffer: String = js.native
  
  @JSImport("gl-react", "Uniform.Resolution")
  @js.native
  val Resolution: String = js.native
  
  @scala.inline
  def backbufferFrom(node: Bus): typings.glReact.anon.Node = ^.asInstanceOf[js.Dynamic].applyDynamic("backbufferFrom")(node.asInstanceOf[js.Any]).asInstanceOf[typings.glReact.anon.Node]
  @scala.inline
  def backbufferFrom(node: Node): typings.glReact.anon.Node = ^.asInstanceOf[js.Dynamic].applyDynamic("backbufferFrom")(node.asInstanceOf[js.Any]).asInstanceOf[typings.glReact.anon.Node]
  
  @scala.inline
  def textureSize(obj: js.Any): Obj = ^.asInstanceOf[js.Dynamic].applyDynamic("textureSize")(obj.asInstanceOf[js.Any]).asInstanceOf[Obj]
  
  @scala.inline
  def textureSizeRatio(obj: js.Any): Ratio = ^.asInstanceOf[js.Dynamic].applyDynamic("textureSizeRatio")(obj.asInstanceOf[js.Any]).asInstanceOf[Ratio]
}
