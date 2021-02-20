package typings.emotionSerialize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Anim extends StObject {
    
    var anim: Double = js.native
    
    var name: String = js.native
    
    var styles: String = js.native
  }
  object Anim {
    
    @scala.inline
    def apply(anim: Double, name: String, styles: String): Anim = {
      val __obj = js.Dynamic.literal(anim = anim.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[Anim]
    }
    
    @scala.inline
    implicit class AnimMutableBuilder[Self <: Anim] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnim(value: Double): Self = StObject.set(x, "anim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyles(value: String): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    }
  }
}
