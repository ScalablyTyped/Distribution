package typings.evernote.mod.Types

import typings.evernote.anon.IncludeAccount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "Types.SavedSearchScope")
@js.native
open class SavedSearchScope () extends StObject {
  def this(args: IncludeAccount) = this()
  
  var includeAccount: js.UndefOr[Boolean] = js.native
  
  var includeBusinessLinkedNotebooks: js.UndefOr[Boolean] = js.native
  
  var includePersonalLinkedNotebooks: js.UndefOr[Boolean] = js.native
}
