package typings.evernote.mod.NoteStore

import typings.evernote.anon.CacheKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.RelatedQuery")
@js.native
class RelatedQuery () extends StObject {
  def this(args: CacheKey) = this()
  
  var cacheKey: js.UndefOr[String] = js.native
  
  var context: js.UndefOr[String] = js.native
  
  var filter: js.UndefOr[NoteFilter] = js.native
  
  var noteGuid: js.UndefOr[String] = js.native
  
  var plainText: js.UndefOr[String] = js.native
  
  var referenceUri: js.UndefOr[String] = js.native
}
