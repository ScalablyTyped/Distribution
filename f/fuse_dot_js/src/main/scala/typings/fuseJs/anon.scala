package typings.fuseJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Id extends StObject {
    
    var id: String
  }
  object Id {
    
    @scala.inline
    def apply(id: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name[T] extends StObject {
    
    var name: /* keyof T */ String
    
    var weight: Double
  }
  object Name {
    
    @scala.inline
    def apply[T](name: /* keyof T */ String, weight: Double): Name[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name[T]]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name[?], T] (val x: Self & Name[T]) extends AnyVal {
      
      @scala.inline
      def setName(value: /* keyof T */ String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
  
  trait Score extends StObject {
    
    var score: Double
  }
  object Score {
    
    @scala.inline
    def apply(score: Double): Score = {
      val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any])
      __obj.asInstanceOf[Score]
    }
    
    @scala.inline
    implicit class ScoreMutableBuilder[Self <: Score] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    }
  }
}
