package typings.fuzzySearch

import typings.fuzzySearch.anon.RequiredOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fuzzy-search", JSImport.Namespace)
  @js.native
  class ^[T /* <: js.Object | String */] protected () extends FuzzySearch[T] {
    def this(haystack: js.Array[T]) = this()
    def this(haystack: js.Array[T], keys: js.Array[String]) = this()
    def this(haystack: js.Array[T], keys: js.UndefOr[scala.Nothing], options: Options) = this()
    def this(haystack: js.Array[T], keys: js.Array[String], options: Options) = this()
  }
  
  /* static member */
  @JSImport("fuzzy-search", "isMatch")
  @js.native
  def isMatch(item: String, query: String, caseSensitive: Boolean): Double = js.native
  
  @js.native
  trait FuzzySearch[T /* <: js.Object | String */] extends StObject {
    
    var haystack: js.Array[T] = js.native
    
    var keys: js.Array[String] = js.native
    
    var options: RequiredOptions = js.native
    
    def search(): js.Array[T] = js.native
    def search(needle: String): js.Array[T] = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var caseSensitive: js.UndefOr[Boolean] = js.native
    
    var sort: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      @scala.inline
      def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
}
