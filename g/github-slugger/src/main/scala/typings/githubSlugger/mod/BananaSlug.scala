package typings.githubSlugger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BananaSlug extends js.Object {
  
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
