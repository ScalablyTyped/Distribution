package typings.githubSlugger

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("github-slugger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("github-slugger", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with BananaSlug
  
  inline def slug(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("slug")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def slug(value: String, maintainCase: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("slug")(value.asInstanceOf[js.Any], maintainCase.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @js.native
  trait BananaSlug extends StObject {
    
    /** @type {Record<string, number>} */
    var occurrences: Record[String, Double] = js.native
    
    /**
      * Reset - Forget all previous slugs
      *
      * @return void
      */
    def reset(): Unit = js.native
    
    /**
      * Generate a unique slug.
      *
      * Tracks previously generated slugs: repeated calls with the same value
      * will result in different slugs.
      * Use the `slug` function to get same slugs.
      *
      * @param  {string} value
      *   String of text to slugify
      * @param  {boolean} [maintainCase=false]
      *   Keep the current case, otherwise make all lowercase
      * @return {string}
      *   A unique slug string
      */
    def slug(value: String): String = js.native
    def slug(value: String, maintainCase: Boolean): String = js.native
  }
}
