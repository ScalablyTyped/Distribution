package typings.frecency

import typings.frecency.anon.ExactQueryMatchWeight
import typings.frecency.anon.FrecencyScore
import typings.frecency.anon.KeepScores
import typings.frecency.anon.Results
import typings.frecency.anon.SearchQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("frecency", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with Frecency[T] {
    def this(constructOpts: ExactQueryMatchWeight) = this()
    
    /* CompleteClass */
    override def save(arg: SearchQuery[T]): Unit = js.native
    
    /* CompleteClass */
    var sort: js.Function1[
        (/* arg */ KeepScores[T]) | (/* arg */ Results[T]), 
        js.Array[(T & FrecencyScore) | T]
      ] = js.native
  }
  
  trait Frecency[T] extends StObject {
    
    def save(arg: SearchQuery[T]): Unit
    
    var sort: js.Function1[
        (/* arg */ KeepScores[T]) | (/* arg */ Results[T]), 
        js.Array[(T & FrecencyScore) | T]
      ]
  }
  object Frecency {
    
    inline def apply[T](
      save: SearchQuery[T] => Unit,
      sort: (/* arg */ KeepScores[T]) | (/* arg */ Results[T]) => js.Array[(T & FrecencyScore) | T]
    ): Frecency[T] = {
      val __obj = js.Dynamic.literal(save = js.Any.fromFunction1(save), sort = js.Any.fromFunction1(sort))
      __obj.asInstanceOf[Frecency[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Frecency[?], T] (val x: Self & Frecency[T]) extends AnyVal {
      
      inline def setSave(value: SearchQuery[T] => Unit): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
      
      inline def setSort(value: (/* arg */ KeepScores[T]) | (/* arg */ Results[T]) => js.Array[(T & FrecencyScore) | T]): Self = StObject.set(x, "sort", js.Any.fromFunction1(value))
    }
  }
  
  type idAttrFn = js.Function1[/* result */ String, String]
}
