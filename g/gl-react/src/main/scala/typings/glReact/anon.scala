package typings.glReact

import typings.glReact.mod.Bus
import typings.glReact.mod.Surface
import typings.glReact.mod.Vec4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Color extends StObject {
    
    var color: Vec4
  }
  object Color {
    
    inline def apply(color: Vec4): Color = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color]
    }
    
    extension [Self <: Color](x: Self) {
      
      inline def setColor(value: Vec4): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dst extends StObject {
    
    def dst(): Unit
    
    def src(): Unit
  }
  object Dst {
    
    inline def apply(dst: () => Unit, src: () => Unit): Dst = {
      val __obj = js.Dynamic.literal(dst = js.Any.fromFunction0(dst), src = js.Any.fromFunction0(src))
      __obj.asInstanceOf[Dst]
    }
    
    extension [Self <: Dst](x: Self) {
      
      inline def setDst(value: () => Unit): Self = StObject.set(x, "dst", js.Any.fromFunction0(value))
      
      inline def setSrc(value: () => Unit): Self = StObject.set(x, "src", js.Any.fromFunction0(value))
    }
  }
  
  trait GetGLSize extends StObject {
    
    def getGLSize(): js.Tuple2[Double, Double]
  }
  object GetGLSize {
    
    inline def apply(getGLSize: () => js.Tuple2[Double, Double]): GetGLSize = {
      val __obj = js.Dynamic.literal(getGLSize = js.Any.fromFunction0(getGLSize))
      __obj.asInstanceOf[GetGLSize]
    }
    
    extension [Self <: GetGLSize](x: Self) {
      
      inline def setGetGLSize(value: () => js.Tuple2[Double, Double]): Self = StObject.set(x, "getGLSize", js.Any.fromFunction0(value))
    }
  }
  
  trait GlParent extends StObject {
    
    var glParent: Surface[js.Any] | typings.glReact.mod.Node
    
    var glSurface: Surface[js.Any]
  }
  object GlParent {
    
    inline def apply(glParent: Surface[js.Any] | typings.glReact.mod.Node, glSurface: Surface[js.Any]): GlParent = {
      val __obj = js.Dynamic.literal(glParent = glParent.asInstanceOf[js.Any], glSurface = glSurface.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlParent]
    }
    
    extension [Self <: GlParent](x: Self) {
      
      inline def setGlParent(value: Surface[js.Any] | typings.glReact.mod.Node): Self = StObject.set(x, "glParent", value.asInstanceOf[js.Any])
      
      inline def setGlSurface(value: Surface[js.Any]): Self = StObject.set(x, "glSurface", value.asInstanceOf[js.Any])
    }
  }
  
  trait GlParentAny extends StObject {
    
    var glParent: js.Any
  }
  object GlParentAny {
    
    inline def apply(glParent: js.Any): GlParentAny = {
      val __obj = js.Dynamic.literal(glParent = glParent.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlParentAny]
    }
    
    extension [Self <: GlParentAny](x: Self) {
      
      inline def setGlParent(value: js.Any): Self = StObject.set(x, "glParent", value.asInstanceOf[js.Any])
    }
  }
  
  trait GlParentBus extends StObject {
    
    var glParent: Bus
  }
  object GlParentBus {
    
    inline def apply(glParent: Bus): GlParentBus = {
      val __obj = js.Dynamic.literal(glParent = glParent.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlParentBus]
    }
    
    extension [Self <: GlParentBus](x: Self) {
      
      inline def setGlParent(value: Bus): Self = StObject.set(x, "glParent", value.asInstanceOf[js.Any])
    }
  }
  
  trait GlSurface extends StObject {
    
    var glParent: js.Any
    
    var glSurface: js.Any
  }
  object GlSurface {
    
    inline def apply(glParent: js.Any, glSurface: js.Any): GlSurface = {
      val __obj = js.Dynamic.literal(glParent = glParent.asInstanceOf[js.Any], glSurface = glSurface.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlSurface]
    }
    
    extension [Self <: GlSurface](x: Self) {
      
      inline def setGlParent(value: js.Any): Self = StObject.set(x, "glParent", value.asInstanceOf[js.Any])
      
      inline def setGlSurface(value: js.Any): Self = StObject.set(x, "glSurface", value.asInstanceOf[js.Any])
    }
  }
  
  trait Node extends StObject {
    
    var node: typings.glReact.mod.Node | Bus
    
    var `type`: String
  }
  object Node {
    
    inline def apply(node: typings.glReact.mod.Node | Bus, `type`: String): Node = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setNode(value: typings.glReact.mod.Node | Bus): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Obj extends StObject {
    
    var obj: js.Any
    
    var `type`: String
  }
  object Obj {
    
    inline def apply(obj: js.Any, `type`: String): Obj = {
      val __obj = js.Dynamic.literal(obj = obj.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Obj]
    }
    
    extension [Self <: Obj](x: Self) {
      
      inline def setObj(value: js.Any): Self = StObject.set(x, "obj", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ratio extends StObject {
    
    var obj: js.Any
    
    var ratio: Boolean
    
    var `type`: String
  }
  object Ratio {
    
    inline def apply(obj: js.Any, ratio: Boolean, `type`: String): Ratio = {
      val __obj = js.Dynamic.literal(obj = obj.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ratio]
    }
    
    extension [Self <: Ratio](x: Self) {
      
      inline def setObj(value: js.Any): Self = StObject.set(x, "obj", value.asInstanceOf[js.Any])
      
      inline def setRatio(value: Boolean): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
