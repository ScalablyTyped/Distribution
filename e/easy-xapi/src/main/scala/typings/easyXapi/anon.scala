package typings.easyXapi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Level extends StObject {
    
    var level: String
    
    var name: String
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
  
  trait Partial extends StObject {
    
    var partial: Boolean
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
