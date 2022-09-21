package typings.fuzzySearch

import typings.fuzzySearch.anon.RequiredOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fuzzy-search", JSImport.Namespace)
  @js.native
  open class ^[T /* <: js.Object | String */] protected ()
    extends StObject
       with FuzzySearch[T] {
    def this(haystack: js.Array[T]) = this()
    def this(haystack: js.Array[T], keys: js.Array[String]) = this()
    def this(haystack: js.Array[T], keys: js.Array[String], options: Options) = this()
    def this(haystack: js.Array[T], keys: Unit, options: Options) = this()
  }
  @JSImport("fuzzy-search", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def isMatch(item: String, query: String, caseSensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatch")(item.asInstanceOf[js.Any], query.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @js.native
  trait FuzzySearch[T /* <: js.Object | String */] extends StObject {
    
    var haystack: js.Array[T] = js.native
    
    var keys: js.Array[String] = js.native
    
    var options: RequiredOptions = js.native
    
    def search(): js.Array[T] = js.native
    def search(needle: String): js.Array[T] = js.native
  }
  
  trait Options extends StObject {
    
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    var sort: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
}
