package typings.githubSlugger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("github-slugger", JSImport.Namespace)
@js.native
class ^ () extends BananaSlug
@JSImport("github-slugger", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    *
    * @param value  string of text to slugify
    * @param [maintainCase=false] Keep the current case, otherwise make all lowercase
    */
  def slug(value: String): String = js.native
  def slug(value: String, maintainCase: Boolean): String = js.native
  def slug(value: js.Any): String = js.native
  def slug(value: js.Any, maintainCase: Boolean): String = js.native
}
