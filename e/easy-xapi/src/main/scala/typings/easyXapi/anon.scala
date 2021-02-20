package typings.easyXapi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Level extends StObject {
    
    var level: String = js.native
    
    var name: String = js.native
  }
  object Level {
    
    @scala.inline
    def apply(level: String, name: String): Level = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Level]
    }
    
    @scala.inline
    implicit class LevelMutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Partial extends StObject {
    
    var partial: Boolean = js.native
  }
  object Partial {
    
    @scala.inline
    def apply(partial: Boolean): Partial = {
      val __obj = js.Dynamic.literal(partial = partial.asInstanceOf[js.Any])
      __obj.asInstanceOf[Partial]
    }
    
    @scala.inline
    implicit class PartialMutableBuilder[Self <: Partial] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPartial(value: Boolean): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
    }
  }
}
