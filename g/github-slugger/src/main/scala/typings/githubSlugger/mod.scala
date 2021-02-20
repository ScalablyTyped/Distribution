package typings.githubSlugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("github-slugger", JSImport.Namespace)
  @js.native
  class ^ () extends BananaSlug
  
  /**
    *
    * @param value  string of text to slugify
    * @param [maintainCase=false] Keep the current case, otherwise make all lowercase
    */
  /* static member */
  @JSImport("github-slugger", "slug")
  @js.native
  def slug(value: String): String = js.native
  @JSImport("github-slugger", "slug")
  @js.native
  def slug(value: String, maintainCase: Boolean): String = js.native
  @JSImport("github-slugger", "slug")
  @js.native
  def slug(value: js.Any): String = js.native
  @JSImport("github-slugger", "slug")
  @js.native
  def slug(value: js.Any, maintainCase: Boolean): String = js.native
  
  @js.native
  trait BananaSlug extends StObject {
    
    /**
      * Forget all previous slugs
      */
    def reset(): Unit = js.native
    
    /**
      *
      * @param value  string of text to slugify
      * @param [maintainCase=false] Keep the current case, otherwise make all lowercase
      */
    def slug(value: String): String = js.native
    def slug(value: String, maintainCase: Boolean): String = js.native
  }
}
