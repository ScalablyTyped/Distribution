package typings.fuseJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Id extends StObject {
    
    var id: String
  }
  object Id {
    
    inline def apply(id: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name[T] extends StObject {
    
    var name: /* keyof T */ String
    
    var weight: Double
  }
  object Name {
    
    inline def apply[T](name: /* keyof T */ String, weight: Double): Name[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name[T]]
    }
    
    extension [Self <: Name[?], T](x: Self & Name[T]) {
      
      inline def setName(value: /* keyof T */ String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
  
  trait Score extends StObject {
    
    var score: Double
  }
  object Score {
    
    inline def apply(score: Double): Score = {
      val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any])
      __obj.asInstanceOf[Score]
    }
    
    extension [Self <: Score](x: Self) {
      
      inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    }
  }
}
