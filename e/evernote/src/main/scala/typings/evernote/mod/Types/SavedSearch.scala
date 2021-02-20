package typings.evernote.mod.Types

import typings.evernote.anon.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "Types.SavedSearch")
@js.native
class SavedSearch () extends StObject {
  def this(args: Format) = this()
  
  var format: js.UndefOr[QueryFormat] = js.native
  
  var guid: js.UndefOr[Guid] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var query: js.UndefOr[String] = js.native
  
  var scope: js.UndefOr[SavedSearchScope] = js.native
  
  var updateSequenceNum: js.UndefOr[Double] = js.native
}
