package typings.evernote.mod.Types

import typings.evernote.anon.ContactName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "Types.NotebookDescriptor")
@js.native
open class NotebookDescriptor () extends StObject {
  def this(args: ContactName) = this()
  
  var contactName: js.UndefOr[String] = js.native
  
  var guid: js.UndefOr[Guid] = js.native
  
  var hasSharedNotebook: js.UndefOr[Boolean] = js.native
  
  var joinedUserCount: js.UndefOr[Double] = js.native
  
  var notebookDisplayName: js.UndefOr[String] = js.native
}
